package com.internousdevwork.mackeypark.dao;

import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdevwork.mackeypark.util.DBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * 購入履歴をデータベースに追加するDAOクラス
 * @author SAORI MAEKAWA
 * @since 1.0
 * @version 1.0
 */
public class GoPurchaseCompletionDAO {

    /**
     * mackeyparkデータベースのhistoryテーブルに購入履歴を格納するメソッド
     * @param id ユーザーID
     * @param itemId 商品ID
     * @param numberOfItems 購入枚数
     * @return true/false 格納に成功したらtrue、失敗したらfalseを返します。
     */
    public boolean insert(String id,String itemId,String numberOfItems){
        String date;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String sdfTime = sdf.format(c.getTime());
        date = sdfTime;
        DB db = null;
        MongoClient mongo = null;
        try {
            mongo = new MongoClient("localhost", 27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }
        db = mongo.getDB("mackeypark");
        DBCollection colls = db.getCollection("history");
        BasicDBObject input = new BasicDBObject();
        long count = colls.getCount();
        long i = ++count;
        String s = String.valueOf(i);
        input.put("sales_id",s);
        input.put("user_id",id);
        input.put("item_id",itemId  );
        input.put("number_of_items", numberOfItems);
        input.put("date", date);
        colls.insert(input);
        return true;
    }

    /**
     * <p>
     * openconnectデータベースのuserテーブルよりユーザーIDを条件に検索を行い、<br>
     * クレジットカードトークンの有無を確認するメソッド<br>
     * </p>
     * @param id ユーザーID
     * @return true/false クレジットトークンがあればtrue、なければfalseを返します。
     */
    public boolean cardcheck(int id){
        String sql;
        String token = null;
        Connection con = DBConnector.getConnection("openconnect");
        try{
            sql = "select credit_token from user where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                token = rs.getString("credit_token");
            }
            if(token != null){
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return false;
    }

}
