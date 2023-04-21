package ensyu6_6;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_6
 * 概要：演習6_6
 * 作成者：OikawaKouhei
 * 作成日：2023/04/21
 */
public class Ensyu6_6 {
	/*
	 * 関数名：main
	 * 概要：入力した人数と点数を計算し、合計点・平均点・最高点・最低点を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 人数を表す変数pepoleNumberを初期化
		int pepoleNumber = 0;
		// 合計値を出すための変数sumNumberを初期化
		int sumNumber= 0;
		
		// 以降の文を実行
		do {
			//「人数：」を表示
			System.out.print("人数：");
			// 入力した値をpepoleNumberの値に代入
			pepoleNumber = standardInput.nextInt();
			// pepoleNumberの値が1未満の場合、判断
			if (pepoleNumber < 1) {
				//「正の整数値を入力してください。」を表示
				System.out.println("正の整数値を入力してください。");
			}
		// pepoleNumberの値が1未満の場合、doから繰り返し実行
		} while (pepoleNumber < 1) ;
		
		// 入力された人数を要素数とした、配列testNumberを生成
		int [] testNumber = new int[pepoleNumber];
		
		// 入力された人数に応じて、何人の点数を入力するか表示
		System.out.println(pepoleNumber + "人の点数を入力してください。");
		/*
		 * 【人数に応じた点数を順に入力するためのループ文】
		 * 要素数の指定と、繰り返し処理を行うための変数firstRepeatNumberを0の値で初期化
		 * firstRepeatNumberの値がpepoleNumberの値未満の間、以降の文を繰り返し行う
		 * firstRepeatNumberの値をインクリメントして、繰り返しの実行をする
		 */
		for (int firstRepeatNumber = 0 ; firstRepeatNumber < pepoleNumber ; firstRepeatNumber++) {
			// 以降の文を実行する
			do {
				// 指定した要素数と「番の点数を入力してください。：」を表示
				System.out.print((firstRepeatNumber + 1) + "番の点数を入力してください。：");
				// 指定した要素に標準入力した点数を代入
				testNumber[firstRepeatNumber] = standardInput.nextInt();
				// 「testNumber[firstRepeatNumber] 」に代入された値が0未満の場合、判断
				if (testNumber[firstRepeatNumber] < 0)
					//「負の整数値は入力しないでください。」と表示
					System.out.println("負の整数値は入力しないでください。");
			//「testNumber[firstRepeatNumber] 」に代入された値が0未満の間、do以降から繰り返し実行
			} while (testNumber[firstRepeatNumber] < 0);
			// sumNumberの値にtestNumber[firstRepeatNumber]の値を加算代入
			sumNumber += testNumber[firstRepeatNumber];
		}
		// 改行するため
		System.out.println();
		
		// 最大値を代入するための変数maxNumberをtestNumber[0]で初期化
		int maxNumber = testNumber[0];
		/*
		 * 【入力された点数の最大値を求めるためのループ文】
		 * 要素数の指定と、繰り返し処理を行うための変数secondRepeatNumberを1の値で初期化
		 * secondRepeatNumberの値がtestNumber.lengthの値未満の間、以降の文を繰り返し実行
		 * secondRepeatNumberの値をインクリメントして、繰り返しの実行をする
		 */
		for (int secondRepeatNumber = 1 ; secondRepeatNumber < testNumber.length ; secondRepeatNumber++) {
			// maxNumberの値がtestNumber[secondRepeatNumber]の値未満の場合、判断
			if(testNumber[secondRepeatNumber] > maxNumber) {
				// maxNumberの値にtestNumber[secondRepeatNumber]の値を代入
				maxNumber = testNumber[secondRepeatNumber];
			}
		}
		// 最小値を代入するための変数minimumNumberをtestNumber[0]で初期化
		int minimumNumber = testNumber[0];
		/*
		 * 【入力された点数の最小値を求めるためのループ文】
		 * 要素数の指定と、繰り返し処理を行うための変数thirdRepeatNumberを1の値で初期化
		 * thirdRepeatNumberの値がtestNumber.lengthの値未満の間、以降の文を繰り返し実行
		 * thirdRepeatNumberの値をインクリメントして、繰り返しの実行をする
		 */
		for (int thirdRepeatNumber = 1 ; thirdRepeatNumber < testNumber.length ; thirdRepeatNumber++) {
			// testNumber[thirdRepeatNumber]の値がminimumNumberの値未満の場合、判断
			if(testNumber[thirdRepeatNumber] < minimumNumber) {
				// minimumNumberの値にtestNumber[secondRepeatNumber]の値を代入
				minimumNumber = testNumber[thirdRepeatNumber];
			}
		}
		// 合計点を表示
		System.out.println(pepoleNumber + "人の合計点は"+ sumNumber + "です。");
		// 平均点を表示
		System.out.println(pepoleNumber + "人の平均点は"+ (sumNumber / pepoleNumber) + "です。");
		// 最高点を表示
		System.out.println(pepoleNumber + "人の最高点は"+ maxNumber + "です。");
		// 最低点を表示
		System.out.println(pepoleNumber + "人の最低点は"+ minimumNumber + "です。");
	}

}
