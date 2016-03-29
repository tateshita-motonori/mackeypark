package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.dto.LoginOauthDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * Oauthでログインに必要な情報を取得するDAOクラス
 * @author KATUSAKA KOTAKI
 * @since 1.0
 * @version 1.0
 */
public class LoginOauthDAO{

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
     * 更新件数
     */
    private int count;

    /**
     * 結果を格納するDTOクラス
     */
    private LoginOauthDTO dto = new LoginOauthDTO();

    /**
     * <p>
     * openconnectデータベースに接続し、取得したoauthIdとoauthNameが<br>
     * userテーブルに登録されているか判定するためのメソッド<br>
     * 登録されていればユーザーIDをDTOに格納します。<br>
     * </p>
     * @param oauthId OAuthサービス元のユニークID
     * @param oauthName OAuthサービス元のユーザー名
     * @return true/false 登録されていればtrueを返し、登録されていなければfalseを返します。
     */
    public boolean select(String oauthId, String oauthName){
        try{
            con = DBConnector.getConnection("openconnect");
            sql = "SELECT id FROM user WHERE oauth_id=? AND oauth_name=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,oauthId);
            ps.setString(2,oauthName);
            rs = ps.executeQuery();
            if(rs.next()){
                dto.setId(rs.getInt("id"));
                return true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 初回ログイン時にopenconnectデータベースに接続し、userテーブルにユーザー情報を登録できるか確認するメソッド
     * @param oauthId OAuthサービス元のユニークID
     * @param userName OAuthサービス元のユーザー名
     * @param oauthName OAuthサービス元の名前
     * @param email OAuthのサービス元で登録しているメールアドレス
     * @return count 更新件数を返します。
     */
    public int insert(String userName, String email, String oauthId, String oauthName ) {
        count = 0;
        try {
            con = DBConnector.getConnection("openconnect");
            sql = "INSERT INTO user(user_name, email, oauth_id, oauth_name) values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, email);
            ps.setString(3, oauthId);
            ps.setString(4, oauthName);
            count = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    /**
     * データベース(openconnect)に接続し、Twitterから受け取った情報を、テーブル(user)にユーザー情報としてインサートできるか確認する為のメソッド
     * @param oauthId OAuthサービス元のユニークID
     * @param userName OAuthサービス元のユーザー名
     * @param oauthName OAuthサービス元の名前
     * @param email OAuthのサービス元で登録しているメールアドレス
     * @return true/false <p>インサート成功時にtrueを、失敗時にfalse返します。</p>
     */
        public boolean insertFromTwitter(String userName, String oauthId, String oauthName ) {
            con = DBConnector.getConnection("openconnect");
            sql = "INSERT INTO user(user_name, oauth_id, oauth_name) values (?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, userName);
                ps.setString(2, oauthId);
                ps.setString(3, oauthName);

                int insertCount = ps.executeUpdate();
                if (insertCount > 0) {
                    return true;
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
            return false;
        }

    /**
     * 結果を格納するDTOクラスを取得するメソッド
     * @return dto 結果を格納するDTOクラス
     */
    public LoginOauthDTO getLoginOauthDTO() {
        return dto;
    }

    /**
     * 結果を格納するDTOクラスを格納するメソッド
     * @param dto 結果を格納するDTOクラス
     */
    public void setLoginOauthDTO(LoginOauthDTO dto) {
        this.dto = dto;
    }

}