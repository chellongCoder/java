/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 *
 * @author Long Nguyen Nhat
 */
public class loiChecked {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("long"));
        } catch (FileNotFoundException ex) {
        }
    }
}
