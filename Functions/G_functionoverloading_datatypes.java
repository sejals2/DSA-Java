public class G_functionoverloading_datatypes {
    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }



    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(sum(3.4f,5.7f));
    }
}
