package Arrays;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int max = 0;
        int diff;
        for (int i=0;i<rectangles.length;i++){
            if (rectangles[i][0] < rectangles[i][1]){
                diff = rectangles[i][0];
            }else {
                diff  = rectangles[i][1];
            }
            if (diff == max){
                count++;
            }
            if (diff > max){
                count++;
                max = diff;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int rectangle[][] = {{5,8},{3,9},{5,12},{16,5}};
        countGoodRectangles(rectangle);
        System.out.println(countGoodRectangles(rectangle));
    }
}
