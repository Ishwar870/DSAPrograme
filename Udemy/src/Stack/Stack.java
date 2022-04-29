package Stack;

public class Stack {
    int arr[];
    int topOfStack;
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is Created with the size of " + size);
//        Total time Complexity O(1) and space complexity O(N)
    }
//    isEmpty or not
    public  boolean isEmpty(){
        if (topOfStack == -1){
            return true;
        }else{
            return false;
        }
//        total time complexity O(1) and space complexity O(1)

    }
//    isFull or not
    public boolean isFull(){
        if (topOfStack == arr.length-1){
            System.out.println("The stack is full!");
            return true;
        }else{
            return false;
        }
//        total time complexity O(1) and space O(1)
    }
//    push method
    public void push(int value){
        if (isFull()){
//            System.out.println("the stack is full! ");
        }else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The stack is successfully inserted");
        }
//        Total time complexity O(1) and space O(1)
    }
//    pop method
    public int pop(){
        if (isEmpty()){
            System.out.println("the stack is empty ");
            return -1;
        }else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
//        total time complexity O(1) and space O(1)
    }
//    peek method
    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else {
            return arr[topOfStack];
        }
//       total time complexity O(1) and space O(1)
    }
//    delete Stack
    public void deleteStack(){
        arr = null;
        System.out.println("Stack is successfully deleted! ");
    }
//    total time complexity O(1) and space O(1)
}
