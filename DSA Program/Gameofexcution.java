import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int josephus(int n,int k){
		if(n==1){
			return 1;
		}else{
			return (josephus(n-1,k)+k-1)%n+1;
		}
	}
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		// int n = sc.nextInt();
		// int k = sc.nextInt();
		for(int i=0;i<t;i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int sum = josephus(n,k);
			System.out.println(sum);
		}
	}
	
}
