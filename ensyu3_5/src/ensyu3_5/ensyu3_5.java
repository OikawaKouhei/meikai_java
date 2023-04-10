package ensyu3_5;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_5
 * 概要：演習3_5
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class ensyu3_5 {
	/*
	 * 関数名：main関数
	 * 概要：正の整数値を読み込み、5で割り切れれば「5で割り切れます」と表示し、できなければ「5で割り切れません」と表示する
	 * 　　　また、正の整数値でない場合、「正ではない値が入力されました。」と表示するプログラム
	 * 引数：String[]args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値：」と出力して、以降に整数値の入力を促す
		System.out.print("整数値：");
		// 変数firstNumberに、入力した値を代入する
		int firstNumber = standardInput.nextInt();
		
		// 変数firstNumberが正の値かどうか判定をする
		if (firstNumber > 0)
			// 変数firstNumberが5で割り切れるか判定をする
			if (firstNumber % 5 == 0)
			// 5で割り切れる判定が出た時、「その値は5で割り切れます。」と表示
			System.out.println("その値は5で割り切れます。");
			// 変数firstNumberが5で割り切れない場合の判定をする
			else
			// 5で割り切れない判定が出た時に、「その値は5で割り切れません。」と表示
			System.out.println("その値は5で割り切れません。");
		// 変数firstNumberが正の値でない場合の判定をする
		else
		//　変数firstNumberが正の値でない場合の判定がなされたとき、「正でない値が入力されました。」と表示する。
			System.out.println("正でない値が入力されました。");
	}

}
