package reviews.reviews2;

public class Review18  {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int i = 1;
        while (num >= i) {
            sum += i;
            i = i + 2;
        }
        System.out.println("結果:" + sum);
    }
}
