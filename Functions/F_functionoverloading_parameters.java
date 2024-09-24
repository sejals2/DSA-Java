//Function Overloading= Multiple functions with same name but different parameters
//Function overloading using parameters

public class F_functionoverloading_parameters {

        public static int sum(int a,int b){
            return a+b;
        
        }
        
        
        public static int sum(int a,int b,int c){
            return a+b+c;
        
        }
        
        public static void main(String[] args) {
             System.out.println(sum(2,3));
             System.out.println(sum(2,5,6));
;
    }
}
