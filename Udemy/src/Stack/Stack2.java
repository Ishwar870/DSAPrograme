package Stack;

public class Stack2 {
    LinkedList linkedList;

    public Stack2(){
        linkedList = new LinkedList();
    }
    public void push(int value){
        linkedList.insertLinkedList(value,0);
        System.out.println("Inserted " + value + " in stack" );
    }
//    Time Complexity O(1) and space O(1)
    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        }else {
            return false;
        }
//        Time complextiy O(1) and space O(1)
    }
//     pop method
    public int pop(){
        int result = -1;
        if (isEmpty()){
            System.out.println("The stack is empty");
        }else {
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }
    //    Time complexity O(1) and space O(1)
//    peek method
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }else {
            return linkedList.head.value;
        }
//      Time complexity O(1) and space O(1)
    }
//    Delete Method
    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }
//    Time complexity O(1) and space O(1)
}
