

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int a[]={i,j};
                    return a;
                }
            }
           
        }
         return null;
    }

    public static void main(String[] args) {
        int nums[]={2,7,10,11,15};
        int target=9;

        int result[] = TwoSum.twoSum(nums, target);
        

        // Check and print the result
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }

        
    }

}
