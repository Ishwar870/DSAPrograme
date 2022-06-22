package Array;

import java.util.Scanner;

public class PrimeFactSubt {
    public static int findSumprime( int num){
        int sum =0;
        for (int i = 2; i*i<= num; i++){
            while (num % i == 0){
                sum += i;
                num /= i;
            }

        }
        sum += num;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 12;
        System.out.println(findSumprime(num));
    }
}
