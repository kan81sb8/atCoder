package atCoder.Beginner386.B;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 作成するべき文字列Sを受け取る
		String s = sc.next();
		sc.close();

		// それぞれの値を配列に入れてチェックする。
		String[] words = s.split("");

		int count = 0;
		int zeroCount = 0;
		// 先頭から何を押すのが良いかチェックしていく。
		for (String i : words) {
			if (i.equals("0")) {
				if (zeroCount == 0) {
					zeroCount++;
				} else {
					count++;
					zeroCount = 0;
				}
			} else {
				count++;
				if (zeroCount != 0) {
				  count++;
				}
				zeroCount = 0;
			}
		}
		// 最後が0の時にはカウントを増やす。
		if (zeroCount != 0) {
			count++;
		}
		System.out.println(count);
    }
}