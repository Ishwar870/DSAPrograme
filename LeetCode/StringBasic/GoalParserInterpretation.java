package StringBasic;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i =0;i<command.length();i++){
            if (chars[i] == 'G'){
                stringBuilder.append(command.charAt(i));
            }
            if(chars[i] == '(' && chars[i+1] == ')'){
                stringBuilder.append('o');
            }
            if (chars[i] == '(' && chars[i+1] == 'a'){
                stringBuilder.append("al");
            }
        }

    return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
    }
}
