package ensyu7_30;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_30
 * 概要：多重定義された各メソッドを用いて、それぞれの最小値を求めるプログラム
 * 作成者：OikwaKouhei
 * 作成日：2023/05/09
 */
public class Ensyu7_30 {
	/*
	 * 関数名：inputNumber
	 * 概要：int型の整数値を入力するためのメソッド
	 * 引数：String tentativeNumber
	 * 返り値：returnNumber
	 * パラメーターの説明：入力する変数名
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int inputNumber(String tentativeNumber) {
		// 標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		// 返り値のための変数を0で初期化
		int returnNumber = 0;
		
		//「tentativeNumber + "の値："」を表示
		System.out.print(tentativeNumber + "の値：");
		// returnNumberに入力値を代入
		returnNumber = standardInput.nextInt();
		// returnNumberの値を返す
		return returnNumber;
	}
	
	/*
	 * 関数名：inputElement
	 * 概要：int型の配列の要素と要素数の値を入力するためのメソッド
	 * 引数：String tentativeElement
	 * 返り値：returnElement
	 * パラメーターの説明：入力する変数名
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int[] inputElement (String tentativeElement) {
		// 標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		// 要素数のための変数を0で初期化
		int elementNumber = 0;
		
		// 以降の文を実行
		do {
			//「tentativeElementの要素数：」を表示
			System.out.print(tentativeElement + "の要素数：");
			// // returnNumberに入力値を代入
			elementNumber = standardInput.nextInt();
		// elementNumberの値が、0以下の間、do以降を繰り返し実行
		} while(elementNumber <= 0);
		
		// 返り値returnElementを、要素数elementNumberの値で生成
		int[] returnElement = new int[elementNumber];
		
		/*
		 * 【配列の各要素を入力していくためのループ文】
		 * インデックスを表すための変数を0で初期化
		 * firstCountの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * firstCountをインクリメントし次の繰り返しの準備
		 */
		for (int firstCount = 0; firstCount < elementNumber; firstCount++) {
			// 要素のインデックスを表示し、以降に要素の入力を促す
			System.out .print(tentativeElement + "[" + firstCount + "] =");
			// returnElementに各要素を代入
			returnElement[firstCount] = standardInput.nextInt();
		}
		// returnElementを返す
		return returnElement;
	}
	
	/*
	 * 関数名：min
	 * 概要：int型の整数値二つの最小値を求めるメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：int a , int b
	 * 返り値：minimumNumber
	 * パラメーターの説明：比較する二つの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int min(int a, int b) {
		// 返り値をaの値で初期化
		int minimumNumber = a;
		
		// minimumNumberの値がbの値より大きければ判断
		if (minimumNumber > b ) {
			// minimumNumberの値に、bの値を代入
			minimumNumber = b;
		}
		// minimumNumberを返す
		return minimumNumber;
	}
	
	/*
	 * 関数名：min
	 * 概要：int型の整数値三つの最小値を求めるメソッド
	 *  　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：int a , int b , int c
	 * 返り値：minimumNumber
	 * パラメーターの説明：比較する三つの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int min(int a, int b , int c) {
		// 返り値をaの値で初期化
		int minimumNumber = a;
		
		// minimumNumberの値がbの値より大きければ判断
		if (minimumNumber > b ) {
			// minimumNumberの値に、bの値を代入
			minimumNumber = b;
		}
		// minimumNumberの値がcの値より大きければ判断
		if (minimumNumber > c) {
			// minimumNumberの値に、bの値を代入
			minimumNumber = c;
		}
		// minimumNumberを返す
		return minimumNumber;
	}
	
	/*
	 * 関数名：min
	 * 概要：int型の配列の要素の値の最小値を求めるメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：int[] a
	 * 返り値：minimumNumber
	 * パラメーターの説明：比較する要素がある配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int min(int[] a) {
		// minimumNumberの値を、a[0]の値で初期化
		int minimumNumber = a[0];
		
		/*
		 * 【配列の要素の最小値を求めるためのループ文】
		 * インデックスを表すための変数を0で初期化
		 * firstCountの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * firstCountをインクリメントし次の繰り返しの準備
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			// minimumNumber値のほうが、aの要素より大きい場合
			if (minimumNumber > a[firstCount]) {
				// minimumNumberの値に、a[firstCount]の値を代入
				minimumNumber = a[firstCount];
			}
		}
		// minimumNumberを返す
		return minimumNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：最小値を表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	public static void main(String[] args) {
		// firstNumberに、メソッドinputNumberで帰ってきた値を代入
		int firstNumber = inputNumber("firstNumber");
		// secondNumberに、メソッドinputNumberで帰ってきた値を代入
		int secondNumber = inputNumber("secondNumber");
		// thirdNumberに、メソッドinputNumberで帰ってきた値を代入
		int thirdNumber = inputNumber("thirdNumber");
		
		//改行する
		System.out.println();
		
		//｛firstNumberとsecondNumberの最小値を求めます。｝を表示
		System.out.println("firstNumberとsecondNumberの最小値を求めます。");
		// firstNumberとsecondNumberの最小値を表示します。
		System.out.println(min(firstNumber , secondNumber) + "です。");
		
		//｛firstNumberとsecondNumber, thirdNumberの最小値を求めます。｝を表示
		System.out.println("firstNumberとsecondNumberとthirdNumberの最小値を求めます。");
		// firstNumberとsecondNumberの最小値を表示します。
		System.out.println(min(firstNumber , secondNumber , thirdNumber) + "です。");
		// 改行するため
		System.out.println();
		
		// 配列firstElementの値にメソッドinputElementの帰ってきた値を第代入
		int[] firstElement = inputElement("firstElement");
		// firstElementの要素の最小値を求めます。を表示
		System.out.println("firstElementの要素の最小値を求めます。");
		// 配列firstElementの最小値を表示
		System.out.println(min(firstElement) + "です。");
		
	}
}
