package ensyu7_2;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_2
 * 概要：最小値を求めるメソッドを作成し、最小値を表示
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_2 {
	/*
	 * 関数名：min
	 * 概要：最小値を求めるメソッド　
	 * 　　　なお、関数名・メソッドの変数名は、指定されているため命名規則から外れての表記
	 * 引数(仮引数)：int a,int b,int c
	 * 返り値： minimumNumber
	 * パラメーター(仮引数)の説明：最小値を代入するためのもの
	 */
	static int min(int a, int b, int c) {
		// 変数minimumNumberをaの値で初期化
		int minimumNumber = a;
		// minimumNumberの値がbの値より大きいか判断
		if (minimumNumber > b)
			// minimumNumberにbの値を代入
			minimumNumber = b;
		// minimumNumberの値がcの値より大きいか判断
		if (minimumNumber > c)
			// minimumNumberにcの値を代入
			minimumNumber = c;
		// minimumNumberの値を返す
		return minimumNumber;
	}

	/*
	 * 関数名：main
	 * 概要：入力した三つの整数値のうち最小値を表示
	 * 引数：String[] arg
	 * 返り値：なし
	 * パラメーターの説明：入力値と最小値を表示するため
	 */
	public static void main(String[] arg) {
		// 標準入力すらため
		Scanner standardInput = new Scanner(System.in);

		//「整数firstNUmber：」を表示し、以降に標準入力を促す
		System.out.print("整数firstNUmber：");
		// 変数firstNUmberを標準入力した値で初期化
		int firstNUmber = standardInput.nextInt();
		//「整数secondNumber：」を表示し、以降に標準入力を促す
		System.out.print("整数secondNumber：");
		// 変数secondNumberを標準入力した値で初期化
		int secondNumber = standardInput.nextInt();
		//「整数thirdNumber：」を表示し、以降に標準入力を促す
		System.out.print("整数thirdNumber：");
		// 変数thirdNumberを標準入力した値で初期化
		int thirdNumber = standardInput.nextInt();
		
		// minメソッドからの返り値を表示
		System.out.println("最小値は" + min(firstNUmber,secondNumber,thirdNumber) + "です。");

	}

}
