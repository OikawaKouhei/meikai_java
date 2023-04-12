package ensyu3_12;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：Ensyu3_12
 * 概要：演習3_12
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class Ensyu3_12 {
	/*
	 * 関数名：main
	 * 概要：入力した三つの整数値の最小値を求めて表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値A：」を表示し、以降に整数値の入力を促す。 
		System.out.print("整数値A：");
		// 入力した値を、変数firstNumberに代入
		int firstNumber = standardInput.nextInt();
		// 「整数値B：」を表示し、以降に整数値の入力を促す。
		System.out.print("整数値B：");
		// 入力した値を、変数secondNumberに代入
		int secondNumber = standardInput.nextInt();
		// 「整数値C：」を表示し、以降に整数値の入力を促す。
		System.out.print("整数値C：");
		// 入力した値を、変数thirdNumberに代入
		int thirdNumber = standardInput.nextInt();
		
		// のちに、最小値を代入するために、変数minimumValueを生成し、firstNumberの値で初期化する
		int minimumNumber = firstNumber;
		// 変数secondNumberが変数minimumValueより小さいと判定したら、変数minimumValueに変数secondNumberの値を代入する
		if (secondNumber < minimumNumber) minimumNumber = secondNumber;
		// 変数thirdNumberが変数minimumValueより小さいと判定したら、変数minimumValueに変数thirdNumberの値を代入する
		if (thirdNumber < minimumNumber) minimumNumber = thirdNumber;
		
		// 最終的に代入された変数minimumValueを、三つの値の最小値として表示する
		System.out.println("最小値は" + minimumNumber + "です。");
	}

}
