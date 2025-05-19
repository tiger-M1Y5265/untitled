public class Review19 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 1;
        int factorial = 1;
        while (factorial <= num) {
            sum *= factorial;
            factorial = factorial + 1;
        }
        System.out.println("結果:" + sum);
    }
}
