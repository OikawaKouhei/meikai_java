package ensyu3_10;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：ensyu3_10
* 概要：演習3_10
* 作成者：OikawaKouhei
* 作成日：2023/04/10
*/
public class ensyu3_10 {
	/*
	 * 関数名：main関数
	 * 概要：二つの整数値を読み込んで、その差を表示する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数A：」を表示し、整数値の入力を促す
		System.out.print("整数A：");
		// 変数firstNumberに、入力した値を代入
		int firstNumber =standardInput.nextInt();
		// 「整数B：」を表示し、整数値の入力を促す
		System.out.print("整数B：");
		// 変数secondNumberに、入力した値を代入
		int secondNumber = standardInput.nextInt();
		
		// 大きいほうの値を、代入するために変数bigNumberを生成し、大きい値がどちらかを判定する
		int bigNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
		// 小さいほうの値を、代入するために変数smallNumberを生成し、小さい値がどちらかを判定する
		int smallNumber = firstNumber < secondNumber ? firstNumber : secondNumber;
		
		// 変数bigNumberから、変数smallNumberを引き、二つの値の差を求め、表示する
		System.out.println("二つの整数値の差は" + (bigNumber - smallNumber ) + "です。");
	}

}
