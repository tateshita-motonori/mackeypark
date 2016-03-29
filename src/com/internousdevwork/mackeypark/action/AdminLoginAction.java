package com.internousdevwork.mackeypark.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.AdminLoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者ログインするアクションクラス
 * @author RYOUSUKE MASAKI
 * @version 1.0
 * @since 1.0
 */
public class AdminLoginAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 1509301276846720328L;

    /**
     * ユーザーID
     */
    public String id;

    /**
     * パスワード
     */
    public String password;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * openconnectデータベースに接続し、adminテーブルにユーザーIDとパスワードが登録されているか判定するメソッド
     * @return SUCCESS/ERROR 登録されていればSUCCESS、されていなければERRORを返します。
     */
    public  String execute(){
        AdminLoginDAO dao = new AdminLoginDAO();
        if(dao.select( id , password )){
            session.put("id", id);
            return SUCCESS;
        }
        return ERROR;
    }

    /**
     * ユーザーIDを取得するメソッド
     * @return id ユーザーID
     */
    public String getId(){
        return id;
    }

    /**
     * ユーザーIDを格納するメソッド
     * @param id ユーザーID
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * パスワードを取得するメソッド
     * @return password パスワード
     */
    public String getPass(){
        return password;
    }

    /**
     * パスワードを格納するメソッド
     * @param password パスワード
     */
    public void setPass(String password){
        this.password = password;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession(){
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session){
        this.session = session;
    }

}
