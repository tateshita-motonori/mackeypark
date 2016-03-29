/*
 * タイトル：GoAdminPurchaseHistoryDTOをテストする為のクラス
 * 説明    ：GoAdminPurchaseHistoryDTOをテストする
 *
 * 著作権  ：Copyright(c) 2016 InterNous, Inc.
 * 会社名  ：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdevwork.mackeypark.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdevwork.mackeypark.dto.GoAdminPurchaseHistoryDTO;

public class GoAdminPurchaseHistoryDTOTest {

    private String testStringNull;
    private String testStringKara;
    private String testStringSpace;
    private String testStringZenkakuSpace;
    private String testStringHankaku;
    private String testStringZenkaku;
    private String testStringHankakuZenkaku;

    @Before
    public void setUp() throws Exception {

        testStringNull = null;
        testStringKara = "";
        testStringSpace = " ";
        testStringZenkakuSpace = "　";
        testStringHankaku = "abc123";
        testStringZenkaku = "ａｂｃ１２３あいう漢字";
        testStringHankakuZenkaku = "aｂc1２3ｱイｳ漢字";
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#getSalesId()} のテスト・メソッド
     */
    @Test
    public void testGetSalesId1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#setSalesId()} のテスト・メソッド
     */
    @Test
    public void testSetSalesId1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSalesId2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#getUserId()} のテスト・メソッド
     */
    @Test
    public void testGetUserId1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetUserId2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetUserId3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetUserId4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetUserId5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetUserId6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    @Test
    public void testGetUserId7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setUserId(expected);
        assertEquals(expected, test.getUserId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#setUserId()} のテスト・メソッド
     */
    @Test
    public void testSetUserId1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    @Test
    public void testUserId2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserId3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserId4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserId5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserId6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserId7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setUserId(expected);
        String actual = test.getUserId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#getItemId()} のテスト・メソッド
     */
    @Test
    public void testGetItemId1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#setItemId()} のテスト・メソッド
     */
    @Test
    public void testSetItemId1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testItemId2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#getNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testGetNumberOfItems1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#setNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testSetNumberOfItems1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfItems2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#getAmount()} のテスト・メソッド
     */
    @Test
    public void testGetAmount1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#setAmount()} のテスト・メソッド
     */
    @Test
    public void testSetAmount1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testAmount2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#getDate()} のテスト・メソッド
     */
    @Test
    public void testGetDate1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.GoAdminPurchaseHistoryDTO#setDate()} のテスト・メソッド
     */
    @Test
    public void testSetDate1() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testDate2() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate3() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate4() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate5() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate6() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate7() {
        GoAdminPurchaseHistoryDTO test = new GoAdminPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

}