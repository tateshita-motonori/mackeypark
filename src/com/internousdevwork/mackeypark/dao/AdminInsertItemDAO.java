package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.dto.AdminItemsDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 商品をデータベースに追加するDAOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class AdminInsertItemDAO {

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
     * 更新件数
     */
    private int count=0;

    /**
     * mackeyparkデータベースのticketテーブルに商品情報を追加するメソッド
     * @param dto 商品情報が入るDTOクラス
     * @return count 更新件数を返します。
     */
    public int insert(AdminItemsDTO dto){
        try{
            con = DBConnector.getConnection("mackeypark");
            sql = "insert into ticket(item_name,period,division,explanation,design,img_path,price,registration_date)values(?,?,?,?,?,?,?,now())";
            ps = con.prepareStatement(sql);
            ps.setString(1, dto.getItemName());
            ps.setString(2, dto.getPeriod());
            ps.setString(3, dto.getDivision());
            ps.setString(4, dto.getExplanation());
            ps.setString(5, dto.getDesign());
            ps.setString(6, dto.getimgPath());
            ps.setInt(7, dto.getPrice());
            count = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        System.out.println(count);
        return count;
    }


    public boolean selectItem(String itemName){
     try{
            con = DBConnector.getConnection("mackeypark");
            sql ="SELECT item_name,design FROM ticket WHERE item_name= ? AND design IN('マッキ―','マニー','ドイジー','グッフィ','ポルート')";
            ps = con.prepareStatement(sql);
            ps.setString(1,itemName);

			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				return false;
				}
			return true;
			} catch (SQLException e) {

				System.out.println("例外");
				return false;
			}
}
    }