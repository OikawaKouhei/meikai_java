package ensyu5_2;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu5_2
 * 概要：演習5_2
 * 作成者：OikawaKouhei
 * 作成日：2023/04/20
 */
public class Ensyu5_2 {
	/*
	 * 関数名：main
	 * 概要：float型の変数とdouble型の変数に値を読み込んで、表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「変数xはfloat型で、変数yはdouble型です。」と表示
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		//「変数x：」と表示して、以降に入力を促す
		System.out.print("変数x：");
		// 変数firstNumberを入力した値で初期化
		float firstNumber = standardInput.nextFloat();
		//「変数y：」と表示して、以降に入力を促す
		System.out.print("変数y：");
		// 変数secondNumberを入力した値で初期化
		Double secondNumber = standardInput.nextDouble();
		
		// fioat型で直した変数xの値を表示
		System.out.println("x = " + firstNumber);
		// double型で直した変数yの値を表示
		System.out.println("y = " + secondNumber);
		
	}
}
