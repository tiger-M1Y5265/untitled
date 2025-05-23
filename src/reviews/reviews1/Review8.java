package reviews.reviews1;

public class Review8 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = b;
        a = Math.toIntExact(10000L);
        b = Math.toIntExact(10000L);
        b = (int)a;
        double f = 5.94;
        short s = 10;
    }
}
