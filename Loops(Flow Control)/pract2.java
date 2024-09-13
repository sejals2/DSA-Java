/*Write a program to find the factorial of any number entered by the user*/
import java.util.*;
public class pract2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int fact=1;

        System.out.println("enter the positive integer:");
        num=sc.nextInt();

        for(int i=1;i<=num;i++){
            fact *=i;
        }
        System.out.println("factorial:"+fact);
    }
}
