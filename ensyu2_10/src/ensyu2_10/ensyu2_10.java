package ensyu2_10;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu2_10
 * 概要：演習2_10
 * 作成者：OikawaKouhei
 * 作成日：2023/04/07
 */
public class ensyu2_10 {
	
	/*
	 * 関数名：main関数
	 * 概要：姓・名の順に入力を促し、最後に「こんにちは + 姓+名 +さん。」と表示する。
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力をするため
		Scanner standardInput = new Scanner(System.in);
		
		// 「姓：」を出力し、そこに姓の入力を促すため
		System.out.print("姓：");
		// 入力した文字列を、変数familyNameに代入するため
		String familyName = standardInput.next();
		
		// 「名：」を出力し、そこに名の入力を促すため
		System.out.print("名：");
		// 入力した文字列を、変数firstNameに代入するため
		String firstName = standardInput.next();
		
		// 入力した、姓と名の文字列を連結して出力するため
		System.out.println("こんにちは" + (familyName + firstName) + "さん。");
	}

}
