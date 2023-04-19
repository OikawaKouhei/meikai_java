package ensyu4_26;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_26
 * 概要：演習4_26
 * 作成者：OikawaKouhei
 * 作成日：2023/04/19
 */
public class Ensyu4_26 {
	/*
	 * 関数名：main
	 * 概要：入力した値の合計と平均を求める。また、合計値を求める際、負の数が入力されたとき、
	 * 　　　加算せず読み込まないプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値を加算します。」を表示する
		System.out.println("整数値を加算します。");
		
		// 加算する個数を表すための変数countNumberを、0で初期化
		int countNumber = 0;
		
		// 以降の文を実行
		do {
			//「何個表示しますか：」と表示して、以降に標準入力を促す
			System.out.print("何個表示しますか：");
			// countNumberに入力された数値を代入
			countNumber = standardInput.nextInt();
			// countNumberの値が0以下の場合判断
			if (countNumber <= 0) {
				//「正の整数値を入力してください。」と表示
				System.out.println("正の整数値を入力してください。");
			}
		// 0以下の間、繰り返しdo以降を実行
		} while (countNumber <= 0);
		
		// 合計値を表すための変数sumNumberを0で初期化
		int sumNumber = 0;
		// forの文を繰り返すための変数firstNumberを0で初期化
		int firstNumber = 0 ;
		// 平均の母数を求めるための変数averageNumberを初期化
		int averageNumber = 0;
		
		/*
		 * firstNumberの値がcountNumberの値未満の間、繰り返しを実行
		 * firstNumberをインクリメントして次の繰り返しの準備をする
		 */
		for (; firstNumber < countNumber ; firstNumber++) {
			//「整数：」を表示して以降に入力を促す
			System.out.print("整数：");
			// 加算するための変数pulsNumberを標準入力した値で初期化
			int pulsNumber = standardInput.nextInt();
			// pulsNumberの値が、0未満の場合、判断
			if (pulsNumber < 0) {
				//「負の数は加算しません。」を表示
				System.out.println("負の数は加算しません。");
				// averageNumberの値をインクリメントして、いくつ負の値が入力されたか数える
				averageNumber++ ;
				// 以降の文を飛ばし、forの()内の更新部の評価・実行から行う
				continue;
			}
			// sumNumberの値にpulsNumberの値を足す
			sumNumber += pulsNumber;
		}
		// 求めた合計値を表示
		System.out.println("合計は" + sumNumber + "です。");
		// sumNumberの値が、0でない場合、判断
		if (sumNumber != 0) {
			// 平均値を求めて表示
			System.out.println("平均は" + (sumNumber / ( firstNumber - averageNumber)) + "です。");
		// sumNumberの値が0の場合、判断
		} else {
			// 平均値は0であることを表示
			System.out.println("平均は" + sumNumber + "です。");
		}
	}
	

}
