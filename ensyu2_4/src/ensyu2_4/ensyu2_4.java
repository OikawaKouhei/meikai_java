package ensyu2_4;
// java.util.Scannerパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu2_4
 * 概要：演習2_4
 * 作成者：OikawaKouhei
 * 作成日：2023/04/06
 */
public class ensyu2_4 {
	
	/*
	 * 関数名：main関数
	 * 概要：標準入力した数値に10を加減した値を、出力する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：「10を加えた値は" + (resultNumber + 10) + "です。"」
	 * 　　　　　　　　　：「10を減じた値は" + (aresultNumber - 10) + "です。"」
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値：」を画面に出力し、整数値の入力を促すため
		System.out.print("整数値：");
		// 標準入力した数値を、resultNumberに代入する
		int resultNumber = standardInput.nextInt();
		
		// 入力したresultNumberに10を加えた数値を出力するため
		System.out.println("10を加えた値は" + (resultNumber + 10) + "です。");
		// 入力したresultNumberに10を減じた数値を出力するため
		System.out.println("10を減じた値は" + (resultNumber - 10) + "です。");
	}

}
