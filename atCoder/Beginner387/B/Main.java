package atCoder.Beginner387.B;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 入力の数値を受け取る
		int x = sc.nextInt();
		sc.close();

		// 9*9 を配列に全て入れる。 
		int count = 0;
		for(int i = 1; i <= 9; i++) {
			for(int n = 1; n <= 9; n++) {
				if (i*n != x) {
					count = count + (i * n);
				}
			}
		}
		System.out.println(count);
    }
}