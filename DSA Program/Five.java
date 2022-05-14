import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int r = sc.nextInt();
			int curr = r, prev = -1;
			for(int i =0;i<n;i++){
				char type = sc.next().charAt(0);
				int id = -1;
				if(type == 'P'){
					id = sc.nextInt();
				}
				if(type == 'P'){
					prev = curr;
					curr = id;
				}
				else if(type == 'B'){
					int temp = prev;
					prev = curr;
					curr = temp;
				}
			}
			System.out.println(curr);
		}
	}
}
