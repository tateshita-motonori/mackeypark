package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 退会確認に遷移するアクションクラス
 * @author YURINA SATO
 * @version 1.0
 * @since 1.0
 */
public class GoWithdrawalCheckAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -3575836727912525377L;

    /**
     * 退会確認に遷移するメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}