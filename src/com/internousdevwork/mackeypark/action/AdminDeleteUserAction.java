package com.internousdevwork.mackeypark.action;
import com.internousdevwork.mackeypark.dao.AdminDeleteUserDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザーを削除するアクションクラス
 * @author KAZUHIRO YOASHIHARA
 * @version 1.0
 * @since 1.0
 */
public class AdminDeleteUserAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 4321779838595059431L;

    /**
     * ユーザーID
     */
    public String id;

    /**
     * エラーメッセージ
     */
    private String errorMessage;

    /**
     * openconnectデーターベースのuserテーブルからユーザーの削除を行うメソッド
     * @return SUCCESS/ERROR ユーザーの削除に成功した場合はSUCCESS、失敗した場合はERRORを返します。
     */
    public String execute(){
        int intId = 0;
        try{
            intId = Integer.parseInt(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(intId==0){
            errorMessage = getText("admin_user.input_number");
            return SUCCESS;
        }
    	AdminDeleteUserDAO dao = new AdminDeleteUserDAO();
        if(dao.delete(intId)<1){
            return ERROR;
        }
        return SUCCESS;
    }

    /**
     * ユーザーIDを取得するメソッド
     * @return id ユーザーID
     */
    public String getId(){
      return id;
    }

    /**
     * ユーザーIDを格納するメソッド
     * @param id ユーザーID
     */
    public void setdId(String id){
      this.id = id;
    }

    /**
     * エラーメッセージを取得するメソッド
     * @return errorMessage エラーメッセージ
     */
    public String getErrorMessage() {
        return errorMessage;
    }

}