package ensyu7_4;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_4
 * 概要：1から入力値までの全整数の和を求めて表示
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_4 {
	/*
	 * 関数名：sumUp
	 * 概要：nから1までの和の値を求める
	 * 　　　なお、関数名と変数名は問題指定のため、命名規則に則っていません
	 * 引数：int n
	 * 返り値：sumNumber
	 * パラメーターの説明：nの値から1の値までの総和を加算するため
	 */
	static int sumUp(int n) {
		// 合計値を求めるための変数sumNumberをnの値で初期化
		int sumNumber = n;
		
		// 1から加算させるための変数OVER_ONEを1で初期化
		final int OVER_ONE = 1;
		
		// nの値をデクリメントし、値が0になるまで判断
		while(n-- > OVER_ONE) {
			// sumNumberの値に、nの値を加算
			sumNumber += n;
		}
		//sumNumberの値を返す
		return sumNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：nから1までの和の値を表示する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：nの値から1の値までの総和を表示する
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 入力値を代入するための変数firstNumberを0で初期化
		int firstNumber = 0;
		
		// 以降の文を実行
		do {
			//「整数値firstNumber：」を表示し、以降に整数値の標準入力を促す
			System.out.print("整数値firstNumber：");
			// 変数firstNumberに標準入力した値を代入
			firstNumber = standardInput.nextInt();
		// firstNumberの値が0以下の場合、doから繰り返し判断
		} while (firstNumber <= 0);
		// sumUpメソッドからの返り値を、総和として表示
		System.out.println("1から" + firstNumber + "までの総和は、" + sumUp(firstNumber) + "です。");
	}

}
