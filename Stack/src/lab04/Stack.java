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
public class Stack {
    Node top;
    private int size;
    
    public boolean isEmpty () {
        return top == null;
    }
    
    public int numOfElenment () {
        return size;
    }
    
    public void push (Node node) {
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        size++;
    }
    
    public Node pop () {
        Node node = null;
        if (!isEmpty()) {
            node = top;
            top = top.getNext();
            node.setNext(null);
            size--;
        }
        return node;
    }
    
    public int search(int item) {
        int pos = 0;
        Node node = top;
        while (node != null) {
            pos++;
            if (node.getItem() == item) {
                return pos;
            }
            node = node.getNext();
        }
        return 0;
    }
    
    public void display () {
        Node node = top;
        System.out.println("danh sách hiện có " + size + " phần tử.");
        while (node != null) {
            System.out.print(node.getItem() + " | ");
            node = node.getNext();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.display();
        stack.push(new Node (10, null));
        stack.push(new Node(12, null));
        stack.push(new Node (20, null));
        stack.push(new Node (30, null));
        stack.push(new Node (100, null));
        stack.display();
        Node node_pop = stack.pop();
        stack.display();
        System.out.println("thong tin cua node da pop: " + node_pop.getItem());
        System.out.println("so 12 o vi tri " + stack.search(12));
    }
}
