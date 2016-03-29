package com.internousdevwork.mackeypark.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * ユーザーを削除するDAOクラス
 * @author KAZUHIRO YOSHIHARA
 * @version 1.0
 * @since 1.0
 */
public class AdminDeleteUserDAO {

    /**
     * 更新件数
     */
    private int count;

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
     * openconnectデータベースに接続しuserテーブルからユーザーIDの一致したユーザーを削除するメソッド
     * @param id ユーザーID
     * @return count 更新件数を返します。
     */
    public int delete(int id){
        count = 0;
        try{
        	con = DBConnector.getConnection("openconnect");
            sql = "delete from user where id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            count =ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }

}
