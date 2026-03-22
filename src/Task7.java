// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task7 {
    public static void revPrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        revPrint(n - 1, sc);
        System.out.print(x + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? Write them here -> ");
        int m = sc.nextInt();
        System.out.print("Enter " + m + " numbers: ");  // write numbers with a space
        revPrint(m, sc);
    }
}