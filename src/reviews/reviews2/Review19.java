package reviews.reviews2;

public class Review19 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 1;
        int factorial = 1;
        while (sum <= num) {
            factorial *= sum;
            sum = sum + 1;
        }
        System.out.println("結果:" + factorial);
    }
}
