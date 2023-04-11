package ensyu3_14;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：Ensyu3_14
 * 概要：ennsyuu3_14 
 * 作成者：OikawaKouhei
 * 作成日：2023/04/11
 */
public class Ensyu3_14 {
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込み、小さいほうの値と大きいほうの値をそれぞれ表示する。また、同値の場合、同値であることを表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		//	標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//	「整数A」を表示し、以降に整数値の入力を促す。入力された値で初期化するため、変数firstNumberを作成
		System.out.print("整数A："); int firstNumber = standardInput.nextInt();
		//	「整数B」を表示し、以降に整数値の入力を促す。入力された値で初期化するため、変数secondNumberを作成
		System.out.print("整数B："); int secondNumber = standardInput.nextInt();
		
		//	変数minimumNumberと変数maxNumberを宣言し初期化する
		int minimumNumber = 0;
		int maxNumber = 0;
		
		//	firstNumberとsecondNumberが同じ値でないか判定する
		if (firstNumber != secondNumber) {
			//	同じ値でないと判定した場合、firstNumberのほうがsecondNumberより小さいかを判定する
			if (firstNumber < secondNumber) {
			//	firstNumberのほうがsecondNumberより小さいと判定したら、minimumNuberにfirstNumberを代入する
			minimumNumber = firstNumber;
			//	firstNumberのほうがsecondNumberより小さいと判定したら、maxNuberにsecondNumberを代入する
			maxNumber = secondNumber;
				//小さい値と判定した値を表示する
				System.out.println("小さいほうの値は" + minimumNumber + "です。");
				//	大きい値と判定した値を表示する
				System.out.println("大きいほうの値は" + maxNumber + "です。");
			
			//	secondNumberのほうがfirstNumberより小さいかを判定する
			} else {
			//	secondNumberのほうがfirstNumberより小さいかを判定したら、minimumNuberにsecondNumberを代入する
			minimumNumber = secondNumber;
			//	secondNumberのほうがfirstNumberより小さいかを判定したら、maxNuberにfirstNumberを代入する
			maxNumber = firstNumber;
				//小さい値と判定した値を表示する
				System.out.println("小さいほうの値は" + minimumNumber + "です。");
				//	大きい値と判定した値を表示する
				System.out.println("大きいほうの値は" + maxNumber + "です。");
		//	firstNumberとsecondNumberが同じ値であると判定する
		}} else {
			//	「二つの値は同じです。」と表示する
			System.out.println("二つは同じ値です。");
		}
	}

}
