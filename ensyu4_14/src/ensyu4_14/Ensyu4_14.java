package ensyu4_14;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_14
 * 概要：演習4_14
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_14 {
	/*
	 * 関数名：main
	 * 概要：1から入力された整数値までの和を求めるとともに、式も表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
				
		// 「1から入力された整数値までの和を求めます。」と表示
		System.out.println("1から入力された整数値までの和を求めます。");
		
		// 入力された数値を代入するための変数inputNumberを初期化
		int inputNumber = 0 ;
		// 合計値を表示するための変数sumNumberを初期化
		int sumNumber = 0 ;
		
		// 以下の文を実行する
		do {
			//「正の整数値：」を表示して、以降に整数値の入力を促す
			System.out.print("正の整数値：");
			// inputNumberに標準入力した値を代入する
			inputNumber = standardInput.nextInt();
			// inputNumberの値が0以下の場合、判断
			if (inputNumber <= 0) {
				//「正の整数値を再度入力してください。」と表示して、再度入力を促す
				System.out.println("正の整数値を再度入力してください。");
					}
				// inputNumberの値が0以下の場合、do以降を繰り返し判断
		} while (inputNumber <= 0);
				
		/*
		 * 繰り返し合計値に足していくための変数firstNumberを1で初期化
		 * firstNumberの値がinputNumberの値未満の間、以降の文を繰り返し実行
		 * firstNumberの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstNumber = 1 ; firstNumber < inputNumber ; firstNumber++) {
			// firstNumberの値と「 」「+」「 」を表示し、入力値までの和の式を表示する
			System.out.print(firstNumber+ " " + "+" + " ");
			// sumNumberの値にfirstNumberの値を足す
			sumNumber += firstNumber;
		}
		// 入力値との和の式と「 」「=」「 」と合計値を表示し、式を完成させる
		System.out.println(inputNumber + " " + "=" + " " + (sumNumber + inputNumber));
	}

}
