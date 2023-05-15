package ensyu9_5;

/*
 * クラス名：Ensyu9_5
 * 概要：開始日と終了日を入力・表示するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Ensyu9_5 {
	/*
	 * クラス名：main
	 * 概要：開始日と終了日を入力・表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static void main(String[] args) {
		// Periodクラス型のインスタンスfirstPeriodを生成
		Period firstPeriod = new Period(new Day(2023, 05,15),new Day(2023, 05, 28));
		//インスタンスfirstPeriodのtoStringメソッドを表示
		System.out.println(firstPeriod.toString());
	}

}
