package com.internousdevwork.mackeypark.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.TicketListDBCT;;

/**
 * 購入確認で商品一覧を表示するDAOクラス
 * @author SODAI ARAKAWA
 * @version 1.0
 * @since 1.0
 */
public class ListPurchaseCheckItemsDAO {

    /**
     * 種類
     */
	private String[] division = new String[100];

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
     * mackeyparkデーターベースのticketテーブルから商品の種類を取得するメソッド
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectItem() {
        isResult = true;
        int i = 0;
        try {
        	con = TicketListDBCT.getConnection();
            sql = "select division from ticket group by division order by item_id";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                division[i]= rs.getString("division");
                i++;
            }
            if(division.length==0){
                isResult = false;
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
     * 種類を取得するメソッド
     * @return division 種類
     */
    public String[] getDivision() {
        return division;
    }

    /**
     * 種類を格納するメソッド
     * @param division 種類
     */
    public void setDivision(String[] division) {
        this.division = division;
    }

}