package atCoder.Beginner387.C;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 入力の数値を受け取る
		int l = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		// ヘビ数かを確認していく。 
		int count = 0;
		for(int i = l; i <= r; i++) {
			// 桁数を取得する
			int max = String.valueOf(i).length();
			// 配列に入れる
			
		}
		System.out.println(count);
    }
}