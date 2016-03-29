package com.internousdevwork.mackeypark.action;
import com.internousdevwork.mackeypark.dao.ListPurchaseCheckItemsDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入確認で商品一覧を表示するアクションクラス
 * @author SODAI ARAKAWA
 * @version 1.0
 * @since 1.0
 */
public class ListPurchaseCheckItemsAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -2517963615777105868L;

    /**
     * 種類
     */
    private String[] division;

    /**
     * mackeyparkデーターベースのticketテーブルから種類を取得するメソッド
     * @return SUCCESS/ERROR データを取得できたらSUCCESS、できなかったらERRORを返します。
     */
    public String execute(){
        ListPurchaseCheckItemsDAO dao = new ListPurchaseCheckItemsDAO();
        if(dao.selectItem()){
            division = dao.getDivision();
            return SUCCESS;
        }
        return ERROR;
    }

    /**
     * 種類を取得するメソッド
     * @return division 種類
     */
    public String[] getDivision() {
        return division;
    }

    /**
     * 種類を格納するメソッド
     * @param division 種類
     */
    public void setDivision(String[] division) {
        this.division = division;
    }

}