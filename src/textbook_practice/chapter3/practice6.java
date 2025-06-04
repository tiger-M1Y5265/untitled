package textbook_practice.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[数あてゲーム]");
        double randomNum = Math.random() * 9;
        int ans = (int) randomNum;
        System.out.print("0～9の数字を入力してください");
        int num = Integer.parseInt(br.readLine());
        if (num == ans) {
            System.out.println("アタリ!");
        } else {
            System.out.println("違います");
        }
        System.out.println("ゲームを終了します");
    }
}
