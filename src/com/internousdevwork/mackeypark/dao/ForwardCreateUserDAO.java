package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 一時テーブルの削除行うDAOクラス
 * @author TATESHITA MOTONORI
 * @version 1.0
 * @since 1.0
 */
public class ForwardCreateUserDAO {

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
     * mackeyparkデータベースのtempテーブルからtempIdが一致した項目を削除するメソッド
     * @param tempId 一時テーブルのID
     * @return count 更新件数を返します。
     */
    public int deleteTemp(int tempId){
        count = 0;
        con = DBConnector.getConnection("mackeypark");
        sql = " DELETE FROM temp WHERE temp_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,tempId);
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

}
