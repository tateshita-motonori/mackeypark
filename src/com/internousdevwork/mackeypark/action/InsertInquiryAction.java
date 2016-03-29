package com.internousdevwork.mackeypark.action;
import com.internousdevwork.mackeypark.dao.InsertInquiryDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 問い合わせ内容を追加するアクションクラス
 * @author KAZUTOSHI TSURUTA
 * @version 1.0
 * @since 1.0
 */
public class InsertInquiryAction extends ActionSupport {

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -1923936473024719400L;

    /**
     * 問い合わせ投稿者名
     */
    private String formName;

    /**
     * 問い合わせメールアドレス
     */
    private String formAddress;

    /**
     * 問い合わせ内容
     */
    private String formContents;

    /**
     * insertの可否メッセージ
     */
    private String insertCheckMessage;


    /**
     * mackeyparkデーターベースのformテーブルにお問い合わせ内容を追加するメソッド
     * @return SUCCESS/ERROR お問い合わせ内容の追加に成功した場合はSUCCESS、入力必須が全て入力されてない、またはお問い合わせ内容追加に失敗した場合はERRORを返します。
     */
    public String execute(){
        if(formName.equals("")||formAddress.equals("")||formContents.equals("")){
            insertCheckMessage = getText("help.insertCheckMessage_blank");
            return ERROR;
        }
        InsertInquiryDAO dao = new InsertInquiryDAO();
        if(!dao.insert(formName,formAddress,formContents)){
            return ERROR;
        }
        insertCheckMessage = getText("help.insertCheckMessage_accepted");
         return SUCCESS;
    }

    /**
     * 問い合わせ投稿者名を取得するメソッド
     * @return formName 問い合わせ投稿者名
     */
    public String getFormName() {
        return formName;
    }

    /**
     * 問い合わせ投稿者名を格納するメソッド
     * @param formName 問い合わせ投稿者名
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * 問い合わせメールアドレスを取得するメソッド
     * @return formAddress 問い合わせメールアドレス
     */
    public String getFormAddress() {
        return formAddress;
    }

    /**
     * 問い合わせメールアドレスを格納するメソッド
     * @param formAddress 問い合わせメールアドレス
     */
    public void setFormAddress(String formAddress) {
        this.formAddress = formAddress;
    }

    /**
     * 問い合わせ内容を取得するメソッド
     * @return formContents 問い合わせ内容
     */
    public String getFormContents() {
        return formContents;
    }

    /**
     * 問い合わせ内容を格納するメソッド
     * @param formContents 問い合わせ内容
     */
    public void setFormContents(String formContents) {
        this.formContents = formContents;
    }

    /**
     * insertの可否メッセージを取得するメソッド
     * @return insertCheckMessage insertの可否メッセージ
     */
    public String getInsertCheckMessage() {
        return insertCheckMessage;
    }

    /**
     * insertの可否メッセージを格納するメソッド
     * @param insertCheckMessage insertの可否メッセージ
     */
    public void setInsertCheckMessage(String insertCheckMessage) {
        this.insertCheckMessage = insertCheckMessage;
    }
}
