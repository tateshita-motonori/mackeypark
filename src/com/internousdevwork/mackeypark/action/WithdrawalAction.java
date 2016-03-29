package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.WithdrawalDAO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ユーザー情報を消去して退会するアクションクラス
 * @author HARUKI NAKAGAWA
 * @version 1.0
 * @since 1.0
 */
public class WithdrawalAction extends ActionSupport implements SessionAware {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 5545776643164469004L;

    /**
     * セッション
     */
    public Map<String, Object> session;

    /**
     * openconnectデータベースに接続しuserテーブルからユーザーのすべての情報を消去するメソッド
     * @return SUCCESS/ERROR 削除に成功した場合はSUCCESS、失敗した場合はERRORを返します。
     */
    public String execute() {
        if(!session.containsKey("id")){
            return ERROR;
        }
        int id = (int)session.get("id");
        WithdrawalDAO dao = new WithdrawalDAO();
        if(dao.update(id) < 1){
            return ERROR;
        }
        session.clear();
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
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

}
