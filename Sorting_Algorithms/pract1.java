/*
 Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1
 */

public class pract1 {
   //BUBBLE SORT
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //SELECTION SORT
    public static void selectionsort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            int minPos=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[turn];
            arr[turn]=arr[minPos];
            arr[minPos]=temp;
        }
    }



    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        selectionsort(arr);
        printArr(arr);
    }
    
}