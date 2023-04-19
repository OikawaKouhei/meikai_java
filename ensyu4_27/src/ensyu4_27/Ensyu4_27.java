package ensyu4_27;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu4_27
 * 概要：演習4_27
 * 作成者：OikawaKouhei
 * 作成日：2023/04/19
 */
public class Ensyu4_27 {
	/*
	 * 関数名：main
	 * 概要：入力回数に制限のある数当てゲーム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を生成するため
		Random randomNumber = new Random();
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 乱数を代入するための変数answerNumberを初期化
		int answerNumber = randomNumber.nextInt(100);
		
		//「数あてゲームを開始します」を表示
		System.out.println("数あてゲームを開始します");
		//「0から99の数を当ててください」を表示
		System.out.println("0から99の数を10回以内に当ててください");
		
		// 入力値を表示するための変数inputNumberを初期化
		int inputNumber = 0;
		// 回答数をカウントするための変数countNumberを0で初期化
		int countNumber = 0;
		
		// for文のラベル名
		Outer :
			/*
			 * countNumberが10以下の間、以降の文を繰り返し実行
			 * countNumberをインクリメントして、次の繰り返しの準備をする
			 */
			for(; countNumber <= 10 ; countNumber++) {
				// 以降の文を実行する
				do {
					//「いくつかな？・・・」を表示し、以降に数値の入力を促す
					System.out.print("いくつかな？・・・");
					// inputNumberに標準入力した値を代入
					inputNumber = standardInput.nextInt();
					// inputNumberの値が、0より小さく99より大きい場合、判断
					if (inputNumber < 0 || inputNumber > 99) {
						//「0以上99以下の値を入力してください。」を表示
						System.out.println("0以上99以下の値を入力してください。");
						// 以降のif文とdo文の処理を飛ばし、for文のcountNumberの値のインクリメントから実行する
						continue Outer;
					}
					
					// inputNumberの値が、answerNumberの値より大きい場合、判断
					if (inputNumber > answerNumber) {
						//「もっと小さい値です。」と表示
						System.out.println("もっと小さい値です。");
						// 以降のif文とdo文の処理を飛ばし、for文のcountNumberの値のインクリメントから実行する
						continue Outer;
					// inputNumberの値が、answerNumberの値より小さい場合、判断
					} else if (inputNumber < answerNumber) {
						//「もっと大きい値です。」を表示
						System.out.println("もっと大きい値です。");
						// 以降のif文とdo文の処理を飛ばし、for文のcountNumberの値のインクリメントから実行する
						continue Outer;
					}
				// inputNumberの値とanswerNumberの値が、同じ値ではない間、do以降から繰り返し実行
				} while (inputNumber != answerNumber);
				//「正解です」を表示
				System.out.println("正解です。");
				// 以降のfor文を中断する
				break Outer;
			}
		// countNumberの値が、10より大きい場合、判断
		if (countNumber > 10) {
			// 回数制限を超えたことを表示し、正解を表示する
			System.out.println("回数制限を超えました。\n正解は" + answerNumber + "です。");
		}
	}

}
