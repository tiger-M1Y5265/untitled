package reviews.reviews2;

public class Review23 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 1;
        for (int factorial = 1; factorial <= num; factorial++) {
            sum *= factorial;
        }
        System.out.println("結果:" + sum);
    }
}
