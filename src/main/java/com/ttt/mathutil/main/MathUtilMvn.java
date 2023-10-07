/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttt.mathutil.main;
import com.ttt.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilMvn {
    public static void main(String[] args) {
        //Test thử hàm mình viết viết tính giai thừa có đúng ko
        //Chuan bi data testm test case
        //Test Case no1: check if getFactorial() runs well with n = 0
        //Test Proceduce:
        //              Given n = 0
        //              Invoke getFactorial() = 0;
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println(n+"! expected = "+expected+" || actual = "+actual);
    }
}
