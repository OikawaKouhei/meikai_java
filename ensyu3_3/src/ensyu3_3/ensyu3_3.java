package ensyu3_3;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_3
 * 概要：演習3_3
 * 作成者：OikawaKouhei
 * 作成日：202304/10
 */
public class ensyu3_3 {
	/*
	 * 関数名：main関数
	 * 概要：List3_5の最後のelseを、if(firstNumber == 0)に変更した場合の検証
	 * 引数：String[]args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「整数値：」を出力して、以降に整数値の入力を促すため
		System.out.print("整数値：");
		// 標準入力された値を変数firstNumberに初期化するため
		int firstNumber = standardInput.nextInt();
		
		// 入力された値が、正の値か判定するため
		if (firstNumber > 0)
		// 正の値と判定された場合、「その値は正です。」と出力するため
			System.out.println("その値は正です。");
		// 入力された値が、正でなかったとき、負の値か判定するため
		else if(firstNumber < 0)
		// 負の値と判定された場合、「その値は負です。」と出力するため
			System.out.println("その値は負です。");
		// 入力された値が、正でも負の値でもなかった時、0と判定するため
		else if(firstNumber == 0);
		// 0の値と判定された場合、「その値は0です。」と出力するため
			System.out.println("その値は0です。");
	}
}

/*
 *	入力した値が0以外であっても、「その値は、0です。」と表示される。
 *	理由としては、if(firstNumber == 0);に変更したことで、「0以上の値」という条件で「その値は正です。」「その値は0です。」となってしまうから。
 */