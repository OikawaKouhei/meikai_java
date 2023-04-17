package ensyu4_16;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_16
 * 概要：演習4_16
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_16 {
	/*
	 * 関数名：main
	 * 概要：入力した数値に応じて、「*」を表示するとともに、5個表示したら改行するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 変数asteriskNumberを初期化
		int asteriskNumber = 0 ;
		
		// 以降の文を実行
		do {
		//「何個「*」を表示しますか・・・」と表示して、以降に入力を促す
		System.out.print("何個「*」を表示しますか・・・");
		// 変数asteriskNumberの値に入力した数値を代入
		asteriskNumber = standardInput.nextInt();
		// asteriskNumberが0以下の場合、判断
		if (asteriskNumber <= 0) {
			// 「正の整数値を入力してください」を表示
			System.out.println("正の整数値を入力してください");
		}
		// asteriskNumberが0以下の場合、do以降を繰り返し実行
		} while(asteriskNumber <= 0);
		
		/*
		 * 変数firstNumberを0で初期化
		 * asteriskNumberの値よりfirstNumberの値が小さければ、以降の文を繰り返し実行
		 * firstNumberの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstNumber = 0 ; firstNumber < asteriskNumber ; firstNumber++) {
			// firstNumberの値が5で割ったとき、余りがないかつ、firstNumberが0出ないとき判断
			if (firstNumber % 5 == 0 && firstNumber != 0) {
				// 改行する
				System.out.println();
			}
			//「*」を一つ表示
			System.out.print('*');
		}
		// 改行する
		System.out.println();
	}

}
