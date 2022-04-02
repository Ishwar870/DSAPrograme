package InterViewLinkedList;

public class SumOfLinkedList {
    public LinkedList sumlist(LinkedList ll1 , LinkedList ll2){
        Node n1 = ll1.head;
        Node n2 = ll2.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null){
            int result = carry;
            if (n1 != null){
                result += n1.value;
                n1 = n1.next;
            }
            if (n2 != null){
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insert(result % 10);
            carry = result / 10;
        }
        return resultLL;
    }
}
