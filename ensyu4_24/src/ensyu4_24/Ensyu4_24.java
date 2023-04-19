package ensyu4_24;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_24
 * 概要：演習4_24
 * 作成者：OikawaKouhei
 * 作成日：2023/04/19
 */
public class Ensyu4_24 {
	/*
	 * 関数名：main
	 * 概要：整数値を読み込み、それが素数であるか判定するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値を入力するための変数inputNumberを0で初期化
		int inputNumber = 0 ;
		
		// 以降の文を実行する
		do {
			// 「整数値：」を出力して、以降に整数値の入力を促す
			System.out.print("整数値：");
			// inputNumberの値に、標準入力した値を代入
			inputNumber = standardInput.nextInt();
			// 入力した値が、0以下の場合、判断
			if (inputNumber <= 0) {
				//「正の整数値を入力してください」を表示して、再入力を促す
				System.out.println("正の整数値を入力してください");
			// 入力した値が、2の場合、判断
			} else if (inputNumber == 2) {
				//「その値は、素数です。」を表示
				System.out.println("その値は、素数です。");
			// 入力した値が、1の場合、判断
			} else if(inputNumber == 1) {
				//「その値は、素数ではありません。」と表示
				System.out.println("その値は、素数ではありません。");
			}
		// inputNumberの値が、0以下の場合、do以降を繰り返し実行
		} while(inputNumber <= 0);
		
		/*
		 * 素数の判断するための変数primeNumberを2で初期化
		 * primeNumberの値が、inputNumberの値未満の場合、繰り返し判断
		 * primeNumberの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int primeNumber = 2 ; primeNumber < inputNumber ; primeNumber++ ) {
			// inputNumberの値からprimeNumberの値を割った時の余りが0であれば、判断
			if (inputNumber % primeNumber == 0) {
				//「それは整数ではありません。」と表示する
				System.out.println("それは素数ではありません。");
				// この判断がされた場合、forの繰り返し文を抜け出す
				break;
			// primeNumberの値にプラス１した値と、inputNumberの値が同じ値になった場合、判断
			} else if (primeNumber + 1 == inputNumber) {
				//「それは素数です」を表示
				System.out.println("それは素数です。");
			}
		}
	}

}
