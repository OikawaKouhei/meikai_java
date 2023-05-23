package ensyu13_3;

/**
 * クラス名：Ensyu13_3
 * 概要：じゃんけんをテストするクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 * @author OikawaKouhei
 */
public class Ensyu13_3 {
	/**
	 * 関数名：main
	 * 概要：じゃんけんをテストするメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 * @author OikawaKouhei
	 */
	public static void main(String[] args) {
		/**「じゃんけんをします」を表示*/
		System.out.println("じゃんけんをします。");
		/** humanHandsをHyumanPlayerクラス型変数でインスタンス化*/
		HyumanPlayer humanHands = new HyumanPlayer();
		/** 人間側の出した手を表示*/
		humanHands.printHands();

		/** computerHandsをComputerPlayerクラス型変数でインスタンス化*/
		ComputerPlayer computerHands = new ComputerPlayer();
		/** 人間側の出した手を表示*/
		computerHands.printHands();
		/** GamePlayerクラスのdecideWinnerメソッドを呼び出し、二つの勝敗を表示*/
		GamePlayer.decideWinner(humanHands.getHandaNumber(), computerHands.getHandaNumber());
	}

}
