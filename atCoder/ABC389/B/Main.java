package atCoder.ABC389.B;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String xr = sc.next();
		sc.close();

		long x = Long.parseLong(xr);
		// それぞれの値を配列に入れてチェックする。
		long ans = 1;
		for(int i = 1; ans < x; i++) {
			ans = ans * i;
			if (ans == x) {
				System.out.println(i);
				break;
			}
		}
	}
}