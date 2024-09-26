public class Find_MaxMin_Element {
    public static int getLargest(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest=nums[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int nums[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest=nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int nums[]={34,65,78,12,90};
        System.out.println("largest element is:"+getLargest(nums));
        System.out.println("smallest element is:"+getSmallest(nums));
    }
}
