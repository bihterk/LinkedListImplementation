package linkedlist;

import java.util.Objects;

public class Node<T> {

    private T data;
    private Node<T> next;

    public Node() {
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> insertRecursive(Node<T> head, T data) {
        if (head == null) {
            return new Node<>(data,null);
        } else {
            head.setNext(insertRecursive(head.getNext(),data));
            return head;
        }
    }

    public boolean search(Node<T> head, T data) {

        // Base case
        if (head == null)
            return false;

        // If key is present in current node, return true
        if (head.getData() == data)
            return true;

        // Recur for remaining list
        return search(head.getNext(), data);

    }

    public void traverse(Node<T> head) {
        if(head == null) return;
        System.out.println(head.getData() + " ");
        traverse(head.getNext());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        if (next==null && node.next== null && data.equals(node.data)) return true;
        return data.equals(node.data) && ((next!=null && node.next!=null) ? next.equals(node.next) : false);

    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    //  klasik sekilde ekleme yapan metot
//    public void insert(T data) {
//        Node<T> newNode = new Node<>(data, null);
//        if(head==null) {
//            head = newNode;
//        } else {
//            Node<T> n = head;
//            while(n.getNext()!=null) {
//                n = n.getNext();
//            }
//            n.setNext(newNode);
//        }
//    }

//    public void show() {
//        Node<T> node = head;
//        while(node.getNext()!=null) {
//            System.out.print(node.getData() + " - ");
//            node = node.getNext();
//        }
//        System.out.print(node.getData());
//    }
}
