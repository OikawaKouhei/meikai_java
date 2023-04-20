package ensyu5_4;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu5_4
 * 概要：演習5_4
 * 作成者：Oikawakouhei
 * 作成日：2023/04/20
 */
public class Ensyu5_4 {
	/*
	 * 関数名：main
	 * 概要：三つの整数値を読み込んで、その合計と平均を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値A：」と表示して、以降に整数値の入力を促す
		System.out.print("整数値A：");
		// 変数firstNumberを入力した値で初期化
		int firstNumber = standardInput.nextInt();
		//「整数値B：」と表示して、以降に整数値の入力を促す
		System.out.print("整数値B：");
		// 変数secondNumberを入力した値で初期化
		int secondNumber = standardInput.nextInt();
		//「整数値C：」と表示して、以降に整数値の入力を促す
		System.out.print("整数値C：");
		// 変数thirdNumberを入力した値で初期化
		int thirdNumber = standardInput.nextInt();
		
		// 合計値を出すために変数sumNumberを三つの値の合計値で初期化
		int sumNumber = firstNumber + secondNumber + thirdNumber ;
		// 平均値を出すために変数averageNumberを三つの値の平均値で初期化
		double averageNumber = sumNumber / 3.0 ;
		
		// 合計値を表示
		System.out.println("合計値は、" + sumNumber + "です。");
		// 平均値を表示
		System.out.println("平均値は、" + averageNumber + "です。");
	}

}
