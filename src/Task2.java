// Yesmagzam Sultan IT-2502
public class Task2 {
    public static int sum(int[] mass, int n) {
        if (n == 0) return 0;
        return mass[n - 1] + sum(mass, n - 1);
    }
    public static void main(String[] args) {
        int[] mass = {3, 2, 4, 1};
        int n = mass.length;
        double avg = (double) sum(mass, n) / n;
        System.out.println(avg);
    }
}
