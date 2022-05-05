package StringBasic;

public class DefanginganIPAddress {
    public static String defangIPaddr(String address) {
        String replace = address.replace(".","[.]");
        return replace;

    }
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
