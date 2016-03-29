package com.internousdevwork.mackeypark.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.mackeypark.dao.GoPurchaseCheckDAO;
import com.internousdevwork.mackeypark.dto.GoPurchaseCheckDTO;
import com.internousdevwork.mackeypark.dto.PurchaseDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 条件選択で選択された商品をリストに格納するアクションクラス
 * @author SODAI ARAKAWA
 * @version 1.0
 * @since 1.0
 */
public class GoPurchaseCheckAction extends ActionSupport implements SessionAware{

    /**
     * 生成されたシリアルナンバー
     */
    private static final long serialVersionUID = -6680745335460536807L;

    /**
     * セッション
     */
    private Map<String,Object> session;

    /**
     * 商品の個数リスト
     */
    private String numberOfItemsList[];

    /**
     * 商品の個数
     */
    private int numberOfItems;

    /**
     * 来場日
     */
    private String date;

    /**
     * 種類リスト
     */
    private String divisionList[];

    /**
     * 種類
     */
    private String division;

    /**
     * 商品の個数の合計
     */
    private int sumOfItems;

    /**
     * 絵柄
     */
    private String design;


    /**
     * エラーメッセージ1
     */
    private String errorMessage1;

    /**
     * エラーメッセージ2
     */
    private String errorMessage2;

    /**
     * 合計金額
     */
    private int totalPrice=0;

    /**
     * 商品リスト
     */
    private ArrayList<GoPurchaseCheckDTO> itemList = new ArrayList<>();

    /**
     * 購入履歴リスト
     */
    private ArrayList<PurchaseDTO> historyList = new ArrayList<>();

    /**
     * 商品ID
     */
    private int itemId;

    /**
     * 値段
     */
    private int price;

    /**
     * 小計
     */
    private int subTotal;

    /**
     * 購入日
     */
    private String perchaseDate;

    /**
     * 期間リスト
     */
    private String[] periodList;

    /**
     * 条件選択で入力された情報が正しいか判定するメソッド
     * @return SUCCESS/ERROR 入力された情報が正しい場合はSUCCESS、不正な場合はERRORを返します。
     */
    public String execute() {
    	if(!session.containsKey("id")){
		    return ERROR;
		}

    	try {
			if(!dateCheck(date)){
				errorMessage2=getText("select_condition_daySelect");
				return ERROR;
			}
		} catch (Throwable e) {
			return ERROR;
		}

        GoPurchaseCheckDAO dao = new GoPurchaseCheckDAO();
        for(int i=0;i<divisionList.length;i++){
            GoPurchaseCheckDTO orderDto = new GoPurchaseCheckDTO();
            PurchaseDTO historyDto = new PurchaseDTO();
            numberOfItems = Integer.parseInt(numberOfItemsList[i]);
            if(numberOfItems < 1){
                continue;
            }
            division = divisionList[i];
            String period = periodList[i].split(":", 0)[0];
            period = period.trim();
            if(!dao.selectItem(period, division, design)){
                return ERROR;
            }
            itemId = dao.getItemId();
            price = dao.getPrice();
            subTotal = numberOfItems * price;
            totalPrice += subTotal;
            orderDto.setItemId(itemId);
            orderDto.setDivision(division);
            orderDto.setNumberOfItems(numberOfItems);
            orderDto.setSubTotal(subTotal);
            orderDto.setPeriod(period);
            itemList.add(orderDto);
            historyDto.setItemId(Integer.toString(itemId));
            historyDto.setNumberOfItems(Integer.toString(numberOfItems));
            historyList.add(historyDto);
        }
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        perchaseDate = sdf.format(c.getTime());
        session.put("historyList", historyList);
        return SUCCESS;
    }



