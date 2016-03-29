package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.ListSelectConditionItemsDTO;
import com.internousdevwork.mackeypark.util.TicketListDBCT;

/** 商品情報を取得するDAOクラス
 * @author SODAI ARAKAWA
 * @version 1.0
 * @since 1.0
 */
public class ListSelectConditionItemsDAO {

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
     * 商品リスト
     */
    private ArrayList<ListSelectConditionItemsDTO> itemList = new ArrayList<>();

    /**
     * mackeyparkデータベースのticketテーブルからデータを取得するメソッド
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectItem() {
        isResult = false;
        try {
            con = TicketListDBCT.getConnection();
            sql = "select division,explanation,price from ticket group by division order by item_id";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ListSelectConditionItemsDTO dto = new ListSelectConditionItemsDTO();
                dto.setDivision(rs.getString("division"));
                dto.setExplanation(rs.getString("explanation"));
                dto.setPrice(rs.getInt("price"));
                itemList.add(dto);
                isResult = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return isResult;
    }

    /**
     * mackeyparkデータベースのticketテーブルから期間を取得するメソッド
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectPeriod(String division, ArrayList<String> periodList){
        isResult = false;
        try{
            con = TicketListDBCT.getConnection();
            sql = "select period,price from ticket where division = ? group by period order by item_id";
            ps = con.prepareStatement(sql);
            ps.setString(1, division);
            rs = ps.executeQuery();
            while(rs.next()){
                periodList.add(rs.getString("period") + " : " + rs.getInt("price") + "円");
                isResult = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isResult;
    }

    /**
     * 商品リストを取得するメソッド
     * @return itemList 商品リスト
     */
    public ArrayList<ListSelectConditionItemsDTO> getSelectList() {
        return itemList;
    }

    /**
     * 商品リストを格納するメソッド
     * @param itemList 商品リスト
     */
    public void setSelectList(ArrayList<ListSelectConditionItemsDTO> itemList) {
        this.itemList = itemList;
    }

}