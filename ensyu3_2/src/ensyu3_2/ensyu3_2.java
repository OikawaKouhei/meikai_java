package ensyu3_2;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_2
 * 概要：演習3_2
 * 作成者：OikawaKouhei
 * 作成日：2023/04/07
 */
public class ensyu3_2 {
	/*
	 * 関数名：main関数
	 * 概要：入力された二つの整数において、整数Ｂが整数Ａの約数であれば「約数である」と表示し、そうでなければ「約数でない」と表示する
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数A：」と出力し、以降に整数値の入力を促すため
		System.out.print("整数Ａ：");
		// 入力された整数値を、変数firstNumberに置き換えるため
		int firstNumber = standardInput.nextInt();
		//「整数B」と出力し、以降に整数値の入力を促すため
		System.out.print("整数Ｂ：");
		// 入力された整数値を、変数SecondNumberに置き換えるため
		int secondNumber = standardInput.nextInt();
		
		// 「変数firstNumber % 変数SecondNumber」の結果が0かどうか判定する。
		if (firstNumber % secondNumber == 0)
		// 「整数Bは整数Ａの約数」であることを表示する。
		System.out.println("整数Ｂは整数Ａの約数です。");
		// 「変数firstNumber % 変数SecondNumber」の結果が0でなかったことを判定する。
		else
		// 「整数Ｂは整数Ａの約数」ではないことを表示する。」
		System.out.println("整数Ｂは整数Ａの約数ではありません。");
	}
}
