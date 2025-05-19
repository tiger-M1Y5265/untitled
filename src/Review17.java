public class Review17 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int i = 0;
        while (num >= i) {
            if(i % 2 == 0) {
                sum += i;
            }
            i = i + 1;
        }
        System.out.println("結果:" + sum);
    }
}
