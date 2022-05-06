package StringBasic;

import java.util.ArrayList;
import java.util.List;

public class CellsinaRangeonanExcelSheet {
    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        int num1 =(int) s.charAt(1) - '0';
        int num2 = (int) s.charAt(4) - '0';
        int letter1 = (int) s.charAt(0);
        int letter2 = (int) s.charAt(3);
        for (int i=letter1;i<=letter2;i++){
            for (int j = num1 ;j<= num2;j++){
                list.add(String.valueOf((char)i) + String.valueOf(j));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str = "K1:L2";
        cellsInRange(str);
        System.out.println(cellsInRange(str));
    }
}
