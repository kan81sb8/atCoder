package atCoder.Beginner282.A;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 値を受け取る
		int k = sc.nextInt();
		sc.close();

		// アルファベットを格納する配列を作ってしまう。
		// String[]  alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

		// 受け取った数だけループして文字列を作成して出力する。
		// String ans;
		char alphabet = 'A';
		for (int i = 0; i < k; i++) {
			System.out.println(String.valueOf(alphabet + i));
			// ans = ans.concat(alphabet + i);
		}
		// System.out.println(ans);
    }
}