/*
 * タイトル：LoginOauthDTOをテストする為のクラス
 * 説明????：LoginOauthDTOをテストする
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

import com.internousdevwork.mackeypark.dto.LoginOauthDTO;

public class LoginOauthDTOTest {

    private int testInt0;
    private int testIntMax;
    private int testIntMin;

    @Before
    public void setUp() throws Exception {
        testInt0 = 0;
        testIntMax = Integer.MAX_VALUE;
        testIntMin = Integer.MIN_VALUE;
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.LoginOauthDTO#getId()} のテスト・メソッド
     */
    @Test
    public void testGetId1() {
        LoginOauthDTO test = new  LoginOauthDTO();
        int expected = testInt0;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId2() {
        LoginOauthDTO test = new  LoginOauthDTO();
        int expected = testIntMax;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId3() {
        LoginOauthDTO test = new  LoginOauthDTO();
        int expected = testIntMin;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.LoginOauthDTO#setId()} のテスト・メソッド
     */
    @Test
    public void testSetId1() {
        LoginOauthDTO test = new LoginOauthDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId2() {
        LoginOauthDTO test = new LoginOauthDTO();
        int expected = testIntMax;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId3() {
        LoginOauthDTO test = new LoginOauthDTO();
        int expected = testIntMin;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

}
