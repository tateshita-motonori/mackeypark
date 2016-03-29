package com.internousdevwork.mackeypark.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdevwork.mackeypark.dto.ListMainItemsDTO;

public class ListMainItemsDTOTest {

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
     *{@link com.internousdev.mackeypark.DTO.ListMainItemsDTO#getDivision()} のテスト・メソッド
     */
    @Test
    public void testGetDivision1() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision2() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision3() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision4() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision5() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision6() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision7() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.ListMainItemsDTO#setDivision()} のテスト・メソッド
     */
    @Test
    public void testSetDivision1() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision2() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision3() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision4() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision5() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision6() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision7() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.ListMainItemsDTO#getExplanation()} のテスト・メソッド
     */
    @Test
    public void testGetExplanation1() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringNull;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation2() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringKara;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation3() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringSpace;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation4() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation5() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation6() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation7() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }


    /**
     *{@link com.internousdev.mackeypark.DTO.ListMainItemsDTO#setExplanation()} のテスト・メソッド
     */
    @Test
    public void testSetExplanation1() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringNull;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testExplanation2() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringKara;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation3() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringSpace;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation4() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation5() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation6() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringZenkaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation7() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.ListMainItemsDTO#getPrice()} のテスト・メソッド
     */
    @Test
    public void testGetPrice1() {
        ListMainItemsDTO test = new  ListMainItemsDTO();
        int expected = testInt0;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    @Test
    public void testGetPrice2() {
        ListMainItemsDTO test = new  ListMainItemsDTO();
        int expected = testIntMax;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    @Test
    public void testGetPrice3() {
        ListMainItemsDTO test = new  ListMainItemsDTO();
        int expected = testIntMin;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.ListMainItemsDTO#setPrice()} のテスト・メソッド
     */
    @Test
    public void testSetPrice1() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        int expected = testInt0;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice2() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        int expected = testIntMax;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice3() {
        ListMainItemsDTO test = new ListMainItemsDTO();
        int expected = testIntMin;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

}
