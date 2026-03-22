// Yesmagzam Sultan IT-2502
import java.util.Scanner;
public class Task9 {
    public static int Dlina(String s) {
        if (s.equals("")) return 0;
        return 1 + Dlina(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string -> ");
        String s = sc.nextLine();
        System.out.println("Length is " + Dlina(s));
    }
}