package ensyu2_7;

import java.util.Random;

// java.util.Randomのパッケージを利用するための宣言


/*
 * クラス名：ensyu2_7
 * 概要：演習2_7
 * 作成者：Oikawa kouhei
 * 作成日：2023/04/06
 */
public class ensyu2_7 {
	
	/*
	 * 関数名：main関数
	 * 概要：上から、1以上9以下の乱数、－9以上－1以下の乱数、10以上99以下の乱数を生成
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// r乱数をを取得する
		Random randomNumber = new Random();
		
		// 1以上9以下の範囲の乱数を生成する
		int firstRandom = randomNumber.nextInt(9);
		
		// -9以上-1以下の範囲の乱数生成する
		int secondRandom = randomNumber.nextInt(9);
		
		// 10以上99以下の範囲の乱数を生成するため
		int thirdRandom = randomNumber.nextInt(90);
		
		// 1以上9以下のランダムの値を出力するため
		System.out.println(firstRandom + 1);
		// -9以上-1以下のランダムの値を出力するため
		System.out.println( - (secondRandom + 1));
		//10以上99以下のランダムの値を出力するため
		System.out.println(thirdRandom + 10);
	}

}
