package com.internousdevwork.mackeypark.dto;

/**
 * 購入履歴に挿入する値を格納するDTOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class PurchaseDTO {

    /**
     * 商品ID
     */
    private String itemId;

    /**
     * 商品の個数
     */
    private String numberOfItems;

    /**
     * 商品IDを取得するメソッド
     * @return itemId 商品ID
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 商品IDを格納するメソッド
     * @param itemId 商品ID
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 商品の個数を取得するメソッド
     * @return numberOfItems 商品の個数
     */
    public String getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * 商品の個数を格納するメソッド
     * @param numberOfItems 商品の個数
     */
    public void setNumberOfItems(String numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

}
