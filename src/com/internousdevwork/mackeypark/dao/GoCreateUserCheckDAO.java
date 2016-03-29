package com.internousdevwork.mackeypark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.util.DBConnector;

/**
 * <p>
 * 入力された値を検証、tempテーブルにinsertし、<br>
 * 更新から1時間が経過した情報を削除するDAOクラス<br>
 * </p>
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class GoCreateUserCheckDAO  implements SessionAware{

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * 更新件数
     */
    public int count;

    /**
     * 一時テーブルのID
     */
    private int tempId;

    /**
     * 結果を格納するインターフェース
     */
    private ResultSet rs;

    /**
     * 検索結果の有無
     */
    private boolean isResult;

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection con;

    /**
     * SQL文を実行するためのインターフェース
     */
    private PreparedStatement ps;

    /**
     * <p>
     * 入力されたメールアドレスが既に登録されているものでないかどうか<br>
     * openconnectデータベースのuserテーブルのデータと照合するメソッド<br>
     * </p>
     * @param email メールアドレス
     * @return isResult 検索結果の有無を返します。
     */
    public boolean selectByEmail(String email){
        isResult = false;
        try {
            con = DBConnector.getConnection("openconnect");
            String sql = "SELECT email FROM user WHERE email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
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
        return isResult ;
    }

    /**
     * <p>
     * mackeyparkデータベースのtempテーブルを作成した時刻と現在時刻を比較し、<br>
     * 作成から1時間以上が経過していれば該当IDの情報を全て削除するメソッド<br>
     * </p>
     * @return count 更新件数を返します。
     */
    public int deleteTemp(){
        Connection con = DBConnector.getConnection("mackeypark");
        try{
            String sql = "delete from temp where registration_date < now() - INTERVAL 3600 SECOND";
            PreparedStatement ps = con.prepareStatement(sql);
            count= ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 入力された値をmackeyparkデータベースのtempテーブルへ格納すると同時に、tempIdを取得するメソッド
     * @param userName ユーザー名
     * @param nameKana フリガナ
     * @param password パスワード
     * @param email メールアドレス
     * @param cardNumber クレジットカード番号
     * @param cardMonth 有効期限(月)
     * @param cardYear 有効期限(年)
     * @param cardHolder クレジットカード名義
     * @param securityCode セキュリティコード
     * @return count 更新件数を返します。
     */
    public int insertTemp(String userName, String nameKana, String password, String email,
            String cardNumber, String cardMonth, String cardYear, String cardHolder,
            String securityCode) {
        Connection con = DBConnector.getConnection("mackeypark");
        try{
            String expirationDate = cardMonth +" / "+ cardYear;
            String sql ="insert into temp (password, user_name, user_kana, email,card_number, "
                    + "expiration_date,card_holder,security_code,registration_date) "
                    + "values(?,?,?,?,?,?,?,?,now())";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,password);
            ps.setString(2,userName);
            ps.setString(3,nameKana);
            ps.setString(4,email);
            ps.setString(5,cardNumber);
            ps.setString(6,expirationDate);
            ps.setString(7,cardHolder);
            ps.setString(8,securityCode);
            count = ps.executeUpdate();
            sql="SELECT LAST_INSERT_ID() AS LAST";
            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()){
                setTempId(rs.getInt("LAST"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return count;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object>GetSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    /**
     * 一時テーブルのIDを取得するメソッド
     * @return tempId 一時テーブルのID
     */
    public int getTempId() {
        return tempId;
    }

    /**
     * 一時テーブルのIDを格納するメソッド
     * @param tempId 一時テーブルのID
     */
    public void setTempId(int tempId) {
        this.tempId = tempId;
    }

}