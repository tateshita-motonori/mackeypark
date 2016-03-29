package com.internousdevwork.mackeypark.action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログインに遷移するアクションクラス
 * @author YURINA SATO
 * @version 1.0
 * @since 1.0
 */
public class GoLoginAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 2077381157416740982L;

    /**
     * ログインに遷移させるメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
        return SUCCESS;
    }

}
