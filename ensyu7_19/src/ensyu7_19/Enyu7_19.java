package ensyu7_19;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_19
 * 概要：配列aから要素a[idx]を先頭とするn個の要素を削除するプログラム
 * 作成日：2023/05/02
 * 作成者：OikawaKouhei
 */
public class Enyu7_19 {
	/*
	 * 関数名：aryRmvN
	 * 概要：配列aから要素a[idx]を先頭とするn個の要素を削除するメソッド
	 * 引数：int[] a , int idx , int n
	 * 返り値：なし
	 * パラメーターの説明：配列aと削除する要素の先頭と、削除個数
	 * 作成日：2023/05/02
	 * 作成者：OikawaKouhei
	 */
	static void aryRmvN(int[] a, int idx, int n) {
		// 定数INDEX_RANGEを1で初期化
		final int INDEX_RANGE = 1;

		// 仮引数の配列の要素をコピーするための配列copyElementを、配列aの要素数で生成
		int[] copyElement = new int[a.length];
		/*
		 * 【配列copyElementに配列aの要素をコピーするためのループ文】
		 * インデックスを表す変数firstCountの値を0で初期化
		 * firstCountの値が配列aの要素数未満の場合、判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			// 配列copyElementに配列aの要素をコピーする
			copyElement[firstCount] = a[firstCount];
		}

		// nの値が1より大きい場合、判断
		if (n > 1) {
			/*
			 * 【配列aから要素a[idx]を先頭とするn個の要素を削除するためのループ文】
			 * インデックスを表すための変数firstCountをidxの値で初期化
			 * firstCountの値が、(idx + n) - INDEX_RANGEの値未満の場合、以降の文を繰り返し実行
			 * firstCountの値を、インクリメントし、次の繰り返しの準備をする
			 */
			for (int firstCount = idx; firstCount <= (idx + n); firstCount++) {
				// firstCount + n値が、配列aの要素数と同じ値となり、かつ要素数が0出ない場合、判断
				if (firstCount + n == a.length) {
					// forぶんを抜け出す
					break;
				}
				// 配列aの要素に、配列copyElementの一つ上のインデックスの要素を代入
				a[firstCount] = copyElement[firstCount + n];
			}
		// そうでない場合、判断
		} else {
			/*
			 * 【指定されたインデックスの要素を削除し、それより後ろの全要素を一つ前方にずらすためのループ文】
			 * インデックスを表す変数firstCountの値を削除する要素のインデックスの値で初期化
			 * firstCountの値が、配列aの要素数-1の値未満の場合、以降の文を繰り返し判断
			 * firstCountの値をインクリメントし、次の繰り返しの準備をする
			 */
			for (int firstCount = idx; firstCount < a.length - 1; firstCount++) {
				// 配列aの要素の値に、配列copyElementの一つ後ろの要素を代入する
				a[firstCount] = copyElement[firstCount + 1];
			}
		}
	}

	/*
	 * 関数名：main
	 * 概要：要素数と要素を入力するためのメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成日：2023/05/02
	 * 作成者：OikawaKouhei
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 要素数を表す変数elementNumberの値を0で初期化
		int elementNumber = 0;
		// 削除したい要素のインデックスを表す変数deleatNumberを0で初期化
		int deleatindex = 0;
		// 削除したい要素の個数を表す変数deleatNumberの値を0で初期化
		int deleatNumber = 0;

		// 以降の文を実行
		do {
			//「要素数：」を表示
			System.out.print("要素数：");
			// elementNumberの値に標準入力した値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberの値が0以下の間、繰り返し実行
		} while (elementNumber <= 0);

		// 配列firstElementを要素数elementNumberで生成
		int[] firstElement = new int[elementNumber];

		/*
		 * 【配列firstElementの要素数を入力するためのループ文】
		 * インデックスを表す変数firstCountの値を0で初期化
		 * firstCountの値がelementNumberの値未満の場合、判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < elementNumber; firstCount++) {
			//「firstElement[firstCount] = 」を表示
			System.out.print("firstElement[" + firstCount + "] = ");
			// 全要素に標準入力した値を代入するため
			firstElement[firstCount] = standardInput.nextInt();
		}

		// 以降の文を実行
		do {
			//「削除の先頭とする要素のインデックス：」を表示
			System.out.print("削除の先頭とする要素のインデックス：");
			// deleatindexの値に標準入力した値を代入
			deleatindex = standardInput.nextInt();
			// deleatindexの値が0以下か、入力した要素数以上の場合、繰り返し実行
		} while (deleatindex < 0 || deleatindex >= elementNumber);

		// 以降の文を実行
		do {
			//「削除する要素個数：」を表示
			System.out.print("削除する要素個数：");
			// deleatNumberの値に標準入力した値を代入
			deleatNumber = standardInput.nextInt();
			// deleatNumberの値が0以下か、deleatindex + deleatNumberの値が、入力した要素数以上の場合、繰り返し実行
		} while (deleatNumber <= 0 || deleatindex + deleatNumber > elementNumber);

		// メソッドaryRmvNを、(firstElement, deleatindex, deleatNumber)を引数をして呼び出す
		aryRmvN(firstElement, deleatindex, deleatNumber);

		//どこの要素から何個削除したか表示
		System.out.println(deleatindex + "の要素から" + deleatNumber + "個削除しました。");
		/*
		 * 【配列firstElementの要素を表示していく】
		 * インデックスを表す変数firstCountの値を0で初期化
		 * firstCountの値がelementNumberの値未満の場合、判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < elementNumber; firstCount++) {
			// 配列firstElementの各要素数を表示
			System.out.println("firstElement[" + firstCount + "] = " + firstElement[firstCount]);
		}
	}
}
