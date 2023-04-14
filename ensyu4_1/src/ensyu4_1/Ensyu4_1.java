package ensyu4_1;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：Ensyu3_5
 * 概要：演習3_5
 * 作成者：OikawaKouhei
 * 作成日：2023/04/11
 */
public class Ensyu4_1 {
	/*
	 * 関数名：main
	 * 概要：入力した値を「正」「負」「0」と判断し、それを繰り返し入力・表示できるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 文を繰り返し行うため変数を生成し、初期化
		int retryNumber = 0;
		
		// 以降の文を実行するため
		do {
			// 「整数値：」と出力して、以降に整数値の入力を促す
			System.out.print("整数値：");
			// 変数firstNumberに、入力した値を代入する
			int firstNumber = standardInput.nextInt();
			
			// firstNumberが正の値の場合を判断
			if (firstNumber > 0) {
				// 正の値であれば「その値は正です。」と表示
				System.out.println("その値は正です。");
			// firstNumberが負の値の場合を判断
			} else if (firstNumber < 0) {
				// 負の値であれば「その値は負です。」と表示
				System.out.println("その値は負です。");
			// 0の場合を判断
			} else {
				// 「その値は0です。」と表示
				System.out.println("その値は0です。");
			}
			
			//「もう一度？ 1…Yes／0…No：」と表示し、繰り返し実行するか、数字の入力を促す
			System.out.println("もう一度？ 1…Yes／0…No：");
			// 変数retryNumberに標準入力した値を代入
			retryNumber = standardInput.nextInt();
			// 変数retryNumberに、入力された数値に応じて、何が選択されたか表示するため
			switch (retryNumber) {
			// case 0の場合、「Noが選択されました。」と表示する。
			case 0 : System.out.println("Noが選択されました。");
			// スイッチ分から抜け出す
			break;
			// case 1場合、「Yesが選択されました。」と表示する。
			case 1 : System.out.println("Yesが選択されました。");
			// スイッチ分から抜け出す
			break;
			// defaultの場合、「指定外の数値が入力されました。」と表示する。
			default : System.out.println("指定外の数値が入力されました。");
			// スイッチ分から抜け出す
			break;
			}
		// retryNumberが1である限りdo以降から繰り返し実行
		} while (retryNumber == 1);
		// 「終了します。」と表示
		System.out.println("終了します。");
	}

}
