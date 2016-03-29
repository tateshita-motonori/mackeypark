package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/***
 *  ログインに遷移するためのアクションクラス
 * @author MOTONORI TATESHITA
 * @version 1.0
 * @since 1.0
 **/
public class GoMainAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 4692568096045038986L;

    /**
     * メインに遷移させるメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}
