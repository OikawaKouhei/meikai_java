package ensyu2_2;
/*
* クラス名：ensyu2_2
* 概要：演習2_2
* 作成者：OikawaKouhei
* 作成日：2023/04/05
*/
public class ensyu2_2 {

	/*
	 * 関数名：main関数
	 * 概要：変数firstNumber,secondNumber,thirdNumberに5,2,10を代入し、その合計と和を求める。
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：「三つの値の合計は" + (firstNumber + secondNumber + thirdNumber) + "です。」
	 * 　　　　　　　　　　「三つの値の平均は" + (firstNumber + secondNumber + thirdNumber) / 3 + "です。」
	 */
	public static void main(String[] args) {
		// firstNumberに実数値を代入するために、firstNumberという変数を宣言する
		int firstNumber;
		// secondNumberに実数値を代入するために、SecondNumberという変数を宣言する
		int secondNumber;
		// thirdNumberに実数値を代入するために、thirdNumberという変数を宣言する
		int thirdNumber;
		
		// 変数firstNumberに、整数値5を代入する
		firstNumber = 5;
		// 変数secondNumberに、整数値2を代入する
		secondNumber= 2;
		// 変数thirdNumberに、整数値10を代入する
		thirdNumber = 10;
		
		/*
		 * System.out.println("")：「三つの値の合計は" + (firstNumber + secondNumber + thirdNumber) + "です。」を画面に出力する
		 * 
		 */
		System.out.println("三つの値の合計は" + (firstNumber + secondNumber + thirdNumber) + "です。");
		System.out.println("三つの値の平均は" + (firstNumber + secondNumber + thirdNumber) / 3 + "です。");
	}
}
