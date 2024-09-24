

public class F_reverseArr {
    public static void reverse(int numbers[]){
          int start=0, end=numbers.length-1;
          while(start<end){
            //swap
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
          }
    }

    public static void main(String[] args) {
        int numbers[]={2,3,5,6,8};
        reverse(numbers);
        //print reverse array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
