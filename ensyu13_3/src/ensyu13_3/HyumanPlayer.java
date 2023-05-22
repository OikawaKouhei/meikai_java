package ensyu13_3;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
* クラス名：HyumanPlayer
* 概要：じゃんけんするプレイヤーを表すクラス
* 作成者：OikawaKouhei
* 作成日：2023/05/19
*/
public class HyumanPlayer extends GamePlayer {
	// プレイヤーの手を表すフィールド変数
	private int handsNumber;
	
	/*
	 * コンストラクタ
	 * 概要：1から3までの入力値で初期化
	 * 引数：なし
	 * 返り値；なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/21
	 */
	public HyumanPlayer() {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// フィールドを初期化する値を入れるための変数
		int handsNumber = 0;
		// 入力値の範囲を絞るための定数
		final int RANGE_NUMBER = 4;
		// 以降の文を実行
		do {
			//「グー…1/チョキ…2/パー…3：」を表示
			System.out.println("グー…1/チョキ…2/パー…3：");
			// handsNumberに入力値を代入
			handsNumber = standardInput.nextInt();
			// handsNumber <= 0 || handsNumber >= RANGE_NUMBERの間、繰り返し実行
		} while (handsNumber <= 0 || handsNumber >= RANGE_NUMBER);
		// フィールドの値をhandsNumberの値で初期化
		this.handsNumber = handsNumber;
	}
	/*
	 * 関数名：getHandaNumber
	 * 概要：handsNumberの値を取得
	 * 引数：なし
	 * 返り値：handsNumber
	 * パラメーターの説明：なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/22
	 */
	public int getHandaNumber() {
		// handsNumberの値を返す
		return handsNumber;
	}

	/*
	 * 関数名；toString
	 * 概要：入力値に応じてどの手を出したか表示するメソッド
	 * 引数；なし
	 * 返り値；myHands
	 * パラメーターの説明：なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/22
	 */
	@Override
	public String toString() {
		// 返り値を	nullで初期化
		String myHands = null;
		// getHandaNumber()の値の時、脱け出すケース文
		switch(getHandaNumber()) {
		// getHandaNumber()の値が1の場合、myHandsに"あなたはグーを出しました"を代入し、抜ける
		case 1 : myHands = "あなたはグーを出しました"; break;
		// getHandaNumber()の値が2の場合、myHandsに"あなたはチョキを出しました"を代入し、抜ける
		case 2 : myHands = "あなたはチョキを出しました"; break;
		// getHandaNumber()の値が3の場合、myHandsに"あなたはパーを出しました"を代入し、抜ける
		case 3 : myHands = "あなたはパーを出しました"; break;
		}
		// myHandsのm時列を返す
		return myHands;
	}

}
