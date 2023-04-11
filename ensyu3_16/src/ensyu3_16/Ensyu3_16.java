package ensyu3_16;
//	java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：Ensyu3_15
 * 概要：演習3_15
 * 作成者：OikawaKouhei
 * 作成日：2023/04/11
 */
public class Ensyu3_16 {
	/*
	 * 関数名：main
	 * 概要：三つの整数値を読み込んで、昇順(小さい順)にソートするプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		//	標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//	「整数値A：」と表示し、以降に整数値の入力を促す
		System.out.print("整数値A：");
		//	入力された値で初期化するために、変数firstNumberを生成
		int firstNumber = standardInput.nextInt();
		//	「整数値B：」と表示し、以降に整数値の入力を促す
		System.out.print("整数値B：");
		//	入力された値で初期化するために、変数secondNumberを生成
		int secondNumber = standardInput.nextInt();
		//	「整数値C：」と表示し、以降に整数値の入力を促す
		System.out.print("整数値C：");
		//	入力された値で初期化するために、変数thirdNumberを生成
		int thirdNumber = standardInput.nextInt();
		
		//	作業用の変数toolNumberを生成し初期化
		int toolNumber = 0;
		
		//	整数値Aの値が、整数値Bの値よりも大きいか判断する
		if (firstNumber > secondNumber) {
		//	変数firstNumberを保存するため、toolNumberに代入
			toolNumber = firstNumber;
		//	変数firstNumberに変数secondNumberを代入
			firstNumber = secondNumber;
		//	変数secondNumberにtoolNumberを代入
			secondNumber = toolNumber;
		//	整数値Aの値が、整数値Bよりも大きいか判断する
		}	if (firstNumber > thirdNumber) {
				//	変数firstNumberを保存するため、toolNumberに代入
				toolNumber = firstNumber;
				//	変数firstNumberに変数thirdNumberを代入
				firstNumber = thirdNumber;
				//	変数thirdNumberにtoolNumberを代入
				thirdNumber = toolNumber;
				//	整数値Bの値が、整数値Cよりも大きいか判断する
			}	if (secondNumber > thirdNumber) {
					//	変数secondNumberを保存するため、toolNumberに代入
					toolNumber = secondNumber;
					//	変数secondNumberに変数thirdNumberを代入
					secondNumber = thirdNumber;
					//	変数thirdNumberにtoolNumberに代入
					thirdNumber = toolNumber;
				}
		
		//	「昇順になるようにソートしました」と表示
		System.out.println("昇順になるようにソートしました");
		//	数値を上から昇順に表示
		System.out.println("整数値A：" + firstNumber);
		System.out.println("整数値B：" + secondNumber);
		System.out.println("整数値C：" + thirdNumber);
	}

}