	/**
     * 種類のvalidationメソッド
     */
    public void validate(){
        if(date.isEmpty()){
            errorMessage1 = getText("purchase_check_comDay");
            addActionError(getText("purchase_check_comDay"));
        }else{
            for(int i=0;i<divisionList.length;i++){
                numberOfItems = Integer.parseInt(numberOfItemsList[i]);
                sumOfItems += numberOfItems;
                if(numberOfItems == 0){
                    continue;
                }
                division = divisionList[i];
                if(division.equals("団体")){
                    if(numberOfItems<20){
                        errorMessage1 = getText("purchase_check_grop");
                        addActionError(getText("purchase_check_grop"));
                    }
                }
            }
            if(sumOfItems==0){
                errorMessage1 = getText("purchase_check_ticketSelect");
                addActionError(getText("purchase_check_ticketSelect"));
            }
        }
    }

    public static boolean dateCheck(String date) throws Throwable {

         boolean dateCheckResult;

        	Date nowDate=new Date();
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date1 = DateFormat.getDateInstance().parse(date);
            Date date2 = DateFormat.getDateInstance().parse(sdf.format(nowDate));
            int  dateCheck= date1.compareTo(date2);
            if (dateCheck == 0) {
            	dateCheckResult=true;
            } else if (dateCheck > 0) {
                dateCheckResult=true;
            } else {
                dateCheckResult=false;
            }
         return dateCheckResult;
    }

    /**
     * 商品の個数リストを格納するメソッド
     * @param numberOfItemsList 商品の個数リスト
     */
    public void setNumberOfItems(String numberOfItemsList) {
        this.numberOfItemsList = numberOfItemsList.split(", ", 0);
    }

    /**
     * 種類リストを格納するメソッド
     * @param division 種類リスト
     */
    public void setDivision(String division) {
        this.divisionList = division.split(", ", 0);
    }

    /**
     * 種類リストを格納するメソッド
     * @param division 種類リスト
     */
    public void setPeriodList(String periodList) {
        this.periodList = periodList.split(", ", 0);
    }

    /**
     *  来場日を取得するメソッド
     *  @return date 来場日
     */
    public String getDate(){
        return date;
    }

    /**
     *  来場日を格納するメソッド
     *  @param date 来場日
     */
    public void setDate(String date){
        this.date = date;
    }

    /**
     *  セッションを取得するメソッド
     *  @return session セッション
     */
    public Map<String, Object> getSession(){
        return session;
    }

    /**
     *  セッションを格納するメソッド
     *  @param session セッション
     */
    public void setSession(Map<String, Object> session){
        this.session = session;
    }

    /**
     * 絵柄を取得するメソッド
     * @return design 絵柄
     */
    public String getDesign() {
        return design;
    }

    /**
     * 絵柄を格納するメソッド
     * @param design 絵柄
     */
    public void setDesign(String design) {
        this.design = design;
    }

    /**
     * 商品の個数の合計を取得するメソッド
     * @return sumOfItems 商品の個数の合計
     */
    public int getSumOfItems() {
        return sumOfItems;
    }

    /**
     * エラーメッセージを取得するメソッド
     * @return errorMessage エラーメッセージ
     */
    public String getErrorMessage() {
        return errorMessage1;
    }

    public String getErrorMessage2() {
		return errorMessage2;
	}

	public void setErrorMessage2(String errorMessage2) {
		this.errorMessage2 = errorMessage2;
	}

    /**
     * 商品リストを取得するメソッド
     * @return itemList 商品リスト
     */
    public ArrayList<GoPurchaseCheckDTO> getItemList() {
        return itemList;
    }

    /**
     * 合計金額を取得するメソッド
     * @return totalPrice 合計金額
     */
    public int getTotalPrice() {
        return totalPrice;
    }

	/**
     * 購入日を取得するメソッド
     * @return perchaseDate 購入日
     */
    public String getPerchaseDate() {
        return perchaseDate;
    }



    /**
     * 期間リストを格納するメソッド
     * @param periodList 期間リスト
     */
    public void setPeriodList(String[] periodList) {
        this.periodList = periodList;
    }

}