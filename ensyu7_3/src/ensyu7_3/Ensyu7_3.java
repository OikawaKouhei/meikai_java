package ensyu7_3;

import java.util.Scanner;

/*
 * クラス名：Ensyu7_3
 * 概要：中央値を求めるメソッドを作成し、最小値を表示
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_3 {
	/*
	 * 関数名：med
	 * 概要：中央値を求めるメソッド
	 * 　　　なお、関数名・メソッドの変数名は、指定されているため命名規則から外れての表記
	 * 引数(仮引数)：int a,int b,int c
	 * 返り値： medianNumber
	 * パラメーター(仮引数)の説明：中央値を代入するためのもの
	 */
	static int med(int a, int b, int c) {
		// 中央値を代入する変数medianNumberをaの値で初期化
		int medianNumber = a;
		// medianNumberの値が、b・cの値未満の場合、判断
		if (medianNumber > b && medianNumber > c) {
			// cの値がb以下の場合、判断
			if (c <= b) {
				// medianNumberの値にbの値を代入
				medianNumber = b;
				// bの値がcの値未満の場合、判断
			} else {
				// medianNumberの値にcの値を代入
				medianNumber = c;
			}
		}
		// medianNumberの値が、b・cの値より大きい場合、判断
		if (medianNumber < b && medianNumber < c) {
			// medianNumberの値にcを代入
			medianNumber = c;
			// cの値がb以下の場合、判断
			if (c <= b) {
				// medianNumberの値にcの値を代入
				medianNumber = c;
				// bの値がcの値未満の場合、判断
			} else {
				// medianNumberの値にbの値を代入
				medianNumber = b;
			}
		}
		// medianNumberの値を返す
		return medianNumber;
	}

	/*
	 * 関数名：main
	 * 概要：入力した値の中央値を表示する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：入力値と中央値を表示する
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		//「整数firstNUmber：」を表示し、以降に標準入力を促す
		System.out.print("整数firstNUmber：");
		// 変数firstNUmberを標準入力した値で初期化
		int firstNUmber = standardInput.nextInt();
		//「整数secondNumber：」を表示し、以降に標準入力を促す
		System.out.print("整数secondNumber：");
		// 変数secondNumberを標準入力した値で初期化
		int secondNumber = standardInput.nextInt();
		//「整数thirdNumber：」を表示し、以降に標準入力を促す
		System.out.print("整数thirdNumber：");
		// 変数thirdNumberを標準入力した値で初期化
		int thirdNumber = standardInput.nextInt();

		// medメソッドからの返り値を表示
		System.out.println("中央値は" + med(firstNUmber, secondNumber, thirdNumber) + "です。");
	}

}
