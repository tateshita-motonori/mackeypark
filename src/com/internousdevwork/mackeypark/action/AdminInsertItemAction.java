package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.AdminInsertItemDAO;
import com.internousdevwork.mackeypark.dto.AdminItemsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品をデータベースに追加するアクションクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class AdminInsertItemAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6377746647438398939L;

    /**
     * セッション
     */
    private Map<String,Object> session;

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
     * 説明
     */
    private String explanation;

    /**
     * 値段
     */
    private String price;

    /**
     * 値段の整数値
     */
    private int priceInt;

    /**
     * イメージファイルパス
     */
    private String imgPath;

    /**
     * 商品追加メッセージ
     */
    private String insertMessage;

    /**
     * 商品の個数
     */
    private int numberOfItems=0;

    /**
     * 現在ページ
     */
    private int page=1;

    /**
     * 検索する商品名
     */
    private String selectItem;

    /**
     * 未入力エラーメッセージ
     */
    private String nullErrorMessage;

    /**
     * 数字入力エラーメッセージ
     */
    private String intErrorMessage;

    /**
     * mackeyparkデータベースのticketテーブルに商品を追加するメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
    	AdminInsertItemDAO insertDao = new AdminInsertItemDAO();
    	itemName = period  + "(" + division + ")";
        if(period.equals("") || division.equals("") || explanation.equals("") || price.equals("")){
            nullErrorMessage = getText("admin_item.insert_ac_single_Input");
            if(!price.matches("[0-9]{0,}")){
                intErrorMessage = getText("admin_item.insert_ac_single_size");
            }
            return SUCCESS;
        }
        if(!price.matches("[0-9]{0,}")){
            intErrorMessage = getText("admin_item.insert_ac_single_size");
            return SUCCESS;
        }
        if(!insertDao.selectItem(itemName)){
        	  intErrorMessage = "すでに存在しています。";
              return SUCCESS;
        }
        try{
            priceInt = Integer.parseInt(price);
        }catch(Exception e){
            e.printStackTrace();
        }
        String designList[]={"マッキー","マニー","ドルナド","ドイジー","グッフィ","ポルート"};

        AdminItemsDTO dto = new AdminItemsDTO();

        for(int i=0; i<6; i++){
            dto.setItemName(itemName);
            dto.setDivision(division);
            dto.setExplanation(explanation);
            dto.setPeriod(period);
            dto.setPrice(priceInt);
            dto.setDesign(designList[i]);
            if(i!=4){
                imgPath ="./picture/" + designList[i] + ".jpg";
            }else{
                imgPath ="./picture/" + designList[i] + ".png";
            }
            dto.setImgPath(imgPath);

            numberOfItems=insertDao.insert(dto);
        }
        if(numberOfItems<1){
            insertMessage = getText("admin_item.insert_ac_notadd");
        }else{
            insertMessage = "「" + itemName + "」"+ getText("admin_item.insert_ac_add");
        }
        return SUCCESS;
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
     * 説明文を取得するメソッド
     * @return explanation 説明文
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * 説明文を格納するメソッド
     * @param explanation 説明文
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * 値段を取得するメソッド
     * @return price 値段
     */
    public String getPrice() {
        return price;
    }

    /**
     * 値段を格納するメソッド
     * @param price 値段
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 現在ページを取得するメソッド
     * @return page 現在ページ
     */
    public int getPage() {
        return page;
    }

    /**
     * 現在ページを格納するメソッド
     * @param page 現在ページ
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 検索する商品名を取得するメソッド
     * @return selectItem 検索する商品名
     */
    public String getSelectItem() {
        return selectItem;
    }

    /**
     * 検索する商品名を格納するメソッド
     * @param selectItem 検索する商品名
     */
    public void setSelectItem(String selectItem) {
        this.selectItem = selectItem;
    }

    /**
     * 商品追加メッセージを取得するメソッド
     * @return insertMessage 商品追加メッセージ
     */
    public String getInsertMessage() {
        return insertMessage;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    /**
     * 未入力エラーメッセージを取得するメソッド
     * @return nullErrorMessage 未入力エラーメッセージ
     */
    public String getNullErrorMessage() {
        return nullErrorMessage;
    }

    /**
     * 数字入力エラーメッセージを取得するメソッド
     * @return intErrorMessage 数字入力エラーメッセージ
     */
    public String getIntErrorMessage() {
        return intErrorMessage;
    }

}