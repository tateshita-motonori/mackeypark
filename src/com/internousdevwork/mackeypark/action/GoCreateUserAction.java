package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録に遷移するアクションクラス
 * @author KATUSAKA KOTAKI
 * @version 1.0
 * @since 1.0
 */
public class GoCreateUserAction  extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -3141362633916366113L;

    /**
     * 新規登録に遷移するメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute() {

        return SUCCESS;
    }

}