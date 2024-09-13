

import java.util.Scanner;

public class m_dispaly_all_numbers_enterbyuser_except_10x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            System.out.println("enter your number");
            int n=sc.nextInt();

            do { 
                if(n%10==0){
                    continue;
                }
                System.out.println("number was:"+n);
            } while (true);
        }
    }
}
