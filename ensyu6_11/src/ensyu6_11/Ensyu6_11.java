package ensyu6_11;

//java.util.Randomのパケージをを利用するための宣言
import java.util.Random;
//java.utl.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu6_11
* 概要：演習6_11
* 作成者：OikawaKouhei
* 作成日：2023/04/24
*/
public class Ensyu6_11 {
	/*
	 * 関数名：main
	 * 概要：同じ値が代入されないようにした、プログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 乱数を生成するため
		Random randomNumber = new Random();

		// 要素数を表す変数elementNumberを0で初期化
		int elementNumber = 0;
		// 正の整数か判断するための定数LESS_THANを1で初期化
		final int LESS_THAN = 1;
		// 11以上の値か判断するための定数OVER_ELEVNを11で初期化
		final int OVER_ELEVN = 11;
		
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
			// elementNumberの値がOVER_ELEVN以上の場合、判断
			} else if (elementNumber >= OVER_ELEVN) {
				//「10以下の値を再度入力してください。」を表示
				System.out.println("10以下の値を再度入力してください。");
			}
		//  elementNumberがLESS_THAN未満の場合または、OVER_ELEVNの値以上の場合、do以降から再度繰り返し実行
		} while (elementNumber < LESS_THAN || elementNumber >= OVER_ELEVN);
		// 配列firstElementを生成
		int[] firstElement = new int[elementNumber];

		// 0から9までの乱数を生成するための定数ORIGINAL_RANDOMを10で初期化
		final int ORIGINAL_RANDOM = 10;
		// 乱数を1から10に調整するための定数ORIGINAL_FARSTを1で初期化
		final int ORIGINAL_FARST = 1;
		// 探索するための変数keyNumberを0の値で初期化
		int keyNumber= 0;
		
		int secondCount = 0;
		
		/*
		 * 【1から10の乱数を各要素に代入するためのループ文】
		 * ループ処理と、要素数を定義するための変数firstCountを0で初期化
		 * firstCountの値が、elementNumberの値未満の間、以降の文をループ処理
		 * firstCountの値をインクリメントし、次のループの準備をする
		 */
		for (int firstCount = 0 ; firstCount < elementNumber ; firstCount++) {
			// 以降の文を実行
			do {
				// 各要素に、1から10までの乱数を代入する
				firstElement[firstCount] = randomNumber.nextInt(ORIGINAL_RANDOM) + ORIGINAL_FARST;
				
				// keyNumberの値にfirstElement[firstCount]の値を代入
				keyNumber = firstElement[firstCount];
				// インデックス[0]から走査するためにsecondCountの値に0を代入
				secondCount = 0;
				/*
				 * secondCountの値がfirstCountの値未満の間、以降の文を繰り返し実行
				 * secondCountをインクリメントし、次の繰り返しの準備をする
				 */
				for ( ; secondCount < firstCount ; secondCount++) {
					// firstElement[secondCount]の値が、keyNumberの値と同じであれば判断
					if (firstElement[secondCount] == keyNumber) {
						// for文を抜け出す
						break;
					}
				}
			// beforeNumberの値が、要素の値と同じ場合繰り返し実行
			} while (secondCount < firstCount);
			
		}
		
		/*
		 * 【各要素を順に表示していくためのループ文】
		 * firstCountの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次のループの準備をする
		 */
		for (int firstCount = 0 ; firstCount < elementNumber ; firstCount++) {
			// 各要素のインデックスを表示
			System.out.print("firstElement[" + firstCount + "] = ");
			// 各要素の値を表示
			System.out.println(firstElement[firstCount]);
		}
	}

}
