package ensyu2_3;

// java.util.Scannerパケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu2_3
 * 概要：演習2_3
 * 作成者：OikawaKouhei
 * 作成日：2023/04/06
 */
public class ensyu2_3 {
	
	/*
	 * 関数名：main関数
	 * 概要：キーボードから入力した数値をそのまま出力する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：「"整数値："」「a + "と入力しましたね。");」
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("整数値：");
		// 標準入力した整数値を、変数resultNumberに代入する
		int resultNumber= standardInput.nextInt();
		
		System.out.println(resultNumber + "と入力しましたね。");
	}	
}
