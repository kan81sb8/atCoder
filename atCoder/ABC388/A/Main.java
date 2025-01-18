package atCoder.ABC388.A;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		// n個分の配列を用意する。
		int[] tList = new int[n];
		int[] lList = new int[n];
		 
		// for文で回して各サイズを入れる
		for(int i = 0; i < n; i++){
			tList[i] = sc.nextInt();
			lList[i] = sc.nextInt();
		}
		sc.close();

		// 長さを足して最大を探す。
		for(int i = 1; i <= d; i++) {
			int maxWei = 0;
			for(int j = 0; j < n; j++ ){

				int wei = tList[j] * (lList[j] + i);
				if (maxWei <= wei) {
					maxWei = wei;
				}
			}
			System.out.println(maxWei);
		}

    }
}