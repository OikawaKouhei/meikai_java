package ensyu3_4;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_4
 * 概要：園主3_4
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class ensyu3_4 {
	/*
	 * 関数名：main関数
	 * 概要：二つの変数、firstNumber,secondNumberの値を読み込み、大小関係を表す表示を出力する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値A：」を出力し、以降に整数値の入力を促す
		System.out.print("整数値A：");
		// 変数firstNumberに入力した整数値を代入する
		int firstNumber = standardInput.nextInt();
		
		// 「整数値B：」を出力し、以降に整数値の入力を促す
		System.out.print("整数値B：");
		// 変数secondNumberに入力した整数値を代入する
		int secondNumber = standardInput.nextInt();
		
		// 変数firstNumberと変数secondNumberが同じ値でないとき、trueと判定する
		if (firstNumber != secondNumber)
			// 二つの変数の値において、変数firstNumberのほうが大きいと判定するため
			if (firstNumber > secondNumber)
				// trueと判定されたとき、「整数値Aのほうが大きいです。」と表示するため
				System.out.println("Aのほうが大きいです。");
			// 二つの変数の値において、変数secondNumberのほうが大きい場合の処理をするため
			else
				// 変数secondNumberのほうが大きい場合のとき、「整数値Bのほうが大きいです。」と表示するため
				System.out.println("Bのほうが大きいです。");
		// 変数firstNumberと変数secondNumberが同じ値かどうかの判定をしたとき、falseと判定した時の処理をするため
		else
			// falseの判定がなされたとき、「AとBは同じ値です。」5
			System.out.println("AとBは同じ値です。");
		
		
	}

}
