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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.naming.NamingException;

/**
 *
 * @author Nguyen Thai Son
 */
public class Teacher extends Person {
    private String rank;

    public Teacher() {
    }

    public Teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank = rank;
    }
    

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Teacher{" + "rank=" + rank + '}'+super.toString();
    }
    public void inPut(){
        super.inPut();
        System.out.print("Nhập rank: ");
        Scanner scanner = new Scanner(System.in);
        this.setRank(scanner.nextLine());
    }
    public void A()throws FileNotFoundException{ //method A ném ngoại lệ
        
    }
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();
        try {
            p1.A();//dùng pt A
            p2.A();
        } catch (IOException e) {//phải bắt ngoại lệ của pt A
            e.printStackTrace();//in ra thông báo lỗi
        }
    }
}

