package com.internousdevwork.mackeypark.dto;

/**
 * 取得した購入履歴の値を格納するDTOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseHistoryDTO {

    /**
     * 購入ID
     */
    private String salesId;

    /**
     * ユーザーID
     */
    private String userId;

    /**
     * 商品ID
     */
    private String itemId;

    /**
     * 商品の個数
     */
    private String numberOfItems;

    /**
     * 合計金額
     */
    private String amount;

    /**
     * 購入日
     */
    private String date;

    /**
     * 商品IDを取得するメソッド
     * @return salesId 商品ID
     */
    public String getSalesId() {
        return salesId;
    }

    /**
     * 商品IDを格納するメソッド
     * @param salesId 商品ID
     */
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    /**
     * ユーザーIDを取得するメソッド
     * @return userId ユーザーID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザーIDを格納するメソッド
     * @param userId ユーザーID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    /**
     * 合計金額を取得するメソッド
     * @return amount 合計金額
     */
    public String getAmount() {
        return amount;
    }

    /**
     * 合計金額を格納するメソッド
     * @param amount 合計金額
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 購入日を取得するメソッド
     * @return date 購入日
     */
    public String getDate() {
        return date;
    }

    /**
     * 購入日を格納するメソッド
     * @param date 購入日
     */
    public void setDate(String date) {
        this.date = date;
    }

}
