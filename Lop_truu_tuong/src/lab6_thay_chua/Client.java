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
public class Client {
    public static void main(String[] args) {
        ArrayList<Shape> lstFig = new ArrayList<>();
        Line line = new Line();
        Circular circular1 = new Circular();
        Circular circular2 = new Circular();
        Composite composite = new Composite();
        //add to composite: 3 line and 1 cirlce
        composite.add(new Line());
        composite.add(new Line());
        composite.add(new Line());
        composite.add(new Circular());
        //add to fig: 1 line, 2 circle, 1 composite
        lstFig.add(line);
        lstFig.add(circular1);
        lstFig.add(circular2);
        lstFig.add(composite); 
        //Thực hiện đổi màu đồng bộ và quay 1 góc 90 độ đối với các đối tượng trong figure.
        for(int i=0;i<lstFig.size();i++){
            lstFig.get(i).setColor(10);            
            //System.out.println("");
            lstFig.get(i).rotate(90);
            System.out.println("");
        }
    }
}
