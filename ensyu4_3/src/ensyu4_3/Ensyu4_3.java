package ensyu4_3;
// java.util.Scannerのパッケージを了するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_3
 * 概要：演習4_3
 * 作成者：OikawaKouhei
 * 作成日：2023/04/13
 */
public class Ensyu4_3 {
	/*
	 * 関数名：main
	 * 概要：二つの整数値を読み込み、小さいほうの数値から大きいほうの数値まで順に表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値A：」と表示し、以降に整数値の入力を促す
		System.out.print("整数値A：");
		//　変数firstNumberを入力した数値で初期化
		int firstNumber = standardInput.nextInt();
		//「整数値B：」と表示し、以降に整数値の入力を促す
		System.out.print("整数値B：");
		//　変数secondNumberを入力した数値で初期化
		int secondNumber = standardInput.nextInt();
		
		
		
		// 二つの値を小さい順にソートするため、作業用の変数toolNumberを作成
		int toolNumber = 0;
		// secondNumberより、firstNumberが大きいか判断する
		if(firstNumber > secondNumber) {
			// その場合,toolNumberに、firstNumberを保存のため代入
			toolNumber = firstNumber;
			// firstNumberにsecondNumberを代入
			firstNumber = secondNumber;
			// secondNumberにtoolNumberを代入
			secondNumber = toolNumber;
		}
		
		// 以降の文を繰り返すため
		do {
				// firstNumberに＋1した値を表示
				System.out.print(firstNumber + " ");
				
				// 次の繰り返し処理時に、+1した数値を表示するため
				firstNumber += 1 ;
					
		// firstNumberとsecondNumberが同じ値になるまでdo以降から繰り返す
		} while (firstNumber <= secondNumber);
	}

}
