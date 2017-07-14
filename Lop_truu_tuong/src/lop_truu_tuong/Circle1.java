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
public class Circle1 implements Shape1, Shape2{//đa kế thừa dùng interface

    @Override
    public void erase() {
        
    }

    @Override
        public void draw() {
        
    }
    
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
    }
}
