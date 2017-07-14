/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslk;

import java.util.Scanner;

/**
 *
 * @author Long Nguyen Nhat
 */
public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        first = last = null;
    }

    public boolean isEmpty() { //hàm kiểm tra dnah sách rỗng
        if (first == null && last == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertFront(int item) {

        if (isEmpty()) { //nếu danh sách rỗng
            Node n = new Node(item);
            first = last = n; // cho đầu cuối bằng node vừa tạo
        } else { //nếu danh sách không rỗng
            Node n = new Node(item, first);
            first = n;
        }
    }

    public void insertBack(int item) {
        if (isEmpty()) {
            Node n = new Node(item);
            first = last = n;
        } else {
            Node n = new Node(item);
            last.next = n;
            last = n;
        }
    }

    public Node removeFront() {
        Node node = null;
        if (!isEmpty()) { //danh sách không rỗng
            if (first == last) { //danh sahcs có 1 nút
                node = first; //cho node mới tạo bằng first
                node.next = null; //con trỏ next trỏ vào null
                first = last = null; //đầu cuối không có
            } else { //danh sách nhiều hơn 1 phần tử
                node = first; //node mới bằng first
                node.next = null; //tách phần tử đầu cần remove ra
                first = first.next; //cho đầu thành phần tử đầu tiếp theo
            }
        }
        return node; //return lại node vừa remove
    }

    public Node removeBack() {
        Node node = null; //khởi tạo node rỗng
        if (!isEmpty()) { //nếu danh sách không rỗng
            if (first == last) { //nếu danh sách có 1 nút
                node = first;
                node.next = null;
                first = last = null;//cho last và first rỗng
            } else { //nếu danh sahcs có nhiều hơn 1 nút
                Node before_node = first; //tìm node trước last
                while (before_node.next != last) {
                    before_node = before_node.next;
                }
                node = last;//lấy ra node cuối
                last = before_node;//last bằng node trc last
                last.next = null;
            }
        }
        return node;//trả về node cuối vừa remove
    }

    public int numOfElement() { //trả về số phần tử hiện có trong danh sahcs
        Node node = first;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public int search(int item) { //hàm search trả về vị trí item trong danh sahcs
        int pos = 0;
        Node node = first;
        while (node != null) {
            pos++;
            if (node.data == item) {
                return pos;
            }
            node = node.next;
        }
        return 0;
    }
    
    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(" | " + node.data + " | ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linklist = new LinkedList();
        Scanner sc = new Scanner(System.in);
        linklist.insertFront(20);
        linklist.insertFront(40);
        linklist.insertBack(100);
        int countOfElement = linklist.numOfElement();
        System.out.println("số phần tử trong danh sách hiện tại là: " + countOfElement);
        linklist.print();
        System.out.println("xoa duoi: " + linklist.removeBack().data);
        linklist.print();
        System.out.println("xoa duoi: " + linklist.removeBack().data);
        linklist.print();
        int item;
        System.out.println("nhập vào số bạn muốn tìm kiếm: ");
        item = sc.nextInt();
        int check = linklist.search(item);
        System.out.println("tìm thấy item " + item + " ở vị trí "+ check);
    }
}
