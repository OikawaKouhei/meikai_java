package ensyu15_8;
/*
 * クラス名：Ensyu5_8
 * 概要：コマンドライン引数で指定された月のカレンダーを表示するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/05/23
 */
public class Ensyu15_8 {
	/*
	 * 関数名：main
	 * 概要：コマンドライン引数で指定された月のカレンダーを表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：コマンド引数
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/23
	 */
	public static void main(String[] args) {
		// args配列の長さが0の場合、判断
		if (args.length == 0) {
			// Dayクラス型変数todayCalendarを引数なしでインスタンス化
			Day todayCalendar = new Day();
			// プログラム実行時の年を表示
			System.out.println("< " + todayCalendar.getyearNumber() + "年のカレンダー >");
			// プログラム実行時の年月のカレンダーを表示
			todayCalendar.printCalendar(todayCalendar.getyearNumber(), todayCalendar.getmonthNumber());
			// args配列の長さが1の場合、判断
		} else if (args.length == 1) {
			// Dayクラス型変数todayCalendarを引数をargs配列[0]の値でインスタンス化
			Day specifyYear = new Day (Integer.parseInt(args[0]));
			// todayCalendarの年フィールドの値を表示
			System.out.println("< " + specifyYear.getyearNumber() + "年のカレンダー >");
			/*
			 * 「コマンド引数で指定された年の1月から12月までのカレンダーを表示するためのループ文」
			 * 1月から表示するためmonthCountの値を1で初期化
			 * monthCountの値が12以下の間、繰り返し実行
			 * monthCountの値をインクリメントし、次の月を表示
			 */
			for (int monthCount = 1; monthCount <= 12; monthCount++) {
				// monthCountの値の月のカレンダーを表示
				specifyYear.printCalendar(specifyYear.getyearNumber(), monthCount);
			}
			// args配列の長さが2の場合、判断
		} else if (args.length == 2) {
			// Dayクラス型変数specifyMontを引数をargs配列[0][1]の値でインスタンス化
			Day specifyMont = new Day(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			// 指定された年と月のカレンダーを表示
			specifyMont.printCalendar(specifyMont.getyearNumber(), specifyMont.getmonthNumber());
		}
	}

}
