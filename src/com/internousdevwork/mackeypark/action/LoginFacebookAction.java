package com.internousdevwork.mackeypark.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.LoginOauthDAO;
import com.internousdevwork.mackeypark.dto.LoginOauthDTO;
import com.internousdevwork.mackeypark.util.FacebookOauth;
import com.opensymphony.xwork2.ActionSupport;

/**
 * facebookでログインするアクションクラス
 * @author KATUSAKA KOTAKI
 * @since 1.0
 * @version 1.0
 */
public class LoginFacebookAction extends ActionSupport implements SessionAware, ServletResponseAware, ServletRequestAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -1843664843551562681L;

    /**
     * OAuthサービス元の名前を格納している変数
     */
    static final String OAUTH_NAME = "Facebook";

    /**
     * レスポンス
     */
    private HttpServletRequest request;

    /**
     * リクエスト
     */
    private HttpServletResponse response;

    /**
     * セッション
     */
    private Map<String, Object> session;

    /**
     * Oauth提供元で登録しているユーザー情報を格納するためのマップ
     */
    private Map<String, String> userMap;

    /**
     * OauthID
     */
    private String oauthId;

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * <p>
     * FACEBOOKでログインできるか判定する為のメソッド<br>
     * アクセストークンを取得できたか判定します。<br>
     * また、openconnectデータベースのuserテーブルにユーザー情報が登録されているかを判定します。<br>
     * 初回ログイン時は同テーブルにユーザー情報を登録します。<br>
     * </p>
     * @return SUCCESS/ERROR ログインに成功したらSUCCESS、アクセストークンがnullまたは初回ログインの場合ERRORを返します。
     */
    public String execute() {
        FacebookOauth oauth = new FacebookOauth();
        userMap = null;
        userMap = oauth.getAccessToken(request, response);
        if (userMap == null) {
            return ERROR;
        }
        oauthId = userMap.get("id");
        userName = userMap.get("name");
        email = userMap.get("email");
        LoginOauthDAO dao = new LoginOauthDAO();
        if (dao.select(oauthId, OAUTH_NAME)) {
            LoginOauthDTO dto = dao.getLoginOauthDTO();
            session.put("id", dto.getId());
            return SUCCESS;
        }
        if (dao.insert(userName,email, oauthId, OAUTH_NAME) == 0) {
            return ERROR;
        }
        dao.select(oauthId, OAUTH_NAME);
        LoginOauthDTO dto = dao.getLoginOauthDTO();
        session.put("id", dto.getId());
        return SUCCESS;
    }

    /**
     * リクエストを格納するメソッド
     * @param request リクエスト
     */
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * レスポンスを格納するメソッド
     * @param response レスポンス
     */
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}
