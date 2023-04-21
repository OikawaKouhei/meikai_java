package ensyu6_5;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_5
 * 概要：演習6_5
 * 作成者：OikawaKouhei
 * 作成日：2023/04/21
 */
public class Ensyu6_5 {
	/*
	 * 関数名：main
	 * 概要：配列の全要素に乱数を代入して、縦向きの棒グラフで、表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args ) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 要素数を表すための変数inputNumberを0で初期化
		int inputNumber = 0;
		//「,」を表示するかを判断するためのfinal変数piriodNumberを1で初期化
		final int piriodNumber = 1;
		
		// 以降の文を実行する
		do {
			//「要素数：」と表示して、以降に整数値の入力を促す
			System.out.print("要素数：");
			// inputNumberの値に標準入力された値を代入
			inputNumber = standardInput.nextInt();
			// inputNumberの値が1未満の場合、判断
			if (inputNumber < 1) {
			//「正の整数値を再度入力してください」を表示
			System.out.println("正の整数値を再度入力してください");
			}
		// inputNumberの値が1未満の場合、do以降から繰り返し実行
		} while (inputNumber < 1);
		// 配列変数erementNumberを宣言し、配列本体を生成する
		int [] erementNumber = new int[inputNumber];
		
		
		/*
		 * 【各配列に標準入力した値を代入するためのループ文】
		 * インデックスを表示し、繰り返し処理を行うための変数firstRepeatNumberを0の値で初期化
		 * firstRepeatNumberの値がinputNumberの値未満の場合、以降の文を繰り返し実行
		 * firstRepeatNumberの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstRepeatNumber = 0 ; firstRepeatNumber < inputNumber ; firstRepeatNumber++) {
			// 代入してほしい要素のインデックスを表示する
			System.out.print("erementNumber[" + firstRepeatNumber + "] = ");
			// 標準入力した値を、表示された要素に代入
			erementNumber[firstRepeatNumber] = standardInput.nextInt();
		}
		// 改行するため
		System.out.println();
		//「erementNumber = {」を表示
		System.out.print("erementNumber = {");
		
		/*
		 *【各要素の代入された値を表示するためのループ文】
		 * インデックスを表示し、繰り返し処理を行うための変数secondRepeatNumberを0の値で初期化
		 * secondRepeatNumberの値がinputNumberの値未満の場合、以降の文を繰り返し実行
		 * secondRepeatNumberの値をインクリメントし、繰り返しの準備をする
		 */
		for (int secondRepeatNumber = 0 ; secondRepeatNumber < inputNumber ; secondRepeatNumber++) {
			//「各要素の値を表示」
			System.out.print(erementNumber [secondRepeatNumber]);
			// secondRepeatNumberの値が、「inputNumber - piriodNumber」の値と同じ出ない場合、判断
			if (secondRepeatNumber != inputNumber - piriodNumber) {
				//「,」を表示
				System.out.print(",");
			}
		}
		//「}」を表示
		System.out.print("}");
	}

}
