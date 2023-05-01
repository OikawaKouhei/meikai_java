package ensyu7_12;

// java.util.Scannerのパッケージを利用するため
import java.util.Scanner;

/*
 * クラス名：Ensyu7_12
 * 概要：整数xを右と左に回転するプログラム
 * 　　　メソッド内における関数名・変数名は教科書準拠の部分があるため、一部命名規則に従っていない場合があります
 * 作成者：OikawaKouhei
 * 作成日：2023/04/30
 */
public class Ensyu7_12 {
	/*
	 * 関数名：printBits
	 * 概要：ビット構成を表示するためのメソッド
	 * 引数：int firstNumber
	 * 返り値：なし
	 * パラメーターの説明：ビット表示する整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static void printBits(int firstNumber) {
		// int型整数を0から31ビットまでの計32ビットとして表示するための定数。
		final int MINUS_INT = 31;
		/*
		 * 【整数値をビット表示するための、ループ文】
		 * 
		 * 変数firstCountをint型ビット数minusIntで初期化
		 * firstCountが0以上の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備
		 * 作成者：OikawaKouhei
		 * 作成日：2023/05/01
		 */
		for (int firstCount = MINUS_INT; firstCount >= 0; firstCount--) {
			/*
			 *  firstNumberの値をfirstCountの値分シフトし、
			 *  その値と1が、両方とも1であれば、1(true)を、そうでなければ、0をだす。
			 *  その値が、1かどうか判断する
			 */
			if ((firstNumber >>> firstCount & 1) == 1) {
				//「1」を表示
				System.out.print('1');
				// そうでない場合
			} else if ((firstNumber >>> firstCount & 1) == 0) {
				//「0」を表示
				System.out.print('0');
			}
		}
	}

	/*
	 * 関数名：rRotate
	 * 概要：表示したビットを右に回転するメソッド
	 * 引数：int firstNumbr , int shiftNumber
	 * 返り値：rightRotation
	 * パラメーターの説明：整数値と右シフト数
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int rRotate(int firstNumbr, int shiftNumber) {
		// 返り値rightRotationを0で初期化
		int rightRotation = 0;
		// 値を保存するための変数temporaryNumberを0で初期化
		int temporaryNumber = 0;
		// int型整数を32ビットとして表しているため
		final int ORIGINAL_INT = 32;
		// temporaryNumberに、firstNumbrの値をshiftNumberの値分右シフトした値を代入
		temporaryNumber = firstNumbr >>> shiftNumber;
		// firstNumbrに、firstNumbrの値をORIGINAL_INT - shiftNumber分左シフトした値を代入
		firstNumbr = firstNumbr << ORIGINAL_INT - shiftNumber;
		// rightRotationに、temporaryNumberの値とfirstNumbrの値を論理和で論理演算した値を代入
		rightRotation = temporaryNumber | firstNumbr;
		// 返り値として、rightRotationの値を返す
		return rightRotation;
	}

	/*
	 * 関数名：lRotate
	 * 概要：表示したビットを左に回転するメソッド
	 * 引数：int firstNumbr , int shiftNumber
	 * 返り値：leftRotation
	 * パラメーターの説明：整数値と左シフト数
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int lRotate(int firstNumber, int shiftNumber) {
		// int型整数を32ビットとして表しているため
		final int ORIGINAL_INT = 32;
		// 返り値leftRotationを0で初期化
		int leftRotation = 0;
		// 値を保存するための変数temporaryNumberを0で初期化
		int temporaryNumber = 0;
		// temporaryNumberに、firstNumbrの値をshiftNumberの値分左シフトした値を代入
		temporaryNumber = firstNumber << shiftNumber;
		// firstNumbrに、firstNumbrの値をORIGINAL_INT - shiftNumber分右シフトした値を代入
		firstNumber = firstNumber >>> ORIGINAL_INT - shiftNumber;
		// leftRotationに、temporaryNumberの値とfirstNumbrの値を論理和で論理演算した値を代入
		leftRotation = temporaryNumber | firstNumber;
		// 返り値として、leftRotationの値を返す
		return leftRotation;
	}

	/*
	 * 関数名：main
	 * 概要：入力した整数値とシフト数分、右と左に回転したビットを表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		//「整数値：」を表示
		System.out.print("整数値：");
		// 変数bitsNumberを、標準入力した値で初期化
		int bitsNumber = standardInput.nextInt();
		//「シフト数：」を表示
		System.out.print("シフト数：");
		// 変数shiftNumberを、標準入力した値で初期化
		int shiftNumber = standardInput.nextInt();

		//「整数　　：」を表示
		System.out.print("整数　　：");
		// 入力された整数値をビット表示
		printBits(bitsNumber);
		// 改行
		System.out.println();
		
		//「右に回転：」を表示
		System.out.print("右に回転：");
		// 入力された整数値のビット表示を、右に回転して表示
		printBits(rRotate(bitsNumber, shiftNumber));
		// 改行
		System.out.println();
		// rRotateを整数値表示
		System.out.println("整数表示：" + rRotate(bitsNumber, shiftNumber));
		
		//「左に回転：」を表示
		System.out.print("左に回転：");
		// 入力された整数値のビット表示を、左に回転して表示
		printBits(lRotate(bitsNumber, shiftNumber));
		// 改行
		System.out.println();
		// lRotateを整数値表示
		System.out.println("整数表示：" + lRotate(bitsNumber, shiftNumber));
	}

}