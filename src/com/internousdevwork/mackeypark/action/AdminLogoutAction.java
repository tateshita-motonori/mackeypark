package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理者ログアウトを行うアクションクラス
 * @author  SHIZUKA IMANISHI
 * @version 1.0
 * @since   1.0
 */
public class AdminLogoutAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6780560381765260606L;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * セッションを削除し、管理者画面からログアウトするメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public  String execute(){
        try{
            session.remove("id");
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        return SUCCESS;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}
