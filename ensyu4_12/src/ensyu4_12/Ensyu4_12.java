package ensyu4_12;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_12
 * 概要：演習4_12
 * 作成者：OikawaKohei
 * 作成日：2023/04/17
 */
public class Ensyu4_12 {
	/*
	 * 関数名：main
	 * 概要：0から入力した正の整数値までカウントアップするプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「カウントアップします。」を表示する
		System.out.println("カウントアップします。");
		// 繰り返しを実行するための変数inputNumberを初期化する
		int inputNumber = 0;
		
		// 以下の文を実行する
		do {
			//「正の整数値：」を表示して、以降に整数値の入力を促す
			System.out.print("正の整数値：");
			// inputNumberに標準入力した値を代入する
			inputNumber = standardInput.nextInt();
			// inputNumberが0以下の場合、判断
			if (inputNumber <= 0) {
				System.out.println("正の整数値を再度入力してください。");
			}
		// inputNumberが0以下の場合、do以降を繰り返し判断
		} while (inputNumber <= 0);
		
		/*
		 * カウントアップを表示するための変数を初期化
		 * countNumberがinputNumber以下の場合、以降の文を繰り返し実行
		 * countNumberをインクリメントしてカウントアップする
		 */
		for (int countNumber = 0 ; countNumber <= inputNumber ; countNumber++) {
			// カウントアップした数値を表示
			System.out.println(countNumber);
		}
	}

}
