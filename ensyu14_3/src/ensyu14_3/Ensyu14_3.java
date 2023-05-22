package ensyu14_3;
//java.util.Scanner1のパッケージを利よ応するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu14_3
* 概要：DVDPlayerクラスをテストするためのクラス
* 作成者；OikawaKouhei
* 作成日：2023/05/21
*/
public class Ensyu14_3 {
	/*
	 * 関数名：main
	 * 概要：テスト用メインメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public static void main(String[] args) {
		// DVDPlayerクラス型を変数名firstRimoconでインスタンス化
		DVDPlayer firstRimocon = new DVDPlayer();
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 範囲を定めるための定数
		final int RANGE_NUMBER = 3;
		// 返り値用の変数を0で初期化
		int outPutNumber = 0;
		// 以降の文を繰り返し実行
		do {
			// どの動作を行わせるか選択指せる表示
			System.out.print("命令してください。\n(1…再生/2…停止/3…スロー)：");
			// outPutNumberの値に入力した値を代入
			outPutNumber = standardInput.nextInt();
			// outPutNumberの値が0以下の場合、判断
			if (outPutNumber < 1 || outPutNumber > RANGE_NUMBER) {
				//「再度正の整数を入力してください。」を表示
				System.out.println("指定された値を入力してください。");
			}
			// outPutNumberの値が0以下、又はRANGE_NUMBERより大きい場合、繰り返し実行
		} while(outPutNumber < 1 || outPutNumber > RANGE_NUMBER);
		
		// outPutNumberの値の時に抜けるスイッチ文
		switch(outPutNumber) {
		// outPutNumberの値が1の時、firstRimoconのplayMotionを呼び出し、文を抜ける
		case 1: firstRimocon.playMotion();break;
		// outPutNumberの値が2の時、firstRimoconのstopMotionを呼び出し、文を抜ける
		case 2: firstRimocon.stopMotion();break;
		// outPutNumberの値が3の時、firstRimoconのslowMotionを呼び出し、文を抜ける
		case 3: firstRimocon.slowMotion();break;
		}
	}
}
