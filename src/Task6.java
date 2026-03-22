// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task6 {
    public static int P(int a, int n) {
        if (n == 0) return 1;
        return a * P(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base a and exponent n -> ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(P(a, n));
    }
}