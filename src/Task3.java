// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task3 {
    public static boolean isSmth(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0 || i * i > n) return n % i != 0;
        return isSmth(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ->  ");
        int n = sc.nextInt();
        System.out.println(isSmth(n, 2) ? "It's Prime" : "It's Composite");
    }
}