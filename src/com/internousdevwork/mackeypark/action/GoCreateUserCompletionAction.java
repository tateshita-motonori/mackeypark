package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.util.CreditCard;
import com.internousdevwork.mackeypark.dao.GoCreateUserCompletionDAO;
import com.internousdevwork.mackeypark.dto.UserInformationDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録で入力された値をデータベースに登録し登録完了へ遷移するアクションクラス
 * @author KATSUSAKA KOTAKI
 * @author SAORI MAEKAWA
 * @author MASATERU IWATA
 * @version 1.0
 * @since 1.0
 */
public class GoCreateUserCompletionAction extends ActionSupport implements SessionAware{

    /**
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
     * openconnectデータベースに接続しuserテーブルにユーザー情報を登録するメソッド
     * @return SUCCESS/ERROR 登録が成功すればSUCCESS、失敗したらERRORを返します。
     */
    public String execute(){
        int tempId = (int)session.get("tempId");
        GoCreateUserCompletionDAO dao = new GoCreateUserCompletionDAO();
        UserInformationDTO dto = new UserInformationDTO();
        if(!dao.select(tempId,dto)){
            return ERROR;
        }
        userName = dto.getUserName();
        nameKana = dto.getNameKana();
        password = dto.getPassword();
        email = dto.getEmail();
        cardNumber = dto.getCardNumber();
        cardHolder = dto.getCardHolder();
        expirationDate = dto.getExpirationDate();
        securityCode = dto.getSecurityCode();
        if(dao.insert(userName, nameKana,email,password) < 1){
            return ERROR;
        }else{
            id = dao.getId();
            session.put("id", id);
            CreditCard creditCard = new CreditCard();
            if(creditCard.isExists(cardNumber)){
                creditCard.add(cardNumber, cardHolder, expirationDate, securityCode,id);
                token = creditCard.getToken();
                card4 =creditCard.getCreditCardNumber();

                if(dao.update(token, card4, id)< 0){
                    return ERROR;
                }
            }
        }
        if(!session.containsKey("tempId")){
            return ERROR;
        }
        dao.delete(tempId);
        session.remove("tempId");
        int id  = dao.getId();
        session.put("id",id);
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
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
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