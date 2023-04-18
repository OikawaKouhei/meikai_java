package ensyu4_17;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_17
 * 概要：演習4_17
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_17 {
	/*
	 * 関数名：main
	 * 概要：入力した整数値の約数を表示。その後、約数の個数も表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 入力値を代入するための変数inputNumberを0で初期化
		int inputNumber = 0;
		// 以降の文を実行する
		do {
			//「整数値：」を表示し、以降に入力を促す
			System.out.print("整数値：");
			// inputNumberの値に入力した値を代入
			inputNumber = standardInput.nextInt();
			// inputNumberの値が0以下の場合判断
			if (inputNumber <= 0)
				// 「正の整数値を入力してください。」を表示する
				System.out.println("正の整数値を入力してください。");
		// inputNumberの値が0以下の場合、do以降から繰り返し実行
		} while(inputNumber <= 0);
		
		// 約数を数えるための変数countNumberを初期化する
		int countNumber = 0 ;
		
		/*
		 * 約数を表示するための変数firstNumberを1で初期化
		 * firstNumberの値がinputNumberの値以下の場合、以降の繰り返し実行
		 * firstNumberの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstNumber = 1; firstNumber <= inputNumber ; firstNumber++) {
			// inputNumberをfirstNumberで割ったとき、余りが0の場合、判断
			if (inputNumber % firstNumber == 0) {
				// firstNumberの値を表示する
				System.out.println(firstNumber);
				// 約数を数えるためcountNumberの値をインクリメント
				countNumber++ ;
			}
		}
	// 約数を表示する
	System.out.println("約数は" + countNumber + "個です。");
	}

}
