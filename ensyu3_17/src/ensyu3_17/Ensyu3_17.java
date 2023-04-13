package ensyu3_17;
// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
/*
 * クラス名：Ensyu3_17
 * 概要：演習3_17
 * 作成者：OikawaKouhei
 * 作成日：2023/04/11
 */
public class Ensyu3_17 {
	/*
	 * 関数名：main
	 * 概要：生成される乱数に応じて、グー、チョキ、パーを生成するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を生成するため
		Random randomNumber = new Random();
		// 変数luckyNumberを、0から2で初期化する
		int luckyNumber = randomNumber.nextInt(3);
		
		// 0,1,2の生成された乱数に応じて、グー、チョキ、パーを表示するため、
		switch (luckyNumber) {
			// 0が生成された場合、「グー」と表示する
			case 0 : System.out.print("グー");
			// switch文を抜け出すため
			break;
			// 1が生成された場合、「チョキ」と表示する
			case 1 : System.out.print("チョキ");
			// switch文を抜け出すため
			break;
			// 2が生成された場合、「パー」と表示する
			case 2 : System.out.print("パー");
			// switch文を抜け出すため
			break;
		}
	}

}
