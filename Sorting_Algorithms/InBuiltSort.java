import java.util.Arrays;
import java.util.Collections;



public class InBuiltSort {
    public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,4,2,1,3};
        //Arrays.sort(arr);
       // Arrays.sort(arr,0,3);
        // Arrays.sort(arr,Collections.reverseOrder()); //works on objects 
         Arrays.sort(arr,0,3,Collections.reverseOrder());
         printArr(arr);
    }
}
