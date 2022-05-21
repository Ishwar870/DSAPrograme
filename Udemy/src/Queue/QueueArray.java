package Queue;

public class QueueArray {
    int arr[];
    int topOfQueue;
    int beginningQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningQueue = -1;
        System.out.println("The Queue is succesffully created with the size of "+ size);

//        Total Time complexity O(1) and space O(N)
    }
//    isFull
    public boolean isFull(){
        if (topOfQueue == arr.length-1){
            return true;
        }else {
            return false;
        }
//        Total time complexity O(1) and space O(1
    }
//    isEmpty
    public boolean isEmpty(){
        if (beginningQueue == -1 || beginningQueue == arr.length){
            return true;
        }else {
            return false;
        }
//      Total time complexity O(1) and space O(1)
    }
//    Enqueue
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The Queue is Full ");
        }else if (isEmpty()){
            beginningQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
//       total time complexity O(1) and space O(1)
    }
//    deQueue
    public  int deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is Empty");
            return -1;
        }else{
            int result = arr[beginningQueue];
            beginningQueue++;
            if (beginningQueue > topOfQueue){
                beginningQueue = topOfQueue = -1;
            }
            return result;
        }
//        Total time complexity O(1) and space O(1)
    }
//    peek
    public int peek(){
        if (!isEmpty()){
            return arr[beginningQueue];
        }else {
            System.out.println("The Queue is Empty");
            return -1;
        }
//        time complexity O(1) and space O(1)
    }
//    delete
    public void delete(){
        arr = null;
        System.out.println("Queue is Successfully Deleted");
//   time complexity O(1) and space O(1)
    }
}
