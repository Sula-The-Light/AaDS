// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task1 {
    public static void printTsifry(int n) {
        if (n == 0) return;
        printTsifry(n / 10);
        System.out.println(n % 10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the numbers -> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printTsifry(num);
    }
}