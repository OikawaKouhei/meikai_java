package ensyu3_6;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_6
 * 概要：演習3_6
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class ensyu3_6 {
	/*
	 * 関数名：main関数
	 * 概要：整数値を読み込み、10の倍数かどうかを判定するプログラム。また、正の整数値でない場合も判定するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値：」を出力して、以降に整数値の入力を促す
		System.out.print("整数値：");
		// 変数firstNumberに読み込んだ整数値を代入する
		int firstNumber = standardInput.nextInt();
		
		// 変数firstNumberが正の整数値かどうかを、判定する
		if (firstNumber > 0)
			// 変数firstNumberが正の整数値だった場合、10の倍数かどうかを判定する
			if (firstNumber % 10 == 0)
			// 10の倍数だった場合、「その値は10の倍数です。」と表示する
			System.out.println("その値は10の倍数です。");
			// 変数firstNumberが10の倍数でない場合、判定する
			else
			// 10の倍数だった場合、「その値は10の倍数ではありません。」と表示する
			System.out.println("その値は10の倍数ではありません。");
		// 変数firstNumberが正の整数値でなかったとき判定する
		else
		// 正の整数値ではないと判定した時、「正ではない値が入力されました」と表示する
		System.out.println("正ではない値が入力されました。");
	}

}
