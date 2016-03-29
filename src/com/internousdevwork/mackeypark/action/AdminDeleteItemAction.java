package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.AdminDeleteItemDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品をデータベースから削除するアクションクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class AdminDeleteItemAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -2896885150649418304L;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * 削除する商品名
     */
    private String deleteItem;

    /**
     * 削除する商品ID
     */
    private int deleteItemId;

    /**
     * 削除メッセージ
     */
    private String deleteMessage;

    /**
     * 現在ページ
     */
    private int page=1;

    /**
     * 検索する商品名
     */
    private String selectItem;

    /**
     * <p>
     * mackeyparkデータベースのticketテーブルから商品情報を削除するメソッド<br>
     * 削除に失敗したらエラーメッセージを表示します。<br>
     * </p>
     * @return SUCCESS/ERROR 入力されたitemIdが存在する場合SUCCESSを返し、存在しない場合ERRORを返します。
     */
    public String execute(){
        AdminDeleteItemDAO deleteDao = new AdminDeleteItemDAO();
        try{
            deleteItemId=Integer.parseInt(deleteItem);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(deleteItemId!=0){
            if(deleteDao.selectItemName(deleteItemId)){
                deleteItem = deleteDao.getItemName();
            }else{
                deleteMessage = getText("admin_item.delete_ac_notfind");
                return ERROR;
            }
        }
        if(deleteDao.deleteItemName(deleteItem)<1){
            deleteMessage =  getText("admin_item.delete_ac_notfind");
            return ERROR;
        }else{
            deleteMessage = "「" + deleteItem + "」"+ getText("admin_item.delete_ac_delete");
        }
        return SUCCESS;
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
     * @return searchItem 検索する商品名
     */
    public String getSelectItem() {
        return selectItem;
    }

    /**
     * 検索する商品名を格納するメソッド
     * @param searchItem 検索する商品名
     */
    public void setSelectItem(String searchItem) {
        this.selectItem = searchItem;
    }

    /**
     * 削除メッセージを取得するメソッド
     * @return deleteMessage 削除メッセージ
     */
    public String getDeleteMessage() {
        return deleteMessage;
    }

    /**
     * 削除する商品名を格納するメソッド
     * @param deleteItem 削除する商品名
     */
    public void setDeleteItem(String deleteItem) {
        this.deleteItem = deleteItem;
    }

}