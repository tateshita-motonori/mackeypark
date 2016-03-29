package com.internousdevwork.mackeypark.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoPurchaseCompletionDAO;
import com.internousdevwork.mackeypark.dto.PurchaseDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 購入履歴をデータベースに追加するアクションクラス
 * @author SAORI MAEKAWA
 * @since 1.0
 * @version 1.0
 */
public class GoPurchaseCompletionAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6076032638377483021L;

    /**
     * ユーザーID
     */
    private int id;

    /**
     * 商品ID
     */
    private String itemId;

    /**
     * 商品の個数
     */
    private String numberOfItems;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * mackeyparkデータベースのhistoryテーブルに購入履歴を格納するメソッド
     * @return SUCCESS/ERROR 格納に成功したらSUCCESS、失敗したらERRORを返します。
     */
    @SuppressWarnings("unchecked")
    public String execute (){
        if(!session.containsKey("id")){
            return ERROR;
        }
        id = (int)session.get("id");
        String stringId = Integer.toString(id);
        GoPurchaseCompletionDAO dao = new GoPurchaseCompletionDAO();
        if(!dao.cardcheck(id)){
            return ERROR;
        }
        ArrayList<PurchaseDTO> historyList = new ArrayList<>();
        if(!session.containsKey("historyList")){
            return ERROR;
        }else{
            historyList = (ArrayList<PurchaseDTO>)session.get("historyList");
            session.remove("historyList");
        }
        for(int i=0; i<historyList.size();i++){
            itemId = historyList.get(i).getItemId();
            numberOfItems = historyList.get(i).getNumberOfItems();
            if(!dao.insert(stringId,itemId,numberOfItems)){
                return ERROR;
            }
        }
        return SUCCESS;
    }

    /**
     * セッションを取得するメソッド
     * @return session セッション
     */
    public Map<String,Object> getSession() {
        return session;
    }

    /**
     * セッションを格納するメソッド
     * @param session セッション
     */
    public void setSession(Map<String,Object> session) {
        this.session = session;
    }

}
