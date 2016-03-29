package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * ユーザー情報を削除し、ログアウトするDAOクラス
 * @author HARUKI NAKAGAWA
 * @version 1.0
 * @since 1.0
 */
public class WithdrawalDAO {

    /**
     * 更新件数
     */
    private int count = 0;
    
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
     * openconnectデータベースに接続しuserテーブルからユーザーIDを元にユーザー情報を削除するメソッド
     * @param id ユーザーID
     * @return count 更新件数を返します。
     */
    public int update(int id) {
        con = DBConnector.getConnection("openconnect");
        try{
            sql ="delete from user where id =?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            count = ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return count;
    }

}