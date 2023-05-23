package ensyu15_5;

/*
 * クラス名：Ensyu13_3
 * 概要：じゃんけんをテストするクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
 
public class Ensyu15_5 {
	/*
	 * 関数名：main
	 * 概要：じゃんけんをテストするメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public static void main(String[] args) {
		//「じゃんけんをします」を表示
		System.out.println("じゃんけんをします。");
		// humanHandsをHyumanPlayerクラス型変数でインスタンス化
		HyumanPlayer humanHands = new HyumanPlayer();
		// 人間側の出した手を表示
		humanHands.printHands();
		
		// firstComputerをComputerPlayerクラス型変数でインスタンス化
		ComputerPlayer firstComputer = new ComputerPlayer();
		// secondComputerをComputerPlayerクラス型変数でインスタンス化
		ComputerPlayer secondComputer = new ComputerPlayer();
		
		// firstComputer側の出した手を表示
		firstComputer.printHands();
		// secondComputer側の出した手を表示
		secondComputer.printHands();
		
		// GamePlayerクラスのdecideWinnerメソッドを呼び出し、勝敗を表示
		GamePlayer.decideWinner(humanHands.getHandaNumber(), firstComputer.getHandaNumber(), secondComputer.getHandaNumber());
	}

}
