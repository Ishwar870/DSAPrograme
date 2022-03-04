package AntiClockedwise;
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
    public Node insert(int i , Node node){
        if (node == null){
            return getNewNode(i);
        }
        node.next = insert(i,node.next);
        return node;
    }
    public int getSizeOfLinkedList(Node node){
        if (node == null){
            return 0;
        }
        return 1+getSizeOfLinkedList(node.next);
    }
    public Node AntiClocked(int k , Node node){
        if(node == null || k < 0){
            return node;
        }
        int sizeOfLinked = getSizeOfLinkedList(node);
        k = k%sizeOfLinked;
        if (k ==0){
            return node;
        }
        int i = 1;
        Node tmp = node;
        while (i < k){
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
}
public class RotedAntiColckWise {
    public static void main(String[] args) {
        Linked a = new Linked();
        Node head = null;
        head = a.insert(4,head);
        head = a.insert(8,head);
        head = a.insert(12,head);
        head = a.insert(16,head);
        head = a.insert(20, head);
        a.PrintList(head);
        System.out.println();
        head = a.AntiClocked(2,head);
        a.PrintList(head);
    }
}
