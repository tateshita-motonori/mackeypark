package com.internousdevwork.mackeypark.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdevwork.mackeypark.dto.AdminUserDTO;

public class AdminUserDTOTest {

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
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#getId()} のテスト・メソッド
     */
    @Test
    public void testGetId1() {
        AdminUserDTO test = new  AdminUserDTO();
        int expected = testInt0;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId2() {
        AdminUserDTO test = new  AdminUserDTO();
        int expected = testIntMax;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId3() {
        AdminUserDTO test = new  AdminUserDTO();
        int expected = testIntMin;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminCustamerDTO#setId()} のテスト・メソッド
     */
    @Test
    public void testSetId1() {
        AdminUserDTO test = new AdminUserDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId2() {
        AdminUserDTO test = new AdminUserDTO();
        int expected = testIntMax;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId3() {
        AdminUserDTO test = new AdminUserDTO();
        int expected = testIntMin;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#getPassword()} のテスト・メソッド
     */
    @Test
    public void testGetPassword1() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringNull;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword2() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringKara;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword3() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringSpace;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword4() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkakuSpace;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword5() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankaku;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword6() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkaku;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword7() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankakuZenkaku;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#setPassword()} のテスト・メソッド
     */
    @Test
    public void testSetPassword1() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringNull;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testPassword2() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringKara;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword3() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringSpace;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword4() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkakuSpace;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword5() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankaku;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword6() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkaku;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword7() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankakuZenkaku;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#getUserName()} のテスト・メソッド
     */
    @Test
    public void testGetUserName1() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringNull;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName2() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringKara;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName3() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringSpace;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName4() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkakuSpace;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName5() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankaku;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName6() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkaku;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName7() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankakuZenkaku;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#setUserName()} のテスト・メソッド
     */
    @Test
    public void testSetUserName1() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringNull;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testUserName2() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringKara;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName3() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringSpace;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName4() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkakuSpace;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName5() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankaku;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName6() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkaku;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName7() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankakuZenkaku;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#getEmail()} のテスト・メソッド
     */
    @Test
    public void testGetEmail1() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail2() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail3() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail4() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkakuSpace;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail5() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail6() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail7() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankakuZenkaku;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.AdminUserDTO#setEmail()} のテスト・メソッド
     */
    @Test
    public void testSetEmail1() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmail2() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail3() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail4() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkakuSpace;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail5() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail6() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail7() {
        AdminUserDTO test = new AdminUserDTO();
        String expected = testStringHankakuZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

}