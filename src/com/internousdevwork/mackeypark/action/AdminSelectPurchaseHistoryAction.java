package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;

import com.internousdevwork.mackeypark.dao.AdminSelectPurchaseHistoryDAO;
import com.internousdevwork.mackeypark.dto.AdminSelectPurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入履歴を検索するアクションクラス
 * @author TAKESHI BANSHOU
 * @version 1.0
 * @since 1.0
 */
public class AdminSelectPurchaseHistoryAction extends ActionSupport{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = 5225223860360033266L;

    /**
     * 検索種別
     */
    private String selectDivision;

    /**
     * 検索条件
     */
    private String selectCondition;

    /**
     * 購入履歴リスト
     */
    private ArrayList<AdminSelectPurchaseHistoryDTO> historyList;

    /**
     * mackeyparkデータベースのhistoryテーブルの購入履歴を検索するメソッド
     * @return SUCCESS/ERROR 検索に成功したらSUCCESS、失敗したらERRORを返します。
     */
    public String execute(){
        AdminSelectPurchaseHistoryDAO dao = new AdminSelectPurchaseHistoryDAO();
        historyList = dao.select( selectDivision, selectCondition );
        if(historyList.size()<0){
            return ERROR;
        }
        return SUCCESS;
    }

    /**
     * 検索種別を取得するメソッド
     * @return selectDivision 検索種別
     */
    public String getSelectDivision() {
        return selectDivision;
    }

    /**
     * 検索種別を格納するメソッド
     * @param selectDivision 検索種別
     */
    public void setSelectDivision(String selectDivision) {
        this.selectDivision = selectDivision;
    }

    /**
     * 検索条件を取得するメソッド
     * @return selectCondition 検索条件
     */
    public String getSelectCondition() {
        return selectCondition;
    }

    /**
     * 検索条件を格納するメソッド
     * @param selectCondition 検索条件
     */
    public void setSelectCondition(String selectCondition) {
        this.selectCondition = selectCondition;
    }

    /**
     * 購入履歴リストを取得するメソッド
     * @return historyList 購入履歴リスト
     */
    public ArrayList<AdminSelectPurchaseHistoryDTO> getHistoryList() {
        return historyList;
    }

    /**
     * 購入履歴リストを格納するメソッド
     * @param historyList 購入履歴リスト
     */
    public void setHistoryList(ArrayList<AdminSelectPurchaseHistoryDTO> historyList) {
        this.historyList = historyList;
    }

}