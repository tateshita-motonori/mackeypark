package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.dto.UserInformationDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 情報変更で入力された値をデータベースに登録するDAOクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class GoEditUserCompletionDAO {

    /**
     * ユーザーID
     */
    private int id;

    /**
     * 更新件数
     */
    private int count;

    /**
     * 検索結果の有無
     */
    private boolean isResult;

    /**
     * SQL文を送るための準備
     */
    private PreparedStatement ps;

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection con;

    /**
     * 結果を格納するインターフェース
     */
    private ResultSet rs;


    /**
     * <p>
     * openconnectデータベースのuserテーブルのユーザー情報を変更するメソッド<br>
     * ユーザーネーム、フリガナ、メールアドレス、パスワードをopenconnectデータベースに格納します。<br>
     * </p>
     * @param email メールアドレス
     * @param password パスワード
     * @param id ユーザーID
     * @return count 更新件数を返します。
     */
    public int update(String email,String password,int id){
        count = 0;
        con = DBConnector.getConnection("openconnect");
        try {
            String sql = "Update user set email = ?,password = ? where id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setInt(3, id);
            count = ps.executeUpdate();
        } catch (SQLException e) {
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

    /**
     * <p>
     * openconnectデータベースのuserテーブルのクレジットカード情報を変更するメソッド<br>
     * クレジットトークン、クレジットカード下４ケタ、ユーザーIDをopenconnectデータベースに格納します。<br>
     * </p>
     * @param token クレジットトークン
     * @param card4 クレジットカード下４ケタ
     * @param userId ユーザーID
     * @return count 更新件数を返します。
     */
    public int updateCard(String token, String card4, int userId){
        count = 0;
        try{
            con = DBConnector.getConnection("openconnect");
            String sql = "update user set credit_number = ?, credit_token = ? where id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, card4);
            ps.setString(2, token);
            ps.setInt(3, userId);
            count = ps.executeUpdate();
            return count;
        }catch(SQLException e){
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

    /**
     * mackeyparkデータベースのtempテーブルから格納された情報を取り出し、dtoへ格納するメソッド
     * @param tempId 一時テーブルのID
     * @param dto 結果を格納するDTOクラス
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select(int tempId,UserInformationDTO dto){
        isResult = false;
        con = DBConnector.getConnection("mackeypark");
        try{
            String sql = "select password,email,card_number,card_holder,expiration_date,security_code from temp WHERE temp_id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, tempId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dto.setPassword(rs.getString("password"));
                dto.setEmail(rs.getString("email"));
                dto.setCardNumber(rs.getString("card_number"));
                dto.setCardHolder(rs.getString("card_holder"));
                dto.setExpirationDate(rs.getString("expiration_date"));
                dto.setSecurityCode(rs.getString("security_code"));
                isResult = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if( con!= null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isResult;
    }

    /**
     * openconnectデータベースのuserテーブルからユーザーIDを取得するメソッド
     * @param id ユーザーID
     * @return isResult 検索結果の有無を返します。
     */
    public boolean select(int id){
        isResult = false;
        Connection con = DBConnector.getConnection("openconnect");
        try{
            String sql = "select id from user WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                isResult = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if( con!= null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isResult;
    }

    /**
     *<p>
     * 更新に成功したmackeyparkデータベースのtempテーブルに<br>
     * 格納されているユーザー情報を削除するメソッド<br>
     * </p>
     * @param tempId 一時テーブルのID
     * @return count 更新件数を返します。
     */
    public int delete(int tempId) {
        int count = 0;
        try{
            con = DBConnector.getConnection("mackeypark");
            String sql ="delete from temp  where temp_id =?";
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1,tempId);
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

    /**
     * ユーザーID取得するメソッド
     * @return id ユーザーID
     */
    public int getId() {
        return id;
    }

}
