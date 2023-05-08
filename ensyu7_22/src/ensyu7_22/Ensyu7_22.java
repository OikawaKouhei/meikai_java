package ensyu7_22;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_22
 * 概要：同じ配列を生成するプログラム
 * 作成日：2023/05/08
 * 作成者：OikawaKouhei
 */
public class Ensyu7_22 {
	/*
	 * 関数名：arrayClone
	 * 概要：引数と同じ配列を生成するメソッド
	 * 　　　関数名・変数名は教科書準拠のため、規約コードと異なります
	 * 引数：int[] a
	 * 返り値：returnElement
	 * パラメーターの説明：生成する配列の元の配列
	 * 作成日：2023/05/08
	 * 作成者：OikawaKouhei
	 */
	static int[] arrayClone(int[] a) {
		// 返り値となる配列returnElementを、要素数a.lengthで生成
		int[] returnElement = new int[a.length];
		/*
		 * 【配列aの要素を配列returnElementにコピーするためのループ文】
		 * インデックスを表す変数firstCountを0で初期化
		 * firstCountの値がa.lengthの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			// 配列aの要素を配列returnElementに代入
			returnElement[firstCount] = a[firstCount];
		}
		// 配列returnElementを返り値として返す
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
		// firstElementと同じ配列を生成
		int[] secondElement = arrayClone(firstElement);

		// 改行ずるため
		System.out.println();
		// 同じ配列を生成したことを表示
		System.out.println("配列firstElementと同じ配列生成しました");

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