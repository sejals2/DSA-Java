
import java.util.Scanner;
public class c_print_1_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        if(sc.hasNextInt()){
            int n=sc.nextInt();

            int i=1;
            while(i<=n){
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
        }
    }
}
