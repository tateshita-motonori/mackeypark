package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 管理者ログインに遷移するアクションクラス
 * @author TAMAKI FUKUI
 * @version 1.0
 * @since 1.0
 */
public class GoAdminLoginAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 7613728308728780040L;

    /**
     * 管理者ログインに遷移するメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public  String execute(){
        return SUCCESS;
    }

}
