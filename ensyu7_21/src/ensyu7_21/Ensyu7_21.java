package ensyu7_21;

// java.util.Scannerのパッケージを利用するため宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_21
 * 概要：2つの配列の全要素を入れ替えるプログラム
 * 作成日：2023/05/08
 * 作成者：OikawaKouhei
 */
public class Ensyu7_21 {
	/*
	 * 関数名：aryExchang
	 * 概要：配列の要素を交換するためのメソッド
	 * 　　　関数名・変数名は教科書準拠のため、規約コードと異なります
	 * 引数：int a[] , int b[]
	 * 返り値：無し
	 * パラメーターの説明：交換する二つの配列
	 */
	static void aryExchang(int a[], int b[]) {
		// 交換時の保存用の配列を要素数b.lengthで生成
		int[] tentativeElement = new int[b.length];
		/*
		 * 【配列tentativeElementに配列aの要素をコピーするためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値が配列aの要素数未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			//配列tentativeElementの各要素に配列aの各要素を代入
			tentativeElement[firstCount] = a[firstCount];
		}
		/*
		 * 【配列aに配列bの要素をコピーするためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値が配列aの要素数未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			//配列aの各要素に配列bの各要素を代入
			a[firstCount] = b[firstCount];
		}
		/*
		 * 【配列bに配列tentativeElementの要素をコピーするためのループ文】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値が配列aの要素数未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			//配列bの各要素に配列tentativeElementの各要素を代入
			b[firstCount] = tentativeElement[firstCount];
		}

	}

	/*
	 * 関数名：main
	 * 概要：二つの配列を生成し、それらの要素を交換して表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
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

		// 以降の文を実行
		do {
			//「要素secondElementの要素数：」を表示
			System.out.print("要素secondElementの要素数：");
			// secondElementsの値に標準入力した値を代入
			secondElements = standardInput.nextInt();
			// secondElementsの値が0以下の間、do以降から繰り返し実行
		} while (secondElements <= 0);

		// 配列secondElementを要素数firstElementsで生成
		int[] secondElement = new int[secondElements];

		/*
		 * 【配列secondElementに要素を入力するため】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値がsecondElementsの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < secondElements; firstCount++) {
			// 配列secondElementの各インデックスを表示
			System.out.print("secondElement[" + firstCount + "] = ");
			// 配列secondElementの各インデックスに要素を入力
			secondElement[firstCount] = standardInput.nextInt();
		}
		// 改行ずるため
		System.out.println();

		// firstElementsの値がsecondElementsの値以下の場合、判断
		if (firstElements <= secondElements) {
			// firstElement , secondElementを引数として、メソッドaryExchangを呼び出す
			aryExchang(firstElement, secondElement);
			// secondElementsの値がfirstElementsの値未満の場合、判断
		} else if (firstElements > secondElements) {
			// secondElement , firstElementを引数として、メソッドaryExchangを呼び出す
			aryExchang(secondElement, firstElement);
		}

		// 二つの配列の要素を交換したことを表示
		System.out.println("二つの配列の要素を交換しました。");

		/*
		 * 【配列firstElementに要素を表示するため】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値がfirstElementsの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < firstElements; firstCount++) {
			// 各インデックスの要素を表示
			System.out.println("firstElement[" + firstCount + "] = " + firstElement[firstCount]);
		}
		// 改行ずるため
		System.out.println();

		/*
		 * 【配列secondElementに要素を表示するため】
		 * インデックスを表すための変数firstCountを0で初期化
		 * firstCountの値がsecondElementsの値未満の間、以降の繰り返しをループ
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < secondElements; firstCount++) {
			// 各インデックスの要素を表示
			System.out.println("secondElement[" + firstCount + "] = " + secondElement[firstCount]);
		}
	}

}