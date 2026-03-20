// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task4 {
    public static int Fact(int n) {
        if (n <= 1) return 1;
        return Fact(n - 1) * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Fact(n);
        System.out.println(result);
    }
}





