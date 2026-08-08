import java.util.Scanner;

public class SwapStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Strings : ");
        String a = sc.nextLine();

        System.out.println("Enter Second String : ");
        String b = sc.nextLine();

        System.out.println("Before Swapping : " + a + " " + b);

        String temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping : " + a + " " + b);

        sc.close();

        
    }
}
