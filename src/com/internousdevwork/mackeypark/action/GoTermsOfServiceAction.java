package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 利用規約に遷移させるアクションクラス
 * @author WATARU KUME
 * @version 1.0
 * @since 1.0
 */
public class GoTermsOfServiceAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 4922082706119932800L;

    /**
     * 利用規約に遷移させるメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}
