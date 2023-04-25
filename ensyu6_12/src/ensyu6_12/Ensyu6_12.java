package ensyu6_12;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_12
 * 概要：演習6_12
 * 作成者：OikawaKouhei
 * 作成日：2023/04/25
 */
public class Ensyu6_12 {
	/*
	 * 関数名：main
	 * 概要：配列の要素の並びをシャッフルするプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を生成するため
		Random randomNumber = new Random();
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 要素数を表す変数elementNumberを0で初期化
		int elementNumber = 0;
		// 正の整数か判断するための定数LESS_THANを1で初期化
		final int LESS_THAN = 1;
		
		// 以降の文を実行
		do {
			//「要素数：」を表示し、以降に整数値の入力を促す
			System.out.print("要素数：");
			// 変数firstElementに入力値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberがLESS_THAN未満の場合、判断
			if (elementNumber < LESS_THAN) {
				//「正の整数値を再度入力してください。」を表示
				System.out.println("正の整数値を再度入力してください。");
			}
		//  elementNumberがLESS_THAN未満の場合または、OVER_ELEVNの値以上の場合、do以降から再度繰り返し実行
		} while (elementNumber < LESS_THAN);
		// 配列firstElementを生成
		int [] firstElement = new int[elementNumber];
		
		// 10以上の乱数を表示するための変数OVER_NUMBERを10で初期化
		final int OVER_NUMBER = 10;
		// 乱数の上限を指定するための変数LIMIT_NUMBERを90で初期化
		final int LIMIT_NUMBER = 90;
		
		/*
		 * 【10から99までの乱数を生成して、各要素に代入するためのループ文】
		 * インデックスを表示し、繰り返しを行うための変数countNumberを0で初期化
		 * countNumberの値が、要素数elementNumberの値未満の間、以降の文を繰り返し実行
		 * countNumberの値をインクリメントし、インデックスの値をかえ、繰り返しの準備をする
		 */
		for (int countNumber = 0 ; countNumber < elementNumber ; countNumber++) {
			// 各要素に、10から99までの乱数を代入する
			firstElement[countNumber] = OVER_NUMBER + randomNumber.nextInt(LIMIT_NUMBER);
			// インデックスに対応した各要素を全て表示
			System.out.println("firstElement[" + countNumber + "] = " + firstElement[countNumber]);
		}
		// インデックスをランダムに指定するための変数randomErementを0の値で初期化
		int randomErement = 0;
		
		/*
		 * 【要素をランダムな順になるようにするためのプログラム】
		 * インデックスを表示し、繰り返しを行うための変数countNumberを0で初期化
		 * countNumberの値が、要素数elementNumberの値未満の間、以降の文を繰り返し実行
		 * countNumberの値をインクリメントし、インデックスの値をかえ、繰り返しの準備をする
		 */
		for (int countNumber = 0 ; countNumber < elementNumber ; countNumber++) {
			// インデックスをランダムに指定するため
			randomErement = randomNumber.nextInt(elementNumber);
			// 保存・置換用の変数exchangeNumberをfirstElement[countNumber]の値で初期化
			int exchangeNumber = firstElement[countNumber];
			// firstElement[countNumber]の値に、firstElement[randomErement]の値を代入
			firstElement[countNumber] = firstElement[randomErement];
			// firstElement[randomErement]の値に、保存しておいた、exchangeNumberの値を代入
			firstElement[randomErement] = exchangeNumber;
		}
		
		//「要素をランダムに並べました。」を表示
		System.out.println("要素をランダムに並べました。");
		/*
		 * 【ランダムに並べた要素を順に表示するためのループ文】
		 * インデックスを表示し、繰り返しを行うための変数countNumberを0で初期化
		 * countNumberの値が、要素数elementNumberの値未満の間、以降の文を繰り返し実行
		 * countNumberの値をインクリメントし、インデックスの値をかえ、繰り返しの準備をする
		 */
		for (int countNumber = 0 ; countNumber < elementNumber ; countNumber++) {
			// ランダムに並べた要素を順に表示
			System.out.println("elementNumber[" + countNumber + "] = " + firstElement[countNumber]);
		}
	}

}
