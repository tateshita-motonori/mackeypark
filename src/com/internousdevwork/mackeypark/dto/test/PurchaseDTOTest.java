/*
 * タイトル：PurchaseDTOをテストする為のクラス
 * 説明    ：PurchaseDTOをテストする
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

import com.internousdevwork.mackeypark.dto.PurchaseDTO;

public class PurchaseDTOTest {

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
     *{@link com.internousdev.PurchaseDTO.DTO.PurchaseDTODTO#getItemId()} のテスト・メソッド
     */
    @Test
    public void testGetItemId1() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringNull;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId2() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringKara;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId3() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringSpace;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId4() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkakuSpace;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId5() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId6() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId7() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    /**
     *{@link com.internousdev.PurchaseDTO.DTO.PurchaseDTO#setItemId()} のテスト・メソッド
     */
    @Test
    public void testSetItemId1() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringNull;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testItemId2() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringKara;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId3() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringSpace;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId4() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkakuSpace;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId5() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId6() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId7() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemId(expected);
        String actual = test.getItemId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.PurchaseDTO.DTO.PurchaseDTO#getNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testGetNumberOfItems1() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringNull;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems2() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringKara;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems3() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringSpace;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems4() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkakuSpace;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems5() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems6() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems7() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankakuZenkaku;

        test.setNumberOfItems(expected);
        assertEquals(expected, test.getNumberOfItems());
    }

    /**
     *{@link com.internousdev.PurchaseDTO.DTO.PurchaseDTO#setNumberOfItems()} のテスト・メソッド
     */
    @Test
    public void testSetNumberOfItems1() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringNull;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testNumberOfItems2() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringKara;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems3() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringSpace;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems4() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkakuSpace;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems5() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems6() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringZenkaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumberOfItems7() {
        PurchaseDTO test = new PurchaseDTO();
        String expected = testStringHankakuZenkaku;

        test.setNumberOfItems(expected);
        String actual = test.getNumberOfItems();
        assertEquals(expected, actual);
    }

}
