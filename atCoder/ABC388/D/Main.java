package atCoder.ABC388.D;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		// n個分の配列を用意する。
		int[] aliens = new int[n];
		 
		// for文で回して各サイズを入れる
		for(int i = 0; i < n; i++){
			aliens[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		// 年数分のループを回す。
		for(int i = 0; i < n; i++) {
			int maxStones = 0;
			if (aliens[i] <= (n - i - 1)) {
				maxStones = aliens[i];
				aliens[i] = 0;
			} else {
				maxStones = (n - i -1);
				aliens[i] = aliens[i] - (n - i - 1);
			}
			for(int j = 0; j < maxStones; j++) {
				aliens[i + j + 1]++;
			}
		}
		for (int i : aliens) {
			System.out.print(i + " ");
		}
		System.out.println("");
    }
}