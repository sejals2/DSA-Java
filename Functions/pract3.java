/*Write a Java program to check if a number is a palindrome in Java? ( 121 is a
palindrome, 321 is not)*/
import java.util.Scanner;
public class pract3 {
    public static boolean isPalindrome(int number){
        int palindrome=number; //copied number into variable
        int rev=0;

        while(palindrome!=0){
            int remainder=palindrome%10;
            rev=rev*10+remainder;
            palindrome=palindrome/10;
        }
        //if original & reverse of number is equal
        //number is palindrome in java
        if(number==rev){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int palindrome=sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number:"+palindrome+" is a palindrome");
        }else{
            System.out.println("Number:"+palindrome+" is not palindrome");
        }
    }
}
