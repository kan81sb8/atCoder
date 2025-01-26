package atCoder.ABC389.C;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		// q個分の配列を用意する。
		long[] snakeList = new long[q + 1];
		snakeList[0] = 0;
		int deleteCount = 0;
		long deleteLong = 0;
		int outCount = 0;
		 
		// for文で回して各サイズを入れる
		for(int i = 1; i <= q; i++){
			int type = sc.nextInt();
			if (type == 1) {
				snakeList[i - deleteCount - outCount] = snakeList[i - 1 - deleteCount - outCount] + sc.nextInt();
			} else if (type == 2) {
				deleteLong = deleteLong + snakeList[deleteCount + 1] - snakeList[deleteCount];
				deleteCount++;
			} else if (type == 3) {
				int target = sc.nextInt();
				long ans = snakeList[target - 1 + deleteCount] - deleteLong;
				System.out.println(ans);
				outCount++;
			}
		}
		sc.close();
	}
}