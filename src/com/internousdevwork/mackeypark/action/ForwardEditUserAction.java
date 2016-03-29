package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.ForwardCreateUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 情報確認で戻るボタンが押された際、値を引き継いだ状態で情報変更に遷移するアクションクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class ForwardEditUserAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -5318461462447569225L;

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * フリガナ
     */
    private String nameKana;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * 情報確認から情報変更に遷移する為のメソッド
     * @return SUCCESS/ERROR 一時テーブルのIDを取得できた場合SUCCESSを返し、できなかった場合ERRORを返します。
     */
    public String execute(){
        if(!session.containsKey("tempId")){
            return ERROR;
        }else{
            int tempId = (int)session.get("tempId");
            ForwardCreateUserDAO dao = new ForwardCreateUserDAO();
            if(dao.deleteTemp(tempId) < 0){
                return ERROR;
            }
        }
        return SUCCESS;
    }

    /**
     * ユーザー名を取得するメソッド
     * @return userName ユーザー名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ユーザー名を格納するメソッド
     * @param userName ユーザー名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * フリガナを取得するメソッド
     * @return nameKana フリガナ
     */
    public String getNameKana() {
        return nameKana;
    }

    /**
     * フリガナを格納するメソッド
     * @param nameKana フリガナ
     */
    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
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
     * メールアドレスを取得するメソッド
     * @return email メールアドレス
     */
    public String getEmail() {
        return email;
    }

    /**
     * メールアドレスを取得するメソッド
     * @param email メールアドレス
     */
    public void setEmail(String email) {
        this.email = email;
    }

}