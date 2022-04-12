package interview;

public class Sttring {
    public static strNode add(char value){
        strNode newNode = new strNode();
        newNode.value = value;
        newNode.next = null;
        return newNode;
    }
    public static strNode string_to_sll(String text, strNode head){
        head = add(text.charAt(0));
        strNode current = head;
        for (int i =1;i<text.length();i++){
            current.next = add(text.charAt(i));
            current = current.next;
        }
        return head;
    }
    public static void print(strNode head){
        strNode curr = head;
        while(curr != null){
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        String str = "ABCDEFHGTR";
        strNode head = null;
        head = string_to_sll(str,head);
        print(head);
    }
}
 class strNode{
    char value;
    strNode next;
}
