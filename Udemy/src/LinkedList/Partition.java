package InterViewLinkedList;

public class Partition {
    public LinkedList partition(LinkedList ll , int x){
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null){
            Node Next = currentNode.next;
            if (currentNode.value < x){
                currentNode.next = ll.head;
                ll.head = currentNode;
            }else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = Next;
        }
        ll.tail.next = null;
        return ll;
    }
}
