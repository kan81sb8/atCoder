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
		// (先頭の数字 - 1)^残りの桁数 がその桁のヘビ数の候補になる。
		// 最大桁数の時だけ最大値を考慮すればすれば残りは計算で出せる。
		// 渡された値のヘビ数を求める。 
		int count = 0;
		for(int i = l; i <= r; i++) {
			// 桁数を取得する
			int max = String.valueOf(i).length();
			// 配列に入れる

		}
		System.out.println(count);
    }
}