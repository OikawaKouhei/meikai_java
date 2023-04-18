package ensyu4_21_3;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_21_3
 * 概要：演習4_21_3
 * 作成者：OikawaKouhei
 * 作成日：2023/04/18
 */
public class Ensyu4_21_3 {
	/*
	 * 関数名：main
	 * 概要：直角が右上側の直角三角形を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パッケージを利用するための宣言
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 段数を入力するための変数inputNumberを0で初期化
		int inputNumber = 0 ;
		
		//「右上側直角の三角形を表示します。」を表示する
		System.out.println("右上側直角の三角形を表示します。");
		
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
		 * verticalNumberを1で初期化
		 * verticalNumberの値がinputNumberの値以下の場合、以降の文を繰り返す
		 * verticalNumberの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int verticalNumber = 1; verticalNumber <= inputNumber ; verticalNumber++) {
			
			/*
			 * spaceNumberを1で初期化
			 * spaceNumberの値がverticalNumberの値より小さい場合、以降の文を繰り返す
			 * spaceNumberをインクリメントし、次の繰り返しの準備をする
			 */
			for(int spaceNumber = 1 ; spaceNumber < verticalNumber ; spaceNumber++) {
				//「 」を表示し、右上が直角になるようにする
				System.out.print(" ");
			
			/*
			 * besideNumberをinputNumberの値で初期化
			 * besideNumberの値がverticalNumberの値以上の場合、以降の文を繰り返す
			 * besideNumberをデクリメントし、次の繰り返しの準備をする
			 */
			}for(int besideNumber = inputNumber ; besideNumber >= verticalNumber ; besideNumber--) {
				//「*」を表示し、直角三角形をつくる
				System.out.print('*');
			}
			// その段で、表示したい「*」を表示し終えたら、改行する
			System.out.println();
		}	
	}

}
