package Arrays;

public class ShuffleStringArray {
    public static String restore(String s, int[] index){
        char[] result = new char[index.length];
        for (int i =0;i< index.length;i++){
            result[index[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in;
        String s = "warhsi";
        int index[] = {3,4,5,2,1,0};
        restore(s,index);
        System.out.println(restore(s,index));
    }
}
