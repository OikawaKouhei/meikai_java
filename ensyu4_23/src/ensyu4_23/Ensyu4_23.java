package ensyu4_23;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_23
 * 概要：演習4_23
 * 作成者：OikawaKouhei
 * 作成日：2023/04/18
 */
public class Ensyu4_23 {
	/*
	 * 関数名：main
	 * 概要：段数に応じて10を割ったときの余りの整数値を表示した、ピラミッドを表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パッケージを利用するための宣言
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 段数を入力するための変数inputNumberを0で初期化
		int inputNumber = 0 ;
				
		//「段数に応じて10を割ったときの余りの整数値を表示した、ピラミッドを表示します。」を表示する
		System.out.println("段数に応じて10を割ったときの余りの整数値を表示した、ピラミッドを表示します。");
				
		// 以降の文を実行
		do {
			//「段数は：」を表示し以降に、整数値の入力を促す
			System.out.print("段数は：");
			// inputNumberの値に、標準入力された値を代入
			inputNumber = standardInput.nextInt();
			// inputNumberが0以下の場合、判断
			if (inputNumber <= 0)
			// 正の整数値の入力を再度促す
			System.out.println("正の整数値を入力してください。");
			// inputNumberの値が0以下の場合、do以降を再度繰り返し実行
			} while (inputNumber <= 0);
		
		/*
		 * 列を表すための変数verticalNumberを1で初期化
		 * verticalNumberの値がinputNumberの値以下の場合、以降の文を繰り返し実行
		 * verticalNumberの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int verticalNumber = 1 ; verticalNumber <= inputNumber ; verticalNumber++) {
			/*
			 * 半角スペースを表すための変数spaceNumberを「inputNumber - 1」の値で初期化
			 * spaceNumberの値がinputNumberの値以上の場合、以降の文を繰り返し実行
			 * spaceNumberの値をデクリメントし、次の繰り返しの準備をする
			 */
			for (int spaceNumber = inputNumber - 1 ; spaceNumber >= verticalNumber ; spaceNumber-- ) {
				// ピラミッド型を作るため「 」を表示
				System.out.print(" ");	
			/*
			 * 行を表すための変数besideNumberを1で初期化
			 * besideNumberの値が「verticalNumber-1) * 2 + 1」以下の場合、以降の文を繰り返し実行
			 * besideNumberの値をインクリメントし、次の繰り返しの準備をする
			 */
			} for (int besideNumber = 1 ; besideNumber <= (verticalNumber - 1) * 2 + 1 ; besideNumber++) {
				// ピラミッドを、行の値÷10の余りの値で表示
				System.out.print(verticalNumber % 10);	
			}
			// その段で、表示したい「*」を表示し終えたら、改行する
			System.out.println();
		}
	}
}
