package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoMyPageDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 情報変更に遷移する為のアクションクラス
 * @author KAZUNORI KUDO
 * @version 1.0
 * @since 1.0
 **/
public class GoEditUserAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 7182126617892636496L;

    /**
     * ユーザーID
     */
    private int id;

    /**
     * ユーザー名
     */
    public String userName;

    /**
     * フリガナ
     */
    public String nameKana;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * openconnectデータベースのuserテーブルからユーザー名とフリガナを取得するメソッド
     * @return SUCCESS/ERROR 検索に成功したらSUCCESS、失敗したらERRORを返します。
     */
    public String execute(){
        GoMyPageDAO dao = new GoMyPageDAO();
        id = (int) session.get("id");
        if(dao.select(id)){
            userName = dao.getUserName();
            nameKana = dao.getNameKana();
            return SUCCESS;
        }else{
            return ERROR;
        }
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

}