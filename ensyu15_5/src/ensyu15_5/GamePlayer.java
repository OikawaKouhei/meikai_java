package ensyu15_5;

/*
 * クラス名：GamePlayer
 * 概要：じゃんけんするプレイヤーを表す抽象クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public abstract class GamePlayer {
	/*
	 * 関数名：judgeWinner
	 * 概要：2人の勝敗を決めるメソッド
	 * 引数：int myNumber , int opponentNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public static int judgeWinner(int myNumber , int firstOppnent) {
		// じゃんけんに参加している人数に応じた定数
		final int PEOPLE_NUMBER = 3;
		// 勝敗を数値化した返り値の値
		int judgeNumber = (myNumber - firstOppnent + PEOPLE_NUMBER) % PEOPLE_NUMBER;
		// 人間(myNumber)が引き分けであれば0、勝ちであれば1、負けであれば2の値を返す
		return judgeNumber;
	}
	/*
	 * 関数名：decideWinner
	 * 概要：3人でじゃんけんしたときの勝敗結果を表示
	 * 引数：int playerHands, int secondComputer, int thirdComputer
	 * 返り値：なし
	 * パラメーターの説明：二つの勝敗結果を値にして出したもの
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/22
	 */
	public static void decideWinner(int playerHands, int firstComputer, int secondComputer) {
		// playerHands,firstComputerの勝敗で、プレイヤーが勝った場合、判断
		if (judgeWinner(playerHands,firstComputer) == 2) {
			// playerHands,secondComputerの勝敗を判断
			switch (judgeWinner(playerHands,secondComputer)) {
			// 引き分けか勝ちの場合、「あなたの勝ちです」を表示して、スイッチ文を抜ける
			case 0:
			case 2: System.out.println("あなたの勝ちです。"); break;
			// 負けの場合、「引き分けです」を表示して、スイッチ分を抜ける
			case 1: System.out.println("引き分けです。"); break;
			}
			// playerHands,firstComputerの勝敗で、プレイヤーが負けた場合、判断
		} else if(judgeWinner(playerHands,firstComputer) == 1) {
			// playerHands,secondComputerの勝敗を判断
			switch (judgeWinner(playerHands,secondComputer)) {
			// 引き分けか、負けの場合、「あなたの負けです」を表示して、スイッチ分を抜ける
			case 0:
			case 1: System.out.println("あなたの負けです。"); break;
			// 勝った場合、「引き分けです」を表示
			case 2: System.out.println("引き分けです。"); break;
			}
			// playerHands,firstComputerの勝敗で、引き分けの場合、判断
		} else {
			// playerHands,secondComputerの勝敗を判断
			switch (judgeWinner(playerHands,secondComputer)) {
			// 引き分けの場合、「引き分けです」を表示して、スイッチ分を抜ける
			case 0: System.out.println("引き分けです。"); break;
			// 勝ちの場合、「あなたの勝ちです」を表示して、スイッチ文を抜ける
			case 2: System.out.println("あなたの勝ちです。"); break;
			// 負けの場合、「あなたの負けです」を表示して、スイッチ分を抜ける
			case 1: System.out.println("あなたの負けです。"); break;
			}
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
