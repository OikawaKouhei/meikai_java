package ensyu3_13;
// java.util.Scannerのパッケージを李輸するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu3_13
 * 概要：演習3_13
 * 作成者：OikawaKouhei
 * 作成日：2023/04/11
 */
public class Ensyu3_13 {
	/*
	 * 関数名：main
	 * 概要：三つの整数値を読み込みその中央値を求めて表示するプログラム
	 * 引数：Strin[] args
	 * 返り値：なし
	 * パラメーターの説明：な4し
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値A：」を表示して、以降に整数値の入力を促す
		System.out.print("整数A：");
		// 変数firstNumberを生成し、入力された値で初期化する
		int firstNumber = standardInput.nextInt();
		//「整数値B：」を表示して、以降に整数値の入力を促す
		System.out.print("整数B：");
		// 変数secondNumberを生成し、入力された値で初期化する
		int secondNumber = standardInput.nextInt();
		//	「整数値C：」を表示して、以降に整数値の入力を促す
		System.out.print("整数C：");
		// 変数thirdNumberを生成し、入力された値で初期化する
		int thirdNumber = standardInput.nextInt();
		
		//	のちに、中央値を代入するために、変数medianNumberを生成し、firstNumberで初期化する
		int medianNumber = firstNumber;
		//	secondNumberがmedianNumberより大きいと判定したら、medianNumberにsecondNumberを代入する
		if (medianNumber < secondNumber) { medianNumber = secondNumber; }
		//	thirdNumberがmedianNumberより大きいと判定したら、medianNumberにthirdNumberを代入する
		if (medianNumber > thirdNumber) { medianNumber = thirdNumber; }
		
		//	最終的に代入されたmedianNumberを中央値として表示する。
		System.out.println("中央値は" + medianNumber + "です。");
	}

}
