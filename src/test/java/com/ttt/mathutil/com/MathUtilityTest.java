/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ttt.mathutil.com;

import static com.ttt.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //so sanh xem gia tri ki vong 1 == thuc te tinh 0! hay ko
    //thay ra 2 mau xanh: pass, do: not pass
    //nhung khi not pass thi phai kiem tra lai ham tinh toan(lam viec) va ca expected xem co phai expected sai ko
    @Test
    public void testFactorialGivenRightArgument0RunWell(){
        //Test Case no1: check if getFactorial() runs well with n = 0
        //Test Porceduce:
        //              Given n = 0
        //              Invoke getFactorial() = 0;
        //              Expect return 1
        int n = 0;
        long expected = 1;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    @Test
    public void testFactorialGivenRightArgument1RunWell(){
        //Test Case no2: check if getFactorial() runs well with n = 1
        //Test Porceduce:
        //              Given n = 1
        //              Invoke getFactorial() = 1;
        //              Expect Return 1
    assertEquals(1, getFactorial(1));
    }
    @Test
    public void testFactorialGivenRightArgument2RunWell(){
        //Test Case no3: check if getFactorial() runs well with n = 2
        //Test Porceduce:
        //              Given n = 2
        //              Invoke getFactorial() = 2;
        //              Expect Return 2
    assertEquals(2, getFactorial(2));
    }
    @Test
    public void testFactorialGivenRightArgument3RunWell(){
        //Test Case no4: check if getFactorial() runs well with n = 5
        //Test Porceduce:
        //              Given n = 5
        //              Invoke getFactorial() = 120;
        //              Expect Return 120
        assertEquals(120, getFactorial(5));
                    //6             //3 giai thua Hy vong tra ve 
    }
    //TONG KET VE MAU
    //XANH:  KHI TAT CA CAC TEST CASE DEU XANH
    //DO:    CHI MOT TRONG NHUNG TEST CASE BI SAI
    //XANH LA PHAI XANH HET, CHI CAN 1 DO LA DU TOANG
    //NGUYEN LY: TEST CASE NEU DA TON TAI THI HAM PHAI DUNG
}

