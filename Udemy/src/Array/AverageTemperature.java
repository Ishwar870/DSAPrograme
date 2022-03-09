package Array;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days Temperature: ");
        int numOfDays = sc.nextInt();
        int temp[] = new int[numOfDays];
        int sum =0;
        for (int i=0;i<numOfDays;i++){
            System.out.println("Days " + (i+1) + "'s Temperature: ");
            temp[i] = sc.nextInt();
            sum += temp[i];
        }
        double average = sum/numOfDays;
        int above = 0;
        for (int i=0;i< temp.length;i++ ){
            if (temp[i] > average){
                   above++;
            }
        }
        System.out.println("The Average Temperature is " + average);
        System.out.println(above + " days above average Temperature ");
    }
}
