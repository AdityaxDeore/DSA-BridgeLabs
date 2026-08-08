import java.util.Scanner;

public class Swapelements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Numbers : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Before Swapping : " + a + " " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping : " + a + " " + b);

        sc.close();

        
    }
}
