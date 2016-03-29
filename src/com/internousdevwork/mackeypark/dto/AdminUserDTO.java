package com.internousdevwork.mackeypark.dto;

/**
 * ユーザー情報を格納するDTOクラス
 * @author KAZUHIRO YOSHIHARA
 * @version 1.0
 * @since 1.0
 */
public class AdminUserDTO {

    /**
     * ユーザーID
     */
    private int id;

    /**
     * パスワード
     */
    private String password;

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * ユーザーIDを取得するメソッド
     * @return id ユーザーID
     */
    public int getId() {
        return id;
    }

    /**
     * ユーザーIDを格納するメソッド
     * @param id ユーザーID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * パスワードを取得するメソッド
     * @return password パスワード
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードを格納するメソッド
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
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
    public void setEmail(String email) {
        this.email = email;
    }

}