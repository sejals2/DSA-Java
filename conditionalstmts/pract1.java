/*Write a Java program to get a number from the user and print whether it is
positive or negative.*/
import java.util.Scanner;
public class pract1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        if(sc.hasNextInt()){
        int x=sc.nextInt();

        if(x>0){
            System.out.println("x is positive");
        }
        else{
            System.out.println("x is negative");
        }
    }
    }
}
