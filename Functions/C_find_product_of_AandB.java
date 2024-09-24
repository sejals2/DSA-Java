

public class C_find_product_of_AandB {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        int a=2;
        int b=5;
        int prod=multiply(a,b);
        System.out.println("a*b="+prod);

        prod=multiply(20,40);
        System.out.println("a*b="+prod);
    }
}
