/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Student extends Person{
    public String msv;

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    @Override
    public void getDetail() {
        System.out.println("ho ten: " + getHoTen());
        System.out.println("ngay sinh: " + getMsv());
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.getDetail();
    }
}
