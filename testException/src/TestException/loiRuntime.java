/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

/**
 *
 * @author Long Nguyen Nhat
 */
public class loiRuntime {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
        System.out.println("a/b = " + a/b);

            int[] arr = new int[10];
            System.out.println(arr[100]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
