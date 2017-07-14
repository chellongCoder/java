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
public class Employee extends Person{
    public double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void getDetail() {
        super.getDetail(); 
        System.out.println(getSalary());
    }
    
    
    
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.
        employee.setHoTen("long nguyễn nhật");
        employee.setNgaySinh("17/7/1998");
        employee.setSalary(100000);
        employee.getDetail();
    }
}
