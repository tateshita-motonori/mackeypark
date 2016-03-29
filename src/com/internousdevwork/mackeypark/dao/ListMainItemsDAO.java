package com.internousdevwork.mackeypark.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.ListMainItemsDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * メインで商品一覧を表示するDAOクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class ListMainItemsDAO {

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
    private ArrayList<ListMainItemsDTO> itemList = new ArrayList<>();

    /**
     * <p>
     * mackeyparkデータベースに接続し<br>
     * ticketテーブルの種類と説明と値段情報を取得するメソッド<br>
     * </p>
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select() {
        isResult = false;
        try {
            con = DBConnector.getConnection("mackeypark");
            sql = "SELECT division,explanation,price FROM ticket GROUP BY division ORDER BY item_id";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ListMainItemsDTO dto = new ListMainItemsDTO();
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
