/*
 * タイトル：ListSelectConditionItemsDTOをテストする為のクラス
 * 説明????：ListSelectConditionItemsDTOをテストする
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

import com.internousdevwork.mackeypark.dto.ListSelectConditionItemsDTO;

public class ListSelectConditionItemsDTOTest {

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
     *{@link com.internousdev.ListSelectConditionItemsDTO.DTO.ListSelectConditionItemsDTO#getDivision()} のテスト・メソッド
     */
    @Test
    public void testGetDivision1() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision2() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision3() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision4() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision5() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision6() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision7() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    /**
     *{@link com.internousdev.ListSelectConditionItemsDTO.DTO.ListSelectConditionItemsDTO#setDivision()} のテスト・メソッド
     */
    @Test
    public void testSetDivision1() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision2() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision3() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision4() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision5() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision6() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision7() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.ListSelectConditionItemsDTO.DTO.ListSelectConditionItemsDTO#getExplanation()} のテスト・メソッド
     */
    @Test
    public void testGetExplanation1() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringNull;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation2() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringKara;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation3() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringSpace;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation4() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation5() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation6() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation7() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    /**
     *{@link com.internousdev.ListSelectConditionItemsDTO.DTO.ListSelectConditionItemsDTO#setExplanation()} のテスト・メソッド
     */
    @Test
    public void testSetExplanation1() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringNull;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testExplanation2() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringKara;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation3() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringSpace;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation4() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation5() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation6() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringZenkaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation7() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.ListSelectConditionItemsDTO.DTO.ListSelectConditionItemsDTO#getPrice()} のテスト・メソッド
     */
    @Test
    public void testGetPrice1() {
        ListSelectConditionItemsDTO test = new  ListSelectConditionItemsDTO();
        int expected = testInt0;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    @Test
    public void testGetPrice2() {
        ListSelectConditionItemsDTO test = new  ListSelectConditionItemsDTO();
        int expected = testIntMax;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    @Test
    public void testGetPrice3() {
        ListSelectConditionItemsDTO test = new  ListSelectConditionItemsDTO();
        int expected = testIntMin;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    /**
     *{@link com.internousdev.ListSelectConditionItemsDTO.DTO.ListSelectConditionItemsDTO#setPrice()} のテスト・メソッド
     */
    @Test
    public void testSetPrice1() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        int expected = testInt0;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice2() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        int expected = testIntMax;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice3() {
        ListSelectConditionItemsDTO test = new ListSelectConditionItemsDTO();
        int expected = testIntMin;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

}
