package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.LoginDAO;
import com.internousdevwork.mackeypark.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログインするアクションクラス
 * @author KATUSAKA KOTAKI
 * @version 1.0
 * @since 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -573963797324632013L;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * パスワード
     */
    private String password;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * エラーメッセージ
     */
    private String errorMessage;

    /**
     * <p>
     * メールアドレスとパスワードが登録されているか判定するためのメソッド<br>
     * ログインに成功したらメインへ遷移し、失敗したらエラーメッセージをログイン画面に表示します。<br>
     * </p>
     * @return SUCCESS/ERROR ログイン成功時はSUCCESS返し、失敗したらERRORを返します。
     */
    public String execute(){
        LoginDAO dao = new LoginDAO();
        if(!dao.select(email, password)){
            setErrorMessage(getText("login_ac.error"));
            return ERROR;
        }
        LoginDTO dto = dao.getDto();
        session.put("id", dto.getId());
        return SUCCESS;
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

    /**
     * エラーメッセージを取得するメソッド
     * @return errorMessage エラーメッセージ
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * エラーメッセージを格納するメソッド
     * @param errorMessage エラーメッセージ
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}