package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.CreditCard;
import com.internousdevwork.mackeypark.dao.GoEditUserCompletionDAO;
import com.internousdevwork.mackeypark.dto.UserInformationDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 情報変更で入力された値をデータベースに登録し登録完了へ遷移するアクションクラス
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class GoEditUserCompletionAction extends ActionSupport implements SessionAware{

    /**
     *
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 6876659197016857171L;

    /**
     * ユーザーID
     */
    private int id;

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
     * パスワード
     */
    private String password;

    /**
     * クレジットカード名義
     */
    private String cardHolder;

    /**
     * 有効期限（月）
     */
    private String cardMonth;

    /**
     * 有効期限（年）
     */
    private String cardYear;

    /**
     * セキュリティコード
     */
    private String securityCode;

    /**
     * 有効期限(月/年)
     */
    private String expirationDate = cardMonth+"/"+cardYear;

    /**
     * クレジットカードトークン
     */
    private String token;

    /**
     * クレジットカードの下4ケタ
     */
    private String card4;

    /**
     * クレジットカード番号
     */
    private String cardNumber;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * openconnectデータベースに接続しuserテーブルにユーザー情報を変更するメソッド
     * @return SUCCESS/ERROR 変更に成功すればSUCCESS、失敗したらERRORを返します。
     */
    public String execute(){
        int tempId = (int)session.get("tempId");
        GoEditUserCompletionDAO dao = new GoEditUserCompletionDAO();
        UserInformationDTO dto = new UserInformationDTO();
        if(!dao.select(tempId,dto)){
            return ERROR;
        }
        password = dto.getPassword();
        email = dto.getEmail();
        id = (int) session.get("id");
        if(dao.update(email,password,id) < 1){
            return ERROR;
        }else{
            cardNumber = dto.getCardNumber();
            cardHolder = dto.getCardHolder();
            expirationDate = dto.getExpirationDate();
            securityCode = dto.getSecurityCode();
            CreditCard creditCard = new CreditCard();
            if(creditCard.isExists(cardNumber)){
                creditCard.add(cardNumber, cardHolder, expirationDate, securityCode,id);
                token = creditCard.getToken();
                card4 =creditCard.getCreditCardNumber();
                if(dao.updateCard(token, card4, id) < 1){
                    return ERROR;
                }
            }
        }
        if(!session.containsKey("tempId")){
            return ERROR;
        }
        if(dao.delete(tempId) <= 1){
            return SUCCESS;
        }
        session.remove("tempId");
        return SUCCESS;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
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
    public void setUser_name(String userName) {
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
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * メールアドレスを取得するメソッド
     * @return mail_address メールアドレス
     */
    public String getEmail() {
        return email;
    }

    /**
     * メールアドレスを格納するメソッド
     * @param email メールアドレス
     */
    public void seteEmail(String email) {
        this.email = email;
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

}