package ensyu9_5;

/*
 * クラス名：Period
 * 概要：期間を表すクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Period {
	// 期間の開始日を表す非公開フィールドfromを初期化
	private Day from;
	// 機関の開始日を表す非公開フィールドtoを初期化
	private Day to;
	
	// 仮引数がない場合の、フィールド変数を初期化
	public Period() {}	
	// 仮引数が開始期間fromと、終了機関toの場合のフィールド変数を初期化
	public Period(Day from, Day to) {
		// フィールド変数fromにDayクラスのコピーコンストラクタを用いて初期化
		this.from = new Day(from);
		// フィールド変数toにDayクラスのコピーコンストラクタを用いて初期化
		this.to = new Day(to);
	}
	/*
	 * 関数名：getFrom
	 * 概要：開始期間の日付を返す
	 * 引数：なし
	 * 返り値：new Day(from)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public Day getFrom() {
		// Dayクラスで開始日の日付をインスタンス化し、返す
		return new Day(from);
	}
	/*
	 * 関数名：getTo
	 * 概要：終了期間の日付を返す
	 * 引数：なし
	 * 返り値：new Day(to)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public Day getTo() {
		// Dayクラスで終了日の日付をインスタンス化し、返す
		return new Day(to);
	}
	/*
	 * 関数名：toString
	 * 概要：開始期間と終了機関の日付を文字列で返す
	 * 引数：なし
	 * 返り値："開始日：" + new Day(from) + "\n終了日：" + new Day(to)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public String toString() {
		// "開始日：" + new Day(from) + "\n終了日：" + new Day(to)の文字列を返す
		return "開始日：" + new Day(from) + "\n終了日：" + new Day(to);
	}
}
