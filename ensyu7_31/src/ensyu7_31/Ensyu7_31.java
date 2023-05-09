package ensyu7_31;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_31
 * 概要：多重定義された各メソッドを用いて、それぞれの絶対値を求めるプログラム
 * 作成者：OikwaKouhei
 * 作成日：2023/05/09
 */
public class Ensyu7_31 {
	
	/*
	 * 関数名：absolute
	 * 概要：int型の整数値の絶対値を求めるメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：int x
	 * 返り値：returnNumber
	 * パラメーターの説明：絶対値を求める整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int absolute(int x) {
		// 返り値を表す変数をxの値で初期化
		int returnNumber = x;
		// returnNumberの値が0未満であれば判断
		if (returnNumber < 0) {
			// returnNumberの値を反転する
			returnNumber = -returnNumber;
		}
		// returnNumberの値を返す
		return returnNumber;
	}
	
	/*
	 * 関数名：absolute
	 * 概要：long型の整数値の絶対値を求めるメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：long x
	 * 返り値：returnNumber
	 * パラメーターの説明：絶対値を求める整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static long absolute(long x) {
		// 返り値を表す変数をxの値で初期化
		long returnNumber = x;
		// returnNumberの値が0未満であれば判断
		if (returnNumber < 0) {
			// returnNumberの値を反転する
			returnNumber = -returnNumber;
		}
		// returnNumberの値を返す
		return returnNumber;
	}
	/*
	 * 関数名：absolute
	 * 概要：float型の実数の絶対値を求めるメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：float x
	 * 返り値：returnNumber
	 * パラメーターの説明：絶対値を求める整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static float absolute(float x) {
		// 返り値を表す変数をxの値で初期化
		float returnNumber = x;
		// returnNumberの値が0未満であれば判断
		if (returnNumber < 0) {
			// returnNumberの値を反転する
			returnNumber = -returnNumber;
		}
		// returnNumberの値を返す
		return returnNumber;
	}
	/*
	 * 関数名：absolute
	 * 概要：double型の実数値の絶対値を求めるメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：double x
	 * 返り値：returnNumber
	 * パラメーターの説明：絶対値を求める整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static double absolute(double x) {
		// 返り値を表す変数をxの値で初期化
		double returnNumber = x;
		// returnNumberの値が0未満であれば判断
		if (returnNumber < 0) {
			// returnNumberの値を反転する
			returnNumber = -returnNumber;
		}
		// returnNumberの値を返す
		return returnNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：入力した値を絶対値にして表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：絶対値を求める整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	public static void main(String[] args) {
		// 標準入力する準備
		Scanner standardInput = new Scanner(System.in);
		
		//「int型の整数：」を表示
		System.out.print("int型の整数：");
		// firstNumberを入力した値で初期化
		int firstNumber = standardInput.nextInt();
		
		//「long型の整数：」を表示
		System.out.print("long型の整数：");
		// secondNumberを入力した値で初期化
		long secondNumber = standardInput.nextLong();
		
		//「float型の実数：」を表示
		System.out.print("float型の実数：");
		// thirdNumberを入力した値で初期化
		float thirdNumber = standardInput.nextFloat();
		
		//「double型の実数：」を表示
		System.out.print("double型の実数：");
		// forthNumberを入力した値で初期化
		double forthNumber = standardInput.nextDouble();
		
		//「絶対値を求めました。」を表示
		System.out.println("絶対値を求めました。");
		// firstNumberの絶対値を表示
		System.out.println("int型の整数：" + absolute(firstNumber));
		// secondNumberの絶対値を表示
		System.out.println("long型の整数：" + absolute(secondNumber));
		// thirdNumberの絶対値を表示
		System.out.println("float型の実数：" + absolute(thirdNumber));
		// forthNumberの絶対値を表示
		System.out.println("double型の実数：" + absolute(forthNumber));
	}

}
