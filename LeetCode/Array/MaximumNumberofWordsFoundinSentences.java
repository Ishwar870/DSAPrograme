package Arrays;

public class MaximumNumberofWordsFoundinSentences {
    public static int mostWordsFound(String[] sentences){
        int max = 0;
//         Method 1
        for (String word: sentences){
            max = Math.max(word.split(" ").length,max);
        }
//         method 2
        for (String sentence : sentences){
            int count = 1;
            for (int i =0;i<sentence.length();i++){
                if (sentence.charAt(i) == ' ' ){
                    count++;
                }
                if (max < count){
                    max = count;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] senetence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(senetence));
    }
}
