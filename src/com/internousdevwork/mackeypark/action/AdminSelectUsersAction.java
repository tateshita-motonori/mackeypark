package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.AdminSelectUsersDAO;
import com.internousdevwork.mackeypark.dto.AdminUserDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ユーザーの検索を行うアクションクラス
 * @author KAZUHIRO YOSHIHARA
 * @version 1.0
 * @since 1.0
 */
public class AdminSelectUsersAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 6135956959018452752L;

    /**
     * ユーザー名
     */
    public String userName;

    /**
     * ユーザー一覧のリスト
     */
    private ArrayList<AdminUserDTO> userList = new ArrayList<>();

    /**
     * openconnectデーターベースのuserテーブルから検索条件に一致したユーザー一覧を取得するメソッド
     * @return SUCCESS/ERROR ユーザーが存在する場合はSUCCESS、存在しない場合はERRORを返します。
     */
    public String execute(){
    	AdminSelectUsersDAO dao = new AdminSelectUsersDAO();
    	userName = userName.trim();
        if(!dao.select(userName)){
            return ERROR;
            }
        userList = dao.getUserList();
        return SUCCESS;
        }

    /**
     * ユーザー名を取得するメソッド
     * @return userName ユーザー名
     */
    public String getUserName(){
      return userName;
    }

    /**
     * ユーザー名を格納するメソッド
     * @param userName ユーザー名
     */
    public void setUserName(String userName){
      this.userName = userName;
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

}