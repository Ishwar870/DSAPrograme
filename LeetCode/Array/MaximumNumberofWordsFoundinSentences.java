package Arrays;

public class MaximumNumberofWordsFoundinSentences {
    public static int mostWordsFound(String[] sentences){
        int max = 0;
        for (String word: sentences){
            max = Math.max(word.split(" ").length,max);
        }
        return max;
    }
    public static void main(String[] args) {
        String[] senetence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(senetence));
    }
}
