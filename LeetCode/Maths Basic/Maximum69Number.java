package Math;

public class Maximum69Number {
    public static int maximum69Number (int num) {
      char[] temp = Integer.toString(num).toCharArray();
      for (int i=0;i< temp.length;i++){
          if (temp[i] == '6'){
              temp[i] = '9';
              break;
          }
      }
      return Integer.parseInt(new String(temp));
    }
    public static void main(String[] args) {
        int num = 9669;
        maximum69Number(num);
        System.out.println(maximum69Number(num));
    }
}
