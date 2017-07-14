/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop_truu_tuong;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Circle extends Shape{

    protected int radius;
    
    
    @Override
    public void erase() {
    }

    @Override
    public void draw() {
    }
    
    public static void main(String[] args) {
//        Shape shape = new Shape();//vì là lớp abstract trên k tạo đối tượng
        Circle circle = new Circle();
        
    }
}
