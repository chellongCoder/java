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
public abstract class Shape {
    protected int x,y;
    
    public abstract void erase();
    public abstract void draw();
    
    public void moveTo(int x1, int y1) {
        x = x1;
        y = y1;
        erase();
        draw();
    }
    
}
