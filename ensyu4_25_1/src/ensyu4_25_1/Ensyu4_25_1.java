package ensyu4_25_1;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_25_1
 * 概要：演習4_25_1
 * 作成者：OikawaKouhei
 * 作成日：2023/04/19
 */
public class Ensyu4_25_1 {
	/*
	 * 関数名：main
	 * 概要：入力した値の合計と平均を求める。また、0が入力されたらそこで終了するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値を加算します。」を表示する
		System.out.println("整数値を加算します");
		
		// 加算する個数を表すための変数countNumberを、0で初期化
		int countNumber = 0;
		
		// 以降の文を実行
		do {
			//「何個表示しますか：」と表示して、以降に標準入力を促す
			System.out.print("何個表示しますか：");
			// countNumberに入力された数値を代入
			countNumber = standardInput.nextInt();
			// countNumberの値が0以下の場合判断
			if (countNumber <= 0) {
				//「正の整数値を入力してください。」と表示
				System.out.println("正の整数値を入力してください。");
			}
		// 0以下の間、繰り返しdo以降を実行
		} while (countNumber <= 0);
		
		// 合計値を表すための変数sumNumberを0で初期化
		int sumNumber = 0;
		// 平均を求めるための変数averageNumberを0で初期化
		int averageNumber = 0 ;
		/*
		 * averageNumberの値がcountNumberの値未満の間、繰り返しを実行
		 * averageNumberをインクリメントして次の繰り返しの準備をする
		 */
		for (; averageNumber < countNumber ; averageNumber++) {
			//「整数(0で終了)：」を表示して以降に入力を促す
			System.out.print("整数(0で終了)：");
			// 加算するための変数pulsNumberを標準入力した値で代入
			int pulsNumber = standardInput.nextInt();
			// pulsNumberの値が0の場合判断
			if (pulsNumber == 0) {
			// この判断がされた場合、forの繰り返し文を抜け出す
			break;
			}
			// 入力した値のpulsNumberを合計の値sumNumberに足す
			sumNumber += pulsNumber ;
		}
		// 求めた合計を表示
		System.out.println("合計は" + sumNumber + "です。");
		
		// sumNumberの値が、0でない場合、判断
		if (sumNumber != 0) {
			// 平均値を求めて表示
			System.out.println("平均は" + (sumNumber / averageNumber) + "です。");
		// sumNumberの値が0の場合、判断
		} else {
			// 平均値は0であることを表示
			System.out.println("平均は" + sumNumber + "です。");
		}
	}		
}

