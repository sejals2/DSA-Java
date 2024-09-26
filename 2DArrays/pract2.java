/*Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18*/

public class pract2 {
    public static void main(String[] args) {
        int nums[][]={{11,4,5},{5,6,7},{7,9,10}};
        int sum=0;

        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        System.out.println("sum of elements in 2nd row:"+sum);
    }
}
