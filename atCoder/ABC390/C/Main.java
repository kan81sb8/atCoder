package atCoder.ABC390.C;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		String ans = "Yes";
		float baisu = Float.intBitsToFloat(x[1]) / Float.intBitsToFloat(x[0]);
		for(int i = 1; i < n; i++) {
			if (baisu * x[i-1] != x[i]) {
				ans = "No";
				break;
			} 
		}
		System.out.println(ans);
	}
}