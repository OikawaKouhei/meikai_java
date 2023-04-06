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
	 * パラメーターの説明：「10を加えた値は" + (result + 10) + "です。"」
	 * 　　　　　　　　　：「10を減じた値は" + (aresult - 10) + "です。"」
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("整数値：");
		// 標準入力した数値を、resultに代入する
		int result = standardInput.nextInt();
		
		System.out.println("10を加えた値は" + (result + 10) + "です。");
		System.out.println("10を減じた値は" + (result - 10) + "です。");
	}

}
