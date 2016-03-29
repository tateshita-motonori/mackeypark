package com.internousdevwork.mackeypark.util;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * MongoDBの指定したデータベースに接続するutilクラス
 *
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class MDBConnector {

    /**
     * MongoDBの指定したデータベースに接続するメソッド
     * @return db 指定したデータベースへのコネクション情報を返します。
     */
    public DB getConnection(){
        DB db = null;
        try{
            MongoClient mongo = new MongoClient("localhost", 27017);
            db = mongo.getDB("event");
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        return db;
    }

}
