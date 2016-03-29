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
 * 入力された値を検証、tempテーブルに追加し、<br>
 * 更新から1時間が経過した情報を削除するDAOクラス<br>
 * </p>
 * @author WATARU KUME
 * @version 1.0
 * @since 1.0
 */
public class GoEditUserCheckDAO  implements SessionAware{

    /**
     * セッション
     */
    private Map<String,Object>session;

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * フリガナ
     */
    private String nameKana;

    /**
     *更新件数
     */
    public int count;

    /**
     * 一時テーブルのID
     */
    private int tempId;

    /**
     * SQL文を実行するためのインターフェース
     */
    private PreparedStatement ps;

    /**
     * 検索結果の有無
     */
    boolean isResult;

    /**
     * 結果を格納するインターフェース
     */
    private ResultSet rs;

    /**
     * データベースに接続するためのインターフェース
     */
    private Connection con;

    /**
     * <p>
     * 入力されたメールアドレスが既に登録されているものでないかどうか<br>
     * openconnectデータベースのuserテーブルのデータと照合するメソッド<br>
     * </p>
     * @param id ユーザーID
     * @param email メールアドレス
     * @return isResult  検索結果の有無を返します。
     */
    public boolean selectByEmail(String email,int id){
        isResult = false;
        try {
            con = DBConnector.getConnection("openconnect");
            String sql = "SELECT id FROM user WHERE email = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                if(id==rs.getInt("id")){
                    return false;
                }
                isResult = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
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
     * <p>
     * mackeyparkデータベースのtempテーブルを作成した時刻と現在時刻を比較し、<br>
     * 作成から1時間以上が経過していれば一時テーブルの情報を全て削除するメソッド<br>
     * </p>
     * @return count 更新件数を返します。
     */
    public int deleteTemp(){
        con = DBConnector.getConnection("mackeypark");
        try{
            String sql = "delete from temp where date < now() - INTERVAL 3600 SECOND";
            ps = con.prepareStatement(sql);
            count=ps.executeUpdate();
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
     * 入力された値をmackeyparkデータベースのtempテーブルへ格納すると同時に、一時テーブルのIDを取得するメソッド
     * @param password パスワード
     * @param email メールアドレス
     * @param cardNumber クレジットカード番号
     * @param cardMonth 有効期限(月)
     * @param cardYear 有効期限(年)
     * @param cardHolder クレジットカード名義
     * @param securityCode セキュリティコード
     * @return count 更新件数を返します。
     */
    public int insertTemp(String password, String email,
            String cardNumber, String cardMonth, String cardYear, String cardHolder,
            String securityCode) {
        Connection con = (Connection)DBConnector.getConnection("mackeypark");
        try{
            String expirationDate = cardMonth +" / "+ cardYear;
            String sql ="insert into temp (password,email,"
                    + "card_number, expiration_date,"
                    + "card_holder,security_code) "
                    + "values(?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,password);
            ps.setString(2,email);
            ps.setString(3,cardNumber);
            ps.setString(4,expirationDate);
            ps.setString(5,cardHolder);
            ps.setString(6,securityCode);
            count = ps.executeUpdate();
            sql="SELECT LAST_INSERT_ID() AS LAST";
            rs = ps.executeQuery(sql);
            if (rs.next()){
                tempId = rs.getInt("LAST");
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
     * ユーザー名を取得するメソッド
     * @return userName ユーザー氏名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * フリガナを取得するメソッド
     * @return nameKana フリガナ
     */
    public String getNameKana() {
        return nameKana;
    }

}