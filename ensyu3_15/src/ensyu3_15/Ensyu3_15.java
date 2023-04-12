package ensyu3_15;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu3_15
 * 概要：演習3_15
 * 作成者：OikawaKouhei
 * 作成日：2023/04/11
 */
public class Ensyu3_15 {
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込み降順(大きい順)にソートするプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		//「整数値A：」を表示し、以降に整数値の入力を促す
		System.out.print("整数値A：");
		// 入力された値で初期化するために、変数firstNumberを生成
		int firstNumber = standardInput.nextInt();
		//「整数値B：」を表示し、以降に指数値の入力を促す
		System.out.print("整数値B：");
		// 入力された値で初期化するために、変数secondNumberを生成
		int secondNumber = standardInput.nextInt();

		// 二つの値をソートするために、一時保存用の変数toolNumberを宣言し、初期化する
		int toolNumber = 0;

		// 整数Bが整数Aより大きい値だった場合、交換するため判断する
		if (firstNumber < secondNumber) {
			// 現在のfirstNumberの値を保存するため代入する
			toolNumber = firstNumber;
			// secondNumberの値を整数Aとして表示するために代入
			firstNumber = secondNumber;
			// toolNumberの値を整数Bとして表示するために代入
			secondNumber = toolNumber;
		}
		//「A≧Bとなるようにソートしました。」と表示する
		System.out.println("A≧Bとなるようにソートしました。");
		//「整数値A：」の後に、二つの整数値のうち、大きいほうを表示する
		System.out.println("整数値A：" + firstNumber);
		//「整数値B：」の後に、二つの背数値のうち、小さいほうを表示する
		System.out.println("整数値B：" + secondNumber);
	}

}
