package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.dto.LoginDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * ログインするDAOクラス
 * @author KATUSAKA KOTAKI
 * @version 1.0
 * @since 1.0
 */
public class LoginDAO {

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
     * 結果を格納するDTOクラス
     */
    private LoginDTO dto = new LoginDTO();

    /**
     * openconnectデータベースに接続し、メールアドレスとパスワードがuserテーブルに登録されているか判定するメソッド
     * @param email メールアドレス
     * @param password パスワード
     * @return true/false 登録されていればtrueを返し、登録されていなければfalseを返します。
     */
    public boolean select(String email, String password){
        try{
            con = DBConnector.getConnection("openconnect");
            sql = "SELECT id FROM user WHERE email=? AND password=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if(rs.next()){
                dto.setId(rs.getInt("id"));
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    /**
     * 結果を格納するDTOクラスを取得するメソッド
     * @return dto 結果を格納するDTOクラス
     */
    public LoginDTO getDto() {
        return dto;
    }

}