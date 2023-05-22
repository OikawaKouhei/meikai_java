package ensyu13_4;

/**
 * クラス名：Day
 * 概要：日付を表すクラス
 * 作成日：2023/05/12
 * @author OikawaKouhei
 */
public class Day {
	/** 年を表す非公開フィールドyearを1で初期化*/
	private int year = 1;
	/** 月を表す非公開フィールドmonthを1で初期化*/
	private int month = 1;
	/** 日を表す非公開フィールドdateを1で初期化*/
	private int date = 1;
	
	/**
	 * 日付を１年1月1日で生成するコンストラクタ
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 */
	public Day() {}
	/**
	 * 日付を指定年１月1月1日で生成するコンストラクタ
	 * 作成日：2023/05/12
	 * @param year 設定する年
	 * @author OikawaKouhei
	 */
	public Day(int year) {this.year = year;}
	/**
	 * 日付をyear年month月1日で生成するコンストラクタ
	 * 作成日：2023/05/12
	 * @param year 設定する年
	 * @param month 設定する月
	 * @author OikawaKouhei
	 */
	public Day(int year, int month) {this(year); this.month = month;}
	/**
	 * 日付をyear年month月date日で生成するコンストラクタ
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param year 設定する年
	 * @param month 設定する月
	 * @param date 設定する日
	 */
	public Day(int year, int month, int date) {this(year, month); this.date = date;}
	/**
	 * 引数の日付をyear年month月date日でコピーして生成するコンストラクタ
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param d 設定する年月日
	 */
	public Day(Day d) {this(d.year, d.month, d.date);}
	
	/**
	 * 関数名：getYear
	 * 概要：年を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return year
	 */
	public int getYear() { return year;}
	/**
	 * 関数名：getMonth
	 * 概要：月を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return month
	 */
	public int getMonth() {return month;}
	/**
	 * 関数名：getDate
	 * 概要：日を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return date
	 */
	public int getDate() {return date;}
	
	/**
	 * 関数名：setYear
	 * 概要：年を設定する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param year 年を設定する
	 */
	public void setYear(int year) {this.year = year;}
	/**
	 * 関数名：setMonth
	 * 概要：月を設定する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param month 月を設定する
	 */
	public void setMonth(int month) {this.month = month;}
	/**
	 * 関数名：setDate
	 * 概要：日を設定する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param date 日を設定する
	 */
	public void setDate(int date) {this.date = date;}
	/**
	 * 関数名：set
	 * 概要：日を設定する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param year 年を設定する
	 * @param month 月を設定する
	 * @param date 日を設定する
	 */
	public void set(int year, int month, int date) {
		// 年を設定する
		this.year = year;
		// 月を設定する
		this.month = month;
		// 日を設定する
		this.date = date;
	}
	
	/**
	 * 関数名：dayOfWeek
	 * 概要：曜日を求めるメソッド
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7 曜日を求める式
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
		// (y + y / 4 - y /100 + y / 400 + (13 * m + 8) / 5 + date) % 7の値を返す
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	/**
	 * 関数名：equalTo
	 * 概要：日付を比較し正しいか判断するメソッド
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param d 比較する日付のDayクラス型変数
	 * @return year == d.year && month == d.month && date == d.date 日付が同じかを求める式
	 */
	public boolean equalTo(Day d) {
		// year == d.year && month == d.month && date == d.dateを判断し、trueかfalseを返す
		return (year == d.year && month == d.month && date == d.date);
	}
	
	/**
	 * 関数名：equalTo
	 * 概要：年月日とその曜日を文字列として返却するメソッド
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]) 年月日と曜日を文字列として返す
	 */
	public String toString() {
		// String型配列wdを、要素「"日","月","火","水","木","金","土"」で生成
		String[] wd = {"日","月","火","水","木","金","土"};
		// 年月日と曜日を文字列表現で返す
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}
}
