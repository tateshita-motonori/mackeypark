package com.internousdevwork.mackeypark.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.exceptions.OAuthException;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.model.OAuthConfig;
import org.scribe.model.OAuthConstants;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuth20ServiceImpl;
import org.scribe.oauth.OAuthService;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;

/**
 * GoogleOAuthでログインの際に使用するutilクラス
 * @author KATUSAKA KOTAKI
 * @since 1.0
 * @version 1.0
 */
public class GoogleApi extends DefaultApi20 {

    /**
     * 認証URL
     */
    private static final String AUTHORIZE_URL = "https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=%s&redirect_uri=%s";

    /**
     * スコープ
     */
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";

    /**
     * アクセストークンの有効期限を返す為のメソッド
     * @return endPoint 有効期限をendPointに格納し返します。
     */
    @Override
    public String getAccessTokenEndpoint() {
        String endPoint = "https://accounts.google.com/o/oauth2/token";
        return endPoint;
    }

    /**
     * アクセストークンを抽出する為のメソッド
     * @return AccessTokenExtractor() アクセストークンを抽出できた場合、値をAccessTokenExtractorに格納し返します。
     */
    @Override
    public AccessTokenExtractor getAccessTokenExtractor() {
        return new AccessTokenExtractor() {
            @Override
            public Token extract(String response) {
                Preconditions.checkEmptyString(response, "Response body is incorrect. Can't extract a token from an empty string");
                Matcher matcher = Pattern.compile("\"access_token\" : \"([^&\"]+)\"").matcher(response);
                if (matcher.find())
                {
                    String token = OAuthEncoder.decode(matcher.group(1));
                    return new Token(token, "", response);
                }else{
                    throw new OAuthException("Response body is incorrect. Can't extract a token from this: '" + response + "'", null);
                }
            }
        };
    }

    /**
     * 認証URL(AuthorizationUrl)を取得する為のメソッド
     * @param config 設定
     * @return String.format() スコープがある場合とない場合でそれぞれのURLを返します。
     */
    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
        if (config.hasScope()) {
            return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(),
                    OAuthEncoder.encode(config.getCallback()),
                    OAuthEncoder.encode(config.getScope()));
        } else {
            return String.format(AUTHORIZE_URL, config.getApiKey(),
                    OAuthEncoder.encode(config.getCallback()));
        }
    }

    /**
     * リクエスト形式を返す為のメソッド
     * @return Verb POSTを返します。
     */
    @Override
    public Verb getAccessTokenVerb() {
        return Verb.POST;
    }

    /**
     * グーグルのサービス形式を返す為のメソッド
     * @param config 設定
     * @return GoogleOAuth2Service configの設定でインスタンス化して値を返します。
     */
    @Override
    public OAuthService createService(OAuthConfig config) {
        return new GoogleOAuth2Service(this, config);
    }

    /**
     * GoogleOAuthを使用する際の形式を定める為のクラス
     * @author KATUSAKA KOTAKI
     * @since 1.0
     * @version 1.0
     */
    private class GoogleOAuth2Service extends OAuth20ServiceImpl {

    /**
     * 許可タイプ認定コード
     */
    private static final String GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";

    /**
     * 許可タイプ
     */
    private static final String GRANT_TYPE = "grant_type";

    /**
     * API
     */
    private DefaultApi20 api;


    /**
     * 設定
     */
    private OAuthConfig config;

    /**
     * コンストラクタ
     * @param api API
     * @param config 設定
     */
    public GoogleOAuth2Service(DefaultApi20 api, OAuthConfig config) {
        super(api, config);
        this.api = api;
        this.config = config;
    }

        /**
         * リクエスト形式によってアクセストークンの取得方法を変更する為のメソッド
         * @param requestToken リクエストトークン
         * @param verifier 検証器
         * @return api.getAccessTokenExtractor().extract() GETとPOSTの場合でそれそれの値を返します。
         */
        @Override
        public Token getAccessToken(Token requestToken, Verifier verifier) {
            OAuthRequest request = new OAuthRequest(api.getAccessTokenVerb(), api.getAccessTokenEndpoint());
            switch (api.getAccessTokenVerb()) {
            case POST:
                request.addBodyParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
                request.addBodyParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
                request.addBodyParameter(OAuthConstants.CODE, verifier.getValue());
                request.addBodyParameter(OAuthConstants.REDIRECT_URI, config.getCallback());
                request.addBodyParameter(GRANT_TYPE, GRANT_TYPE_AUTHORIZATION_CODE);
                break;
            case GET:
            default:
                request.addQuerystringParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
                request.addQuerystringParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
                request.addQuerystringParameter(OAuthConstants.CODE, verifier.getValue());
                request.addQuerystringParameter(OAuthConstants.REDIRECT_URI, config.getCallback());
                if(config.hasScope()) request.addQuerystringParameter(OAuthConstants.SCOPE, config.getScope());
            }
            Response response = request.send();
            return api.getAccessTokenExtractor().extract(response.getBody());
        }

    }

}