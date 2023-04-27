package ensyu7_8;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_8
 * 概要：a以上b未満の乱数を生成して、その値を返却するメソッドを使ったプログラム
 * 　　　また、bの値がaの値より小さい場合には、aの値をそのまま返却する
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_8 {
	/*
	 * 関数名：random
	 * 概要：a以上b未満の乱数を生成するメソッド
	 * 　　　関数名、変数名は、教本の問題準拠
	 * 引数：int a , int b
	 * 返り値：randomRange
	 * パラメーターの説明：a・bの値の大小関係の判定と、その範囲の乱数を生成するため、
	 */
	static int random(int a, int b) {
		// 乱数を生成する準備
		Random randomNumber = new Random();
		// 返り値を示す変数randomRangeをaの値で初期化
		int randomRange = a;
		// randomRangeの値がbの値以下の場合、判断
		if (randomRange <= b) {
			// randomRangeの値に、a以上b未満の乱数を代入
			randomRange = randomNumber.nextInt(b - randomRange) + randomRange;
		}
		// randomRangeの値を返す
		return randomRange;
	}

	/*
	 * 関数名：main
	 * 概要：入力したfirstNumber以上secondNumber未満の乱数を表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：入力したfirstNumber以上secondNumber未満の乱数を表示するため
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 整数aの値を示す変数firstNumberを0で初期化
		int firstNumber = 0;
		// 整数bの値を示す変数secondNumberを0で初期化
		int secondNumber = 0;
		
		// 以降の文を実行
		do {
			//「整数値a：」を表示し、以降に整数値の入力を促す
			System.out.print("整数値a：");
			// 整数値aを表す変数firstNumberを標準入力した値で初期化
			firstNumber = standardInput.nextInt();
			//「整数値b：」を表示し、以降に整数値の入力を促す
			System.out.print("整数値b：");
			// 整数値bを表す変数secondNumberを標準入力した値で初期化
			secondNumber = standardInput.nextInt();
			// firstNumberの値とsecondNumberの値が同じ場合、判断
			if (firstNumber == secondNumber) {
				System.out.println("整数値aと整数値bに同じ値が入力されました。\n再度入力してください");
			}
		// firstNumberの値とsecondNumberの値が同じ間、do以降から繰り返し実行
		} while (firstNumber == secondNumber);
		
		//「a以上b未満の乱数を生成します。\nbの値がaの値より小さい場合、aの値を表示します。」を表示
		System.out.println("a以上b未満の乱数を生成します。\nbの値がaの値より小さい場合、aの値を表示します。");
		// firstNumberの値以上secondNumberの値未満の乱数または、firstNumberの値を表示
		System.out.println(random(firstNumber, secondNumber));

	}

}
