package com.internousdevwork.mackeypark.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdevwork.mackeypark.dto.AdminItemsDTO;

public class AdminItemsDTOTest {

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
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getItemId()} のテスト・メソッド
     */
    @Test
    public void testGetItemId1() {
        AdminItemsDTO test = new  AdminItemsDTO();
        int expected = testInt0;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId2() {
        AdminItemsDTO test = new  AdminItemsDTO();
        int expected = testIntMax;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    @Test
    public void testGetItemId3() {
        AdminItemsDTO test = new  AdminItemsDTO();
        int expected = testIntMin;

        test.setItemId(expected);
        assertEquals(expected, test.getItemId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setItemId()} のテスト・メソッド
     */
    @Test
    public void testSetItemId1() {
        AdminItemsDTO test = new AdminItemsDTO();
        int expected = testInt0;

        test.setItemId(expected);
        int actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId2() {
        AdminItemsDTO test = new AdminItemsDTO();
        int expected = testIntMax;

        test.setItemId(expected);
        int actual = test.getItemId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemId3() {
        AdminItemsDTO test = new AdminItemsDTO();
        int expected = testIntMin;

        test.setItemId(expected);
        int actual = test.getItemId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getItemName()} のテスト・メソッド
     */
    @Test
    public void testGetItemName1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    @Test
    public void testGetItemName2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    @Test
    public void testGetItemName3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    @Test
    public void testGetItemName4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    @Test
    public void testGetItemName5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    @Test
    public void testGetItemName6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    @Test
    public void testGetItemName7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemName(expected);
        assertEquals(expected, test.getItemName());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setItemName()} のテスト・メソッド
     */
    @Test
    public void testSetItemName1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemName2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemName3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemName4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemName5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemName6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetItemName7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setItemName(expected);
        String actual = test.getItemName();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getPeriod()} のテスト・メソッド
     */
    @Test
    public void testGetPeriod1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    @Test
    public void testGetPeriod2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    @Test
    public void testGetPeriod3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    @Test
    public void testGetPeriod4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    @Test
    public void testGetPeriod5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    @Test
    public void testGetPeriod6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    @Test
    public void testGetPeriod7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setPeriod(expected);
        assertEquals(expected, test.getPeriod());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setPeriod()} のテスト・メソッド
     */
    @Test
    public void testSetPeriod1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    @Test
    public void testPeriod2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPeriod3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPeriod4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPeriod5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPeriod6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPeriod7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setPeriod(expected);
        String actual = test.getPeriod();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getDivision()} のテスト・メソッド
     */
    @Test
    public void testGetDivision1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    @Test
    public void testGetDivision7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        assertEquals(expected, test.getDivision());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setDivision()} のテスト・メソッド
     */
    @Test
    public void testSetDivision1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testDivision2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDivision7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDivision(expected);
        String actual = test.getDivision();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getDesign()} のテスト・メソッド
     */
    @Test
    public void testGetDesign1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    @Test
    public void testGetDesign2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    @Test
    public void testGetDesign3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    @Test
    public void testGetDesign4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    @Test
    public void testGetDesign5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    @Test
    public void testGetDesign6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    @Test
    public void testGetDesign7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDesign(expected);
        assertEquals(expected, test.getDesign());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setDesign()} のテスト・メソッド
     */
    @Test
    public void testSetDesign1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    @Test
    public void testDesign2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDesign3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDesign4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDesign5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDesign6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDesign7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setDesign(expected);
        String actual = test.getDesign();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getExplanation()} のテスト・メソッド
     */
    @Test
    public void testGetExplanation1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    @Test
    public void testGetExplanation7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setExplanation(expected);
        assertEquals(expected, test.getExplanation());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setExplanation()} のテスト・メソッド
     */
    @Test
    public void testSetExplanation1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testExplanation2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExplanation7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setExplanation(expected);
        String actual = test.getExplanation();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getPrice()} のテスト・メソッド
     */
    @Test
    public void testGetPrice1() {
        AdminItemsDTO test = new  AdminItemsDTO();
        int expected = testInt0;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    @Test
    public void testGetPrice2() {
        AdminItemsDTO test = new  AdminItemsDTO();
        int expected = testIntMax;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    @Test
    public void testGetPrice3() {
        AdminItemsDTO test = new  AdminItemsDTO();
        int expected = testIntMin;

        test.setPrice(expected);
        assertEquals(expected, test.getPrice());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setPrice()} のテスト・メソッド
     */
    @Test
    public void testSetPrice1() {
        AdminItemsDTO test = new AdminItemsDTO();
        int expected = testInt0;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice2() {
        AdminItemsDTO test = new AdminItemsDTO();
        int expected = testIntMax;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice3() {
        AdminItemsDTO test = new AdminItemsDTO();
        int expected = testIntMin;

        test.setPrice(expected);
        int actual = test.getPrice();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#getimgPath()} のテスト・メソッド
     */
    @Test
    public void testGetimgPath1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    @Test
    public void testGetimgPath2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    @Test
    public void testGetimgPath3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    @Test
    public void testGetimgPath4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    @Test
    public void testGetimgPath5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    @Test
    public void testGetimgPath6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    @Test
    public void testGetimgPath7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setImgPath(expected);
        assertEquals(expected, test.getimgPath());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminItemsDTO#setImgPath()} のテスト・メソッド
     */
    @Test
    public void testSetImgPath1() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringNull;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

    @Test
    public void testImgPath2() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringKara;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetImgPath3() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringSpace;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetImgPath4() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkakuSpace;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetImgPath5() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankaku;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetImgPath6() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringZenkaku;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetImgPath7() {
        AdminItemsDTO test = new AdminItemsDTO();
        String expected = testStringHankakuZenkaku;

        test.setImgPath(expected);
        String actual = test.getimgPath();
        assertEquals(expected, actual);
    }

}
