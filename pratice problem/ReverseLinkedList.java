package ReversedNode;
class Node{
    int i;
    Node next;
}
class Linked{
    public void PrintList(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.i + " ");
        PrintList(node.next);
    }
    public Node getNewNode(int i){
        Node a = new Node();
        a.i = i;
        a.next = null;
        return a;
    }
    public Node insert(int i, Node node){
        if (node == null){
            return getNewNode(i);
        }
        node.next = insert(i,node.next);
        return node;
    }
    public Node reversed(Node node){
        if (node == null || node.next == null){
            return node;
        }
        Node temp = reversed(node.next);// 24->null  24 12
        node.next.next = node; // 24->12->
        node.next = null; // 24->12-> null
        return temp;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        Linked a = new Linked();
        Node head = null;
        head = a.insert(12,head);
        head = a.insert(24,head);
        head = a.insert(36,head);
        head = a.insert(48,head);
        head = a.insert(60,head);
        a.PrintList(head);
        System.out.println();
        head = a.reversed(head);
        a.PrintList(head);
        System.out.println();

    }
}
