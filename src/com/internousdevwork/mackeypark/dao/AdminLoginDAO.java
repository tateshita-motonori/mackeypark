package com.internousdevwork.mackeypark.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 管理者ログインするDAOクラス
 * @author RYOUSUKE MASAKI
 * @version 1.0
 * @since 1.0
 */
public class AdminLoginDAO {

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
     * openconnectデータベースに接続し、adminテーブルにユーザーIDとパスワードが登録されているか判定するメソッド
     * @param id ユーザーID
     * @param password パスワード
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select( String id, String password ){
        isResult = false;
        try{
            con = DBConnector.getConnection("openconnect");
            sql = "SELECT id FROM admin WHERE admin_id = ? AND password = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if(rs.next()){
                isResult = true;
            }
        }
        catch(SQLException e){
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
