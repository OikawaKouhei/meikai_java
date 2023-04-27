package ensyu7_6;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_6
 * 概要：月の季節を表示するメソッドを用いて、1から12までの入力した数値に応じて該当季節を表示
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_6 {
	/*
	 * 関数名：printSeasn
	 * 概要：数字に応じた季節を表示するためのメソッド
	 * 　　　関数名、変数名は、教本の問題準拠
	 * 引数：int m
	 * 返り値：なし
	 * パラメーターの説明：値に応じて、季節を表示させるため
	 */
	static void printSeason(int m) {
		// 探すラベルの値を示し、条件に該当するものがあるか探す
		switch (m) {
		// mの値が1の場合
		case (1):
			// mの値が2の場合
		case (2):
			// 「冬を表示」
			System.out.println("冬");
			// swich文を抜け出す
			break;
		// mの値が3の場合
		case (3):
			// mの値が4の場合
		case (4):
			// mの値が5の場合
		case (5):
			//「春」を表示
			System.out.println("春");
			// swich文を抜け出す
			break;
		// mの値が6の場合
		case (6):
			// mの値が7の場合
		case (7):
			// mの値が8の場合
		case (8):
			//「夏」を表示
			System.out.println("夏");
			// swich文を抜け出す
			break;
		// mの値が9の場合
		case (9):
			// mの値が10の場合
		case (10):
			// mの値が11の場合
		case (11):
			//「秋」を表示
			System.out.println("秋");
			// swich文を抜け出す
			break;
		// mの値が12の場合
		case (12):
			//「冬」を表示
			System.out.println("冬");
			// swich文を抜け出す
			break;
		default:
			// swich文を抜け出す
			break;
		}
	}

	/*
	 * 関数名：main
	 * 概要：標準入力させ、その値に応じた季節を表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		//「季節は？：」を表示し、数値の入力を促す
		System.out.print("季節は？：");
		// 変数seasonNumberを入力値で初期化
		int seasonNumber = standardInput.nextInt();

		// 入力値に該当する数値がある場合、該当季節を表示
		printSeason(seasonNumber);
	}
}
