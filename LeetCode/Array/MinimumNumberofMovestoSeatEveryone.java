package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Input: seats = [3,1,5], students = [2,7,4]
//        Output: 4
//        Explanation: The students are moved as follows:
//        - The first student is moved from from position 2 to position 1 using 1 move.
//        - The second student is moved from from position 7 to position 5 using 2 moves.
//        - The third student is moved from from position 4 to position 3 using 1 move.
//        In total, 1 + 2 + 1 = 4 moves were used.
public class MinimumNumberofMovestoSeatEveryone {
    public static int minMovesToSeat(int[] seats, int[] students){
            sort(seats);
            sort(students);
           int c = 0;
           for (int i =0;i<seats.length;i++){
               c = c+Math.abs(students[i] - seats[i]);

           }
           return c;
    }
    public static void sort(int arr[]){
        int temp;
        for (int i =0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        for (int i =0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seats[] = new int[n];
        for (int i =0;i<n;i++){
            seats[i] = sc.nextInt();
        }
        int students[] = new int[n];
        for (int i =0;i<n;i++){
            students[i] = sc.nextInt();
        }

        System.out.println(minMovesToSeat(seats,students));

    }
}
