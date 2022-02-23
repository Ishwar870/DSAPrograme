import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();       
            long z = sc.nextLong();
            x = z-x;
            y = z-y;
            z=(x>=y)?x:y;
            System.out.print(z + "\n");
        }

	}
}
