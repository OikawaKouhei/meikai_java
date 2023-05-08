package ensyu7_24;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu7_24
* 概要：配列から指定したインデックスの要素を削除し、一つ前方にずらすプログラム
* 作成日：2023/05/08
* 作成者：OikawaKouhei
*/
public class Ensyu7_24 {
	/*
	 * 関数名：arrayRmvOf
	 * 概要：配列から指定したインデックスの要素を削除し、一つ前方にずらすメソッド
	 * 　　　関数名・変数名は教科書準拠のため、規約コードと異なります
	 * 引数：int[] a , int idx
	 * 返り値：returnElement
	 * パラメーターの説明：削除したい要素がある配列と、削除したい要素のインデックス
	 * 作成日：2023/05/08
	 * 作成者：OikawaKouhei
	 */
	static int[] arrayRmvOf(int[] a, int idx) {
		// 返り値のための配列returnElementを要素数a.length-1で生成
		int[] returnElement = new int[a.length - 1];
		/*
		 * 【指定されたインデックスの要素を削除し、ひとつ前にずらすためのループ文】
		 * インデックスを表すための変数firstCountをidxで初期化
		 * firstCountの値が a.length - 1の値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = idx; firstCount < a.length - 1; firstCount++) {
			// a[firstCount]の要素に、a[firstCount + 1]の要素を代入
			a[firstCount] = a[firstCount + 1];
		}
		/*
		 * 【返り値の配列returnElementに、配列aの各要素を代入するためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値が a.lengthの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length - 1; firstCount++) {
			// returnElement[firstCount]の要素に、a[firstCount]の要素を代入 
			returnElement[firstCount] = a[firstCount];
		}
		// 返り値として配列returnElementを返す
		return returnElement;
	}

	/*
	 * 関数名：main
	 * 概要：配列から指定したインデックスの要素を削除し、一つ前方にずらしたものを表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成日：2023/05/08
	 * 作成者：OikawaKouhei
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 要素数を代入するための変数firstElementsを0で初期化
		int firstElements = 0;
		// 削除したい要素のインデックスの値を代入するための変数deleatIndexを0で初期化
		int deleatIndex = 0;

		// 以降の分を実行
		do {
			//「要素firstElementの要素数：」を表示
			System.out.print("要素firstElementの要素数：");
			// firstElementsの値に標準入力した値を代入
			firstElements = standardInput.nextInt();
		// firstElementsの値が0以下の間、do以降から繰り返し実行
		} while (firstElements <= 0);

		// 配列firstElementを要素数firstElementsで生成
		int[] firstElement = new int[firstElements];

		/*
		 * 【配列firstElementに要素を入力するため】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値がfirstElementsの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < firstElements; firstCount++) {
			// 配列firstElementの各インデックスを表示
			System.out.print("firstElement[" + firstCount + "] = ");
			// 配列firstElementの各インデックスに要素を入力
			firstElement[firstCount] = standardInput.nextInt();
		}
		// 以降の文を実行
		do {
			//「削除する要素のインデックス：」を表示
			System.out.print("削除する要素のインデックス：");
			// deleatIndexの値に、入力した値を代入
			deleatIndex = standardInput.nextInt();
		// deleatIndexの値が、firstElementの要素数の範囲でない場合、do以降から繰り返し実行
		} while (deleatIndex < 0 || deleatIndex >= firstElement.length);

		// 配列secondElementに、メソッドarrayRmvOfで返された配列を代入
		int[] secondElement = arrayRmvOf(firstElement, deleatIndex);

		/*
		 * 【配列secondElementに要素を表示するため】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値がsecondElementsの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < secondElement.length; firstCount++) {
			// 各インデックスの要素を表示
			System.out.println("secondElement[" + firstCount + "] = " + secondElement[firstCount]);
		}
	}
}
