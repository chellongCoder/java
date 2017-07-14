/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThuaException;

/**
 *
 * @author Long Nguyen Nhat
 */

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author Nguyen Thai Son
 */
public class Student extends Person {
    private String clas;

    public Student() {
        //super();
    }

    public Student(String clas, String name, String address, String department) {
        //super();
        super(name, address, department);
        this.clas = clas;
    }
    
    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
    public void docFile()throws EOFException{ //lớp con thừa kế phải bắt ngoại lệ
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(inputStreamReader);
            br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void A() throws IOException{
        
    }
    @Override
    public String toString() {
        return "Student{" + "clas=" + clas + '}'+super.toString();
    }
    public void inPut(){
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên lớp:");
        this.setClas(scanner.nextLine());
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.inPut();
        System.out.println(s);
    }
}
