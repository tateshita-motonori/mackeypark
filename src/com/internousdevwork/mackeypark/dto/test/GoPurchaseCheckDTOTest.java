/*
 * タイトル：GoPurchaseCheckDTOをテストする為のクラス
 * 説明????：GoPurchaseCheckDTOをテストする
 *
 * 著作権??：Copyright(c) 2016 InterNous, Inc.
 * 会社名??：インターノウス株式会社
 *
 * 変更履歴：
 *
 */
package com.internousdevwork.mackeypark.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdevwork.mackeypark.dto.GoPurchaseCheckDTO;

public class GoPurchaseCheckDTOTest {

    private int testInt0;
    private int testIntMax;
    private int testIntMin;
    private String testStringNull;
    private String testStringKara;
    private String testStringSpace;
    private String testStringZenkakuSpace;
    private String testStringHankaku;
    private String testStringZenkaku;
    private String testStringHankakuZenkaku;

    @Before
    public void setUp() throws Exception {
        testInt0 = 0;
        testIntMax = Integer.MAX_VALUE;
        testIntMin = Integer.MIN_VALUE;

        testStringNull = null;
        testStringKara = "";
        testStringSpace = " ";
        testStringZenkakuSpace = "　";
        testStringHankaku = "abc123";
        testStringZenkaku = "ａｂｃ１２３あいう漢字";
        testStringHankakuZenkaku = "aｂc1２3ｱイｳ漢字";

}

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#getItemId()} のテスト・メソッド
     */
    @Test
    public void testGetItemId1() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testInt0;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId2() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testIntMax;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId3() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testIntMin;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#setItemId()} のテスト・メソッド
     */
    @Test
    public void testSetItemId1() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testInt0;

        test.setItemId(expected);
        int actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId2() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testIntMax;

        test.setItemId(expected);
        int actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId3() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testIntMin;

        test.setItemId(expected);
        int actual = test.getItemId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#getDivision()} のテスト・メソッド
     */
    @Test
    public void testGetDivision1() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision2() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision3() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision4() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision5() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision6() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision7() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#setDivision()} のテスト・メソッド
     */
    @Test
    public void testSetDivision1() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision2() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision3() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision4() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision5() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision6() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision7() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#getSubTotal()} のテスト・メソッド
     */
    @Test
    public void testGetSubTotal1() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testInt0;

        test.setSubTotal(expected);
        assertEquals(expected, test.getSubTotal());
    }

    @Test
    public void testGetSubTotal2() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testIntMax;

        test.setSubTotal(expected);
        assertEquals(expected, test.getSubTotal());
    }

    @Test
    public void testGetSubTotal3() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testIntMin;

        test.setSubTotal(expected);
        assertEquals(expected, test.getSubTotal());
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#setSubTotal()} のテスト・メソッド
     */
    @Test
    public void testSetSubTotal1() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testInt0;

        test.setSubTotal(expected);
        int actual = test.getSubTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSubTotal2() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testIntMax;

        test.setSubTotal(expected);
        int actual = test.getSubTotal();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSubTotal3() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testIntMin;

        test.setSubTotal(expected);
        int actual = test.getSubTotal();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#getNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testGetNumberOfItems1() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testInt0;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems2() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testIntMax;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems3() {
        GoPurchaseCheckDTO test = new  GoPurchaseCheckDTO();
        int expected = testIntMin;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    /**
     *{@link com.internousdev.GoPurchaseCheckDTO.DTO.GoPurchaseCheckDTO#setNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testSetNumberOfItems1() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testInt0;

        test.setNumberOfItems(expected);
        int actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems2() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testIntMax;

        test.setNumberOfItems(expected);
        int actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems3() {
        GoPurchaseCheckDTO test = new GoPurchaseCheckDTO();
        int expected = testIntMin;

        test.setNumberOfItems(expected);
        int actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

}
