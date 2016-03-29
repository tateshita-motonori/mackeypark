package com.internousdevwork.mackeypark.dto.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.internousdevwork.mackeypark.dto.UserInformationDTO;

public class UserInformationDTOTest {

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
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getUserName()} のテスト・メソッド
     */
    @Test
    public void testGetUserName1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    @Test
    public void testGetUserName7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setUserName(expected);
        assertEquals(expected, test.getUserName());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setUserName()} のテスト・メソッド
     */
    @Test
    public void testSetUserName1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testUserName2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetUserName7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setUserName(expected);
        String actual = test.getUserName();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getPassword()} のテスト・メソッド
     */
    @Test
    public void testGetPassword1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    @Test
    public void testGetPassword7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setPassword(expected);
        assertEquals(expected, test.getPassword());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setPassword()} のテスト・メソッド
     */
    @Test
    public void testSetPassword1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testPassword2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPassword7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setPassword(expected);
        String actual = test.getPassword();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getEmail()} のテスト・メソッド
     */
    @Test
    public void testGetEmail1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    @Test
    public void testGetEmail7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setEmail(expected);
        assertEquals(expected, test.getEmail());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setEmail()} のテスト・メソッド
     */
    @Test
    public void testSetEmail1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmail2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setEmail(expected);
        String actual = test.getEmail();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getPostalCode()} のテスト・メソッド
     */
    @Test
    public void testGetPostalCode1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    @Test
    public void testGetPostalCode2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    @Test
    public void testGetPostalCode3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    @Test
    public void testGetPostalCode4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    @Test
    public void testGetPostalCode5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    @Test
    public void testGetPostalCode6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    @Test
    public void testGetPostalCode7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setPostalCode(expected);
        assertEquals(expected, test.getPostalCode());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setPostalCode()} のテスト・メソッド
     */
    @Test
    public void testSetPostalCode1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testPostalCode2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPostalCode3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPostalCode4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPostalCode5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPostalCode6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPostalCode7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setPostalCode(expected);
        String actual = test.getPostalCode();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getAddress()} のテスト・メソッド
     */
    @Test
    public void testGetAddress1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    @Test
    public void testGetAddress2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    @Test
    public void testGetAddress3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    @Test
    public void testGetAddress4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    @Test
    public void testGetAddress5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    @Test
    public void testGetAddress6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    @Test
    public void testGetAddress7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setAddress(expected);
        assertEquals(expected, test.getAddress());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setAddress()} のテスト・メソッド
     */
    @Test
    public void testSetAddress1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddress2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setAddress(expected);
        String actual = test.getAddress();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getCardNumber()} のテスト・メソッド
     */
    @Test
    public void testGetCardNumber1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    @Test
    public void testGetCardNumber2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    @Test
    public void testGetCardNumber3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    @Test
    public void testGetCardNumber4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    @Test
    public void testGetCardNumber5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    @Test
    public void testGetCardNumber6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    @Test
    public void testGetCardNumber7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setCardNumber(expected);
        assertEquals(expected, test.getCardNumber());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setCardNumber()} のテスト・メソッド
     */
    @Test
    public void testSetCardNumber1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testCardNumber2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardNumber3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardNumber4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardNumber5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardNumber6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardNumber7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setCardNumber(expected);
        String actual = test.getCardNumber();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getCardHolder()} のテスト・メソッド
     */
    @Test
    public void testGetCardHolder1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    @Test
    public void testGetCardHolder2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    @Test
    public void testGetCardHolder3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    @Test
    public void testGetCardHolder4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    @Test
    public void testGetCardHolder5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    @Test
    public void testGetCardHolder6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    @Test
    public void testGetCardHolder7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setCardHolder(expected);
        assertEquals(expected, test.getCardHolder());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setCardHolder()} のテスト・メソッド
     */
    @Test
    public void testSetCardHolder1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    @Test
    public void testCardHolder2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardHolder3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardHolder4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardHolder5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardHolder6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCardHolder7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setCardHolder(expected);
        String actual = test.getCardHolder();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getSecurityCode()} のテスト・メソッド
     */
    @Test
    public void testGetSecurityCode1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    @Test
    public void testGetSecurityCode2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    @Test
    public void testGetSecurityCode3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    @Test
    public void testGetSecurityCode4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    @Test
    public void testGetSecurityCode5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    @Test
    public void testGetSecurityCode6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    @Test
    public void testGetSecurityCode7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setSecurityCode(expected);
        assertEquals(expected, test.getSecurityCode());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setSecurityCode()} のテスト・メソッド
     */
    @Test
    public void testSetSecurityCode1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSecurityCode2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSecurityCode3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSecurityCode4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSecurityCode5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSecurityCode6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSecurityCode7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setSecurityCode(expected);
        String actual = test.getSecurityCode();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getExpirationDate()} のテスト・メソッド
     */
    @Test
    public void testGetExpirationDate1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    @Test
    public void testGetExpirationDate2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    @Test
    public void testGetExpirationDate3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    @Test
    public void testGetExpirationDate4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    @Test
    public void testGetExpirationDate5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    @Test
    public void testGetExpirationDate6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    @Test
    public void testGetExpirationDate7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setExpirationDate(expected);
        assertEquals(expected, test.getExpirationDate());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setExpirationDate()} のテスト・メソッド
     */
    @Test
    public void testSetExpirationDate1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testExpirationDate2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExpirationDate3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExpirationDate4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExpirationDate5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExpirationDate6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetExpirationDate7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setExpirationDate(expected);
        String actual = test.getExpirationDate();
        assertEquals(expected, actual);
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#getNameKana()} のテスト・メソッド
     */
    @Test
    public void testGetNameKana1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    @Test
    public void testGetNameKana2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    @Test
    public void testGetNameKana3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    @Test
    public void testGetNameKana4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    @Test
    public void testGetNameKana5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    @Test
    public void testGetNameKana6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    @Test
    public void testGetNameKana7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setNameKana(expected);
        assertEquals(expected, test.getNameKana());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.UserInformationDTO#setNameKana()} のテスト・メソッド
     */
    @Test
    public void testSetNameKana1() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringNull;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

    @Test
    public void testNameKana2() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringKara;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNameKana3() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringSpace;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNameKana4() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkakuSpace;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNameKana5() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankaku;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNameKana6() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringZenkaku;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNameKana7() {
        UserInformationDTO test = new UserInformationDTO();
        String expected = testStringHankakuZenkaku;

        test.setNameKana(expected);
        String actual = test.getNameKana();
        assertEquals(expected, actual);
    }

}
