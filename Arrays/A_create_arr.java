
import java.util.Scanner;
public class A_create_arr{
    public static void main(String[] args) {
        //create
        int marks[]=new int[30];
        Scanner sc=new Scanner(System.in);

        //input
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//math

        //output
        System.out.println("phy"+ marks[0]);
        System.out.println("chem"+ marks[1]);
        System.out.println("maths"+ marks[2]);

        //update
        marks[2]=100;
        System.out.println("maths"+ marks[2]);

        //average
        int average=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("average="+average);

        //length of array
        System.out.println("length of array="+marks.length);


    }
}