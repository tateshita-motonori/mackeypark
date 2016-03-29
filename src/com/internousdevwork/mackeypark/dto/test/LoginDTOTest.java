/*
 * タイトル：LoginDTOをテストする為のクラス
 * 説明????：LoginDTOをテストする
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

import com.internousdevwork.mackeypark.dto.LoginDTO;

public class LoginDTOTest {

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
     *{@link com.internousdev.mackeypark.DTO.LoginDTO#getId()} のテスト・メソッド
     */
    @Test
    public void testGetId1() {
        LoginDTO test = new  LoginDTO();
        int expected = testInt0;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId2() {
        LoginDTO test = new  LoginDTO();
        int expected = testIntMax;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetId3() {
        LoginDTO test = new  LoginDTO();
        int expected = testIntMin;

        test.setId(expected);
        assertEquals(expected, test.getId());
    }

    /**
     *{@link com.internousdev.mackeypark.DTO.LoginDTO#setId()} のテスト・メソッド
     */
    @Test
    public void testSetId1() {
        LoginDTO test = new LoginDTO();
        int expected = testInt0;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId2() {
        LoginDTO test = new LoginDTO();
        int expected = testIntMax;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetId3() {
        LoginDTO test = new LoginDTO();
        int expected = testIntMin;

        test.setId(expected);
        int actual = test.getId();
        assertEquals(expected, actual);
    }

}
