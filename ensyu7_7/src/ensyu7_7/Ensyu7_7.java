package ensyu7_7;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_7
 * 概要：n個の'*'を連続生成するメソッドputStarsを内部で、メソッドputCharsを呼び出すことで
 * 　　　表示できるプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_7 {
	/*
	 * 関数名：putChars
	 * 概要：仮引数cに与えられた文字をn個表示するメソッド
	 * 　　　関数名、変数名は、教本の問題準拠
	 * 引数：char c , int n
	 * 返り値：なし
	 * パラメーターの説明：文字を複数回表すため
	 */
	static void putChars(char c , int n) {
		// nの値をデクリメントし、0より大きい間、判断
		while (n-- > 0) {
			// 文字を表示
			System.out.print(c);
		}
	}
	
	/*
	 * 関数名：putStars
	 * 概要：「*」を表示するためのメソッド
	 * 　　　関数名、変数名は、教本の問題準拠
	 * 引数：int n
	 * 返り値：なし
	 * パラメーターの説明：処理回数を定めるため
	 */
	static void putStars(int n) {
		// putCharsから呼び出し「*」を表示
		putChars('*',n);
	}	
	
	/*
	 * 関数名：main
	 * 概要：「*」を表示するための
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：「*」を表示
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 段数を代入するための変数triangleNumberを0で初期化
		int triangleNumber = 0;
		// 正の整数値以外を入力できないよう判断するための定数LESS_THANを1で初期化
		final int LESS_THAN = 1;
		
		// 以降の文を実行
		do {
		//「左下直角の三角形を表示します。」を表示
		System.out.println("左下直角の三角形を表示します。");
		//「段数は：」を表示
		System.out.print("段数は：");
		// 入力値をtriangleNumberの値に代入
		triangleNumber = standardInput.nextInt();
		// triangleNumberの値がLESS_THAN未満であれば、do以降から繰り返し実行
		} while(triangleNumber < LESS_THAN);
		
		/*
		 * 【左下直角の三角形を生成するためのループ文】
		 * 段数を指定するための変数firstCountを1で初期化
		 * firstCountの値がtriangleNumberの値以下の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、繰り返しの準備をする
		 */
		for (int firstCount = 1 ; firstCount <= triangleNumber ; firstCount++) {
			// putStarsメソッドをfirstCountの値で呼び出す
			putStars(firstCount);
			// 改行する
			System.out.println();
		}
		
	}
}