package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.mackeypark.dto.UserInformationDTO;
import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * 新規登録で入力された値をデータベースに登録するDAOクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class GoCreateUserCompletionDAO {

    /**
     * ユーザーID
     */
    private int id;

    /**
     * 更新件数
     */
    public int count;

    /**
     * SQL文を実行するためのインターフェース
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
     * openconnectデータベースのuserテーブルに値を格納するメソッド<br>
     * ユーザーネーム、フリガナ、メールアドレス、パスワードをopenconnectデータベースに格納します。<br>
     * </p>
     * @param userName ユーザー名
     * @param nameKana フリガナ
     * @param email メールアドレス
     * @param password パスワード
     * @return count 更新件数を返します。
     */
    public int insert(String userName,String nameKana,String email,String password){
        count = 0;
        try {
            con = DBConnector.getConnection("openconnect");
            String sql = "insert into user(user_name,user_kana,email,password) values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, nameKana);
            ps.setString(3, email);
            ps.setString(4, password);
            count = ps.executeUpdate();
            sql="select id from user where email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt("id");
            }else{
                return count;
            }
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
     * openconnectデータベースのuserテーブルにクレジットカード情報を格納するメソッド
     * @param token クレジットトークン
     * @param card4 クレジットカード下４ケタ
     * @param userId ユーザーID
     * @return count 更新件数を返します。
     */
    public int update(String token, String card4, int userId){
        count = 0;
        con = DBConnector.getConnection("openconnect");
        try{
            String sql = "update user set credit_number = ?, credit_token = ? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
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
     * mackeyparkデータベースのtempテーブルの中から値を取り出し、dtoに値を格納するメソッド
     * @param tempId 一時テーブルのID
     * @param dto 結果を格納するDTOクラス
     * @return isResult tempテーブルから値を取得できたらtrue、できなければfalseを返します。
     */
    public boolean select(int tempId,UserInformationDTO dto){
        boolean isResult = false;
        con = DBConnector.getConnection("mackeypark");
        try{
            String sql = "select user_name,user_kana,password,email,card_number,card_holder,expiration_date,security_code from temp WHERE temp_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tempId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dto.setUserName(rs.getString("user_name"));
                dto.setNameKana(rs.getString("user_kana"));
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
     *<p>
     * 更新に成功した後makeyparkデータベースのtempテーブルに<br>
     * 格納されているユーザー情報を削除するメソッド<br>
     * </p>
     * @param tempId 一時テーブルのID
     * @return count 更新件数を返します。
     */
    public int delete(int tempId) {
        con = DBConnector.getConnection("mackeypark");
        int count = 0;
        try{
            String sql ="delete from temp  where temp_id =?";
            PreparedStatement ps = con.prepareStatement(sql);
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
