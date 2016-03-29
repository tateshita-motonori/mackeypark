package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 商品情報をmackeyparkデータベースから取得するDAOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class GoPurchaseCheckDAO {

    /**
     * 商品ID
     */
    private int itemId;

    /**
     * 値段
     */
    private int price;

    /**
     * 検索結果の有無
     */
    private boolean isResult;

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
     * <p>
     * mackeyparkデータベースのticketテーブルより、<br>
     * 有効期間、種類、絵柄を条件に商品IDと値段を取得するメソッド<br>
     * </p>
     * @param period 期間
     * @param division 種類
     * @param design 絵柄
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectItem(String period, String division, String design){
        isResult = false;
        try{
        	con = DBConnector.getConnection("mackeypark");
            sql = "SELECT item_id, price FROM ticket WHERE period = ? AND division = ? AND design = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, period);
            ps.setString(2,division);
            ps.setString(3, design);
            rs = ps.executeQuery();
            if(rs.next()){
                itemId = rs.getInt("item_id");
                price = rs.getInt("price");
            }
            isResult = true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return isResult;
    }

    /**
     * <p>
     * mackeyparkデータベースのticketテーブルより、<br>
     * 種類を条件に有効期間のリストを取得するメソッド<br>
     * </p>
     * @param division 種類
     * @param periodList 期間リスト
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectPeriodList(String division, ArrayList<String> periodList ){
        isResult = false;
        try{
        	con = DBConnector.getConnection("mackeypark");
            sql = "SELECT period FROM ticket WHERE division = ? GROUP BY period";
            ps = con.prepareStatement(sql);
            ps.setString(1, division);
            rs = ps.executeQuery();
            while(rs.next()){
                periodList.add(rs.getString("period"));
            }
            isResult = true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return isResult;
    }

    /**
     * 商品IDを取得するメソッド
     * @return itemId 商品ID
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * 値段を取得するメソッド
     * @return price 値段
     */
    public int getPrice() {
        return price;
    }

}