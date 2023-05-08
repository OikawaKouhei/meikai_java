package ensyu7_26;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu7_26
* 概要：配列に指定したインデックスに、要素を新たに挿入し、以降の要素を一つずつ後方にずらすプログラム
* 作成日：2023/05/08
* 作成者：OikawaKouhei
*/
public class Ensyu7_26 {
	/*
	 * 関数名：arrayInsOfN
	 * 概要：配列に指定したインデックスに、要素を新たに挿入し、以降の要素を一つずつ後方にずらすメソッド
	 * 　　　関数名・変数名は教科書準拠のため、規約コードと異なります
	 * 引数：int[] a , int idx , int x
	 * 返り値：returnElement
	 * パラメーターの説明：削除したい要素がある配列と、削除したい要素のインデックス、削除する個数
	 * 作成日：2023/05/08
	 * 作成者：OikawaKouhei
	 */
	static int[] arrayInsOfN(int[] a, int idx, int x) {
		// 返り値のための配列returnElementを要素数a.lengthで生成
		int[] returnElement = new int[a.length + 1];
		/*
		 * 【配列returnElementに配列aの要素を、挿入するインデックスより前の要素を代入するためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値が idxの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < idx; firstCount++) {
			// returnElement[firstCount]の要素に、a[firstCount]の要素を代入
			returnElement[firstCount] = a[firstCount];
		}
		// returnElement[idx]に、xを挿入
		returnElement[idx] = x;
		/*
		 * 【配列returnElementに配列aの要素を、挿入するインデックスより跡の要素を代入するためのループ文】
		 * インデックスを表すための変数firstCountをidx + 1で初期化
		 * firstCountの値が returnElementの要素数の値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = idx + 1; firstCount < returnElement.length; firstCount++) {
			// returnElement[firstCount]の要素に、a[firstCount - 1]の要素を代入
			returnElement[firstCount] = a[firstCount - 1];
		}
		// returnElementの配列を返り値として返す
		return returnElement;
	}

	/*
	 * 関数名：main
	 * 概要：配列に指定したインデックスに、要素を新たに挿入し、以降の要素を一つずつ後方にずらし表示するメソッド
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
		// 要素を挿入したいインデックスの値を代入するための変数insertIndexを0で初期化
		int insertIndex = 0;
		// 挿入したい要素を代入するための変数insertNumberを0で初期化
		int insertNumber = 0;

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
			//「要素を挿入するインデックス：」を表示
			System.out.print("要素を挿入するインデックス：");
			// insertIndexの値に、入力した値を代入
			insertIndex = standardInput.nextInt();
		// insertIndexの値が、firstElementの要素数の範囲でない場合、do以降から繰り返し実行
		} while (insertIndex < 0 || insertIndex >= firstElement.length);

		//「挿入する要素：」を表示
		System.out.print("挿入する要素：");
		// insertNumberの値に、入力した値を代入
		insertNumber = standardInput.nextInt();

		// 配列secondElementに、メソッドarrayRmvOfNで返された配列を代入
		int[] secondElement = arrayInsOfN(firstElement, insertIndex, insertNumber);

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
