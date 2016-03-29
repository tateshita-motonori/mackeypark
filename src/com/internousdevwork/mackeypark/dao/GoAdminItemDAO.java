package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.AdminItemsDTO;
import com.internousdevwork.mackeypark.util.DBConnector;
/**
 * 商品リストをデータベースから取得するDAOクラス
 * @author SHIZUKA IMANISHI
 * @version 1.0
 * @since 1.0
 */
public class GoAdminItemDAO {

    /**
     * 結果を格納するDTOクラス
     */
    private AdminItemsDTO dto;

    /**
     * 絵柄
     */
    private String design;

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
     * 検索していない時に商品リストをmackeyparkデータベースのticketテーブルから商品リスト取得するメソッド
     * @param itemList 商品リスト
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectItem(ArrayList<AdminItemsDTO> itemList){
        isResult = false;
        con = DBConnector.getConnection("mackeypark");
        try{
            sql = "SELECT item_id, item_name, period, division,explanation, group_concat(design separator '、'), price FROM ticket group by item_name order by item_id";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                dto = new AdminItemsDTO();
                dto.setItemId(rs.getInt("item_id"));
                dto.setItemName(rs.getString("item_name"));
                dto.setPeriod(rs.getString("period"));
                dto.setDivision(rs.getString("division"));
                dto.setExplanation(rs.getString("explanation"));
                design=rs.getString("group_concat(design separator '、')");
                dto.setDesign(design);
                dto.setPrice(rs.getInt("price"));
                itemList.add(dto);
                isResult = true;
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
        return isResult;
    }

    /**
     * 検索した時にmackeyparkデータベースからticketテーブルから商品リストを取得するメソッド
     * @param selectItem 検索する商品名
     * @param itemList  商品リスト
     * @return isResult 更新結果の有無を返します。
     */
    public boolean selectItemByItemName(String selectItem, ArrayList<AdminItemsDTO> itemList){
        isResult = false;
        con = DBConnector.getConnection("mackeypark");
        try{
            sql = "SELECT item_id, item_name, period, division, design, price FROM ticket WHERE item_name LIKE ? order by item_id";
            ps = con.prepareStatement(sql);
            String partialMatch = "%" + selectItem + "%";
            ps.setString(1,partialMatch);
            rs = ps.executeQuery();
            while(rs.next()){
                dto = new AdminItemsDTO();
                dto.setItemId(rs.getInt("item_id"));
                dto.setItemName(rs.getString("item_name"));
                dto.setPeriod(rs.getString("period"));
                dto.setDivision(rs.getString("division"));
                design=rs.getString("design");
                dto.setDesign(design);
                dto.setPrice(rs.getInt("price"));
                itemList.add(dto);
                isResult = true;
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
        return isResult;
    }

}