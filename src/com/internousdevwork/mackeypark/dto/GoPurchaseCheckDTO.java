package com.internousdevwork.mackeypark.dto;

/**
 * 商品情報を格納するDTOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class GoPurchaseCheckDTO {

    /**
     * 商品ID
     */
    private int itemId;

    /**
     * 種類
     */
    private String division;

    /**
     * 商品の個数
     */
    private int numberOfItems;

    /**
     * 小計
     */
    private int subTotal;

    /**
     * 期間
     */
    private String period;

    /**
     * 商品IDを取得するメソッド
     * @return itemId 商品ID
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * 商品IDを格納するメソッド
     * @param itemId 商品ID
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * 種類を取得するメソッド
     * @return division 種類
     */
    public String getDivision() {
        return division;
    }

    /**
     * 種類を格納するメソッド
     * @param division 種類
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * 小計を取得するメソッド
     * @return subTotal 小計
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * 小計を格納するメソッド
     * @param subTotal 小計
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * 商品の個数を取得するメソッド
     * @return numberOfItems 商品の個数
     */
    public int getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * 商品の個数を格納するメソッド
     * @param numberOfItems 商品の個数
     */
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * 期間を取得するメソッド
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 期間を格納するメソッド
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

}
