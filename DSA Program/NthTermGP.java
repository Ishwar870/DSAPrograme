static int NthGP(int A, int R, int N){
//Enter your code here
    int current = 0;
    for(int i=0;i<N;i++){
      current = A*(int)Math.pow(R,i);
    }
    return current;
}
