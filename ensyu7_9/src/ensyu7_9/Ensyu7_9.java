package ensyu7_9;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_9
 * 概要：「正の整数値：」を表示し、標準入力させるメソッドを用いて、正の整数値が入力されたらその値を表示させるプログラム
 * 　　　また、bの値がaの値より小さい場合には、aの値をそのまま返却する
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_9 {
	// 標準入力するための準備
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名：readPlusInt
	 * 概要：正の正数値を標準入力させ、その値をそのまま返却するメソッド
	 * 引数：なし
	 * 返り値：jaudgeNumber
	 * パラメーターの説明：なし
	 */
	static int readPlusInt() {
		// 標準入力した値を代入するための変数jydgeNumberを0で初期化
		int jydgeNumber = 0;
		// 以降の文を実行
		do {
			//「整数値：」を表示し、以降に入力を促す
			System.out.print("整数値：");
			// jydgeNumberの値に、標準入力した値を代入
			jydgeNumber = standardInput.nextInt();
		// jydgeNumberの値が0以下の場合、do以降から繰り返し実行
		} while(jydgeNumber <= 0);
		// jydgeNumberの値を返す
		return jydgeNumber;
	}
	/*
	 * 関数名：main
	 * 概要：正の整数値を標準入力させ、その値をそのまま表示させるメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// readPlusIntメソッドを表示するため
		System.out.println(readPlusInt());
	}
}
