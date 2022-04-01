package LinkedList;

public class CircularDoubleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node CreateCDLL(int nodeValue){
        head = new Node();
        Node newNode = new Node();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }
//    Total time complexity O(1) and space complexity O(1)
    public void insert(int nodeValue , int location){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null){
            CreateCDLL(nodeValue);
            return;
        }else if (location == 0){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }else  if (location >= size){
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index <location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }
//    Total time complexity O(N) space complexity O(1)
    public void traverselCDLL(){
        if (head != null){
            Node tempNode = head;
            for (int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("The CDLL does not exist");
        }
        System.out.println();
    }
//    total time complexity O(N) and space complexity O(1)
        public void ReverseTraversel(){
        if (head != null){
            Node tempNode = tail;
            for (int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        }else {
            System.out.println("CDLL does not exist");
        }
            System.out.println();
//        Total time complexity O(N) space complexity O(1)
    }
    public  boolean  SearchNode(int nodeValue){
       if (head != null){
           Node tempNode = head;
           for (int i=0;i<size;i++){
               if (tempNode.value == nodeValue){
                   System.out.println("The Node found at " + i);
                   return true;
               }
               tempNode = tempNode.next;
           }
       }
        System.out.println("Node not found");
        return false;
//        Total time complexity O(N) space complexity O(1)
    }
    public void DeleteNodeCDLL(int location){
        if (head == null){
            System.out.println("The CDSLL Does not exist!");
            return;
        }else if (location == 0){
            if (size == 1){
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
            }else{
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        }else if (location >= size){
            if (size == 1){
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            }else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        }else {
            Node tempNode = head;
            for (int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
//        Total time complexity O(N) space complexity O(1)
    }
    public void deleteCDLL(){
        Node tempNode = head;
        for (int i=0;i<size;i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("Successfully Deleted!");
    }
//    Total time Complexity O(N) space complexity O(1)
}
