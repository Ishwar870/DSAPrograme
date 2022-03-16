import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Node[] arr = new Node[n];
		for(int i =0; i<n;i++){
			arr[i] = new Node(0);
		}
		for(int i =0;i<n;i++){
			int left = sc.nextInt();
			int right = sc.nextInt();
			if(left != -1){
				arr[i].left = arr[left-1];
			}
			if(right != -1){
				arr[i].right = arr[right-1];
			}
		}
		for(int i =0;i<q;i++){
			int queryType = sc.nextInt();
			perform(queryType,arr,sc);
		}

	}
	private static void perform(int queryType, Node[] arr, Scanner sc){
		switch(queryType){
			case 1:{
				int nodeValue = sc.nextInt();
				int valueToBeAdded = sc.nextInt();
				addValue(arr[nodeValue - 1], valueToBeAdded);
                break;
			}
			case 2: {
				int nodeValue = sc.nextInt();
                System.out.println(arr[nodeValue - 1].data);
                break;
			}
			default: {}
		}		
	}
	 private static void addValue(Node root, int value){
        if(root == null){
            return;
        }
        root.data = root.data + value;
        addValue(root.left, value);
        addValue(root.right, value);
    }
}
class Node {

    public int data;
    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }
}
