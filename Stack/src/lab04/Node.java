/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Long Nguyen Nhat
 */
public class Node {
    private int item;
    private Node next;

    public Node() {
    }

    public Node(int item, Node next) {
        this.item = item;
        this.next = next;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
}
