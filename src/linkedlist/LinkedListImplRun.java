package linkedlist;

public class LinkedListImplRun {

    public static void main(String[] args) {

      Node<Integer> node = new Node<>();
      Node<Integer> head = null;
      head = node.insertRecursive(head,15);
      head = node.insertRecursive(head,20);
      head = node.insertRecursive(head,25);
      head = node.insertRecursive(head,30);

      head.traverse(head);
      boolean findingNode = head.search(head,25);
      System.out.println(findingNode);
    }
}
