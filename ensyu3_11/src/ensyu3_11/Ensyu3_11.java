package ensyu3_11;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu3_11
 * 概要：演習3_11
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class Ensyu3_11 {
	/*
	 * 関数名：main関数
	 * 概要：二つの整数値を読み込み、それらの値の差が10以下であるか、11以上であるか判断するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数A：」を表示し、整数値の入力を促す
		System.out.print("整数A：");
		// 変数firstNumberに、入力した値を代入
		int firstNumber =standardInput.nextInt();
		// 「整数B：」を表示し、整数値の入力を促す
		System.out.print("整数B：");
		// 変数secondNumberに、入力した値を代入
		int secondNumber = standardInput.nextInt();
		
		// 大きいほうの値を、代入するために変数bigNumberを生成し、大きい値がどちらかを判定する
		int bigNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
		// 小さいほうの値を、代入するために変数smallNumberを生成し、小さい値がどちらかを判定する
		int smallNumber = firstNumber < secondNumber ? firstNumber : secondNumber;
		
			
		// 変数bigNumberと変数smallNumberの差が11以上であるかを判断する
		if (bigNumber - smallNumber >= 11)
			// 差が11以上であった場合、「それらの差は11以上です。」と表示する
			System.out.println("それらの差は11以上です。");
		// 変数bigNumberと変数smallNumberの差が10以下であるかを判断する
		else
			// 差が10以下であった場合、「それらの差は10以下です。」と表示する
			System.out.println("それらの差は10以下です。");
		
	}

}
