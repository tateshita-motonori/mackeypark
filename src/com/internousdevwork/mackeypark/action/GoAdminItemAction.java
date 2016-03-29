package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoAdminItemDAO;
import com.internousdevwork.mackeypark.dto.AdminItemsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品リストを作成するアクションクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class GoAdminItemAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 2494474900328891974L;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * 商品リスト
     */
    private ArrayList<AdminItemsDTO> itemList = new ArrayList<>();

    /**
     * 商品10個が格納されたマップのリスト
     */
    private ArrayList<ArrayList<AdminItemsDTO>> itemMapList = new ArrayList<>();

    /**
     * ページリスト
     */
    private ArrayList<Integer> pageList = new ArrayList<>();

    /**
     * 現在ページ
     */
    private int page=1;

    /**
     * 検索する商品名
     */
    private String selectItem;

    /**
     * 検索結果無し
     */
    private String noResultMessage="";

    /**
     * 未入力エラーメッセージ
     */
    private String nullErrorMessage;

    /**
     * 数字入力エラーメッセージ
     */
    private String intErrorMessage;

    /**
     * 期間
     */
    private String period;

    /**
     * 種類
     */
    private String division;

    /**
     * 説明文
     */
    private String explanation;

    /**
     * 値段
     */
    private String price;

    /**
     * 商品追加メッセージ
     */
    private String insertMessage;

    /**
     * 削除メッセージ
     */
    private String deleteMessage;

    /**
     * mackeyparkデータベースのticketテーブルから商品リストを取得するメソッド
     * @return SUCCESS 常にSUCCESSを返します。
     */
    public String execute(){
    	GoAdminItemDAO listDao = new GoAdminItemDAO();
        if(selectItem == null || selectItem.length()==0){
            if(!listDao.selectItem(itemList)){
                noResultMessage=getText("admin_item.no_item");
                return SUCCESS;
            }
        }else{
            selectItem = selectItem.trim();
            if(!listDao.selectItemByItemName(selectItem, itemList)){
                noResultMessage=getText("admin_item.no_item");
                return SUCCESS;
            }
        }
        noResultMessage="";
        Iterator<AdminItemsDTO> it = itemList.iterator();
        int count = 0;
        while(it.hasNext()){
            ArrayList<AdminItemsDTO> tenItemsList = new ArrayList<>();
            for(int i=0; i<10; i++){
                if(!it.hasNext()){
                    break;
                }
                tenItemsList.add(it.next());
            }
            count++;
            itemMapList.add(tenItemsList);
            pageList.add(count);
        }
        itemList = itemMapList.get((page-1));
        return SUCCESS;
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
     * 商品リストを取得するメソッド
     * @return itemList 商品リスト
     */
    public ArrayList<AdminItemsDTO> getItemList() {
        return itemList;
    }

    /**
     * ページリストを取得するメソッド
     * @return pageList ページリスト
     */
    public ArrayList<Integer> getPageList() {
        return pageList;
    }

    /**
     * 検索結果無しを取得するメソッド
     * @return noisResult 検索結果無し
     */
    public String getNoResultMessage() {
        return noResultMessage;
    }

    /**
     * 未入力エラーメッセージを取得するメソッド
     * @return nullErrorMessage 未入力エラーメッセージ
     */
    public String getNullErrorMessage() {
        return nullErrorMessage;
    }

    /**
     * 未入力エラーメッセージを格納するメソッド
     * @param nullErrorMessage 未入力エラーメッセージ
     */
    public void setNullErrorMessage(String nullErrorMessage) {
        this.nullErrorMessage = nullErrorMessage;
    }

    /**
     * 数字入力エラーメッセージを取得するメソッド
     * @return intErrorMessage 数字入力エラーメッセージ
     */
    public String getIntErrorMessage() {
        return intErrorMessage;
    }

    /**
     * 数字入力エラーメッセージを格納するメソッド
     * @param intErrorMessage 数字入力エラーメッセージ
     */
    public void setIntErrorMessage(String intErrorMessage) {
        this.intErrorMessage = intErrorMessage;
    }

    /**
     * 期間を取得するメソッド
     * @return period 期間
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 期間を格納するメソッド
     * @param period 期間
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
     * 商品追加メッセージを取得するメソッド
     * @return insertMessage 商品追加メッセージ
     */
    public String getInsertMessage() {
        return insertMessage;
    }

    /**
     * 商品追加メッセージを格納するメソッド
     * @param insertMessage 商品追加メッセージ
     */
    public void setInsertMessage(String insertMessage) {
        this.insertMessage = insertMessage;
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
     * 削除メッセージを取得するメソッド
     * @return deleteMessage 削除メッセージ
     */
    public String getDeleteMessage() {
        return deleteMessage;
    }

    /**
     * 削除メッセージを格納するメソッド
     * @param deleteMessage 削除メッセージ
     */
    public void setDeleteMessage(String deleteMessage) {
        this.deleteMessage = deleteMessage;
    }

}