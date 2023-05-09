package ensyu7_32;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu7_32
* 概要：多重定義された各メソッドを用いて、それぞれ整数値をビット表示するプログラム
* 作成者：OikwaKouhei
* 作成日：2023/05/09
*/
public class Ensyu7_32 {
	/*
	 * 関数名：printbits
	 * 概要：byte型整数値をビット表示するメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：byte x
	 * 返り値：なし
	 * パラメーターの説明：ビット表示する、byte型整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static void printbits(byte x) {
		// byte型の表現できる範囲を表すための定数を7で初期化
		final int BYTE_BITS = 7;
		/*
		 * 【ビット表示するためのループ文】
		 * 表示するビット目を表す変数をBYTE_BITSで初期化
		 * firstCountの値が0以上の間、以降の文を繰り返し実行
		 * firstCountの値をデクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = BYTE_BITS; firstCount >= 0; firstCount--) {
			// xの値のfirstCountビット目を最下位ビットまで右シフトし、論利積を行いその値が1であれば、判断
			if ((x >>> firstCount & 1) == 1) {
				//「1」を表示
				System.out.print('1');
			// 0であった場合、判断
			} else {
				//「0」を表示
				System.out.print('0');
			}
		}
	}

	/*
	 * 関数名：printbits
	 * 概要：short型整数値をビット表示するメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：short x
	 * 返り値：なし
	 * パラメーターの説明：ビット表示する、short型整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static void printbits(short x) {
		// short型の表現できる範囲を表すための定数を15で初期化
		int SHORT_BITS = 15;
		/*
		 * 【ビット表示するためのループ文】
		 * 表示するビット目を表す変数をSHORT_BITSで初期化
		 * firstCountの値が0以上の間、以降の文を繰り返し実行
		 * firstCountの値をデクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = SHORT_BITS; firstCount >= 0; firstCount--) {
			// xの値のfirstCountビット目を最下位ビットまで右シフトし、論利積を行いその値が1であれば、判断
			if ((x >>> firstCount & 1) == 1) {
				//「1」を表示
				System.out.print('1');
			// 0であった場合、判断
			} else {
				//「0」を表示
				System.out.print('0');
			}
		}
	}

	/*
	 * 関数名：printbits
	 * 概要：int型整数値をビット表示するメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：int x
	 * 返り値：なし
	 * パラメーターの説明：ビット表示する、int型整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static void printbits(int x) {
		// int型の表現できる範囲を表すための定数を31で初期化
		int INT_BITS = 31;
		/*
		 * 【ビット表示するためのループ文】
		 * 表示するビット目を表す変数をINT_BITSで初期化
		 * firstCountの値が0以上の間、以降の文を繰り返し実行
		 * firstCountの値をデクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = INT_BITS; firstCount >= 0; firstCount--) {
			// xの値のfirstCountビット目を最下位ビットまで右シフトし、論利積を行いその値が1であれば、判断
			if ((x >>> firstCount & 1) == 1) {
				//「1」を表示
				System.out.print('1');
			// 0であった場合、判断
			} else {
				//「0」を表示
				System.out.print('0');
			}
		}
	}

	/*
	 * 関数名：printbits
	 * 概要：long型整数値をビット表示するメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：long x
	 * 返り値：なし
	 * パラメーターの説明：ビット表示する、long型整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static void printbits(long x) {
		// long型の表現できる範囲を表すための定数を63で初期化
		int LONG_BITS = 63;
		/*
		 * 【ビット表示するためのループ文】
		 * 表示するビット目を表す変数をLONG_BITSで初期化
		 * firstCountの値が0以上の間、以降の文を繰り返し実行
		 * firstCountの値をデクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = LONG_BITS; firstCount >= 0; firstCount--) {
			// xの値のfirstCountビット目を最下位ビットまで右シフトし、論利積を行いその値が1であれば、判断
			if ((x >>> firstCount & 1) == 1) {
				//「1」を表示
				System.out.print('1');
			// 0であった場合、判断
			} else {
				//「0」を表示
				System.out.print('0');
			}
		}
	}

	/*
	 * 関数名：main
	 * 概要：入力した値を絶対値にして表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：入力した整数値をビット表示するメソッド
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	public static void main(String[] args) {
		// 標準入力する準備
		Scanner standardInput = new Scanner(System.in);
		
		//「int型の整数：」を表示
		System.out.print("byte型の整数：");
		// firstNumberを入力した値で初期化
		byte firstNumber = standardInput.nextByte();
		
		//「long型の整数：」を表示
		System.out.print("short型の整数：");
		// secondNumberを入力した値で初期化
		short secondNumber = standardInput.nextShort();
		
		//「float型の整数：」を表示
		System.out.print("int型の整数：");
		// thirdNumberを入力した値で初期化
		int thirdNumber = standardInput.nextInt();
		
		//「double型の整数：」を表示
		System.out.print("long型の整数：");
		// forthNumberを入力した値で初期化
		long forthNumber = standardInput.nextLong();
		
		//「各整数値をビット表示します。」
		System.out.println("各整数値をビット表示します。");
		
		//「byte型の整数」を表示
		System.out.println("byte型の整数");
		// firstNumberの値をビット表示
		printbits(firstNumber);
		// 改行する
		System.out.println();
		
		//「short型の整数」を表示
		System.out.println("short型の整数");
		// secondNumberの値をビット表示
		printbits(secondNumber);
		// 改行する
		System.out.println();
		
		//「int型の整数」を表示
		System.out.println("int型の整数");
		// thirdNumberの値をビット表示
		printbits(thirdNumber);
		// 改行する
		System.out.println();
		
		//「long型の整数」を表示
		System.out.println("long型の整数");
		// forthNumberの値をビット表示
		printbits(forthNumber);
		// 改行する
		System.out.println();
	}
}
