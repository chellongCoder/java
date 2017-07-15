/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goiPhuongThucTrongConstructor;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Point extends Shape {
    protected int x, y;
    public Point (int xx, int yy) {
        x = xx;
        y = yy;
    }
    public void draw () {
        System.out.println(x + " | " + y);
    }
    
    public static void main(String[] args) {
        Point p = new Point (10, 10);
        p.draw();
    }
}
