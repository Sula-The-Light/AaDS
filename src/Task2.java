// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task2 {
    static int readNsum(Scanner sc, int n) {
        if (n == 0) return 0;
        int x = sc.nextInt();
        return x + readNsum(sc, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter " + n + " integers -> ");
        int total = readNsum(sc, n);
        System.out.println((double) total / n);
    }
}