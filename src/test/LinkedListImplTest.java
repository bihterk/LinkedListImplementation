package test;

import linkedlist.Node;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListImplTest {

    Node<Integer> node = new Node<>();
    Node<Integer> head;

    // it is executed before each test methods
    @BeforeEach
    public void initEach(){
        head = null;
    }

    @org.junit.jupiter.api.Test
    void insertRecursiveTest() {
        // after created and added the new nodes in the linkedList,
        // we control if it exists and keeps the data via the adding order

        head = node.insertRecursive(head, 0);
        head = node.insertRecursive(head, 2);
        head = node.insertRecursive(head, 4);

        Node<Integer> node3 = new Node<>(4,null);
        Node<Integer> node2 = new Node<>(2,node3);
        Node<Integer> node1 = new Node<>(0,node2);
        assertEquals(head, node1);
    }

    @org.junit.jupiter.api.Test
    void insertRecursiveIfDataIsDifferentTest() {
        // after created and added the new nodes in the linkedList,
        // we control if it exists and keeps the data via the adding order

        head = node.insertRecursive(head, 0);
        head = node.insertRecursive(head, 1);
        head = node.insertRecursive(head, 4);

        Node<Integer> node3 = new Node<>(4,null);
        Node<Integer> node2 = new Node<>(2,node3);
        Node<Integer> node1 = new Node<>(0,node2);
        assertNotEquals(head, node1);
    }

    @org.junit.jupiter.api.Test
    void insertRecursiveIfNextIsDifferentTest() {
        // after created and added the new nodes in the linkedList,
        // we control if it exists and keeps the data via the adding order

        head = node.insertRecursive(head, 0);
        head = node.insertRecursive(head, 2);
        head = node.insertRecursive(head, 4);

        Node<Integer> node3 = new Node<>(4,null);
        Node<Integer> node2 = new Node<>(2,node3);
        Node<Integer> node1 = new Node<>(0,node3);
        assertNotEquals(head, node1);
    }

}