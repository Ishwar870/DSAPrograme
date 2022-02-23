import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		Arrays.sort(a);
		System.out.print(a[1]);
	}
}
