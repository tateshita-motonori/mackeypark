package com.internousdevwork.mackeypark.util;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * SQLの指定したデータベースに接続するutilクラス
 * @author YUKI HOSHINO
 * @version 1.0
 * @since 1.0
 */
public class DBConnector{

    /**
     * SQLの指定したデータベースに接続するメソッド
     * @param database データベース
     * @return con 指定したデータベースへのコネクション情報を返します。
     */
    public static Connection getConnection(String database){
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/";
        String user = "root";
        String pass = "mysql";
        url += database;
        Connection con = null;
        try{
            Class.forName(driverName);
            con = (Connection) DriverManager.getConnection(url,user,pass);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        url = "jdbc:mysql://localhost/";
        return con;
    }

}