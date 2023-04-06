package ensyu2_1;
/*
* クラス名：ensyu2_1
* 概要：演習2_1
* 作成者：OikawaKouhei
* 作成日：2023/4/5
*/
public class ensyu2_1 {
	/*
	 * 関数名：main関数
	 * 概要：firstNumberとsecondNumberに少数部をもつ実数値を代入するように変更した場合のプログラムとその考察
	 * 引数：string[] args
	 * 返り値：なし
	 * パラメーターの説明：「firstNumberの値は" + firstNumber + "です。」
	 * 　　　　　　　　　　「secondNumberの値は" + secondNumber + "です。」
	 * 　　　　　　　　　　「合計は" + (firstNumber + secondNumber) + "です。」
	 * 　　　　　　　　　　「平均は" + (firstNumber + secondNumber) / 2 + "です。」
	 */
	public static void main(String[] args) {
		// firstNumberに実数値を代入するために、firstNumberという変数を宣言する
		int firstNumber;
		
		// secondNumberに実数値を代入するために、secondNumberという変数を宣言する
		int secondNumber;
		
		// 変数firstNumberに実数値3.6を代入する
		firstNumber = 3.3;
		
		// 変数secondNumberに実数値6.4を代入する
		secondNumber = 6.7;

		// 画面に、「firstNumberの値は、（firstNumberに代入された値）です。」が出力される。
		System.out.println("firstNumberの値は" + firstNumber + "です。");
		
		// 画面に、「SecondNumberの値は、（SecondNumberに代入された値）です。」が出力される。
		System.out.println("secondNumberの値は" + secondNumber + "です。");
		
		// 画面に、「合計は、（firstNumberとsecondNumberの合計）です。」が出力される。
		System.out.println("合計は" + (firstNumber + secondNumber) + "です。");
		
		// 画面に、「合計は、（firstNumberとsecondNumberの平均）です。」が出力される。
		System.out.println("平均は" + (firstNumber + secondNumber) / 2 + "です。");
	}
}


/*
 * ＜考察＞
 * int型は整数の値しか扱えないためエラーが起きる。
*/

