package com.internousdevwork.mackeypark.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.GoAdminPurchaseHistoryDTO;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * 購入履歴に遷移し、購入履歴を表示するDAOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseHistoryDAO {

    /**
     * 検索結果の有無
     */
    private boolean isResult;

    /**
     * 購入履歴リスト
     */
    private ArrayList<GoAdminPurchaseHistoryDTO> historyList = new ArrayList<GoAdminPurchaseHistoryDTO>();

    /**
     * mackeyparkデータベースのhistoryテーブルから購入履歴の値を取得し、リストを作成するメソッド
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select(){
        isResult = false;
        DB db = null;
        MongoClient mongo = null;
        try {
            mongo = new MongoClient("localhost", 27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        db = mongo.getDB("mackeypark");
        DBCollection colls = db.getCollection("history");
        DBCursor cursor = colls.find();
        try {
            while( cursor.hasNext() ) {
                DBObject dbs = cursor.next();
                GoAdminPurchaseHistoryDTO dto = new GoAdminPurchaseHistoryDTO();
                dto.setSalesId((String)dbs.get("sales_id"));
                dto.setUserId((String)dbs.get("user_id"));
                dto.setItemId((String)dbs.get("item_id"));
                dto.setNumberOfItems((String)dbs.get("number_of_items"));
                dto.setAmount((String)dbs.get("amount"));
                dto.setDate((String)dbs.get("date"));
                historyList.add(dto);
                isResult = true;
            }
        } finally {
            cursor.close();
        }
        return isResult;
    }

    /**
     * 購入履歴リストを取得するメソッド
     * @return historyList 購入履歴リスト
     */
    public ArrayList<GoAdminPurchaseHistoryDTO> getHistoryList() {
        return historyList;
    }

    /**
     * 購入履歴リストを格納するメソッド
     * @param historyList 購入履歴リスト
     */
    public void setHistoryList(ArrayList<GoAdminPurchaseHistoryDTO> historyList) {
        this.historyList = historyList;
    }


}
