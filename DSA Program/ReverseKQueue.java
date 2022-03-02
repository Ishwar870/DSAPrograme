static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
        if(queue.isEmpty() == true || k > queue.size() )
        return queue;
        if(k <= 0)
        return queue;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<k ;i++){
            stack.push(queue.peek());
            queue.remove();
        }
        while(!stack.empty()){
           queue.add(stack.peek());
           stack.pop();
        }
        for(int i=0; i<queue.size()-k;i++){
            queue.add(queue.peek());
            queue.remove();
        }
        return queue;
    }
