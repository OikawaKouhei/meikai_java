package ensyu7_5;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_5
 * 概要：「こんにちは。」を表示して改行するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_5 {
	/*
	 * 関数名：hello
	 * 概要：「こんにちは」表示するメソッド
	 * 　　　なお、関数名と変数名は問題指定のため、命名規則に則っていません
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	static void hello() {
		//「こんにちは。」を表示して、改行する
		System.out.print("こんにちは。\n");
	}
	
	/*
	 * 関数名：main
	 * 概要：「こんにちは。」を表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：「こんにちは。」を表示させるためのもの
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// hellメソッドを表示
		hello();
	}

}
