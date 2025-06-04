package textbook_practice.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください>");
        int ageString = Integer.parseInt(br.readLine());
        double randomNum = Math.random() * 4;
        int fortune = (int) randomNum;
        System.out.print("占いの結果がでました!");
        System.out.println(ageString + "歳の" + name + "さん、　あなたの運気番号は" + fortune + "です");
        System.out.print("(1:大吉　2:中吉　3:吉　4:凶)");
    }
}
