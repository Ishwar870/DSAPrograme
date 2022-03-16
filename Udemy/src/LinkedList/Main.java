package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createLinkedList(5);
//        sll.createLinkedList(6);
        sll.insertLinkedList(10,1);
        sll.insertLinkedList(15,2);
        sll.insertLinkedList(20,3);
        sll.insertLinkedList(25,4);
//        System.out.println(sll.head.value);
        sll.Traversal();
//        sll.searchNode(24);
        sll.deleteSll();
        sll.Traversal();
    }
//    Total time complexity O(1) and space complexity O(1)
}
