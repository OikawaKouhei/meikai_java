package ensyu15_1;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名；Ensyu15_1
 * 概要：文字列を読み込んで、その文字列を逆順に表示するプログラム
 * 作成者：OikawaKouhei
 * 作成日：202305/22
 */
public class Ensyu15_1 {
	
	/*
	 * 関数名；main
	 * 概要：入力・表示を行うメインメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者；OIkawaKouhei
	 * 作成日：2023/05/22
	 */
	public static void main(String[] args) {
		// 標準入力するための準備
		Scanner standardInput = new Scanner(System.in);
		
		//「文字列：」を表示
		System.out.print("文字列：");
		// String型変数firstStringに、入力した文字列を代入
		String firstString = standardInput.next();
		/*
		 * 「文字列を逆順に出力するためのループ文」
		 * 表す文字が何番目にあるかを表す変数を、(firstStringの文字列の長さ-1)の値で初期化
		 * firstStringの値が、0以上の間繰り返し実行
		 * firstStringの値をデクリメント
		 */
		for (int firstCount = firstString.length() - 1; firstCount >= 0; firstCount--) {
			// firstStringの文字列を、firstCount番目から表示
			System.out.print(firstString.charAt(firstCount));
		}
		
	}

}
