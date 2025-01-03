package atCoder.Beginner386.C;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 変換回数となるK（=1）を受け取る
		int k = sc.nextInt();
		// 変換元となる文字列Sを受け取る
		String s = sc.next();
		// 変換後となる文字列Tを受け取る
		String t = sc.next();
		sc.close();

		// 回答用の文字例を初期化
		String ans = "No";

		// それぞれの値を配列に入れて比較できるようにする。
		String[] sWords = s.split("");
		String[] tWords = t.split("");

		// 長さを比較してそれぞれの検証に分岐させる。
		if (s.length() == t.length()) {
			ans = equalsCheck(sWords,tWords);
		} else if (s.length() - t.length() == 1) {
			ans = sBiggerCheck(sWords,tWords);
		} else if (s.length() - t.length() == -1) {
			ans = sSmallerCheck(sWords,tWords);
		}
		System.out.println(ans);
    }

	/**
	 * @param sWords
	 * @param tWords
	 * @return "Yes" or "No"
	 */
	private static String equalsCheck(String[] sWords,String[] tWords) {
		// 繰り返しの回数となる文字数を取得する。
		int wordsLength = sWords.length;
		// 文字の違いをカウントする変数を初期化
		int count = 0;
		for(int i = 0; i <= wordsLength; i++) {
			if(sWords[i].equals(tWords[i])) {
				break;
			} else {
				count++;
			}
			if (count > 1) {
				return "No";
			}
		}
		return "Yes";
	}

	private static String sBiggerCheck(String[] sWords, String[] tWords) {
		// 繰り返しの回数となる文字数を取得する。
		int wordsLength = sWords.length;
		// 文字の違いをカウントする変数を初期化
		int count = 0;
		for(int i = 0; i <= wordsLength; i++) {
			if (sWords[i].equals(tWords[i-count])) {
				break;
			} else {
				count++;
			}
			if (count > 1) {
				return "No";
			}
		}
		return "Yes";
	}

	private static String sSmallerCheck(String[] sWords, String[] tWords) {
		// 繰り返しの回数となる文字数を取得する。
		int wordsLength = tWords.length;
		// 文字の違いをカウントする変数を初期化
		int count = 0;
		for(int i = 0; i <= wordsLength; i++) {
			if (sWords[i-count].equals(tWords[i])) {
				break;
			} else {
				count++;
			}
			if (count > 1) {
				return "No";
			}
		}
		return "Yes";
	}
}