package ensyu6_13;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_13
 * 概要：演習6_13
 * 作成者：OikawaKouhei
 * 作成日：2023/04/25
 */
public class Ensyu6_13 {
	/*
	 * 関数名：main
	 * 概要：配列のコピーの際、逆順にコピーするプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 要素数を表す変数elementNumberを0で初期化
		int elementNumber = 0;
		// 1未満か案段するためのfinal変数LESS_THANを1で初期化
		final int LESS_THAN = 1;
		
		// 以降の文を実行する
		do {
			//「要素数：」を表示し、以降に表示を促す
			System.out.print("要素数：");
			// elementNumberに入力値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberの値が1未満の場合、判断
			if (elementNumber < LESS_THAN) {
				//「正の整数値を再度入力してください。」を表示
				System.out.println("正の整数値を再度入力してください。");
			}
		// elementNumberの値が1未満の間、do以降から繰り返し実行
		} while (elementNumber < LESS_THAN);
			// 配列firstElementを生成
			int [] firstElement = new int[elementNumber];
			// 配列secondElementを生成
			int [] secoundElement= new int[elementNumber];
			
		
		
		/*
		 * 【配列firstElementに要素を読み込むためのループ文】
		 * インデックスを表示し、繰り返し処理を行うための変数countNumberを0で初期化
		 * countNumberの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * countNumberの値をインクリメントし、次のインデックスの表示と繰り返しの準備をする
		 */
		for (int countNumber = 0 ; countNumber < elementNumber ; countNumber++) {
			// 配列firstElementの各インデックスを表示
			System.out.print("firstElement[" + countNumber + "] = ");
			// 各インデックスに、標準入力した値を代入
			firstElement[countNumber] = standardInput.nextInt();
		}
		
		/*
		 * 【配列secoundElementの各要素に配列firstElementの各要素の値を逆順でコピーするためのループ文】
		 * 配列secoundElementのインデックスを変えるための変数firstCountの値を0で初期化
		 * 配列firstElementのインデックスを変えるための変数secondCountの値を0で初期化
		 * firstCountの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次のインデックスの表示と繰り返しの準備をする
		 * secondCountの値をデクリメントし、次のインデックスの表示と繰り返しの準備をする
		 */
		for (int firstCount = 0 , secondCount = firstElement.length - 1 ;  firstCount < elementNumber ;  firstCount++ , secondCount--) {
			// secoundElement[firstCount]の各要素にfirstElement[secondCount]の各要素を代入
			secoundElement[firstCount] = firstElement[secondCount];
		}
		//「firstElementの要素を、逆順でsecoundElementの要素にコピーしました」を表示
		System.out.println("firstElementの要素を、逆順でsecoundElementの要素にコピーしました");
		
		/*
		 * 【配列secoundElementの各要素を表示するためのループ文】
		 * インデックスを表示し、繰り返し処理をするための変数countNumberの値を0で初期化
		 * countNumberの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * countNumberの値をインクリメントし、次のインデックスの表示と繰り返しの準備をする
		 */
		for (int countNumber = 0 ; countNumber < elementNumber ; countNumber++) {
			// 配列secoundElementの各インデックスと各要素を表示
			System.out.println("secoundElement[" + countNumber + "] = " + secoundElement[countNumber]);
		}
	}

}
