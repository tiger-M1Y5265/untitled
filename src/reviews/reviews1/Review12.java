package reviews.reviews1;

public class Review12 {
    public static void main(String[] args) {
        int age = 30;
        if(age >= 0 && age <= 17) {
            System.out.println("未成年");
        } else if(age <= 64) {
            System.out.println("成人");
        } else if(age >= 65) {
            System.out.println("高齢者");
        } else {
            System.out.println("無効な年齢です。");
        }
    }
}
