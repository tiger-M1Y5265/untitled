package textbook_practice.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("1:検索　2:登録　3:削除　4:変更>");
        System.out.print("数字を入力してください>");
        int selected = Integer.parseInt(br.readLine());
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
                case 2:
                    System.out.println("登録します");
                    break;
                    case 3:
                        System.out.println("削除します");
                        break;
                        case 4:
                            System.out.println("変更します");
                            break;
                            default:
        }
    }
}
