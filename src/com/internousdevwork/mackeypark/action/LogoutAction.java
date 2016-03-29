package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン情報を削除してログアウトするためのアクションクラス
 * @author TATSURO YAMAZAKI
 * @version 1.0
 * @since 1.0
 */
public class LogoutAction extends ActionSupport implements SessionAware {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6648329242351370334L;

    /**
     * セッション
     */
    private Map<String, Object> session;

    /**
     * ログイン時のセッションの値を削除しログアウトするメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        session.clear();
        return SUCCESS;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

}
