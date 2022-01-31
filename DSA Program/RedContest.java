import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		boolean t ;
		t = ((str.contains("r") && str.contains("e") ) && str.contains("d"));
		if(t){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}

}
