package ensyu4_8;

// java.util.Scannerを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_8
 * 概要：演習4_8
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_8 {
	/*
	 * 関数名：main
	 * 概要：正の整数値を読み込んで、その桁数を読み込み、出力する
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 変数inputNumberを標準入力した値で初期化
		int inputNumber = 0 ;

		// do以降の文を実行する
		do {
			//「整数値：」を表示し、以降に入力を促す
			System.out.print("整数値：");
			// inputNumberに入力した値を代入
			inputNumber = standardInput.nextInt();
			// inputNumberが0以下の場合を判断
			if (inputNumber <= 0) {
				//「正の整数値を再度入力してください」を表示し、再度入力を促す
				System.out.println("正の整数値を再度入力してください");
			}
		// inputNumberが0以下の場合、do以降の文を繰り返し実行
		} while(inputNumber <= 0);

		// 桁数をカウントするための変数digitsNumberを初期化する
		int digitsNumber = 0 ;
			// inputNumberが0より大きい場合繰り返し実行
			while (inputNumber > 0) {
				// inputNumberを10で割り、その値をinputNumberに代入する
				inputNumber /= 10 ;
				// digitsNumberをインクリメントして、入力した値の桁数を表示
				digitsNumber ++ ;
			}
		// inputNumberが何桁か表示する
		System.out.print("その値は、" + digitsNumber + "桁です。");
	}
}
