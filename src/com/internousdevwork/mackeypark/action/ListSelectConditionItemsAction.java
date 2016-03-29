package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.ListSelectConditionItemsDAO;
import com.internousdevwork.mackeypark.dto.ListSelectConditionItemsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 選択一覧で商品情報を取得するアクションクラス
 * @author SODAI ARAKAWA
 * @version 1.0
 * @since 1.0
 */
public class ListSelectConditionItemsAction extends ActionSupport{

    /**
     * 生成したシリアルナンバー
     */
    private static final long serialVersionUID = -1464738923160060669L;

    /**
     * 商品リスト
     */
    private ArrayList<ListSelectConditionItemsDTO> itemList = new ArrayList<>();

    /**
     * 期間リスト
     */
    private ArrayList<String> periodList;

    /**
     * ポップアップの有無
     */
    private int popup;

    /**
     * mackeyparkデータベースのticketテーブルからデータを取得するメソッド
     * @return SUCCESS/ERROR 商品情報を取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
     */
    public String execute(){
        ListSelectConditionItemsDAO dao = new ListSelectConditionItemsDAO();
        if(!dao.selectItem()){
            return ERROR;
        }
        itemList = dao.getSelectList();
        for(int i=0; i<itemList.size();i++){
            String division = itemList.get(i).getDivision();
            periodList = new ArrayList<>();
            if(!dao.selectPeriod(division, periodList)){
                return ERROR;
            }
            itemList.get(i).setPeriodList(periodList);
        }
        return SUCCESS;
    }

    /**
     * 商品リストを取得するメソッド
     * @return itemList 商品リスト
     */
    public ArrayList<ListSelectConditionItemsDTO> getItemList() {
        return itemList;
    }

    /**
     * 商品リストを格納するメソッド
     * @param itemList 商品リスト
     */
    public void setSelectList(ArrayList<ListSelectConditionItemsDTO> itemList) {
        this.itemList = itemList;
    }

    /**
     * ポップアップの有無を取得するメソッド
     * @return popup ポップアップの有無
     */
    public int getPopup() {
        return popup;
    }

    /**
     * ポップアップの有無を格納するメソッド
     * @param popup ポップアップの有無
     */
    public void setPopup(int popup) {
        this.popup = popup;
    }

}