
import java.util.Scanner;
public class k_keep_entering_till_user_enters_10x {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    
    if(sc.hasNextInt()){
        System.out.println("enter n:");
        int n=sc.nextInt();
    do{
        if(n%10==0){
            break;
        }
        System.out.println(n);
    }while(true);
}
}
  
}