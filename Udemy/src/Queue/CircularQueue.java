package Queue;

public class CircularQueue {
    int arr[];
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Circular Queue is Successfully create at size of: " + size);
//        time complexity O(1) and space O(N)
    }
    public boolean isEmpty(){
        if (topOfQueue == -1){
            return true;
        }else{
            return false;
        }
//        time complexity O(1) and space O(1)
    }
    public boolean isFull(){
        if (topOfQueue+1 == beginningOfQueue){
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        }else {
            return false;
        }
//        time complexity O(1) and space O(1)
    }
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The CQ is full");
        }else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }else{
            if (topOfQueue+1 == size){
                topOfQueue = 0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
//        Time complexity O(1) and space O(1)
    }
//    deQueue
    public int deQueue(){
        if(isEmpty()){
            System.out.println(" The Circular Queue is empty ");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }else if (beginningOfQueue+1 == size){
                beginningOfQueue = 0;
            }else {
                beginningOfQueue++;
            }
            return result;
        }
//        Total time complexity O(1) and space O(1)
    }
//    peek
    public int peek(){
        if (isEmpty()){
            System.out.println("The Circular Queue is empty");
            return -1;
        }else{
            return arr[beginningOfQueue];
        }
//        total time complexity O(1) and space O(1)
    }
//    delete
    public void delete(){
        arr = null;
        System.out.println("Queue is Successfully deleted");
    }
//    Total Time Complexity O(1) and space O(1)
}
