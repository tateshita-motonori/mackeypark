package com.internousdevwork.mackeypark.dao;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * 問い合わせ内容を追加するDAOクラス
 * @author RYOSUKE MASAKI
 * @version 1.0
 * @since 1.0
 */
public class InsertInquiryDAO {

    /**
     * 更新結果の有無
     */
    private boolean isResult = false;

    /**
     * MongoDBに接続するためのクライアントクラス
     */
    private MongoClient mongo = null;

    /**
     * MongoDBのインスタンス
     */
    private DB db = null;

    /**
     * MongoDBコレクションのオブジェクトクラス
     */
    private DBCollection coll;

    /**
     * 更新件数
     */
    private long count;
    /**
     * mackeyparkデータベースのformテーブルに入力された問い合わせ投稿者名、問い合わせメールアドレス、問い合わせ内容を登録するメソッド
     * @param formName 問い合わせ投稿者名
     * @param formAddress 問い合わせメールアドレス
     * @param formContents 問い合わせ内容
     * @return isResult 更新結果の有無を返します。
     */
    public boolean insert(String formName,String formAddress, String formContents){
        Calendar c=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        String date=sdf.format(c.getTime());
        try{
            mongo = new MongoClient("localhost", 27017);
        }catch(UnknownHostException e){
            e.printStackTrace();
            return isResult;
        }
        db = mongo.getDB("mackeypark");
        coll = db.getCollection("form");
        BasicDBObject input = new BasicDBObject();
        count = coll.getCount();
        long i = ++count;
        String formId = String.valueOf(i);
        input.put("form_id",formId);
        input.put("form_name",formName);
        input.put("form_address",formAddress);
        input.put("form_contents",formContents);
        input.put("date",date);
        coll.insert(input);
        isResult = true;
        return isResult;
    }

}