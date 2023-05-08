package ensyu7_23;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu7_23
* 概要：配列の要素の中で、指定した値が含まれている要素のインデックスを先頭から格納した配列を返却するプログラム
* 作成日：2023/05/08
* 作成者：OikawaKouhei
*/
public class Ensyu7_23 {
	/*
	 * 関数名：arraySrchIdx
	 * 概要：配列の要素の中で、指定した値が含まれている要素のインデックスを先頭から格納した配列を生成するメソッド
	 * 　　　関数名・変数名は教科書準拠のため、規約コードと異なります
	 * 引数：int[] a , int x
	 * 返り値：returnElement
	 * パラメーターの説明：値を探す配列と、探す値
	 * 作成日：2023/05/08
	 * 作成者：OikawaKouhei
	 */
	static int[] arraySrchIdx(int[] a, int x) {
		// xの値が何回見つかるか判断するための変数countElementを0で初期化
		int countElement = 0;
		/*
		 * 【配列aを探査し、目的の値が何個見つかるか判断するためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値がa.lengthの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			// 配列a[firstCount]の要素がxであれば、判断
			if (a[firstCount] == x) {
				// 該当数値が何個あるか数えるためのインクリメント
				countElement++;
			}
		}
		// 返り値とする配列returnElementを要素数countElementで生成
		int[] returnElement = new int[countElement];
		/*
		 * 【配列aを探査し、該当数値があった場合、そのインデックスの値を、配列の要素とするためループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * 配列returnElementのインデックスを表すための変数secondCountを0で初期化
		 * firstCountの値がa.lengthの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0, secondCount = 0; firstCount < a.length; firstCount++) {
			// 配列a[firstCount]の要素がxであれば、判断
			if (a[firstCount] == x) {
				// returnElement[secondCount]の要素として、firstCountの値を代入
				returnElement[secondCount] = firstCount;
				// secondCountの値をインクリメントし、returnElementのインデックスの値を変える
				secondCount++;
			}
		}
		// 配列returnElementを返す
		return returnElement;
	}

	/*
	 * 関数名：main
	 * 概要：二つの配列を生成し、それらの要素を交換して表示
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
		// 要素数を代入するための変数secondElementsを0で初期化
		int secondElements = 0;

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
		// 探す値の入力を促す表示
		System.out.print("探す値：");
		// 探す値を表すserchNumberを入力した値で初期化
		int serchNumber = standardInput.nextInt();

		// secondElementの配列に、メソッドarraySrchIdxで生成した配列を代入
		int[] secondElement = arraySrchIdx(firstElement, serchNumber);

		// secondElementの要素数が0より大きければ判断
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
			// secondElementの要素数が0より大きくない場合
		} else {
			// 該当数値が見つからなかったことを表示
			System.out.println("入力された探す値に該当する要素が配列firstElementにありません。");
		}
	}
}
