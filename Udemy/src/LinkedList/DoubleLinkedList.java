package LinkedList;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public Node createDll(int nodeValue){
        head = new Node();
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
//    Total time complexity O(1) and space ccomplexity O(1)
    public void insertDLL(int nodeValue , int location){
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null){
            createDll(nodeValue);
            return;
        }else if (location == 0){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }else if (location >= size){
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else{
            Node tempNode = head;
            int index = 0;
            while (index < location-1){
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
//    Total time complexity O(N) and space complexity O(1)
    public void TraversalDLL(){
        if (head != null){
            Node tempNode = head;
            for (int i =0; i<size ;i++){
                System.out.print(tempNode.value );
                if (i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("DLL does not exist");
        }
        System.out.println();
//        Total time complexity O(N) and space complexity O(1)
    }
    public void ReverseTraversal(){
        if (head != null){
            Node tempNode = tail;
            for (int i =0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        }else {
            System.out.println("Dll does not exist");
        }
//        total time complexity O(N) space complexity O(1)
    }
    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i =0;i<size;i++){
                if (tempNode.value == nodeValue){
                    System.out.println("\nThe Node is found at location: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node Does not Found");
        return false;
//        Total time complexity O(N) and space complexity O(1)
    }
    public void deleteNodeDll(int location){
        if (head == null){
            System.out.println("Dll does not exist");
            return;
        }else if (location == 0){
            if (size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }else {
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if(location >= size){
            Node tempNode = tail.prev;
            if (size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        }else {
            Node tempNode = head;
            for (int i =0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
//        Total time complexity O(N) and space complexity O(1)
    }
    public void deleteDLL(){
        Node tempNode = head;
        for (int i=0;i<size;i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("DLL Deleted Successfully");
    }
//    Total time complexity O(N) space complexity O(1)
}
