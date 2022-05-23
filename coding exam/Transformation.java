package Interview;

public class Transformation {
    public static int min(int a, int b, int c){
        if (a <= b && a <= c){
            return a;
        }else if( b <= a && b <= c){
            return b;
        }else{
            return c;
        }
    }
    public static int transformString(String str1, String str2 , int m , int n){
        if(m ==0)
            return n;
        if (n == 0)
            return m;
//        last charter the two same
        if (str1.charAt(m-1) == str2.charAt(n-1)){
            return transformString(str1,str2,m-1,n-1);
        }
//        if the last char are not same
        return 1+ min(transformString(str1,str2,m,n-1),//insert
                transformString(str1,str2,m-1,n),// delete
                transformString(str1,str2,m-1,n-1) // repalce
                );

    }
    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 =  "tuenday";
        int m = str1.length();
        int n = str2.length();
        transformString(str1,str2,m,n);
        System.out.println(transformString(str1,str2,m,n));
    }
}
