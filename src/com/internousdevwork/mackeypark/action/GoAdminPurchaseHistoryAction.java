package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.GoAdminPurchaseHistoryDAO;
import com.internousdevwork.mackeypark.dto.GoAdminPurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入履歴に遷移し、購入履歴を表示するアクションクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class GoAdminPurchaseHistoryAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 3547752840654691272L;

    /**
     * 購入履歴リスト
     */
    private ArrayList<GoAdminPurchaseHistoryDTO> historyList;

    /**
     * mackeyparkデータベースのhistoryテーブルから値を取得し購入履歴リストを作成するメソッド
     * @return SUCCESS/ERROR リストの作成に成功したらSUCCESS、失敗したらERRORを返します。
     */
    public String execute(){
        GoAdminPurchaseHistoryDAO dao = new GoAdminPurchaseHistoryDAO();
        if( !dao.select() ){
            return ERROR;
        }
        historyList = dao.getHistoryList();
        return SUCCESS;
    }

    /**
     * 購入履歴リストを取得するメソッド
     * @return historyList 購入履歴リスト
     */
    public ArrayList<GoAdminPurchaseHistoryDTO> getHistoryList() {
        return historyList;
    }

    /**
     * 購入履歴リストを格納するメソッド
     * @param historyList 購入履歴リスト
     */
    public void setHistoryList(ArrayList<GoAdminPurchaseHistoryDTO> historyList) {
        this.historyList = historyList;
    }

}