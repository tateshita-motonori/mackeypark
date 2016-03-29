package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * メインからログインに遷移させるアクションクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class GoMainToLoginAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 3317203157611319278L;

    /**
     * ポップアップの有無
     */
    private int popup=0;

    /**
     *  セッション
     */
    private Map<String, Object> session;

    /**
     * ユーザー情報を読み取り、その結果の判定をするメソッド
     * @return SUCCESS/ERROR ユーザーIDを取得できたらSUCCESS、できなければERRORを格納し返します。
     */
    public String execute(){
        if(session.containsKey("id")){
            return SUCCESS;
        }else if(session.containsKey("loginId")){
            return SUCCESS;
        }
        popup = 2;
        return ERROR;
    }

    /**
     * ポップアップの有無を取得するメソッド
     * @return popup ポップアップの有無
     */
    public int getPopup() {
        return popup;
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
