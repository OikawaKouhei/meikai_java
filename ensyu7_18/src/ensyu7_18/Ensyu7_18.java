package ensyu7_18;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Esnyu7_18
 * 概要：配列aから要素a[idx]を削除するプログラム
 * 　　　一部メソッド名・変数名が教科書準拠のため、コード規約と違います
 * 作成日：2023/05/02
 * 作成者：OikawaKouhei
 */
public class Ensyu7_18 {
	/*
	 * 関数名：inputElement
	 * 概要：指定した要素数を削除するためのメソッド
	 * 引数：int[] a , int idx
	 * 返り値：なし
	 * パラメーターの説明：配列と削除する要素を表す引数
	 * 作成日：2023/05/02
	 * 作成者：OikawaKouhei
	 */
	static void aryRmv(int[] a , int idx) {
		// 仮引数の配列の要素をコピーするための配列copyElementを、配列aの要素数で生成
		int[] copyElement = new int [a.length];
		/*
		 * 【配列copyElementに配列aの要素をコピーするためのループ文】
		 * インデックスを表す変数firstCountの値を0で初期化
		 * firstCountの値が配列aの要素数未満の場合、判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < a.length ; firstCount++) {
			// 配列copyElementに配列aの要素をコピーする
			copyElement[firstCount] = a[firstCount];
		}
		/*
		 * 【指定されたインデックスの要素を削除し、それより後ろの全要素を一つ前方にずらすためのループ文】
		 * インデックスを表す変数firstCountの値を削除する要素のインデックスの値で初期化
		 * firstCountの値が、配列aの要素数-1の値未満の場合、以降の文を繰り返し判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = idx ; firstCount < a.length - 1 ; firstCount++) {
			// 配列aの要素の値に、配列copyElementの一つ後ろの要素を代入する
			a[firstCount] = copyElement[firstCount + 1];
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
		int deleatNumber = 0;
		
		// 以降の文を実行
		do {
			//「要素数：」を表示
			System.out.print("要素数：");
			// elementNumberの値に標準入力した値を代入
			elementNumber = standardInput.nextInt();
		// elementNumberの値が0以下の間、繰り返し実行
		} while (elementNumber <= 0);
		
		// 以降の文を実行
		do { 
			//「削除する要素のインデックス：」を表示
			System.out.print("削除する要素のインデックス：");
			// deleatNumberの値に標準入力した値を代入
			deleatNumber = standardInput.nextInt();
		// deleatNumberの値が0以下か、入力した要素数以上の場合、繰り返し実行
		} while (deleatNumber < 0 || deleatNumber >= elementNumber);
		
		// 配列firstElementを要素数elementNumberで生成
		int [] firstElement = new int[elementNumber];
		
		/*
		 * 【配列firstElementの要素数を入力するためのループ文】
		 * インデックスを表す変数firstCountの値を0で初期化
		 * firstCountの値がelementNumberの値未満の場合、判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < elementNumber ; firstCount++) {
			//「firstElement[firstCount] = 」を表示
			System.out.print("firstElement[" + firstCount + "] = ");
			// 全要素に標準入力した値を代入するため
			firstElement[firstCount] = standardInput.nextInt();
		}
		// メソッドaryRmvを引数firstElement、deleatNumberの値で呼び出す
		aryRmv(firstElement , deleatNumber);
		
		//「deleatNumberの要素を削除しました。」を表示
		System.out.println( deleatNumber + "の要素を削除しました。");
		/*
		 * 【配列firstElementの要素を表示していく】
		 * インデックスを表す変数firstCountの値を0で初期化
		 * firstCountの値がelementNumberの値未満の場合、判断
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < elementNumber ; firstCount++) {
			// 配列firstElementの各要素数を表示
			System.out.println("firstElement[" + firstCount + "] = " + firstElement[firstCount]);
		}
	}
	
}
