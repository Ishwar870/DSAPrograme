package LinkedList2;
class Node{
    int i;
    Node next;
}
class Linked{
    public Node getNewNode(int i){
        Node a = new Node();
        a.i = i;
        a.next = null;
        return a;
    }
    public void PrintList(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.i + " ");
        PrintList(node.next);
    }
    public Node insert(int i, Node node){
        if(node == null){
            return getNewNode(i);
        }
        node.next = insert(i,node.next);
        return node;
    }
    public Node roteClockedWise(int k , Node node){
        if(node == null || k < 0){
            return node;
        }
        int sizeOfLinkeList = getSizeOfLinkedList(node);
        k = k % sizeOfLinkeList;
        if (k == 0){
            return node;
        }
        Node tmp = node;
        int i = 1;
        while (i < sizeOfLinkeList - k){
            tmp = tmp.next;
            i++;
        }
        Node temp = tmp.next;
        Node head = temp;
        tmp.next = null;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }
    public int getSizeOfLinkedList(Node node){
        if (node == null){
            return 0;
        }
        return 1+getSizeOfLinkedList(node.next);
    }
}
public class RotateLinkedList {
    public static void main(String[] args) {
        Linked a = new Linked();
        Node head = null;
        head = a.insert(12,head);
        head = a.insert(23,head);
        head = a.insert(26, head);
        head = a.insert(37, head);
        head = a.insert(45,head);
        a.PrintList(head);
        System.out.println();
        head = a.roteClockedWise(2,head);
        a.PrintList(head);
        System.out.println();

    }
}
