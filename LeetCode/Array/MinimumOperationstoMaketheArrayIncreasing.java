// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =1;i< n; i++){
            if(arr[i] <= arr[i-1]){
              count += arr[i-1] - arr[i] + 1;
              arr[i] = arr[i-1] + 1;
            }
        }
        System.out.print(count);
    }
}
