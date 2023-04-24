package ensyu6_8;

// java.utl.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_8
 * 概要：演習6_8
 * 作成者：OikawaKouhei
 * 作成日：2023/04/24
 */
public class Ensyu6_8 {
	/*
	 * 関数名：main
	 * 概要：double型の配列の要素数と全要素の値を読み込み、その値の合計値と平均値を求めるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 要素数を表す変数elementNumberを0で初期化
		int elementNumber = 0;
		
		// 以降の文を実行
		do {
			//「要素数：」を表示し、以降に整数値の入力を促す
			System.out.print("要素数：");
			// 変数firstElementに入力値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberが1未満の場合、判断
			if (elementNumber < 1) {
				//「正の整数値を再度入力してください。」を表示
				System.out.println("正の整数値を再度入力してください。");
			}
		//  elementNumberが1未満の場合、do以降から再度繰り返し実行
		} while(elementNumber < 1);
			// 配列firstElementを生成
			double [] firstElement = new double[elementNumber];
			
		
		/*
		 *【各要素に入力された数値を代入するためのループ処理】
		 * ループ処理をし、インデックスを呼び出すための変数firstCountを0で初期化
		 * firstCountの値がelementNumberの値未満の場合、以降の文を繰り返し行う
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < elementNumber ; firstCount++) {
				// firstElementのインデックスを表示し、どこに要素数を代入しているか判別する
				System.out.print("firstElement[" + firstCount + "] = ");
				// 各要素に入力値を代入する
				firstElement[firstCount] = standardInput.nextDouble();
		}
		
		// 合計値をだすための変数sumNumberを0で初期化
		double sumNumber = 0.0;
		// 平均をだすための変数averageNumberを0で初期化
		double averageNumber = 0.0;
		
		/*
		 *【配列firstElementの走査をするためのループ処理】
		 * 走査において着目している要素を表す変数
		 * どの配列を走査するかを判断するため
		 */
		for (double firstCount : firstElement) {
			// 合計値に、走査した要素を加算代入
			sumNumber += firstCount;
			// 平均の母数を求めるため、averageNumberの値をインクリメント
			averageNumber++;
		}
		// 全要素の和を表示
		System.out.println("全要素の和は" + sumNumber + "です。");
		// 全要素の平均を表示
		System.out.println("全要素の平均は" + (sumNumber / averageNumber) + "です。");
	}

}
