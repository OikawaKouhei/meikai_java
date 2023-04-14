package ensyu4_2;
// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：Ensyu4_2
 * 概要：演習4_2
 * 作成者：OikawaKouhei
 * 作成日：2023/04/13
 */
public class Ensyu4_2 {
	/*
	 * 関数名：main
	 * 概要：(10から99)を当てさせる《数当てゲーム》のプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 乱数を作成するため
		Random randomNumber = new Random();
		
		// 変数unkouwnNumberを(10以上99以下の)乱数で初期化する
		int unkouwnNumber = randomNumber.nextInt(90) + 10;
		// 答えを入力するための変数answerNumberを初期化する
		int answerNumber = 0;
		
		//「数当てゲームを開始します。」を表示する
		System.out.println("数当てゲームを開始します。");
		//「10～99の数値を当ててください」を表示する
		System.out.println("10～99の数値を当ててください");
		
		// 以降の文を、実行するため
		do {
			//「いくつでしょう？・・・」と表示し、以降に整数値の入力を促す
			System.out.print("いくつでしょう？・・・");
			// 変数answerNumberに入力した値を代入する
			answerNumber = standardInput.nextInt();
		
			// answerNumberに範囲内の数値(9より大きく、100より小さい値)が入力された場合を判断する
			if (answerNumber > 9 && answerNumber < 100 ) {
				// answerNumberがunkouwnNumberより大きい場合を判断する
				if (answerNumber > unkouwnNumber) {
				// 大きい場合、unkouwnNumberがanswerNumberよりも小さい値であることを示す
				System.out.println("さらに下の値です");
				
				// answerNumberがunkouwnNumberより小さい場合を判断する
				}else  if (answerNumber < unkouwnNumber) {
				// 小さい場合、unkouwnNumberがanswerNumberよりも大きい値であることを示す
					System.out.println("さらに上の値です");
				}
			// answerNumberが範囲外の数値だった場合を考える
			} else {
				// 範囲外の数値が入力されたことを表示する
				System.out.println("範囲外の値です。");
			}
		// answerNumberとunkouwnNumberが同じ数値になるまで、do以降の処理を繰り返す
		} while (answerNumber != unkouwnNumber);
		
		// 同じ値であれば、「正解です」を表示する
		System.out.println("正解です。");
	}

}
