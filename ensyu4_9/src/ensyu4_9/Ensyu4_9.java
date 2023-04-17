package ensyu4_9;

// java.util.Scanner;を利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_9
 * 概要：演習4_9
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_9 {
	/*
	 * 関数名：main
	 * 概要：正の整数値を読み込んで、1からその値までの積を求めるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 入力した値を代入するための変数imputNumberを宣言
		int imputNumber = 0 ;
		
		// 以降の文を実行するため
		do {
			//「整数値：」を表示して、以降に入力を促す
			System.out.print("整数値：");
			// imputNumberに入力した値を代入
			imputNumber = standardInput.nextInt();
			// imputNumberが、0以下、13以上の値の場合、判断
			if (imputNumber <= 0 || imputNumber >= 13) {
				//「1以上12以下の整数値を入力してください。」を表示して、再度入力を促す
				System.out.println("1以上12以下の整数値を入力してください。");
			}
		// imputNumberが、0以下、13以上の値の場合、繰り返しdo以降から実行
		} while (imputNumber <= 0 || imputNumber >= 13);

		// 積の合計値を求めるための変数sumNumberを初期化
		int sumNumber = 1 ;
		// 繰り返しを実行するための変数repetitionNumberを初期化
		int repetitionNumber = 1 ;

		// repetitionNumberがimputNumber以下の場合、以降の文を繰り返し実行
		while (repetitionNumber <= imputNumber) {
			// sumNumberにrepetitionNumberの値を掛けて代入し、合計値を出す
			sumNumber *= repetitionNumber ;
			// repetitionNumberをインクリメントして、次の値を掛けられるようにする
			repetitionNumber++ ;
		}
	// 計算した積の合計値を表示する
	System.out.println("1から" + imputNumber + "までの積は" + sumNumber + "です。");
	}
}
