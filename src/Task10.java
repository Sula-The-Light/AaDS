// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task10 {
    public static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 2 integers -> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Your GCD is " + GCD(a, b));
    }
}