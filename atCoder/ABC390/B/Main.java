package atCoder.ABC390.B;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		String ans = "Yes";
		for(int i = 1; i < n-1; i++) {
			if (x[i] * x[i] != x[i-1] * x[i+1]) {
				ans = "No";
				break;
			} 
		}
		System.out.println(ans);
	}
}