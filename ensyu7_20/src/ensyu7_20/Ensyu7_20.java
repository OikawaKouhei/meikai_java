package ensyu7_20;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_20
 * 概要：配列の指定した要素に、値を挿入するプログラム
 * 作成日：2023/05/02
 * 作成者：OikawaKouhei
 */
public class Ensyu7_20 {
	/*
	 * 関数名：aryIns
	 * 概要：配列aから要素a[idx]にxを挿入するメソッド
	 * 引数：int[] a , int idx , int x
	 * 返り値：なし
	 * パラメーターの説明：配列aと挿入する要素の先頭と、要素の値
	 * 作成日：2023/05/02
	 * 作成者：OikawaKouhei
	 */
	static void aryIns(int[] a, int idx, int x) {
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

		// 配列aのidxにxの値を要素として代入
		a[idx] = x;
		/*
		 * 【要素にxを代入したあと、それに伴って以降の全要素を一つ応報に下げるためのループ文】
		 * インデックスを表す変数firstCountをidxの値で初期化
		 * firstCountの値が(a.length - INDEX_RANGE)の値未満の場合、以降を繰り返し判断
		 * firstCountをインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = idx; firstCount < (a.length - INDEX_RANGE); firstCount++) {
			// a[firstCount + INDEX_RANGE]の要素に、copyElement[firstCount]の要素を代入
			a[firstCount + INDEX_RANGE] = copyElement[firstCount];
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
		// 値を挿入したい要素のインデックスを表す変数deleatIndexを0で初期化
		int deleatIndex = 0;
		// 挿入する値を表す変数elementValueの値を0で初期化
		int elementValue = 0;
		
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
			//「要素を挿入するインデックス：」を表示
			System.out.print("要素を挿入するインデックス：");
			// deleatIndexの値に標準入力した値を代入
			deleatIndex = standardInput.nextInt();
			// deleatIndexの値が0以下か、入力した要素数以上の場合、繰り返し実行
		} while (deleatIndex < 0 || deleatIndex >= elementNumber);
		
		//「要素：」を表示
		System.out.print("要素：");
		// deleatNumberの値に標準入力した値を代入
		elementValue = standardInput.nextInt();
		
		// メソッドaryInsを、(firstElement, deleatIndex, deleatNumber)を引数をして呼び出す
		aryIns(firstElement, deleatIndex, elementValue);
		
		//「入力された要素を挿入しました」
		System.out.println("入力された要素を挿入しました.");
		
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
