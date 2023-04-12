package ensyu3_18;
//	java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu3_15
 * 概要：演習3_15
 * 作成者：OikawaKouhei
 * 作成日：2023/04/12
 */
public class Ensyu3_18 {
	/*
	 * 関数名：main
	 * 概要：月を1～12のの整数値として読み込み、それに対応するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するための
		Scanner standardInput =new Scanner(System.in);
		
		//「月を求めます。整数値を入力してください。」と表示し、以降に整数値の入力を促す
		System.out.print("月を求めます。整数値を入力してください。");
		// 入力された値で、変数monthNumberを初期化
		int monthNumber = standardInput.nextInt();
		
		// 以降の流れを複数に分岐するため
		switch(monthNumber) {
			// 1月が入力された場合、「それは冬です」と表示する。スイッチ文を抜け出すため。
			case 1 : System.out.print("それは冬です。"); break;
			// 2月が入力された場合、「それは冬です」と表示する。スイッチ文を抜け出すため。
			case 2 : System.out.print("それは冬です。"); break;
			// 3月が入力された場合、「それは春です」と表示する。スイッチ文を抜け出すため。
			case 3 : System.out.print("それは春です。"); break;
			// 4月が入力された場合、「それは春です」と表示する。スイッチ文を抜け出すため。
			case 4 : System.out.print("それは春です。"); break;
			// 5月が入力された場合、「それは春です」と表示する。スイッチ文を抜け出すため。
			case 5 : System.out.print("それは春です。"); break;
			// 6月が入力された場合、「それは夏です」と表示する。スイッチ文を抜け出すため。
			case 6 : System.out.print("それは夏です。"); break;
			// 7月が入力された場合、「それは夏です」と表示する。スイッチ文を抜け出すため。
			case 7 : System.out.print("それは夏です。"); break;
			// 8月が入力された場合、「それは夏です」と表示する。スイッチ文を抜け出すため。
			case 8 : System.out.print("それは夏です。"); break;
			// 9月が入力された場合、「それは秋です」と表示する。スイッチ文を抜け出すため。
			case 9 : System.out.print("それは秋です。"); break;
			// 10月が入力された場合、「それは秋です」と表示する。スイッチ文を抜け出すため。
			case 10 : System.out.print("それは秋です。"); break;
			// 11月が入力された場合、「それは秋です」と表示する。スイッチ文を抜け出すため。
			case 11 : System.out.print("それは秋です。"); break;
			// 12月が入力された場合、「それは冬です」と表示する。スイッチ文を抜け出すため。
			case 12 : System.out.print("それは冬です。"); break;
			// 該当しない入力がされた場合「エラー」ｔｐ表示する。スイッチ文を抜け出すため。
			default : System.out.print("エラー"); break;
		}
	}

}
