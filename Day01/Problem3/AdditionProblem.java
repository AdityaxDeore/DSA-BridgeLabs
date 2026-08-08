import java.util.Scanner;

public class AdditionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        

        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            
            System.out.println("Enter Second Number: ");
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                
                int sum = num1 + num2;
                System.out.println("Sum is " + sum);
                
            } else {
                System.out.println("Invalid Input! Second input must be a number.");
            }
            
        } else {
            System.out.println("Invalid Input! First input must be a number.");
        }
        
        sc.close();
    }
}
