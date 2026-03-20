// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task3 {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0 || i * i > n) return n % i != 0;
        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n, 2) ? "Prime" : "Composite");
    }
}