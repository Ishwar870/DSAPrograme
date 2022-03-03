package LinkedList;
 class Node{
    int i;
    Node next;
}
class Linked{
     public Node insertFront(int i, Node node){
         Node a = getNewNode(i);
         a.next = node;
         return a;
     }
     public void PrintList(Node node){
         if(node == null){
             return;
         }else{
             System.out.print(node.i + "->");
             PrintList(node.next);
         }
     }
     private Node getNewNode(int i){
         Node a = new Node();
         a.i = i;
         a.next = null;
         return a;
     }
    public Node insert(int i, Node node){
        if(node == null){
            return getNewNode(i);
        }else{
            node.next = insert(i,node.next);
        }
        return node;
    }
}
public class CreateList {
    public static void main(String[] args) {
        Node root = null;
        Linked a = new Linked();
        root = a.insert(12,root);
        root = a.insert(99, root);
        root = a.insert(37,root);
        root = a.insertFront(45 , root);
        a.PrintList(root);
    }
}
