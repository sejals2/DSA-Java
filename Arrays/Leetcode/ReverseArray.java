public class ReverseArray {

    public static void reverse(int nums[]){
        int start=0, end=nums.length-1;
        while(start<end){
            //swap
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;

            start++;
            end--;
        }
    }

     public static void main(String[] args) {
         int nums[]={2,4,5,6,7};
         reverse(nums);

         //print reverse array
         for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
         }

         System.out.println();
     }

}
