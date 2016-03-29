package com.internousdevwork.mackeypark.action;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.ListMainItemsDAO;
import com.internousdevwork.mackeypark.dto.ListMainItemsDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * メインで商品一覧を表示するアクションクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class ListMainItemsAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -556900794609397717L;

    /**
     * 商品リスト
     */
    private ArrayList<ListMainItemsDTO> itemList = new ArrayList<>();

    /**
     * <p>
     * mackeyparkデータベースに接続し<br>
     * ticketテーブルの種類と説明と値段情報を取得するメソッド<br>
     * </p>
     * @return SUCCESS/ERROR データを取得できたら、SUCCESS、できなかったらERRORを格納し返します。
     */
    public String execute(){
        ListMainItemsDAO dao = new ListMainItemsDAO();
        if(dao.select()){
            itemList = dao.getItemList();
            if(itemList.size()<0){
                return ERROR;
            }
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    /**
     * 商品リストを取得するメソッド
     * @return itemList 商品リスト
     */
    public ArrayList<ListMainItemsDTO> getItemList() {
        return itemList;
    }

    /**
     * 商品リストを格納するメソッド
     * @param itemList 商品リスト
     */
    public void setItemList(ArrayList<ListMainItemsDTO> itemList) {
        this.itemList = itemList;
    }

}

