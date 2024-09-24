public class J_primesInRange {
    
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;

    }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){ //consider true
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(100);//prime no from 2 to 20
    }
}
