package com.internousdevwork.mackeypark.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.AdminSelectPurchaseHistoryDTO;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 * 購入履歴を検索するDAOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class AdminSelectPurchaseHistoryDAO {

    /**
     * MongoDBのインスタンス
     */
    private DB db;

    /**
     * 購入履歴リスト
     */
    private ArrayList<AdminSelectPurchaseHistoryDTO> historyList;

    /**
     * MongoDBに接続するためのクライアントクラス
     */
    private MongoClient mongo;

    /**
     * MongoDBコレクションのオブジェクトクラス
     */
    private DBCollection coll;

    /**
     * MongoDBに値を登録するためのHashMap
     */
    private BasicDBObject query;

    /**
     * 結果を格納するオブジェクトクラス
     */
    private DBCursor cursor;

    /**
     * データベースのサブセット
     */
    private DBObject dbs;

    /**
     * mackeyparkデータベースのhistoryテーブルの購入履歴を検索するメソッド
     * @param selectDivision 検索種別
     * @param selectCondision 検索条件
     * @return historyList 購入履歴リストを返します。
     */
    public ArrayList<AdminSelectPurchaseHistoryDTO> select( String selectDivision, String selectCondision ) {
        historyList = new ArrayList<AdminSelectPurchaseHistoryDTO>();
        try {
            mongo = new MongoClient( "localhost", 27017 );
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        db = mongo.getDB( "mackeypark" );
        coll = db.getCollection( "history" );
        query = new BasicDBObject( selectDivision, selectCondision );
        cursor = coll.find(query);
        try {
            while(cursor.hasNext()) {
                AdminSelectPurchaseHistoryDTO dto = new AdminSelectPurchaseHistoryDTO();
                dbs = cursor.next();
                dto.setSalesId((String)dbs.get("sales_id"));
                dto.setId((String)dbs.get("user_id"));
                dto.setItemId((String)dbs.get("item_id"));
                dto.setNumberOfItems((String)dbs.get("number_of_items"));
                dto.setAmount((String)dbs.get("amount"));
                dto.setDate((String)dbs.get("date"));
                historyList.add(dto);
            }
        } finally {
            cursor.close();
        }
        return historyList;
    }

}