package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoEditUserCheckDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *情報変更で入力された値をmackeyparkデータベースのtempテーブルに格納するアクションクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class GoEditUserCheckAction extends ActionSupport implements SessionAware{

    /**
     *生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 3156207032852695825L;

    /**
     * パスワード
     */
    private String password;

    /**
     * 再入力パスワード
     */
    private String reTypePassword;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * 再入力メールアドレス
     */
    private String reTypeEmail;

    /**
     * クレジットカード種別
     */
    private String card;

    /**
     * クレジットカード番号
     */
    private String cardNumber;

    /**
     * 有効期限(月)
     */
    private String cardMonth;

    /**
     * 有効期限(年)
     */
    private String cardYear;

    /**
     * クレジットカード名義
     */
    private String cardHolder;

    /**
     * セキュリティコード
     */
    private String securityCode;

    /**
     * ユーザーID
     */
    private int id;

    /**
     * すでに登録されているメールエラーメッセージ
     */
    private String  emailConfirmErrorMessage;

    /**
     * セッション
     */
    private Map<String,Object> session;
    
    /**
     * クレジットカードエラー情報
     */
    private String cardErrorMessage;
    
    /**
     * 新規登録で入力された値をmackeyparkデータベースのtempテーブルに一時格納するメソッド
     * @return SUCCESS/ERROR 格納したらSUCCESS、格納できなければERRORを返します。
     */
    public String execute(){
        GoEditUserCheckDAO dao = new GoEditUserCheckDAO();
        id= (int) session.get("id");
        if(dao.selectByEmail(email,id)){
            setEmailConfirmErrorMessage(getText("create_user_check.mail_address"));
            return ERROR;
        }
        if(dao.deleteTemp()<0){
            return ERROR;
        }
        if(!cardNumber.equals("")){
            if(card.equals("")
                    || cardYear.equals("")
                    || cardMonth.equals("")
                    || securityCode.equals("")){
                cardErrorMessage = getText("create_user_check.card_information");
                return ERROR;
            }
        }
        if(dao.insertTemp(password,email,
                cardNumber,cardMonth,cardYear,cardHolder,securityCode)<1){
            return ERROR;
        }
        int tempId = dao.getTempId();
        session.put("tempId", tempId);
        return SUCCESS;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session){
        this.session = session;
    }

    /**
     * パスワードを取得するメソッド
     * @return password パスワード
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードを格納するメソッド
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 再入力パスワードを取得するメソッド
     * @return reTypePassword 再入力パスワード
     */
    public String getReTypePassword() {
        return reTypePassword;
    }

    /**
     * 再入力パスワードを格納するメソッド
     * @param reTypePassword  再入力パスワード
     */
    public void setReTypePassword(String reTypePassword) {
        this.reTypePassword = reTypePassword;
    }

    /**
     * メールアドレスを取得するメソッド
     * @return email メールアドレス
     */
    public String getEmail() {
        return email;
    }

    /**
     * メールアドレスを格納するメソッド
     * @param email メールアドレス
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 再入力メールアドレスを取得するメソッド
     * @return reTypeEmail 再入力メールアドレス
     */
    public String getReTypeEmail() {
        return reTypeEmail;
    }

    /**
     * 再入力メールアドレスを格納するメソッド
     * @param reTypeEmail 再入力メールアドレス
     */
    public void setReTypeEmail(String reTypeEmail) {
        this.reTypeEmail = reTypeEmail;
    }

    /**
     * クレジットカード種別を取得するメソッド
     * @return card クレジットカード種別
     */
    public String getCard() {
        return card;
    }

    /**
     * クレジットカード種別を格納するメソッド
     * @param card クレジットカード種別
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * クレジットカード番号を取得するメソッド
     * @return cardNumber クレジットカード番号
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * クレジットカード番号を格納するメソッド
     * @param cardNumber クレジットカード番号
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 有効期限（月）を取得するメソッド
     * @return cardMonth 有効期限（月）
     */
    public String getCardMonth() {
        return cardMonth;
    }

    /**
     * 有効期限（月）を格納するメソッド
     * @param cardMonth 有効期限（月）
     */
    public void setCardMonth(String cardMonth) {
        this.cardMonth = cardMonth;
    }

    /**
     * 有効期限（年）を取得するメソッド
     * @return cardYear 有効期限（年）
     */
    public String getCardYear() {
        return cardYear;
    }

    /**
     *  有効期限（年)を格納するメソッド
     * @param cardYear 有効期限（年)
     */
    public void setCardYear(String cardYear) {
        this.cardYear = cardYear;
    }

    /**
     * クレジットカード名義を取得するメソッド
     * @return cardHolder クレジットカード名義
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * クレジットカード名義を格納するメソッド
     * @param cardHolder クレジットカード名義
     */
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    /**
     * セキュリティコードを取得するメソッド
     * @return securityCode セキュリティコード
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * セキュリティコードを格納するメソッド
     * @param securityCode セキュリティコード
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * セッションを取得するメソッド
     * @return session  セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * すでに登録されているメールエラーメッセージを取得するメソッド
     * @return emailConfirmErrorMessage  すでに登録されているメールエラーメッセージ
     */
    public String getEmailConfirmErrorMessage() {
        return emailConfirmErrorMessage;
    }

    /**
     * すでに登録されているメールエラーメッセージを格納するメソッド
     * @param emailConfirmErrorMessage すでに登録されているメールエラーメッセージ
     */
    public void setEmailConfirmErrorMessage(String emailConfirmErrorMessage) {
        this.emailConfirmErrorMessage = emailConfirmErrorMessage;
    }

    /**
     * クレジットカードエラー情報を取得するメソッド
     * @return cardErrorMessage　クレジットカードエラー情報
     */
    public String getCardErrorMessage() {
        return cardErrorMessage;
    }

    /**
     * クレジットカードエラー情報を格納するメソッド
     * @param cardErrorMessage クレジットカードエラー情報
     */
    public void setCardErrorMessage(String cardErrorMessage) {
        this.cardErrorMessage = cardErrorMessage;
    }

}