/*
 * タイトル：AdminSelectPurchaseHistoryDTOをテストする為のクラス
 * 説明    ：AdminSelectPurchaseHistoryDTOをテストする
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

import com.internousdevwork.mackeypark.dto.AdminSelectPurchaseHistoryDTO;

public class AdminSelectPurchaseHistoryDTOTest {

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
     *{@link com.internousdev.DTO.FindHistoryDTO#getSalesId()} のテスト・メソッド
     */
    @Test
    public void testGetSalesId1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    @Test
    public void testGetSalesId7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setSalesId(expected);
        assertEquals(expected, test.getSalesId());
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#setSalesId()} のテスト・メソッド
     */
    @Test
    public void testSetSalesId1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSalesId2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSalesId7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setSalesId(expected);
        String actual = test.getSalesId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#getId()} のテスト・メソッド
     */
    @Test
    public void testGetId1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#setId()} のテスト・メソッド
     */
    @Test
    public void testSetId1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testId2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setId(expected);
        String actual = test.getId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#getItemId()} のテスト・メソッド
     */
    @Test
    public void testGetItemId1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    /**
     *{@link com.internousdev.AdminSelectPurchaseHistoryDTO.DTO.FindHistoryDTO#setItemId()} のテスト・メソッド
     */
    @Test
    public void testSetItemId1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testItemId2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#getNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testGetNumberOfItems1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#setNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testSetNumberOfItems1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfItems2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#getAmount()} のテスト・メソッド
     */
    @Test
    public void testGetAmount1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    @Test
    public void testGetAmount7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setAmount(expected);
        assertEquals(expected, test.getAmount());
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#setAmount()} のテスト・メソッド
     */
    @Test
    public void testSetAmount1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testAmount2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmount7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setAmount(expected);
        String actual = test.getAmount();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#getDate()} のテスト・メソッド
     */
    @Test
    public void testGetDate1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    @Test
    public void testGetDate7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setDate(expected);
        assertEquals(expected, test.getDate());
    }

    /**
     *{@link com.internousdev.DTO.AdminSelectPurchaseHistoryDTO#setDate()} のテスト・メソッド
     */
    @Test
    public void testSetDate1() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringNull;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testDate2() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringKara;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate3() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringSpace;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate4() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkakuSpace;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate5() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankaku;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate6() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringZenkaku;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDate7() {
        AdminSelectPurchaseHistoryDTO test = new AdminSelectPurchaseHistoryDTO();
        String expected = testStringHankakuZenkaku;

        test.setDate(expected);
        String actual = test.getDate();
        assertEquals(expected, actual);
    }

}
