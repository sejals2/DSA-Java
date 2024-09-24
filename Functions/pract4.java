//Write a Java method to compute the sum of the digits in an intege

import java.util.Scanner;

public class pract4 {
    public static int sumDigit(int n){
        int sumofDigits=0;
        while(n>0){
            int lastDigit=n%10;
            sumofDigits+=lastDigit;
            n=n/10;
        }
        return sumofDigits;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input an integer:");
        int digits=sc.nextInt();
        System.out.println("the sum is:"+sumDigit(digits));
    }
}
