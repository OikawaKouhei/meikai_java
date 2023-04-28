package ensyu7_10;

//java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_10
 * 概要：「x+y+z」「x+y-z」「x-y+z」「x-y-z」をランダムに出題するプログラム
 * 　　　また、bの値がaの値より小さい場合には、aの値をそのまま返却する
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_10 {
	// 標準入力するため
	static Scanner standardInput = new Scanner(System.in);
	// 乱数を生成するため
	static Random randomNumber = new Random();

	/*
	 * 関数名：confirmRetry
	 * 概要：問題を続けるかどうか判断の表示と入力を兼ねたメソッド
	 * 引数：なし
	 * 返り値：countNumber
	 * パラメーターの説明：なし
	 */
	static boolean confirmRetry() {
		// true or falseを判断するための変数countNumberを0で初期化
		int countNumber = 0;
		// 以降の文を実行
		do {
			//「もう一度？<Yes…1/No…0>」を表示して、続行するか確認させる
			System.out.print("もう一度？<Yes…1/No…0>：");
			// countNumberに標準入力した値を代入
			countNumber = standardInput.nextInt();
			// countNumberの値が、0可1でない場合、do以降から繰り返し実行
		} while (countNumber != 0 && countNumber != 1);
		// countNumber == 1を返す
		return countNumber == 1;
	}

	/*
	 * 関数名：makeFormula
	 * 概要：問題をランダムに選択し、その解を導くメソッド
	 * 引数：int firstNumber,secondNumber,thirdNumber
	 * 返り値：answerNumber
	 * パラメーターの説明：三つの値の加減式をランダムに行うため
	 */
	static int makeFormula(int firstNumber, int secondNumber, int thirdNumber) {
		// 乱数の範囲を表す定数IMMOVALE_NUMBERを4で初期化
		final int IMMOVALE_NUMBER = 4;
		// 返り値の変数answerNumberを0で初期化
		int answerNumber = 0;
		// ランダムに式を表示させるために変数formulaNumberをで初期化
		int formulaNumber = randomNumber.nextInt(4);

		// スイッチ文を用いて、異なった式を表示
		switch (formulaNumber) {
		// case0の場合
		case (0):
			// trueの判断の場合
			while (true) {
				// 「x + y + z」の式を表示
				System.out.print(firstNumber + "+" + secondNumber + "+" + thirdNumber + "=");
				// x + y + zの値を、返り値answerNumberに代入
				answerNumber = firstNumber + secondNumber + thirdNumber;

				// 回答者の答えを入力させる
				int answerInput = standardInput.nextInt();
				// answerInputの値とanswerNumberの値が同じ場合、判断
				if (answerInput == answerNumber) {
					// while文を抜け出す
					break;
				}
				//「違います」を表示
				System.out.println("違います。");
			}
			// case (0)を抜け出す
			break;
		// case0の場合
		case (1):
			// trueの判断の場合
			while (true) {
				// 「x + y - z」の式を表示
				System.out.print(firstNumber + "+" + secondNumber + "-" + thirdNumber + "=");
				// x + y + zの値を、返り値answerNumberに代入
				answerNumber = firstNumber + secondNumber - thirdNumber;

				// 回答者の答えを入力させる
				int answerInput = standardInput.nextInt();
				// answerInputの値とanswerNumberの値が同じ場合、判断
				if (answerInput == answerNumber) {
					// while文を抜け出す
					break;
				}
				//「違います」を表示
				System.out.println("違います。");
			}
			// case (0)を抜け出す
			break;

		// case0の場合	
		case (2):
			// trueの判断の場合
			while (true) {
				// 「x + y - z」の式を表示
				System.out.print(firstNumber + "-" + secondNumber + "+" + thirdNumber + "=");
				// x + y + zの値を、返り値answerNumberに代入
				answerNumber = firstNumber - secondNumber + thirdNumber;
				// 変数answerInputの値に標準入力した値を代入
				int answerInput = standardInput.nextInt();
				// answerInputの値とanswerNumberの値が同じ場合、判断
				if (answerInput == answerNumber) {
					// while文を抜け出す
					break;
				}
				//「違います」を表示
				System.out.println("違います。");
			}
			// case (0)を抜け出す
			break;

		// case0の場合	
		case (3):
			// trueの判断の場合
			while (true) {
				// 「x - y - z」の式を表示
				System.out.print(firstNumber + "-" + secondNumber + "-" + thirdNumber + "=");
				// x + y + zの値を、返り値answerNumberに代入
				answerNumber = firstNumber - secondNumber - thirdNumber;

				// answerInputの値を標準入力した値で初期化
				int answerInput = standardInput.nextInt();
				// answerInputの値とanswerNumberの値が同じ場合、判断
				if (answerInput == answerNumber) {
					// while文を抜け出す
					break;
				}
				//「違います。」表示
				System.out.println("違います。");
			}
			//「違います。」えお表示
			break;
		}
		// answerNumberの値を返す
		return answerNumber;
	}

	/*
	 * 関数名：main
	 * 概要：ランダムな数値を生成し、ランダムに生成した式で解を導くメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：式を表示する
	 */
	public static void main(String[] args) {
		//「暗算力トレーニング！！」を表示
		System.out.println("暗算力トレーニング！！");
		//以降の文を繰り返し実行
		do {
			// firstRandomの値に100以上999以下の乱数を初期化
			int firstRandom = randomNumber.nextInt(900) + 100;
			// firstRandomの値に100以上999以下の乱数を初期化
			int secondRandom = randomNumber.nextInt(900) + 100;
			// firstRandomの値に100以上999以下の乱数を初期化
			int thirdRandom = randomNumber.nextInt(900) + 100;

			// makeFormulaメソッドを呼び出す
			makeFormula(firstRandom, secondRandom, thirdRandom);
		// confirmRetryメソッドを呼び出す
		} while (confirmRetry());
	}

}
