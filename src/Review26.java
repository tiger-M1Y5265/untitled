public class Review26 {
    public static void main(String[] args) {
        int[] numArray = new int[]{11,12,13,14,15};;
        int target = 11;
        int count = 0;
        for (int i =0; i < 10; i++) {
            if(numArray[i] == target) {
                count = count + 1;
            }
        }
        System.out.println("検索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
