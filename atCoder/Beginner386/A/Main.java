package atCoder.Beginner386.A;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// カードの値を受け取る
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();

		// それぞれの値を配列に入れてチェックする。
		int[] cards = {a,b,c,d};

		// 最大で２種類なのでxとyを宣言して用意する。
		int x = 0;
		int y = 0;
		String ans = "Yes";
		// 配列の種類をカウントする。
		for (int i : cards) {
			if (x == 0) {
				x = i;
			} else if (x == i) {
				continue;
			} else if (y == 0) {
				y = i;
			} else if (y == i) {
				continue;
			} else {
				ans = "No";
				break;				
			}
		}
		// 4枚同じケースではNoにする。
		if (y == 0) {
			ans = "No";
		}
		System.out.println(ans);
    }
}