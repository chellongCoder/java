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

/**
 *
 * @author Nguyen Thai Son
 */
public class Person {
    private String name;
    private String address;
    private String department;

    public Person() {
    }

    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void docFile()throws IOException{//lớp cha ném ngoại lệ
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        br.readLine();
    }
    ///@Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", department=" + department + '}';
    }
    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên:");
        this.setName(scanner.nextLine());
        System.out.print("Nhập địa chỉ:");
        this.setAddress(scanner.nextLine());
        System.out.print("Nhập phòng ban:");
        this.setDepartment(scanner.nextLine());
    }
    public void A() throws IOException{
        
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.inPut();
        System.out.println(p);
    }
    
}
