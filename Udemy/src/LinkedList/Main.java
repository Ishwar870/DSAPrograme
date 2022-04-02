package InterViewLinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(1);
//        ll.insert(9);
//        ll.insert(5);
//        ll.insert(10);
//        ll.insert(2);
//        ll.traversel();
//        RemoveDuplicate RD = new RemoveDuplicate();
//        ReturnNthToLast N = new ReturnNthToLast();
//        Partition P = new Partition();
//        RD.deleteDuplicate(ll);
//        ll.traversel();
//       Node n = N.nthToLast(ll,2);
//        System.out.println(n.value);
//        LinkedList t = P.partition(ll,6);
//        t.traversel();
        LinkedList llA = new LinkedList();
        llA.insert(7);
        llA.insert(1);
        llA.insert(6);
        LinkedList llB = new LinkedList();
        llB.insert(5);
        llB.insert(9);
        llB.insert(2);
        SumOfLinkedList sum = new SumOfLinkedList();
        LinkedList result = sum.sumlist(llA,llB);
        result.traversel();
    }
}
