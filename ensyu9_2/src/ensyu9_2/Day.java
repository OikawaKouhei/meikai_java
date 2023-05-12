package ensyu9_2;

/*
 * クラス名：Day
 * 概要：日付クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/12
 */
public class Day {
	// 年を表す非公開フィールドyearを1で初期化
	private int year = 1;
	// 月を表す非公開フィールドmonthを1で初期化
	private int month = 1;
	// 日を表す非公開フィールドdateを1で初期化
	private int date = 1;
	
	// 1年1月1日で初期化
	public Day() {}
	// year年1月1日で初期化
	public Day(int year) {this.year = year;}
	// {this.year = year;}のコンストラクタを呼び出し、year年month月1日で初期化
	public Day(int year, int month) {this(year); this.month = month;}
	// {this(year); this.month = month;}のコンストラクタを呼び出し、year年month月date日で初期化
	public Day(int year, int month, int date) {this(year, month); this.date = date;}
	// {this(d.year, d.month, d.date);}のコンストラクタを呼び出し、Day dと同じ日付で初期化
	public Day(Day d) {this(d.year, d.month, d.date);}
	
	/*
	 * 関数名：getYear
	 * 概要：年を取得する
	 * 引数：なし
	 * 返り値：year
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int getYear() { return year;}
	/*
	 * 関数名：getMonth
	 * 概要：年を取得する
	 * 引数：なし
	 * 返り値：month
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int getMonth() {return month;}
	/*
	 * 関数名：getDate
	 * 概要：年を取得する
	 * 引数：なし
	 * 返り値：date
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int getDate() {return date;}
	
	
	/*
	 * 関数名：setYear
	 * 概要：年を設定する
	 * 引数：int year
	 * 返り値：なし
	 * パラメーターの説明：年を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void setYear(int year) {this.year = year;}
	/*
	 * 関数名：setMonth
	 * 概要：月を設定する
	 * 引数：month
	 * 返り値：なし
	 * パラメーターの説明：月を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void setMonth(int month) {this.month = month;}
	/*
	 * 関数名：setDate
	 * 概要：日を設定する
	 * 引数：int date
	 * 返り値：なし
	 * パラメーターの説明：日を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void setDate(int date) {this.date = date;}
	/*
	 * 関数名：set
	 * 概要：年月日を設定する
	 * 引数：int year, int month, int date
	 * 返り値：なし
	 * パラメーターの説明：年月日を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void set(int year, int month, int date) {
		// 年を設定する
		this.year = year;
		// 月を設定する
		this.month = month;
		// 日を設定する
		this.date = date;
	}
	
	/*
	 * 関数名：dayOfWeek
	 * 概要：曜日を求める
	 * 引数：なし
	 * 返り値：(y + y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int dayOfWeek() {
		// yをyearの値で初期化
		int y = year;
		// mをmonthの値で初期化
		int m = month;
		// mの値が1か2の場合判断
		if (m == 1 || m == 2) {
			// ｙの値をデクリメント
			y--;
			// mの値に12を加算代入
			m += 12;
		}
		// (y + y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7の値を返す
		return (y + y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	/*
	 * 関数名：日付を比較し正しいか判断
	 * 概要：日付を比較
	 * 引数：Day d
	 * 返り値：year == d.year && month == d.month && date == d.date
	 * パラメーターの説明：Dayクラス型変数d
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public boolean equalTo(Day d) {
		// year == d.year && month == d.month && date == d.dateを判断し、trueかfalseを返す
		return year == d.year && month == d.month && date == d.date;
	}
	
	/*
	 * 関数名：toSring
	 * 概要：文字列帆湧現を返却
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public String toString() {
		// String型配列wdを、要素「"日","月","火","水","木","金","土"」で生成
		String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日と曜日を文字列表現で返す
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
