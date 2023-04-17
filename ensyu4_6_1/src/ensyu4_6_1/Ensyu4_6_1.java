package ensyu4_6_1;

//java.utilScannerを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu4_6_1
* 概要：演習4_6_1
* 作成者：OikawaKouhei
* 作成日：2023/04/14
*/
public class Ensyu4_6_1 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ値に応じてアスタリスクを入力するプログラム。
	 * 　　　また、読み込んだ値が1未満の場合、改行文字を出力しないプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「何個表示しますか：」と表示して、以降に数値の入力を促すため
		System.out.print("何個表示しますか：");
		
		// 変数firstNumberを入力された数値で初期化
		int firstNumber = standardInput.nextInt();

		// 繰り返しを実行するための変数asteriskNumberを初期化
		int asteriskNumber = 0 ;
		
		// firstNumberが0より大きい場合を判断
		if (firstNumber > 0) {
			// asteriskNumberがfirstNumberより小さい間、以下の文を繰り返し実行
			while (asteriskNumber < firstNumber) {
				// *を一つ表示
				System.out.print('*');
				// asteriskNumberをインクリメントする
				asteriskNumber++;
			}
			// 改行のため
			System.out.println();
		// firstNumberが0以下の場合を判断
		} else {
			
			// 「正の整数値ではありません。」と表示
			System.out.print("正の整数値ではありません。");

		}

	}

}