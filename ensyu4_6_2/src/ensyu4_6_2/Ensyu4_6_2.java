package ensyu4_6_2;

//java.utilScannerを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_6_2
 * 概要：演習4_6_2
 * 作成者：OikwaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_6_2 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ数値に応じて、*を表示するプログラム
	 * 　　　読み込んだ数値が、1未満の場合改行文字を表示しないプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 「何個表示しますか：」と表示して、以降に整数値の入力を促す
		System.out.print("何個表示しますか：");
		// 変数firstNumberを標準入力された数値で、初期化
		int firstNumber = standardInput.nextInt();

		// 繰り返しを実行するための変数asteriskNumberを1で初期化
		int asteriskNumber = 1 ;

		// firstNumberが0より大きい場合を判断
		if (firstNumber > 0) {
			// asteriskNumberがfirstNumber以下の値の間、以下の文を繰り返し実行
			while (asteriskNumber <= firstNumber) {
				// *を表示する
				System.out.print('*');
				// asteriskNumberをインクリメント
				asteriskNumber++;
			}
			// 改行するため
			System.out.println();
		// firstNumberが0未満の場合を判断
		} else {
			// 「正の整数値ではありません。」と表示
			System.out.print("正の整数値ではありません。");

		}

	}

}
