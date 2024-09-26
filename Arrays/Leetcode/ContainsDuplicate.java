public class ContainsDuplicate {
    
    public static boolean ContainDuplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int nums[]={1,4,5,9,3};
        System.out.println("the array contains duplicate?"+ContainDuplicate(nums));
    }
}
