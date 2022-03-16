package LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public  Node createLinkedList(int value){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
//    total time complexity O(1) and space complexity O(1)
    public  void insertLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (node == null){
           createLinkedList(nodeValue);  //---------------O(1)
           return;
        }else if (location == 0){
            node.next = head;       // beginning of node---------------O(1)
            head = node;
        }else if (location >= size){
            node.next = null;
            tail.next = node;     // end of the node-------------------O(1)
            tail = node;
        }else {
//            insert at particular location
            Node tempNode = head;
            int index = 0;
            while (index < location-1){ //---------------------------O(N)
                tempNode = tempNode.next; //------------------------O(1)
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;          //---------------------O(1)
            node.next = nextNode;
        }
        size++;
    }
//    Total time complexity O(N) and space complexity O(1)
    public void Traversal(){
        if (head == null){
            System.out.println("SLL is not exist");
        }else {
            Node tempNode = head;
            for (int i =0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }
//    Total time complexity O(N) and space complexity O(1)
    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i =0;i<size;i++){
                if (tempNode.value == nodeValue){
                    System.out.print("Found the loaction at "+ i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Not found");
        return false;

    }
//    Total time complexity O(N) and space complexity O(1)
//    Deleting of Single Linked List
    public void deleteNode(int location){
        if (head == null){
            System.out.print("SLL does not exists");
            return;
        }else if (location == 0){
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        }else if (location >= size){
            Node tempNode = head;
            for (int i =0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else {
            Node tempNode = head;
            for (int i =0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
//    Total time complexity O(N) and space complexity O(1)
    public void deleteSll(){
        head = null;
        tail = null;
        System.out.println("Single list deleted successfully ");
    }
}
