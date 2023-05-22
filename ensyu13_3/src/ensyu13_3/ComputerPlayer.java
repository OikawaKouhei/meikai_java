package ensyu13_3;
//java.util.Randomパケージを利用するための宣言
import java.util.Random;
/*
* クラス名：ComputerPlayer
* 概要：じゃんけんするコンピュータープレイヤーを表すクラス
* 作成者：OikawaKouhei
* 作成日：2023/05/19
*/
public class ComputerPlayer extends GamePlayer {
	// CPの手を表すフィールド変数
	private int handsNumber;

	/*
	 * コンストラクタ
	 * 概要：1から3までの乱数の値で初期化
	 * 引数：なし
	 * 返り値；なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/21
	 */
	public ComputerPlayer() {
		// 乱数を生成する準備
		Random standardRandom = new Random();
		// フィールドの値に、1から3までの乱数を代入
		this.handsNumber = standardRandom.nextInt(3) + 1;
	}

	/*
	 * 関数名：getHandaNumber
	 * 概要：handsNumberの値を取得するため(ゲッタ)
	 * 引数：なし
	 * 返り値；handsNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/21
	 */
	public int getHandaNumber() {
		// handsNumberの値を返す
		return handsNumber;
	}

	/*
	 * 関数名；toString
	 * 概要：文字列を返却するメソッド
	 * 引数：なし
	 * 返り値；String myHand
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public String toString() {
		// 返り値myHandをnullで初期化
		String myHands = null;

		// getHandaNumberの値を引数にしたスイッチ文
		switch (getHandaNumber()) {
		// getHandaNumberの値が1の場合
		case 1:
			// 文字列"CPはグーを出しました"を代入
			myHands = "CPはグーを出しました";
			// 文を抜ける
			break;
		// getHandaNumberの値が2の場合
		case 2:
			// 文字列"CPはチョキを出しました"を代入
			myHands = "CPはチョキを出しました";
			// 文を抜ける
			break;
		// getHandaNumberの値が3の場合
		case 3:
			// 文字列"CPはパーを出しました"を代入
			myHands = "CPはパーを出しました";
			// 文を抜ける
			break;
		}
		// myHandsを返す
		return myHands;
	}

}