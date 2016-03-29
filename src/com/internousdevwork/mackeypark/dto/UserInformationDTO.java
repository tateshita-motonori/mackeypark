package com.internousdevwork.mackeypark.dto;

/**
 * ユーザー情報を格納するDTOクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class UserInformationDTO {

    /**
     * ユーザー名
     */
    private String userName;

    /**
     * フリガナ
     */
    private String nameKana;

    /**
     * パスワード
     */
    private String password;

    /**
     * メールアドレス
     */
    private String email;

    /**
     * 郵便番号
     */
    private String postalCode;

    /**
     * 住所
     */
    private String address;

    /**
     * クレジットカード番号
     */
    private String cardNumber;

    /**
     * クレジットカード名義
     */
    private String cardHolder;

    /**
     * 有効期限(月/年)
     */
    private String expirationDate;

    /**
     * セキュリティコード
     */
    private String securityCode;

    /**
     * ユーザ名を取得するメソッド
     * @return userName ユーザ名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ユーザ名を格納するメソッド
     * @param userName ユーザ名
     */
    public void setUserName(String userName) {
        this.userName = userName;
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

    /**
     * 郵便番号を取得するメソッド
     * @return postalCode 郵便番号
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 郵便番号を格納するメソッド
     * @param postalCode 郵便番号
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 住所を取得するメソッド
     * @return address 住所
     */
    public String getAddress() {
        return address;
    }

    /**
     * 住所を格納するメソッド
     * @param address 住所
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * クレジットカード番号を取得するメソッド
     * @return cardNumber クレジットカード番号
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * クレジットカード番号を格納するメソッド
     * @param cardNumber クレジットカード番号
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * クレジットカード名義を取得するメソッド
     * @return cardHolder クレジットカード名義
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * クレジットカード名義を格納するメソッド
     * @param cardHolder クレジットカード名義
     */
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    /**
     * セキュリティコードを取得するメソッド
     * @return securityCode セキュリティコード
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * セキュリティコードを格納するメソッド
     * @param securityCode セキュリティコード
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * 有効期限(月/年)を取得するメソッド
     *  @return expirationDate 有効期限(月/年)
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * 有効期限(月/年)を格納するメソッド
     *  @param expirationDate 有効期限(月/年)
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
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

}
