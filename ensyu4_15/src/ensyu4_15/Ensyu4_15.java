package ensyu4_15;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_15
 * 概要：演習4_15
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_15 {
	/*
	 * 関数名：main
	 * 概要：身長と標準体重を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 開始値を表す変数lowNumberを初期化
		int lowNumber = 0 ;
		// 終了値を表す変数highNumberを初期化
		int highNumber = 0 ;
		// 増分値を表す変数countNumberを初期化
		int countNumber = 0 ;
		
		// 以降の文を実行
		do {
			//「何cmから：」を表示して、以降に入力を促す
			System.out.print("何cmから：");
			// lowNumberの値に入力した値を代入
			lowNumber = standardInput.nextInt();
			// lowNumberの値が100以下の場合を判断
			if (lowNumber <= 100) {
				// 「101以上の数値を再度入力してください」を表示して再度入力を促す
				System.out.println("101以上の数値を再度入力してください");
			}
		// lowNumberの値が100以下の間繰り返し実行
		} while(lowNumber <= 100);
		
		// 以降の文を実行
		do {
			//「何cmまで：」を表示して、以降に入力を促す
			System.out.print("何cmまで：");
			// highNumberの値に入力した値を代入
			highNumber = standardInput.nextInt();
			// highNumberの値が100以下の場合を判断
			if (highNumber <= 100) {
				//「101以上の数値を再度入力してください」を表示して再度入力を促す
				System.out.println("101以上の数値を再度入力してください");
			// highNumberの値がlowNumber以下の場合を判断
			} else if( highNumber <= lowNumber) {
				// 「開始値以下の値のため再度数値を入力して下さい」を表示して再度入力を促す
				System.out.println("開始値以下の値のため再度数値を入力して下さい");
			}
		// highNumberの値が100以下の値、または、highNumberの値がlowNumber以下の間繰り返し実行
		} while(highNumber <= 100 || highNumber <= lowNumber);
		
		// 以降の文を実行
		do {
			//「何cmごと」を表示して、以降に入力を促す
			System.out.print("何cmごと：");
			// countNumberの値に入力した値を代入
			countNumber = standardInput.nextInt();
			// countNumberの値が0以下の場合判断
			if (countNumber <= 0) {
				// 「正の整数値を再度入力してください」を表示して再度入力を促す
				System.out.println("正の整数値を再度入力してください");
			// countNumberの値が「highNumber - lowNumber」の値未満の場合判断
			} else if (countNumber > highNumber - lowNumber) {
				// 「その値では計算できないため再度入力してください」を表示して再度入力を促す
				System.out.println("その値では計算できないため再度入力してください");
			}
		// countNumberの値が0以下、または、countNumberの値が「highNumber - lowNumber」の値未満の場合繰り返し実行
		} while(countNumber <= 0 || countNumber > highNumber - lowNumber);
		
		//「身長 体重」を表示
		System.out.println("身長 体重");
		
		/*
		 * weightNumberの値を「(lowNumber - 100) * 0.9」の値で初期化
		 * lowNumberの値がhighNumber以下の間、以降の文を繰り返し実行
		 * lowNumberにcountNumberを加算して、次の繰り返しの準備をする
		 * weightNumberの値に「(lowNumber - 100) * 0.9」の値を代入
		 */
		for(double weightNumber = (lowNumber - 100) * 0.9 ;lowNumber <= highNumber ; lowNumber += countNumber , weightNumber = (lowNumber - 100) * 0.9) {
			
			// lowNumberとweightNumberの値を表示
			System.out.println(lowNumber + "　" + weightNumber);
		}
	}

}
