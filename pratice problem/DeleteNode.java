package LinkedList;
 class Node{
    int i;
    Node next;
}
class Linked{
     public Node insertAtPosition(int i , int pos, Node node){
         if(pos < 1){
             System.out.println("Position is can't be less than 1");
             return node;
         }
         if(node == null && pos > 1){
             System.out.println("Pos is greater than element it not exists");
             return node;
         }
         if(node == null && pos == 1){
             return getNewNode(i);
         }
         if(pos == 1){
             Node newNode = getNewNode(i);
             newNode.next = node;
             return newNode;
         }
         node.next = insertAtPosition(i,pos-1,node.next);
         return node;
     }
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
    public Node delete(Node node){
         if(node == null || node.next == null){
             return null;
         }
         Node temp = node;
         while (temp.next.next != null){
             temp = temp.next;
         }
         temp.next = null;
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
        root = a.insert(45 , root);
        root = a.delete(root);
//        root = a.insertFront(45 , root);
//        root = a.insertAtPosition(5,2,root);
        a.PrintList(root);
    }
}
