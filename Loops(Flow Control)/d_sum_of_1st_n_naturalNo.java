import java.util.Scanner;

public class d_sum_of_1st_n_naturalNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        if(sc.hasNextInt()){
            int n=sc.nextInt();
            int sum=0;
            int i=1;
            while(i<=n){
                sum=sum+i;
                i++;
                
            
            }
            System.out.println("sum:"+sum);

    }
}
}