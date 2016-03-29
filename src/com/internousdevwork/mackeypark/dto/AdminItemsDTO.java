package com.internousdevwork.mackeypark.dto;

/**
 * 商品情報を格納するDTOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class AdminItemsDTO {

    /**
     * 商品ID
     */
    private int itemId;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * 有効期間
     */
    private String period;

    /**
     * 種類
     */
    private String division;

    /**
     * 絵柄
     */
    private String design;

    /**
     * 説明
     */
    private String explanation;

    /**
     * 値段
     */
    private int price;

    /**
     * イメージファイルパス
     */
    private String imgPath;

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
     * 商品名を取得するメソッド
     * @return itemName 商品名
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 商品名を格納するメソッド
     * @param itemName 商品名
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 有効期間を取得するメソッド
     * @return period 有効期間
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 有効期間を格納するメソッド
     * @param period 有効期間
     */
    public void setPeriod(String period) {
        this.period = period;
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
     * 絵柄を取得するメソッド
     * @return design 絵柄
     */
    public String getDesign() {
        return design;
    }

    /**
     * 絵柄を格納するメソッド
     * @param design 絵柄
     */
    public void setDesign(String design) {
        this.design = design;
    }

    /**
     * 説明を取得するメソッド
     * @return explanation 説明
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * 説明を格納するメソッド
     * @param explanation 説明
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * 値段を取得するメソッド
     * @return price 値段
     */
    public int getPrice() {
        return price;
    }

    /**
     * 値段を格納するメソッド
     * @param price 値段
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * イメージファイルパスを取得するメソッド
     * @return imgPath イメージファイルパス
     */
    public String getimgPath() {
        return imgPath;
    }

    /**
     * イメージファイルパスを格納するメソッド
     * @param imgPath イメージファイルパス
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

}