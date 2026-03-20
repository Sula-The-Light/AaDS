// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task5 {
    public static int Fibbo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibbo(n - 1) + Fibbo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibbo(n));
    }
}