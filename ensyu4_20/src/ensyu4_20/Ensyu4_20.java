package ensyu4_20;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_20
 * 概要：演習4_20
 * 作成者：OikawaKouhei
 * 作成日：2023/04/18
 */
public class Ensyu4_20 {
	/*
	 * 関数名：main
	 * 概要：入力した値の正方形を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「正方形を作ります」を表示
		System.out.println("正方形を作ります");
		// 入力した値を代入するためにinputNumberを0で初期化
		int inputNumber = 0 ;
		// 以降の文を実行
		do {
			// 「段数は：」を表示して、以降に入力を促す
			System.out.print("段数は：");
			// 変数inputNumberに入力した値を代入
			inputNumber = standardInput.nextInt();
			// inputNumberが0以下の場合、判断
			if (inputNumber <= 0)
				// 正の整数値の再度入力を促す
				System.out.println("正の整数値を再度入力してください。");
		// inputNumberが0以下の間、do以降を繰り返し実行
		} while (inputNumber <= 0);
		
		/*
		 * verticalNumberを1の値で初期化
		 * verticalNumberの値がinputNumberの値以下の場合、以降の文を繰り返し実行
		 * verticalNumberの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int verticalNumber = 1 ; verticalNumber <= inputNumber ; verticalNumber++ ) {
			/*
			 * besideNmberを1の値で初期化
			 * besideNmberの値がinputNumberの値以下の場合、以降の文を繰り返し実行
			 * besideNmberの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int besideNmber = 1 ; besideNmber <= inputNumber ; besideNmber++) {
				//「*」を表示
				System.out.print('*');
			}
			// 行の*の数が、入力した整数値の数になったら改行する
			System.out.println();
		}	
	}
}
