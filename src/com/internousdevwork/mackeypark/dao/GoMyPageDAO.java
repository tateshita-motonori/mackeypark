package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * マイページに遷移するDAOクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoMyPageDAO {

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * フリガナ
     */
    private String nameKana;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * クレジットカードの下4ケタ
     */
    private String cardNumber;

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection con;

    /**
     * SQL文
     */
    private String sql;

    /**
     * 検索結果の有無
     */
    private boolean isResult;

    /**
     * SQL文を実行するためのインターフェース
     */
    private PreparedStatement ps;

    /**
     * 結果を格納するインターフェース
     */
    private ResultSet rs;

    /**
     * openconnectデータベースのuserテーブルからユーザー名とフリガナを検索するメソッド
     * @param id ユーザーID
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select(int id){
        isResult = false;
        try{
            con = DBConnector.getConnection("openconnect");
            sql = "SELECT user_name,user_kana,email,credit_number FROM user WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                userName = rs.getString("user_name");
                nameKana = rs.getString("user_kana");
                email = rs.getString("email");
                cardNumber = rs.getString("credit_number");
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

    /**
     * ユーザー名を取得するメソッド
     * @return userName ユーザー名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ユーザー名を格納するメソッド
     * @param userName ユーザー名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * フリガナを取得するメソッド
     * @return nameKana フリガナ
     */
    public String getNameKana() {
        return nameKana;
    }

    /**
     * フリガナを格納するメソッド
     * @param nameKana フリガナ
     */
    public void setNameKana(String nameKana) {
        this.nameKana = nameKana;
    }

    /**
     * メールアドレスを取得するメソッド
     * @return email メールアドレス
     */
    public String getEmail() {
        return email;
    }

    /**
     * メールアドレスを格納するメソッド
     * @param email メールアドレス
     */
    public void setmEmails(String email) {
        this.email = email;
    }

    /**
     * クレジットカードの下4ケタを取得するメソッド
     * @return cardNumber クレジットカードの下4ケタ
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * クレジットカードの下4ケタを格納するメソッド
     * @param cardNumber クレジットカードの下4ケタ
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

}