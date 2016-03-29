package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 会社概要に遷移するアクションクラス
 * @author YURINA SATO
 * @version 1.0
 * @since 1.0
 */
public class GoCompanyAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -3464404422195174424L;

    /**
     * 会社概要に遷移させるメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}
