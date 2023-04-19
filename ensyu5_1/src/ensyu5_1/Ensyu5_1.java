package ensyu5_1;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu5_1
 * 概要：演習5_1
 * 作成者：OikawaKouhei
 * 作成日：2023/04/19
 */
public class Ensyu5_1 {
	/*
	 * 関数名：main
	 * 概要：10進数整数を読み込んで、その値を8進数と16進数で表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値：」を表示して、以降に入力を促す
		System.out.print("整数値：");
		// 変数decimalNumberを標準入力した値で初期化
		int decimalNumber = standardInput.nextInt();
		
		// 入力した整数値を、8進数で表示する
		System.out.printf( "8進数では、%oです。\n" , decimalNumber);
		// 入力した整数値を、16進数で表示する
		System.out.printf( "16進数では、%xです。\n" , decimalNumber);
	}

}
