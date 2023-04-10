package ensyu3_9;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_9
 * 概要：演習3_9
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class ensyu3_9 {
	/*
	 * 関数名：main関数
	 * 概要：二つの実数値を読み込んで、大きいほうの値を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「実数A：」を表示し、実数値の入力を促す
		System.out.print("実数A：");
		// 変数firstNumberに、入力した値を代入
		double firstNumber = standardInput.nextDouble();
		// 「実数B：」を表示し、実数値の入力を促す
		System.out.print("実数B：");
		// 変数secondNumberに、入力した値を代入
		double secondNumber = standardInput.nextDouble();
		
		// 大きいほうの値を、代入するために変数bigNumberを生成する
		double bigNumber;
		// 変数firstNumberと変数secondNumberのどちらが大きい値か判定する
		if (firstNumber > secondNumber)
			// 変数firstNumberが大きい場合、変数bigNumberに代入する
			bigNumber = firstNumber;
		// 変数secondNumberが大きい場合を判定する
		else
			// 変数secondNumberが大きい場合、変数bigNumberに代入する
			bigNumber = secondNumber;
		
		// 変数bigNumberに大きいほうの値を代入したのちに、「大きいほうの値は + bigNumber + です。」を表示する
		System.out.println("大きいほうの値は" + bigNumber + "です。");
	}

}
