/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite;

import Entity.SinhVien;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Thai Son
 */
public class ReadObj {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("SinhVien.dat"));
            //ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SinhVien.dat")));
            Object obj=ois.readObject();
            SinhVien sv=(SinhVien)obj;
            System.out.println("sv = " + sv);
        } catch (IOException ex) {
            Logger.getLogger(ReadObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadObj.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(ReadObj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
