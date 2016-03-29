package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 商品をデータベースから削除するDAOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class AdminDeleteItemDAO {

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection con;

    /**
     * SQL文
     */
    private String sql;

    /**
     * SQL文を実行するためのインターフェース
     */
    private PreparedStatement ps;

    /**
     * 結果を格納するインターフェース
     */
    private ResultSet rs;

    /**
     * 更新件数
     */
    private int count=0;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * 検索結果の有無
     */
    private boolean isResult;

    /**
     * mackeyparkデータベースのticketテーブルから商品情報を削除するメソッド
     * @param deleteItem 削除する商品名
     * @return count 更新件数を返します。
     */
    public int deleteItemName(String deleteItem){
        try{
            con = DBConnector.getConnection("mackeypark");
            sql = "DELETE FROM ticket WHERE item_name = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, deleteItem);
            count = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }

    /**
     * mackeyparkデータベースのticketテーブルの商品IDから商品名を検索するメソッド
     * @param deleteItemID 検索する商品ID
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectItemName(int deleteItemID){
        isResult=false;
        try{
            con = DBConnector.getConnection("mackeypark");
            sql = "SELECT item_name FROM ticket WHERE item_id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,deleteItemID);
            rs = ps.executeQuery();
            if(rs.next()){
                isResult=true;
                itemName = rs.getString("item_name");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return isResult;
    }

    /**
     * 商品名を取得するメソッド
     * @return itemName
     */
    public String getItemName(){
        return itemName;
    }

}