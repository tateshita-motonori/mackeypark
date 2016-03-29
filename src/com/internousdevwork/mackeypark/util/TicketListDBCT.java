package com.internousdevwork.mackeypark.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 商品情報を取得するためにデータベースへ接続をするutilクラス
 * @author SODAI ARAKAWA
 * @version 1.0
 * @since 1.0
 */
public class TicketListDBCT{

    /**
     * mackeyparkデータベースに接続するメソッド
     * @return con コネクション情報のインスタンスを返します。
     */
    public static Connection getConnection(){
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/mackeypark";
        String user = "root";
        String pass = "mysql";
        Connection con = null;
        try{
            Class.forName(driverName);
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }

}