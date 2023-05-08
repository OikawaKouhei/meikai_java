package ensyu7_25;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu7_25
* 概要：配列から指定したインデックスの要素を指定した個数削除し、一つ前方にずらすプログラム
* 作成日：2023/05/08
* 作成者：OikawaKouhei
*/
public class Ensyu7_25 {
	/*
	 * 関数名：arrayRmvOfN
	 * 概要：配列から指定したインデックスの要素を指定した個数削除し、一つ前方にずらすメソッド
	 * 　　　関数名・変数名は教科書準拠のため、規約コードと異なります
	 * 引数：int[] a , int idx , int n
	 * 返り値：returnElement
	 * パラメーターの説明：削除したい要素がある配列と、削除したい要素のインデックス、削除する個数
	 * 作成日：2023/05/08
	 * 作成者：OikawaKouhei
	 */
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		// 返り値のための配列returnElementを要素数a.lengthで生成
		int[] returnElement = new int[a.length - n];

		/*
		 * 【指定されたインデックスの要素を指定個数削除し、ひとつ前にずらすためのループ文】
		 * インデックスを表すための変数firstCountをidxで初期化
		 * firstCountの値が a.length - nの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = idx; firstCount < a.length - n; firstCount++) {
			// a[firstCount]の要素に、a[firstCount + n]の要素を代入
			a[firstCount] = a[firstCount + n];
		}

		/*
		 * 【返り値の配列returnElementに、配列aの各要素を代入するためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値が returnElement.lengthの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < returnElement.length; firstCount++) {
			// returnElement[firstCount]の要素に、a[firstCount]の要素を代入 
			returnElement[firstCount] = a[firstCount];
		}
		// 返り値として配列returnElementを返す
		return returnElement;
	}

	/*
	 * 関数名：main
	 * 概要：配列から指定したインデックスの要素を指定個数削除し、一つ前方にずらしたものを表示するメソッド
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
		// 削除個数を代入するための変数deleatNumberを0で初期化
		int deleatNumber = 0;

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

		// 以降の文を実行
		do {
			//「削除する要素の個数：」を表示
			System.out.print("削除する要素の個数：");
			// deleatNumberの値に、入力した値を代入
			deleatNumber = standardInput.nextInt();
			// deleatNumberの値が、0以下、又は、deleatIndex + deleatNumberの値がfirstElementの要素数以上場合、do以降から繰り返し実行
		} while (deleatNumber <= 0 || deleatIndex + deleatNumber > firstElement.length);

		// 配列secondElementに、メソッドarrayRmvOfNで返された配列を代入
		int[] secondElement = arrayRmvOfN(firstElement, deleatIndex, deleatNumber);

		// secondElementの要素数が0より大きい場合、判断
		if (secondElement.length > 0) {
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
		// secondElementの要素数が0の(全ての要素が削除された)場合、判断
		} else {
			// 全ての要素が削除されたことを表示
			System.out.println("全ての要素が削除されました。");
		}
	}
}
