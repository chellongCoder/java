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
public class Line extends Shape{
    private int length;
    public int getLength(){
        return length;
    }
    @Override
    void draw() {
        System.out.println("draw line!");
    }

    @Override
    void rotate(int angle) {
        System.out.println("rotate line with angle:"+angle);
    }

    @Override
    void moveLeft(int point) {
        System.out.println("move line to point:"+point);
    }

    @Override
    void setColor(int color) {
        System.out.println("set color of line:"+color);
    }
    
}
