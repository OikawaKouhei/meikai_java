package ensyu7_15;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_15
 * 概要：配列aの全要素の合計を求めるメソッドを用いて、合計値を表示
 * 　　　一部メソッド名・変数名が教科書準拠のため、コード規約と違います
 * 作成者：OikawaKouhei
 * 作成日：2023/05/01
 */
public class Ensyu7_15 {
	/*
	 * 関数名：sumOf
	 * 概要：配列の全要素の合計を求めるためのメソッド
	 * 引数：int[] a
	 * 返り値：sumNumber
	 * パラメーターの説明：配列を求めるため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int sumOf(int[] a) {
		// 返り値変数sumNumberを、a[0]の値で初期化
		int sumNumber = a[0];
		/*
		 * 【要素の合計値を求めるためのループ文】
		 * 配列のインデックスと繰り返しをするための変数firstCountを1で初期化
		 * firstCountがa.lengthの値未満の間、繰り返しを実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備
		 */
		for(int firstCount = 1 ; firstCount < a.length ; firstCount++) {
			// sumNumberの値にa[firstCount]の要素の値を加算代入
			sumNumber += a[firstCount];
		// sumNumberの値を返り値として返す
		}return sumNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：配列の要素数と要素を入力し、その全要素の合計値を表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 要素数を代入するための変数elementNumberを0で初期化
		int elementNumber = 0;
		
		// 以降の文を実行
		do {
		//「要素数：」を表示
		System.out.print("要素数：");
		// elementNumberの値に、標準入力した値を代入
		elementNumber = standardInput.nextInt();
		// elementNumberの値が1未満の間、do以降から繰り返し実行
		} while(elementNumber < 1);
		// 配列firstElementを、要素数elementNumberの値で生成
		int[] firstElement = new int[elementNumber];
		
		/*
		 * 【要素数分の要素を入力するため】
		 * 配列のインデックスと繰り返しをするための変数firstCountを1で初期化
		 * firstCountがelementNumberの値未満の間、繰り返しを実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備
		 */
		for(int firstCount = 0 ; firstCount < elementNumber ; firstCount++) {
			// 配列のインデックスを表示
			System.out.print("firstElement[" + firstCount + "] =");
			// 各要素数に、標準入力した値を代入
			firstElement[firstCount] = standardInput.nextInt();
		}
		// 配列の全要素の合計値を表示
		System.out.println("配列firstElementの全要素の合計値は" + sumOf(firstElement) + "です。");
	}
	
}
