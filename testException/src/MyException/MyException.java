/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Thai Son
 */
public class MyException extends Exception{

    public MyException() {
    }

    public MyException(String msg) {
        System.out.println(msg);
    }
    
    
}
