package Stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
//        System.out.println(newStack.isEmpty());
//        System.out.println(newStack.isFull());
        newStack.push(21);
        newStack.push(22);
        newStack.push(23);
        newStack.push(24);
//        newStack.push(25);
//        newStack.push(26);
//        System.out.println(newStack.pop());
//        System.out.println(newStack.pop());
        newStack.deleteStack();
//        System.out.println(newStack.peek());

    }

}
