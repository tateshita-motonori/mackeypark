package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dto.AdminUserDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * ユーザーの検索を行うDAOクラス
 * @author KAZUHIRO YOSHIHARA
 * @version 1.0
 * @since 1.0
 */
public class AdminSelectUsersDAO {

    /**
     * ユーザー一覧のリスト
     */
    private ArrayList<AdminUserDTO> userList = new ArrayList<>();

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
     * openconnectデータベースのuserテーブルから名前の一致したユーザー情報をリストに格納するメソッド
     * @param userName ユーザー名
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select(String userName){
        isResult = false;
        try {
            con = DBConnector.getConnection("openconnect");
            sql = "SELECT id, password, user_name, email FROM user WHERE user_name LIKE ?";
            ps = con.prepareStatement(sql);
            String partialMatch = "%" + userName + "%";
            ps.setString(1,partialMatch);
            rs = ps.executeQuery();
            while (rs.next()) {
                AdminUserDTO dto = new AdminUserDTO();
                dto.setId(rs.getInt("id"));
                dto.setPassword(rs.getString("password"));
                dto.setUserName(rs.getString("user_name"));
                dto.setEmail(rs.getString("email"));
                userList.add(dto);
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
     * ユーザー一覧のリストを取得するメソッド
     * @return userList ユーザー一覧のリスト
     */
    public ArrayList<AdminUserDTO> getUserList() {
        return this.userList;
    }

    /**
     * ユーザー一覧のリストを格納するメソッド
     * @param userList ユーザー一覧のリスト
     */
    public void setUsertList(ArrayList<AdminUserDTO> userList) {
        this.userList = userList;
    }

}