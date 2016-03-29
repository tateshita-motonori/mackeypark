package com.internousdevwork.mackeypark.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoSelectConditionDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * メインから選択一覧に遷移させるアクションクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class GoSelectConditionAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 1208306169802210373L;

    /**
     * セッション
     */
    private Map<String, Object> session;

    /**
     * ユーザーID
     */
    private int id;

    /**
     * ポップアップの有無
     */
    private int popup = 0;

    /**
     * <p>
     * ユーザーがログイン状態か否かを判定し、かつクレジット情報が登録されているかを検証するメソッド<br>
     * ユーザーIDとクレジットナンバー下4ケタの両方が取得できれば選択一覧に遷移し、<br>
     * IDがなければログイン画面に遷移し、ID飲み受け取れてクレジットナンバー下4ケタが<br>
     * 取得できなければマイページに遷移します。<br>
     * </p>
     * @return result 両方取得でSUCCESS、IDが受け取れなければERROR、IDのみ取得でcreditErrorを格納し返します。
     */
    public String execute(){
        GoSelectConditionDAO dao = new GoSelectConditionDAO();
        if(!session.containsKey("id")){
            popup = 1;
            return ERROR;
        }
        id = (int)session.get("id");
        if(!dao.selectToken(id)){
            popup = 1;
            return "creditError";
        }
        popup = 1;
        return SUCCESS;
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
     * ポップアップの有無を取得するメソッド
     * @return popup ポップアップの有無
     */
    public int getPopup() {
        return popup;
    }


}
