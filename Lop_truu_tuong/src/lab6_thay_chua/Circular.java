/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author Nguyen Thai Son
 */
public class Circular extends Shape{
    private int area;
    public int getArea(){
        return area;
    }
    @Override
    void draw() {
        System.out.println("draw Circular!");
    }

    @Override
    void rotate(int angle) {
        System.out.println("rotate Circular with angle:"+angle);
    }

    @Override
    void moveLeft(int point) {
        System.out.println("move Circular to point:"+point);
    }

    @Override
    void setColor(int color) {
        System.out.println("set color of Circular:"+color);
    }
}
