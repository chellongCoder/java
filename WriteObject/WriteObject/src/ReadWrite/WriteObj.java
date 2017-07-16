/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite;

import Entity.SinhVien;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Thai Son
 */
public class WriteObj {

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.setName("Nguyen Thai Son");
        sv.setAge(30);
        sv.setAddress("Hà Nội");

        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream("SinhVien.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sv);
        } catch (IOException ex) {
            Logger.getLogger(WriteObj.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(WriteObj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
