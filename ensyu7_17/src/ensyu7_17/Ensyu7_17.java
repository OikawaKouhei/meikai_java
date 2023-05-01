package ensyu7_17;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_17
 * 概要：配列の最も末尾側に位置する要素を見つけるメソッドを用いて、探索するプログラム
 * 　　　一部メソッド名・変数名が教科書準拠のため、コード規約と違います
 * 作成者：OikawaKouhei
 * 作成日：2023/05/01
 */
public class Ensyu7_17 {
	/*
	 * 関数名：linearSearchR
	 * 概要：最も末尾側に位置する要素を見つけるメソッド
	 * 引数：int[] a , int key
	 * 返り値：keyNumber
	 * パラメーターの説明：配列と探索する値を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int linearSearchR(int[] a, int key) {
		// 要素が見つかるとカウントする変数secondCountを0で初期化
		int secondCount = 0;
		// 探査に成功した時、インデックスを代入するため
		int keyIndex = 0;
		// 探査に失敗した時、-1を返り値の値として返すための定数MAINUS_ONEを-1で初期化
		final int MAINUS_ONE = -1;

		/*
		 * 【配列の要素数を探査し、最も末尾にある要素を見つけるためのメソッド】
		 * インデックスと繰り返しを行うための変数firstCountを0で初期化
		 * firstCountの値がa.lengthの値未満の間、繰り返しを実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			// a[firstCount]の要素の値と、keyの値が同じ値か、判断
			if (a[firstCount] == key) {
				// 探査に成功したか判断するために、secondCountの値をインクリメント
				secondCount++;
				// keyIndexの値にfirstCountの値を代入
				keyIndex = firstCount;
			}
		}
		// secondCountの値が、0でなければ判断
		if (secondCount != 0) {
			// keyIndexの値を返り値として、返す
			return keyIndex;
			// そうでない場合、判断
		} else {
			// MAINUS_ONEの値を返り値として、返す
			return MAINUS_ONE;
		}
	}

	/*
	 * 関数名：main
	 * 概要：配列の要素数と要素を入力し、その配列の最も末尾に位置する要素探索し表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 探査に失敗した時、-1を返り値の値として返すための定数MAINUS_ONEを-1で初期化
		final int MAINUS_ONE = -1;

		// 要素数を代入するための変数elementNumberを0で初期化
		int elementNumber = 0;

		// 以降の文を実行
		do {
			//「要素数：」を表示
			System.out.print("要素数：");
			// elementNumberの値に、標準入力した値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberの値が1未満の間、do以降から繰り返し実行
		} while (elementNumber < 1);
		// 配列firstElementを、要素数elementNumberの値で生成
		int[] firstElement = new int[elementNumber];

		/*
		 * 【要素数の値分の要素を入力するため】
		 * 配列のインデックスと繰り返しをするための変数firstCountを1で初期化
		 * firstCountがelementNumberの値未満の間、繰り返しを実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備
		 */
		for (int firstCount = 0; firstCount < elementNumber; firstCount++) {
			// 配列のインデックスを表示
			System.out.print("firstElement[" + firstCount + "] =");
			// 各要素数に、標準入力した値を代入
			firstElement[firstCount] = standardInput.nextInt();
		}

		//「探す値：」を表示
		System.out.print("探す値：");
		// 探査したい値を入力するための変数keyNumberの値を、標準入力した値で初期化
		int keyNumber = standardInput.nextInt();

		// 探査に成功の場合、該当のインデックスの値を代入するための変数indexNumberを、メソッドlinearSearchRの返り値で初期化
		int indexNumber = linearSearchR(firstElement, keyNumber);

		// indexNumberの値が、-1であるか判断
		if (indexNumber == MAINUS_ONE) {
			//「その値は存在しません。」を表示
			System.out.println("その値は存在しません。");
			// それ以外の値の場合
		} else {
			// 該当のインデックスを表示
			System.out.println("その値はfirstElement[" + indexNumber + "]にあります。");
		}
	}
}
