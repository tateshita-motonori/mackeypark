package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.ForwardCreateUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登録確認で戻るボタンが押された際、値を引き継いだ状態で新規登録に遷移する為のアクションクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class ForwardCreateUserAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -1346935978294124743L;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * 登録確認から新規登録に遷移する為のメソッド
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