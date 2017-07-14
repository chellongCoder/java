/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Thai Son
 */
public class TestException {

    public int chia() throws MyException {
        int c = 0;
        try {
            int a = 10;
            int b = 0;
            c = a / b;
        } catch (Exception e) {
            throw new MyException("Lỗi của tôi đây");
        }
        return c;
    }

    public static void main(String[] args) {
        try {
            TestException test = new TestException();
            test.chia();
        } catch (MyException e) {
            System.out.println("1");
            e.printStackTrace();
            System.out.println("2");
        }
    }
}
