package LinkedList;

public class circularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertCLL(int nodeValue , int location){
        Node node = new Node();
        node.value = nodeValue;
        if (node == null){
            createCSLL(nodeValue);
            return;
        }else if (location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if (location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;
        }else {
            Node tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
//        Total time complexity O(N) and space complexity O(1)
    }
    public void TraversalCSLL(){
        if (head != null){
            Node tempNode = head;
            for (int i =0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }else {
            System.out.println("CSLL does not exist");
        }
//        Total time complexity O(N) and space complexity O(1)
    }
    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i=0;i<size;i++){
                if (tempNode.value == nodeValue){
                    System.out.print("\nFound at the index at " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Value is Does not exist");
        return false;
    }
    public void deleteNode(int location){
        if (head == null){
            System.out.println("CSLL does not exist");
            return;
        }else if (location == 0){// more than one node
            head = head.next; //it is refering to the second node
            tail.next = head; // last node is refrence as first node
            size--; // Decrease the size of the node
            if (size == 0){// only one node we have
                tail = null;
                head.next= null;
                head = null;
            }
        }else if (location >= size){
            Node tempNode = head;// here we are assiging the head value to the tempnode
            for (int i =0;i<size-1;i++){
                tempNode = tempNode.next;// in each iterate loop we have to go to the next node
            }
            if (tempNode == head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = head;
            size--;
        }else{
            Node tempNode = head;
            for (int i =0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
    }
//        total time complexity O(N) and space complexity O(1)
    }
    public void deleteCsll(){
        if (head == null){
            System.out.println("The csll does not exist");
        }else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Deleted Successfully ");
        }
//        Total time complexity O(1) and space complexity O(1)
    }

}
