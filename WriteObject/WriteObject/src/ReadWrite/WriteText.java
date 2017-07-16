/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Nguyen Thai Son
 */
public class WriteText {
    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 5; i++) {
                bw.write("Tuc Anh Ach");     
                bw.write("\n");
            }
            bw.close();
        } catch (Exception e) {
        }
    }
}
