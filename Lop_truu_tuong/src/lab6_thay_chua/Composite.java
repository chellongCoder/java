/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Thai Son
 */
public class Composite extends Shape{
    private ArrayList<Shape> lstShape = new ArrayList<>();
    private ArrayList lstShape22 = new ArrayList();
    
    public void add(Shape s){
        lstShape.add(s);
    }
    public void remove(Shape s){
        lstShape.remove(s);
    }
    public Shape getChild(int i){
        Shape s=lstShape.get(i);
        return s;
    }
    @Override
    void draw() {
        System.out.println("draw Composite!");
    }

    @Override
    void rotate(int angle) {
        System.out.println("rotate Composite with angle:"+angle);
    }

    @Override
    void moveLeft(int point) {
        System.out.println("move Composite to point:"+point);
    }

    @Override
    void setColor(int color) {
        System.out.println("set color of Composite:"+color);
    }
    public static void main(String[] args) {
        Composite composite = new Composite();
        //add to composite: 3 line and 1 cirlce
        Line l1 = new Line();
        Line l2 = new Line();
        Line l3 = new Line();
        Circular c1 = new Circular();
        composite.add(l1);
        composite.add(l2);
        composite.add(l3);
        composite.add(c1);
        //before remove
        System.out.println("before remove");
        for (int i = 0; i < composite.lstShape.size(); i++) {
            composite.lstShape.get(i).draw();            
        }
        //remove
        //Object o = new Object();
        
        System.out.println("remove");
        //ArrayList arr = new ArrayList();
        composite.lstShape.remove(l2);
        //after remove
        System.out.println("after remove");
        for (int i = 0; i < composite.lstShape.size(); i++) {
            composite.lstShape.get(i).draw();            
        }
    }
}
