package ensyu4_10;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_10
 * 概要：演習4_10
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_10 {
	/*
	 * 関数名：main
	 * 概要：「*」を読み込んだ数値に応じて表示
	 * 　　　読み込んだ値が1未満であれば改行文字が出ないように出力
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		//「何個*を表示しますか：」を表示して、以降に入力を促す
		System.out.print("何個*を表示しますか：");
		// 変数asteriskNumberを、標準入力した値で初期化する
		int asteriskNumber = standardInput.nextInt();

		// asteriskNumberが0より大きい場合、判断する
		if (asteriskNumber > 0) {
			/*
			 * 繰り返しを実行するための変数firstNumberを初期化する。
			 * firstNumberがasteriskNumberより小さい場合、繰り返し以下の文を実行
			 * firstNumberをインクリメントして、次の繰り返しのための準備をする
			 */
			for (int firstNumber = 0 ; firstNumber < asteriskNumber ; firstNumber++ ) {
				//　firstNumberがasteriskNumberより小さい場合、「*」を表示する
				System.out.print('*');
			// 改行するため
			} System.out.println();
		// asteriskNumberが0より大きくない場合
		} else {
			//「正の整数値を入力してください。」を表示して、再度入力を促す
			System.out.print("正の整数値を入力してください。");
		}
	}
}
