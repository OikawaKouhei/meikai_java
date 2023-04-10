package ensyu3_7;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
* クラス名：ensyu3_6
* 概要：演習3_6
* 作成者：OikawaKouhei
* 作成日：2023/04/10
*/
public class ensyu3_7 {
	/*
	 * 関数名：main関数
	 * 概要：読み込んだ整数値に対して、3で割ったとき、割り切れる場合、1余りの場合、2余りの場合、3余りの場合、
	 * 　　　正の整数値ではない場合の判定をして表示する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値：」を表示して、以降に整数値の入力を促す
		System.out.print("整数値：");
		// 変数firstNumberに入力した整数値を代入
		int firstNumber = standardInput.nextInt();
		
		// 変数firstNumberが正の整数値であるかを判定する
		if (firstNumber > 0)
			// 変数firstNumberが3で割り切れるかを判定する
			if (firstNumber % 3 == 0)
			// 3で割り切れる場合「その値は3で割り切れます。」
			System.out.println("その値は3で割り切れます。");
			// 変数firstNumberを3で割ったとき、1余るかを判定する
			else if (firstNumber % 3 == 1)
			// 変数firstNumberを3で割ったとき、1余る場合、「その値を3で割った余りは1です。」と表示する
			System.out.println("その値を3で割った余りは1です。");
			// 変数firstNumberを3で割ったとき、1余らなかった場合を判定する
			else 
			// 変数firstNumberを3で割ったとき、1余らなかった場合、「その値を3で割った余りは2です。」と表示する
			System.out.println("その値を3で割った余りは2です。");
		// 変数firstNumberが正の整数値でない場合を判定する
		else
		// 変数firstNumberが正の整数値でない場合、「正ではない値が表示されました」と表示する
		System.out.println("正ではない値が表示されました。");
	}

}
