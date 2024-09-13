import java.util.Scanner;

public class Print_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        
        // Input validation
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }

        sc.close();
    }
}

