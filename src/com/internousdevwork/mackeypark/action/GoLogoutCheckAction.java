package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ログアウト確認に遷移するアクションクラス
 * @author YURINA SATO
 * @version 1.0
 * @since 1.0
 */
public class GoLogoutCheckAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 3338066431233265276L;

    /**
     * ログアウト確認に遷移させるメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}
