package ensyu6_10;

//java.util.Randomのパケージをを利用するための宣言
import java.util.Random;
//java.utl.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu6_10
* 概要：演習6_10
* 作成者：OikawaKouhei
* 作成日：2023/04/24
*/
public class Ensyu6_10 {
	/*
	 * 関数名：main
	 * 概要：連続する要素が同じ値を持つことがないようにした、プログラム
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
		final int LESS_THAN =1;
		// 以降の文を実行
		do {
			//「要素数：」を表示し、以降に整数値の入力を促す
			System.out.print("要素数：");
			// 変数firstElementに入力値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberが1未満の場合、判断
			if (elementNumber < LESS_THAN) {
				//「正の整数値を再度入力してください。」を表示
				System.out.println("正の整数値を再度入力してください。");
			}
		//  elementNumberが1未満の場合、do以降から再度繰り返し実行
		} while(elementNumber < LESS_THAN);
		// 配列firstElementを生成
		int [] firstElement = new int[elementNumber];
		
		// 0から9までの乱数を生成するための定数ORIGINAL_RANDOMを10で初期化
		final int ORIGINAL_RANDOM =10;
		// 乱数を1から10に調整するための定数ORIGINAL_FIRSTを1で初期化
		final int ORIGINAL_FIRST =1;
		
		/*
		 * 【1から10の乱数を各要素に代入するためのループ文】
		 * ループ処理と、要素数を定義するための変数firstCountを0で初期化
		 * 前の要素の値を保存するための変数beforeNumberを0で初期化
		 * firstCountの値が、elementNumberの値未満の間、以降の文をループ処理
		 * firstCountの値をインクリメントし、次のループの準備をする
		 */
		for (int firstCount = 0 , beforeNumber = 0; firstCount < elementNumber; firstCount++) {
			// 以降の文を実行
			do {
				// 各要素に、1から10までの乱数を代入する
				firstElement[firstCount] = randomNumber.nextInt(ORIGINAL_RANDOM) + ORIGINAL_FIRST;
			// beforeNumberの値が、要素の値と同じ場合繰り返し実行
			} while (beforeNumber == firstElement[firstCount]);
			// beforeNumberの値に、要素の値を代入
			beforeNumber = firstElement[firstCount];
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

