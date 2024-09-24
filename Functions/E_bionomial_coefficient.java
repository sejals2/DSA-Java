

public class E_bionomial_coefficient {

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f; 
    }

    public int BinCoefficient(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);

        int BinCoefficient=n_fact/(r_fact*nmr_fact);
        return BinCoefficient;

    }

    public static void main(String[] args) {
       System.out.println(BinCoefficient(5, 2));
        
    }
}


