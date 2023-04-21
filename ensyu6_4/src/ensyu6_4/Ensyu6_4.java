package ensyu6_4;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_4
 * 概要：演習6_4
 * 作成者：OikawaKouhei
 * 作成日：2023/04/21
 */
public class Ensyu6_4 {
	/*
	 * 関数名：main
	 * 概要：配列の全要素に乱数を代入して、縦向きの棒グラフで、表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を生成するため
		Random randomNumber = new Random();
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 要素数を表すための変数inputNumberを0で初期化
		int inputNumber = 0;
		
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
			
		// 乱数の範囲を示すための定数finalRandomを10で初期化する
		final int finalRandom =10; 
		/*
		 * 【 配列に、1から10までの乱数を代入するためのループ文 】
		 * 配列名を指定し、また繰り返しをするための変数firstRepeatNumberを0の値で初期化
		 * firstRepeatNumberの値が、inputNumberの値未満の間、以降の文を繰り返しを実行
		 * firstRepeatNumberをインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstRepeatNumber = 0 ; firstRepeatNumber < inputNumber ; firstRepeatNumber++) {
			// 各配列に、1から10までの乱数を代入
			erementNumber[firstRepeatNumber] = 1 + randomNumber.nextInt(10);
		}
		/*
		 * 【次の行ループ文を実行する列を指定するためのループ文】
		 * 配列名を指定し、また繰り返しをするための変数thirdRepeatNumberを0の値で初期化
		 * 「 」か「*」を表示するか判断するための変数firstNumber10の値で初期化
		 * secondRepeatNumberの値が、inputNumberの値未満の間、以降の文を繰り返しを実行
		 * secondRepeatNumberの値をインクリメントして、次の列に移行するため
		 * firstNumberの値をデクリメントして、以降の文で「 」か「*」を表示するか判断する
		 */
		for (int secondRepeatNumber = 0 , firstNumber = 10; secondRepeatNumber < finalRandom ; secondRepeatNumber++, firstNumber--) {
			/*
			 * 【行の「 」と「*」を表示させていくためのループ文】
			 * 配列名を指定し、また繰り返しをするための変数thirdRepeatNumberを0の値で初期化
			 * thirdRepeatNumberの値が、inputNumberの値未満の間、以降の文を繰り返しを実行
			 * thirdRepeatNumberをインクリメントして、配列番号を指定するため
			 */
			for (int thirdRepeatNumber = 0; thirdRepeatNumber < inputNumber ; thirdRepeatNumber++ ) {
				// 指定された配列に代入された値が、firstNumberの値未満の場合判断
				if (erementNumber[thirdRepeatNumber] < firstNumber) {
					//「 」を表示
					System.out.print(" ");
				// 指定された配列に代入された値が、firstNumberの値以上であれば、判断
				} else if (erementNumber[thirdRepeatNumber] >= firstNumber) {
					//「*」を表示
					System.out.print("*");
				}
			}
			// 次の列へ移行するための改行
			System.out.println();
		}
		/*
		 * 【「_」を表示するためのループ文】
		 * foruthRepeatNumberの値を0の値で初期化
		 * foruthRepeatNumberの値が、inputNumber未満の場合、以降の文を繰り返し実行
		 *  foruthRepeatNumberの値を、インクリメントし、繰り返しの準備をする
		 */
		for (int foruthRepeatNumber = 0 ; foruthRepeatNumber < inputNumber ; foruthRepeatNumber++) {
			//「_」を表示
			System.out.print("_");
		}
		// 改行するため
		System.out.println();
		/*
		 * 【その列のインデックスの値を、10で割った値を表示するためのループ文】
		 * fifthRepeatNumberの値が、inputNumber未満の場合、以降の文を繰り返し実行
		 * fifthRepeatNumberの値をインクリメントし、繰り返しの準備をする
		 */
		for (int fifthRepeatNumber = 0 ; fifthRepeatNumber < inputNumber ; fifthRepeatNumber++) {
			// その列のインデックスの値を、10で割った値を表示
			System.out.print(fifthRepeatNumber % 10);
		}
	}

}
