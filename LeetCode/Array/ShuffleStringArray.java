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
        String s = "codeleet";
        int index[] = {4,5,6,7,0,2,1,3};
        restore(s,index);
        System.out.println(restore(s,index));
    }
}
