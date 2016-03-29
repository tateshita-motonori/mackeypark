package com.internousdevwork.mackeypark.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * お問い合わせに遷移させるアクションクラス
 * @author YURINA SATO
 * @version 1.0
 * @since 1.0
 */
public class GoHelpAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -5509179709982593103L;

    /**
     * お問い合わせに遷移させるメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}
