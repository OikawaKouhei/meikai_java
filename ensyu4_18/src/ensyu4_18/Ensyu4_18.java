package ensyu4_18;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_18
 * 概要：演習4_18
 * 作成者：OikawaKouhei
 * 作成日：2023/04/18
 */
public class Ensyu4_18 {
	/*
	 * 関数名：main
	 * 概要：1から入力値までの整数値の2乗の値を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値を入力するための変数inputNumberを0で初期化
		int inputNumber = 0 ;
		
		// do以降の文を実行
		do {
			//「整数値：」を表示して、以降に入力を促す
			System.out.print("整数値：");
			// 変数inputNumberの値に、標準入力した値を代入
			inputNumber = standardInput.nextInt();
			// inputNumberの値が0以下の場合、判断
			if (inputNumber <= 0) {
				//「正の整数値を入力してください。」を表示する
				System.out.println("正の整数値を入力してください。");
			}
		// inputNumberの値が0以下の間、do以降を繰り返し実行
		} while (inputNumber <= 0);
		
		/*
		 * 変数firstNumberを1で初期化する
		 * 変数squareNumberを1で初期化する
		 * firstNumberの値がinputNumberの値以下の間、以降の繰り返しを実行
		 * 2乗の値を表示するため、firstNumberの値と、squareNumberの値をそれぞれインクリメントし、次の繰り返しの準備をする
		 */
		for(int firstNumber = 1 , squareNumber = 1 ; firstNumber <= inputNumber ; firstNumber++ , squareNumber++) {
			// 現在の数値と、その値の2乗の値を表示する
			System.out.println(firstNumber + "の2乗は、" + (squareNumber * firstNumber));
		}
	}

}
