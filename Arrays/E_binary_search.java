

public class E_binary_search {
    public static int binarysearch(int numbers[],int key){
         int start=0, end=numbers.length-1;
         while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if(numbers[mid]==key){   //found
                return mid;
            }
            if(numbers[mid]<key){  //right
                start=mid+1;
            }
            else{            //left
                end=mid-1;

            }
         }
         return -1;
    }

    public static void main(String[] args) {
        int numbers[]={22,23,24,25,26,27,28,29};
        int key=25;

        System.out.println("index for key is ="+ binarysearch(numbers, key));
    }
}
