package ensyu6_7;
// java.util.Randomのパケージをを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_7
 * 概要：演習6_7
 * 作成者：OikawaKouhei
 * 作成日：
 */
public class Ensyu6_7 {

	/*
	 * 関数名：main
	 * 概要：線形探索する際、最も末尾に位置する要素を表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 乱数を生成するため
		Random randomNumber = new Random();
		
		// final変数ORIGINAL_NUMBERを、要素数12で初期化
		final int ORIGINAL_NUMBER = 12;
		// 配列firstElementを生成
		int[] firstElement = new int[ORIGINAL_NUMBER];
		/*
		 * 【1から10の乱数を各要素に代入するためのループ文】
		 * ループ処理と、要素数を定義するための変数firstCountを0で初期化
		 * firstCountの値が、ORIGINAL_NUMBERの値12未満の間、以降の文をループ処理
		 * firstCountの値をインクリメントし、次のループの準備をする
		 */
		for (int firstCount = 0; firstCount < ORIGINAL_NUMBER; firstCount++) {
			// 各要素に、0から9までの乱数を代入する
			firstElement[firstCount] = randomNumber.nextInt(10);
			
		}
		// 配列firstElementの全要素の値を以降に表紙
		System.out.print("配列firstElementの全要素の値\n[ ");
		/*
		 * 【各要素数に代入された要素を表示するためのループ文】
		 * ループ処理と、各要素数を表示するための変数secondCountを0で初期化
		 * secondCountの値が、ORIGINAL_NUMBERの値12未満の間、以降の文をループ処理
		 * secondCountの値をインクリメントし、次のループの準備をする
		 */
		for (int secondCount = 0; secondCount < ORIGINAL_NUMBER; secondCount++) {
			// 各要素数を表示
			System.out.print(firstElement[secondCount] + " ");
		}
		//「]」を表示
		System.out.println("]");
		
		//「探す数値：」を表示し以降に整数値の入力を促す
		System.out.print("探す数値：");
		// 探索する数値を代入するための変数keyNumberを初期化
		int keyNumber = standardInput.nextInt();
		
		// ループ処理と、各要素数を表示するための変数thirdCountを0で初期化
		int thirdCount = 0;
		// 探索に成功した値を代入するための変数searchNumberを0で初期化
		int searchNumber = 0;
		
		/*
		 * 【末尾にある該当の要素を探索するためのループ文】
		 * thirdCountの値が、ORIGINAL_NUMBERの値12未満の間、以降の文をループ処理
		 * thirdCountの値をインクリメントし、次のループの準備をする
		 */
		for (; thirdCount < ORIGINAL_NUMBER; thirdCount++) {
			// 要素の値がkeyNumberの値と同じ値か判断
			if (firstElement[thirdCount] == keyNumber) {
				// searchNumberにthirdCountの値を代入
				searchNumber = thirdCount;
			}
		}
		// searchNumberの値が0でない場合、判断
		if (searchNumber != 0) {
			// 該当の要素のインデックスを表示
			System.out.println("それはfirstElement[" + searchNumber + "]にあります。");
		}
		// searchNumberの値が0である場合、判断
		else {
			// 該当するインデックスは見つからあかったことを表示
			System.out.println("それはありません。");
		}
	}

}
