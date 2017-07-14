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
public class nemLoi {

   

    void chia() throws Exception{ //ném lỗi sang cho method chia
       
            int a = 10;
            int b = 0;
            System.out.println("a/b = " + a / b);
            
            throw new Exception("lỗi ArithmeticException ");
    }
    
    public static void main(String[] args) {
        nemLoi loi = new nemLoi();
        try {
            loi.chia();//nếu sử dụng pt chia thì phải bắt lỗi
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
