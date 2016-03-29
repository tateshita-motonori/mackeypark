package com.internousdevwork.mackeypark.dto;

/**
 * メインに表示する商品一覧のリスト情報を格納するDTOクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class ListMainItemsDTO {

    /**
     * 種類
     */
    private String division;

    /**
     * 説明
     */
    private String explanation;

    /**
     * 値段
     */
    private int price;

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

}

