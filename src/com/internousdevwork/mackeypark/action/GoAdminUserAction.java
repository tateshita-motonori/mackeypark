package com.internousdevwork.mackeypark.action;
import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.GoAdminUserDAO;
import com.internousdevwork.mackeypark.dto.AdminUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザー一覧を作成するアクションクラス
 * @author KAZUHIRO YOASHIHARA
 * @version 1.0
 * @since 1.0
 */
public class GoAdminUserAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6218389182516099196L;

    /**
     * ユーザー一覧のリスト
     */
    private ArrayList<AdminUserDTO> userList = new ArrayList<>();

    /**
     * エラーメッセージ
     */
    private String errorMessage;

    /**
     * openconnectデーターベースのuserテーブルからユーザー一覧を取得するメソッド
     * @return SUCCESS/ERROR データを取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
     */
    public String execute(){
        GoAdminUserDAO dao = new GoAdminUserDAO();
        if(dao.select()){
            userList = dao.getUserList();
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    /**
     * ユーザー一覧のリストを取得するメソッド
     * @return userList ユーザー一覧のリスト
     */
    public ArrayList<AdminUserDTO> getUserList() {
        return userList;
    }

    /**
     * ユーザー一覧のリストを格納するメソッド
     * @param userList ユーザー一覧のリスト
     */
    public void setuserList(ArrayList<AdminUserDTO> userList) {
        this.userList = userList;
    }

    /**
     * エラーメッセージを取得するメソッド
     * @return errorMessage エラーメッセージ
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * エラーメッセージを格納するメソッド
     * @param errorMessage エラーメッセージ
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}