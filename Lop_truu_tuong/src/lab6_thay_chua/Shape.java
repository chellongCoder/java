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
abstract class Shape {
    abstract void draw();
    abstract void rotate(int angle);
    abstract void moveLeft(int point);
    abstract void setColor(int color);
}
