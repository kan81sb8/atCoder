package atCoder.Beginner387.A;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 入力の数値を受け取る
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		// (A + B) ^ 2 を出力する。 
		System.out.println((a+b)*(a+b));
    }
}