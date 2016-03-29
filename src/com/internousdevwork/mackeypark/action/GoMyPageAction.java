package com.internousdevwork.mackeypark.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoMyPageDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * マイページに遷移するアクションクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoMyPageAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -5153723490217048369L;

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
     * クレジットカードの下4ケタ
     */
    private String cardNumber;

    /**
     * ポップアップの有無
     */
    private int popup;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * openconnectデータベースのuserテーブルの会員情報をIDを使い検索するメソッド
     * @return SUCCESS/ERROR 検索に成功したらSUCCESS、失敗したらERRORを返します。
     */
    public String execute(){
        GoMyPageDAO dao = new GoMyPageDAO();
        id = (int)session.get("id");
        boolean isResult = dao.select(id);
        if(isResult){
            userName=dao.getUserName();
            nameKana=dao.getNameKana();
            email=dao.getEmail();
            cardNumber=dao.getCardNumber();
            return SUCCESS;
        }else{
            return ERROR;
        }
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
    public void seteEmail(String email) {
        this.email = email;
    }

    /**
     * クレジットカードの下4ケタを取得するメソッド
     * @return cardNumber クレジットカードの下4ケタ
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * クレジットカードの下4ケタを格納するメソッド
     * @param cardNumber クレジットカードの下4ケタ
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * ポップアップの有無を取得するメソッド
     * @return popup ポップアップの有無
     */
    public int getPopup() {
        return popup;
    }

    /**
     * ポップアップの有無を格納するメソッド
     * @param popup ポップアップの有無
     */
    public void setPopup(int popup) {
        this.popup = popup;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}