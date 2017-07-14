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
public class Person {
    protected String hoTen;
    protected String ngaySinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void getDetail() {
        System.out.println("họ tên " + hoTen );
        System.out.println("ngày sinh " + ngaySinh);
    }
}
