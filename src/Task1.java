// Yesmagzam Sultan IT-2502
public class Task1 {
    public static void printTsifry(int n) {
        if (n == 0) return;
        printTsifry(n / 10);
        System.out.println(n % 10);
    }
    public static void main(String[] args){
        printTsifry(5481);
    }
}
