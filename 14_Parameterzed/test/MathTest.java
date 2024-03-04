/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author TUAN
 */
@RunWith(Parameterized.class)
public class MathTest {

    // Declare variables.
    private static Math math;
    private final int number1;
    private final int number2;
    private final int expectedNumber;

    /**
     * @Contructer function
     */
    public MathTest(int number1, int number2, int expectedNumber) {
        this.number1 = number1;
        this.number2 = number2;
        this.expectedNumber = expectedNumber;
    }

    /***
    @Parameters index order follow: number1 - number2 - expectedNumber
    For example: {  5  ,   6  ,    11  }
    *               |      |        |
    *            number1 number2 expectedNuber
    **/
    @Parameters
    public static Collection<Object[]> dataset() {
        return Arrays.asList(new Object[][]{
            {1, 2, 3},
            {3, 4, 7},
            {5, 6, 11},
            {8, 9, 5}
        });
    }

    /**
     * Setup resource general use.
     */
    @BeforeClass
    public static void __init__() {
        math = new Math();
    }
    
    /**
     * @After test, we will garbage resource
     */
    @AfterClass
    public static void __garbage__() {
        math = null;
    }

    /**
     * Test of sum method, of class Math.
     */
    @Test
    public void testSum() {
        assertEquals("Dữ liệu đầu vào: Number1 = " + number1 + ", Number2 = " + number2,expectedNumber, math.sum(number1,number2));
    }

}
