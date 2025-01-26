package atCoder.ABC390.A;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		for(int i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		int changeCount = 0;
		for(int i = 0; i < 4; i++) {
			if (x[i] > x[i+1]) {
				changeCount++;
				x[i+1] = x[i];
			}
		}

		if (changeCount == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}