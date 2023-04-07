package ensyu3_1;
// java.util.importのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：ensyu3_1
 * 概要：演習3_1
 * 作成者：OikawaKouhei
 * 作成日：2023/04/07
 */
public class ensyu3_1 {
	/*
	 * 関数名：main関数
	 * 概要：読み込んだ整数値を、絶対値に変換して表示
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値：」を出力し、以降に整数値の入力を促す
		System.out.print("整数値：");
		// 入力した処理を、変数absoluteValueに代入
		int absoluteValue = standardInput.nextInt();
		
		// 変数absoluteValueが0より大きいかを判定するため
		if (absoluteValue > 0)
		// 変数absoluteValueの絶対値を出力するため
		System.out.println("その絶対値は" + absoluteValue + "です。");
		// 変数absoluteValueが0より小さかった場合の判定をするため
		else 
		// 変数absoluteValueの絶対値を出力するため
		System.out.println("絶対値は" + (- absoluteValue) + "です。");
	}

}
