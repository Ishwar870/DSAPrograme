import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static void towerOfHoni(int n, char sourcePole,char destinationPole,char helpPole){
		if(n==1){
			System.out.println(n+":"+sourcePole+"->"+destinationPole);
		}else{
			towerOfHoni(n-1,sourcePole,helpPole,destinationPole);
			System.out.println(n+":"+sourcePole+"->"+destinationPole);
			towerOfHoni(n-1,helpPole,destinationPole,sourcePole);
		}
	}
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHoni(n,'A','C','B');
	}
}
