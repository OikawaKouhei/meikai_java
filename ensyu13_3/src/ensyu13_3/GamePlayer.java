package ensyu13_3;

/*
 * クラス名：GamePlayer
 * 概要：じゃんけんするプレイヤーを表す抽象クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public abstract class GamePlayer {
	/*
	 * 関数名：decideWinner
	 * 概要：両者の勝敗を決めるメソッド
	 * 引数：int myNumber , int opponentNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public static void decideWinner(int myNumber , int opponentNumber) {
		// 引数の値が同じ場合判断
		if (myNumber == opponentNumber) {
			//「あいこです」を表示
			System.out.println("あいこです。");
		/*
		 * myNumber == 1 && opponentNumber == 2 || 
		 *	myNumber == 2 && opponentNumber == 3 ||
		 *	myNumber == 3 && opponentNumber == 1の場合判断
		 */
		} else if (myNumber == 1 && opponentNumber == 2 || 
				myNumber == 2 && opponentNumber == 3 ||
				myNumber == 3 && opponentNumber == 1 ) {
			//「あなたの勝ちです」を表示
			System.out.println("あなたの勝ちです。");
			// そうでない場合、判断
		} else {
			// 「あなたの負けです」を表示
			System.out.println("あなたの負けです。");
		}
	}
	/*
	 * 関数名；toString
	 * 概要：文字列を返却する抽象メソッド
	 * 引数：なし
	 * 返り値；なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public abstract String toString();
	
	/*
	 * 関数名；printHands
	 * 概要：文字列を表示するメソッド
	 * 引数：なし
	 * 返り値；なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public void printHands(){
		// toStringメソッドを表示
		System.out.println(toString());
	}
	
	
	
}
