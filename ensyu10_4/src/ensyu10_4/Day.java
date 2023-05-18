package ensyu10_4;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

/*
 * クラス名：Day
 * 概要：日付クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/16
 */
public class Day {
	// グレゴリオカレンダークラス型変数todayDateで、インスタンス化
	GregorianCalendar todayDate = new GregorianCalendar();

	// 年を表す非公開フィールドyearNumberをプログラムを実行した年で初期化
	private int yearNumber = todayDate.get(YEAR);
	// 月を表す非公開フィールドmonthNumberをプログラムを実行した月で初期化
	private int monthNumber = todayDate.get(MONTH) + 1;
	// 日を表す非公開フィールドdateNumberをプログラムを実行した日で初期化
	private int dateNumber = todayDate.get(DATE);

	/*
	 * 関数名：judgeLeap
	 * 概要：引数の年数は閏年か判断する、クラスメソッド
	 * 引数：int yearNumber
	 * 返り値：judgeLeap
	 * パラメーターの説明：閏年か判断する年
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static boolean judgeLeap(int yearNumber) {
		// 返り値をfalseでboolean変数judgemantLeapを初期化
		boolean judgemantLeap = false;
		// 閏年の場合、判断
		if (yearNumber % 4 == 0 && yearNumber % 100 != 0 || yearNumber % 400 == 0) {
			// judgemantLeapにtrueを代入
			judgemantLeap = true;
		}
		// judgemantLeapを返す
		return judgemantLeap;
	}

	/*
	 * 関数名：checkDate
	 * 概要：月の最終日を求めるクラスメソッド
	 * 引数：int yearNumber, int monthNumber
	 * 返り値：dateNumber
	 * パラメーターの説明：閏年を考慮するための月と、最終日を求める月
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static int checkDate(int yearNumber, int monthNumber) {
		// 返り値dateNumberを0で初期化
		int dateNumber = 0;
		// 月末が30日までの月(4,6,9,11)の場合、判断
		if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
			// dateNumberに30を代入
			dateNumber = 30;
			// 閏年の場合、月末日が変わる2月の場合、判断
		} else if (monthNumber == 2) {
			// DayクラスのjudgeLeapメソッドをyearNumberを引数にして、trueであれば判断
			if (Day.judgeLeap(yearNumber) == true) {
				// その年は閏年のため、月末が29日となるので、dateNumberに29を代入
				dateNumber = 29;
				// 閏年でない場合、判断
			} else {
				// その年は閏年でないため、月末が28日となるので、dateNumberに28を代入
				dateNumber = 28;
			}
			// それ以外の月の場合、判断
		} else {
			// 31日が月末となるため、31を代入
			dateNumber = 31;
		}
		// dateNumberの値を返す
		return dateNumber;
	}

	/*
	 * コンストラクタ
	 * 概要：プログラム実行時の日付で初期化
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day() {
	}

	/*
	 * コンストラクタ
	 * 概要： yearNumber年を設定し、以降はプログラム実行時の日付で初期化
	 * 引数：int yearNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day(int yearNumber) {
		// yearNumberの値が0以下の場合、0年は表せないため判断
		if (yearNumber <= 0) {
			// yearNumberフィールドの値を、1で初期化
			this.yearNumber = 1;
			// それ以外の場合、判断
		} else {
			// yearNumberフィールドの値を、引数yearNumberで初期化
			this.yearNumber = yearNumber;
		}
	}

	/*
	 * コンストラクタ
	 * 概要：{this.yearNumber = yearNumber;}のコンストラクタを呼び出し、
	 * 　　　yearNumber年monthNumber月、以降はプログラム実行時の日付で初期化
	 * 引数：int yearNumber, int monthNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day(int yearNumber, int monthNumber) {
		// 同クラス内のyearNumberのコンストラクタを呼び出し、yearNumberを初期化
		this(yearNumber);
		// monthNumberの値が0以下の場合、判断
		if (monthNumber <= 0) {
			// monthNumberフィールドの値を、1で初期化
			this.monthNumber = 1;
			// monthNumberの値が13以上の場合、12月までしかないため、判断
		} else if (monthNumber >= 13) {
			// monthNumberフィールドの値を、12で初期化
			this.monthNumber = 12;
			// それ以外の場合、判断
		} else {
			// monthNumberフィールドの値を、引数monthNumberで初期化
			this.monthNumber = monthNumber;
		}
	}

	/*
	 * コンストラクタ
	 * 概要：{this(yearNumber); this.monthNumber = monthNumber;}のコンストラクタを呼び出し、
	 * 　　　yearNumber年monthNumber月dateNumber日で初期化
	 * 引数：int yearNumber, int monthNumber, int dateNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day(int yearNumber, int monthNumber, int dateNumber) {
		// 同クラス内のyearNumberr, monthNumberのコンストラクタを呼び出し、yearNumberr, monthNumberフィールドを初期化
		this(yearNumber, monthNumber);
		// dateNumberの値が0以下の場合、判断
		if (dateNumber <= 0) {
			// dateNumberフィールドの値を、1で初期化
			this.dateNumber = 1;
			// dateNumberの値が、フィールドの年月の末尾より大きい値の場合、判断
		} else if (dateNumber > checkDate(this.yearNumber, this.monthNumber)) {
			// dateNumberフィールドの値を、フィールドの年月の月末の値で初期化
			this.dateNumber = checkDate(this.yearNumber, this.monthNumber);
			// それ以外の場合。判断
		} else {
			// dateNumberフィールドの値を、dateNumberの値で初期化
			this.dateNumber = dateNumber;
		}

	}

	/*
	 * コンストラクタ
	 * 概要：{this(d.yearNumber, d.monthNumber, d.dateNumber);}のコンストラクタを呼び出し、
	 * 　　　Day dと同じ日付で初期化
	 * 引数：Day d
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day(Day d) {
		// フィールドの値を、引数の値で初期化
		this(d.yearNumber, d.monthNumber, d.dateNumber);
	}

	/*
	 * 関数名：getyearNumber
	 * 概要：年を取得する
	 * 引数：なし
	 * 返り値：yearNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int getyearNumber() {
		// yearNumberの値を返す
		return yearNumber;
	}

	/*
	 * 関数名：getmonthNumber
	 * 概要：年を取得する
	 * 引数：なし
	 * 返り値：monthNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int getmonthNumber() {
		// monthNumberの値を返す
		return monthNumber;
	}

	/*
	 * 関数名：getdateNumber
	 * 概要：年を取得する
	 * 引数：なし
	 * 返り値：dateNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int getdateNumber() {
		// dateNumberの値を返す
		return dateNumber;
	}

	/*
	 * 関数名：setYearNumber
	 * 概要：年を設定する
	 * 引数：int yearNumber
	 * 返り値：なし
	 * パラメーターの説明：年を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void setYearNumber(int yearNumber) {
		// yearNumberフィールドの値に、引数yearNumberの値を代入
		this.yearNumber = yearNumber;
	}

	/*
	 * 関数名：setMonthNumber
	 * 概要：月を設定する
	 * 引数：monthNumber
	 * 返り値：なし
	 * パラメーターの説明：月を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void setMonthNumber(int monthNumber) {
		// monthNumberフィールドの値に、引数monthNumberの値を代入
		this.monthNumber = monthNumber;
	}

	/*
	 * 関数名：setDateNumber
	 * 概要：日を設定する
	 * 引数：int dateNumber
	 * 返り値：なし
	 * パラメーターの説明：日を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void setDateNumber(int dateNumber) {
		// dateNumberフィールドの値に、引数dateNumberの値を代入
		this.dateNumber = dateNumber;
	}

	/*
	 * 関数名：set
	 * 概要：年月日を設定する
	 * 引数：int yearNumber, int monthNumber, int dateNumber
	 * 返り値：なし
	 * パラメーターの説明：年月日を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public void set(int yearNumber, int monthNumber, int dateNumber) {
		// 年を設定する
		this.yearNumber = yearNumber;
		// 月を設定する
		this.monthNumber = monthNumber;
		// 日を設定する
		this.dateNumber = dateNumber;
	}

	/*
	 * 関数名：dayOfWeek
	 * 概要：曜日を求める
	 * 引数：なし
	 * 返り値：(y + y / 100 + y / 400 + (13 * m + 8) / 5 + dateNumber) % 7
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int dayOfWeek() {
		// yをyearNumberの値で初期化
		int y = yearNumber;
		// mをmonthNumberの値で初期化
		int m = monthNumber;
		// mの値が1か2の場合判断
		if (m == 1 || m == 2) {
			// ｙの値をデクリメント
			y--;
			// mの値に12を加算代入
			m += 12;
		}
		// (y + y / 4 - y /100 + y / 400 + (13 * m + 8) / 5 + dateNumber) % 7の値を返す
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + dateNumber) % 7;
	}

	/*
	 * 関数名：日付を比較し正しいか判断
	 * 概要：日付を比較
	 * 引数：Day d
	 * 返り値：yearNumber == d.yearNumber && monthNumber == d.monthNumber && dateNumber == d.dateNumber
	 * パラメーターの説明：Dayクラス型変数d
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public boolean equalTo(Day d) {
		// yearNumber == d.yearNumber && monthNumber == d.monthNumber && dateNumber == d.dateNumberを判断し、trueかfalseを返す
		return yearNumber == d.yearNumber && monthNumber == d.monthNumber && dateNumber == d.dateNumber;
	}

	/*
	 * 関数名：toSring
	 * 概要：文字列を返却
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public String toString() {
		// String型配列wdを、要素「"日","月","火","水","木","金","土"」で生成
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		// 年月日と曜日を文字列表現で返す
		return String.format("%04d年%02d月%02d日(%s)", yearNumber, monthNumber, dateNumber, wd[dayOfWeek()]);
	}

	/*
	 * 関数名：passDate
	 * 概要：年内の経過日数を求めるインスタンスメソッド
	 * 引数：なし
	 * 返り値：elapsedDate
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public int passDate() {
		// 返り値elapsedDateの値を、dateNumberの値で初期化
		int elapsedDate = dateNumber;
		/*
		 * 【月を跨いだ場合の経過日数を求めるため】
		 * firstCountの値を1で初期化
		 * firstCountの値がmonthNumberの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 1; firstCount < monthNumber; firstCount++) {
			// elapsedDateの値に、yearNumber年firstCount月末の値を加算代入
			elapsedDate += checkDate(yearNumber, firstCount);
		}
		// elapsedDateの値を返す
		return elapsedDate;
	}

	/*
	 * 関数名：remainDate
	 * 概要：年内の残り日数を求めるインスタンスメソッド
	 * 引数：なし
	 * 返り値：remainingDate
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public int remainDate() {
		// 返り値remainingDateを0で初期化
		int remainingDate = 0;

		// その年が閏年の場合、判断
		if (judgeLeap(yearNumber) == true) {
			// remainingDateの値に、閏年の総日数366から、経過日数を引いた値を代入
			remainingDate = 366 - passDate();
			// 閏年でない場合、判断
		} else {
			// remainingDateの値に、閏年でない場合の総日数365日から、経過日数を引いた値を代入
			remainingDate = 365 - passDate();
		}
		// remainingDateの値を返す
		return remainingDate;
	}

	/*
	 * 関数名：judgeFrontBack
	 * 概要：他の日付との前後関係を判定するインスタンスメソッド
	 * 　　　前であれば-1、同じであれば0、後であれば1を返り値で返す
	 * 引数：Day comparisonDate
	 * 返り値：なし
	 * パラメーターの説明：比較する日付
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public void judgeFrontBack(Day comparisonDate) {
		// 引数の年がオブジェクトの年より前の場合、判断
		if (yearNumber > comparisonDate.yearNumber) {
			// オブジェクトの日付より引数の日付が前であることを表示
			System.out.println(comparisonDate + "は\n" + this + "より前です。");
			// 引数の月がオブジェクトの月より前の場合、判断
		} else if (yearNumber == comparisonDate.yearNumber && monthNumber > comparisonDate.monthNumber) {
			// オブジェクトの日付より引数の日付が前であることを表示
			System.out.println(comparisonDate + "は\n" + this + "より前です。");
			// 引数の日がオブジェクトの日より前の場合、判断
		} else if (yearNumber == comparisonDate.yearNumber && monthNumber == comparisonDate.monthNumber
				&& dateNumber > comparisonDate.dateNumber) {
			// オブジェクトの日付より引数の日付が前であることを表示
			System.out.println(comparisonDate + "は\n" + this + "より前です。");
			// 二つの日付も同じ場合、判断
		} else if (yearNumber == comparisonDate.yearNumber && monthNumber == comparisonDate.monthNumber
				&& dateNumber == comparisonDate.dateNumber) {
			// 二つの日付が同じであることを表示
			System.out.println(comparisonDate + "は\n" + this + "と同じです。");
			// オブジェクトの日付が、引数の日付より後の場合、判断
		} else {
			// オブジェクトの日付が、引数の日付より後であることを表示
			System.out.println(comparisonDate + "は\n" + this + "より後です。");
		}
	}

	/*
	 * 関数名：judgeFrontBack
	 * 概要：二つの日付との前後関係を判定するインスタンスメソッド
	 * 　　　前であれば-1、同じであれば0、後であれば1を返り値で返す
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static void judgeFrontBack(Day firstDate, Day secondDate) {
		// firstDateの年がsecondDateの年より前の場合、判断
		if (firstDate.yearNumber > secondDate.yearNumber) {
			// firstDateの日付よりsecondDateの日付が前であることを表示
			System.out.println(secondDate + "は\n" + firstDate + "より前です。");
			// secondDateの月がfirstDateの月より前の場合、判断
		} else if (firstDate.yearNumber == secondDate.yearNumber && firstDate.monthNumber > secondDate.monthNumber) {
			// firstDateの日付よりsecondDateの日付が前であることを表示
			System.out.println(secondDate + "は\n" + firstDate + "より前です。");
			// secondDateの月がfirstDateの月より前の場合、判断
		} else if (firstDate.yearNumber == secondDate.yearNumber && firstDate.monthNumber == secondDate.monthNumber
				&& firstDate.dateNumber > secondDate.dateNumber) {
			// firstDateの日付よりsecondDateの日付が前であることを表示
			System.out.println(secondDate + "は\n" + firstDate + "より前です。");
			// 二つの日付も同じ場合、判断
		} else if (firstDate.yearNumber == secondDate.yearNumber && firstDate.monthNumber == secondDate.monthNumber
				&& firstDate.dateNumber == secondDate.dateNumber) {
			// 二つの日付が同じであることを表示
			System.out.println(secondDate + "は\n" + firstDate + "と同じです。");
			// firstDateの日付が、secondDateの日付より後の場合、判断
		} else {
			// firstDateの日付が、secondDateの日付より後であることを表示
			System.out.println(secondDate + "は\n" + firstDate + "より後です。");
		}
	}

	/*
	 * 関数名：setFront
	 * 概要：日付を一つ後ろに進めるセッタメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public void setFront() {
		// dateNumberフィールドの値が、その年月の末日と同じであれば、判断
		if (this.dateNumber == checkDate(yearNumber, monthNumber)) {
			// monthNumberフィールドの値が12(12月)であれば、判断
			if (this.monthNumber == 12) {
				// yearNumberフィールドの値を1加算代入
				this.yearNumber += 1;
				// monthNumberフィールドの値に、1を代入
				this.monthNumber = 1;
				// dateNumberフィールドの値に、1を代入
				this.dateNumber = 1;
				// 12月以外の場合、判断
			} else {
				// monthNumberフィールドの値を1加算代入
				this.monthNumber += 1;
				// dateNumberフィールドの値に、1を代入
				this.dateNumber = 1;
			}
			// 末日でない場合、判断
		} else {
			// dateNumberフィールドの値に、1加算代入
			this.dateNumber += 1;
		}
	}

	/*
	 * 関数名：setBack
	 * 概要：日付を一つ前にもどすセッタメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/17
	 */
	public void setBack() {
		// dateNumberフィールドの値が1(1日)の場合、判断
		if (this.dateNumber == 1) {
			// monthNumberフィールドの値が1(1月)の場合、判断
			if (this.monthNumber == 1) {
				// returnDayの変数yearNumberの値が、0の場合、判断
				if (this.yearNumber == 0) {
					// returnDayの変数yearNumberの値に、、0年を表示しないように1を代入
					this.yearNumber = 1;
					// returnDayの変数dateNumberの値に、、1日を固定で表示させるため、1を代入
					this.dateNumber = 1;
					// returnDayの変数yearNumberの値が、0でない場合判断
				} else {
					// yearNumberフィールドの値を1減算代入
					this.yearNumber -= 1;
					// returnDayの変数monthNumberの値を12(前年の12月を表示するため)を代入
					this.monthNumber = 12;
					// returnDayの変数dateNumberの値を31(前年の31日を表示するため)を代入
					this.dateNumber = 31;
				}
				// 1月でない場合、判断
			} else {
				// monthNumberフィールドの値を1減算代入
				this.monthNumber -= 1;
				// dateNumberフィールドの値の値に、その年月の末日を代入
				this.dateNumber = checkDate(this.yearNumber, this.monthNumber);
			}
			// 月初めでない場合、判断
		} else {
			// dateNumberフィールドの値を1減算代入
			this.dateNumber -= 1;
		}
	}

	/*
	 * 関数名：getFront
	 * 概要：次の日付を返却するゲッタメソッド
	 * 引数：なし
	 * 返り値：new Day(returnDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day getFront() {
		// 返り値のDayクラス型変数returnDayを、そのオブジェクトのメンバ変数で生成
		Day returnDay = new Day(this.yearNumber, this.monthNumber, this.dateNumber);
		// returnDayの変数dateNumberの値が、その年月の末日の場合、判断
		if (returnDay.dateNumber == checkDate(returnDay.yearNumber, returnDay.monthNumber)) {
			// returnDayの変数monthNumberの値が12(12月)の場合、判断
			if (returnDay.monthNumber == 12) {
				// returnDayの変数yearNumberの値を、加算代入
				returnDay.yearNumber += 1;
				// returnDayの変数monthNumberの値に、1(1月にするため)を代入
				returnDay.monthNumber = 1;
				// returnDayの変数dateNumberの値に、1(1日にするため)を代入
				returnDay.dateNumber = 1;
				//　12月以外の末日の場合、判断
			} else {
				// returnDayの変数monthNumberの値に、1を加算代入
				returnDay.monthNumber += 1;
				// returnDayの変数dateNumberの値に、1(1月にするため)を代入
				returnDay.dateNumber = 1;
			}
			// 末日でない場合、判断
		} else {
			// returnDayの変数dateNumberの値に、1を加算代入
			returnDay.dateNumber += 1;
		}
		// returnDayを引数にインスタンス化したものを返す
		return new Day(returnDay);
	}

	/*
	 * 関数名：getBack
	 * 概要：前の日付を返却するゲッタメソッド
	 * 引数：なし
	 * 返り値：new Day(returnDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day getBack() {
		// 返り値のDayクラス型変数returnDayを、そのオブジェクトのメンバ変数で生成
		Day returnDay = new Day(this.yearNumber, this.monthNumber, this.dateNumber);
		// returnDayの変数dateNumberの値が、その年月の1日の場合、判断
		if (returnDay.dateNumber == 1) {
			// monthNumberフィールドの値が1(1月)の場合、判断
			if (this.monthNumber == 1) {
				// returnDayの変数yearNumberの値が、0の場合、判断
				if (this.yearNumber == 0) {
					// returnDayの変数yearNumberの値に、、0年を表示しないように1を代入
					this.yearNumber = 1;
					// returnDayの変数dateNumberの値に、、1日を固定で表示させるため、1を代入
					this.dateNumber = 1;
					// returnDayの変数yearNumberの値が、0でない場合判断
				} else {
					// yearNumberフィールドの値を1減算代入
					this.yearNumber -= 1;
					// returnDayの変数monthNumberの値を12(前年の12月を表示するため)を代入
					this.monthNumber = 12;
					// returnDayの変数dateNumberの値を31(前年の31日を表示するため)を代入
					this.dateNumber = 31;
				}
				//　1月以外の1日の場合、判断	
			} else {
				// returnDayの変数monthNumberの値を、減算代入
				returnDay.monthNumber -= 1;
				// returnDayの変数dateNumberの値に、returnDay.monthNumberの末日を代入
				returnDay.dateNumber = checkDate(returnDay.yearNumber, returnDay.monthNumber);
			}
			// 1日でない場合、判断
		} else {
			// returnDayの変数dateNumberの値を、減算代入
			returnDay.dateNumber -= 1;
		}
		// returnDayを引数にインスタンス化したものを返す
		return new Day(returnDay);
	}

	/*
	 * 関数名：setFront
	 * 概要：日付をn日後ろに進めるセッタメソッド
	 * 引数：int spectifiedValue
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public void setFront(int spectifiedValue) {
		/*
		 * 【日付を指定日進めるためのメソッド】
		 * firstCountを0で初期化
		 * firstCountの値がspectifiedValue未満の間、以降の文を、繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 0; firstCount < spectifiedValue; firstCount++) {
			// dateNumberフィールドの値をインクリメント
			this.dateNumber++;
			// dateNumberフィールドの値が、その年月の末日の場合、判断
			if (this.dateNumber > checkDate(yearNumber, monthNumber)) {
				// monthNumberフィールドの値が12(12月)の場合、判断
				if (this.monthNumber == 12) {
					// yearNumberフィールドの値を、加算代入
					this.yearNumber += 1;
					// monthNumberフィールドの値に、1(1月にするため)を代入
					this.monthNumber = 1;
					// dateNumberフィールドの値に、1(1日にするため)を代入
					this.dateNumber = 1;
					//　12月以外の末日の場合、判断
				} else {
					// monthNumberフィールドの値に、1を加算代入
					this.monthNumber += 1;
					// dateNumberのフィールド値に、1(1月にするため)を代入
					this.dateNumber = 1;
				}
			}
		}
	}

	/*
	 * 関数名：setBack
	 * 概要：日付をn日に前に戻すセッタメソッド
	 * 引数：int spectifiedValue
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public void setBack(int spectifiedValue) {
		/*
		 * 【日付を指定日戻すためのメソッド】
		 * firstCountを0で初期化
		 * firstCountの値がspectifiedValue未満の間、以降の文を、繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 0; firstCount < spectifiedValue; firstCount++) {
			// dateNumberフィールドの値をデクリメント
			this.dateNumber--;
			// dateNumberフィールドの値が、その年月の1日の場合、判断
			if (this.dateNumber < 1) {
				// monthNumberフィールドの値が1(1月)の場合、判断
				if (this.monthNumber == 1) {
					// returnDayの変数yearNumberの値を、減算代入
					this.yearNumber -= 1;
					// yearNumberフィールドの値が、0の場合、判断
					if (this.yearNumber == 0) {
						// yearNumberフィールドの値に、0年を表示しないように1を代入
						this.yearNumber = 1;
						// dateNumberフィールドの値に、1日を固定で表示させるため、1を代入
						this.dateNumber = 1;
						// ループ文を抜ける
						break;
						// yearNumberフィールドの値が、0でない場合判断
					} else {
						// monthNumberフィールドの値を12(前年の12月を表示するため)を代入
						this.monthNumber = 12;
						// dateNumberフィールドの値を31(前年の31日を表示するため)を代入
						this.dateNumber = 31;
					}
					// 1月でない場合
				} else {
					// monthNumberフィールドの値を減算代入
					this.monthNumber -= 1;
					// dateNumberフィールドの値に、月末日の値を代入
					this.dateNumber = checkDate(this.yearNumber, this.monthNumber);
				}
			}
		}
	}

	/*
	 * 関数名：getFront
	 * 概要：n日後の日付を返却するゲッタメソッド
	 * 引数：int spectifiedValue
	 * 返り値：new Day(returnDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day getFront(int spectifiedValue) {
		// 返り値のDayクラス型変数returnDayを、そのオブジェクトのメンバ変数で生成
		Day returnDay = new Day(this.yearNumber, this.monthNumber, this.dateNumber);
		/*
		 * 【日付を指定日戻すためのメソッド】
		 * firstCountを0で初期化
		 * firstCountの値がspectifiedValue未満の間、以降の文を、繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 0; firstCount < spectifiedValue; firstCount++) {
			// returnDayクラスのdateNumberの値をインクリメント
			returnDay.dateNumber++;
			// returnDayの変数dateNumberの値が、その年月の末日の場合、判断
			if (returnDay.dateNumber > checkDate(returnDay.yearNumber, returnDay.monthNumber)) {
				// returnDayの変数monthNumberの値が12(12月)の場合、判断
				if (returnDay.monthNumber == 12) {
					// returnDayの変数yearNumberの値を、加算代入
					returnDay.yearNumber += 1;
					// returnDayの変数monthNumberの値に、1(1月にするため)を代入
					returnDay.monthNumber = 1;
					// returnDayの変数dateNumberの値に、1(1日にするため)を代入
					returnDay.dateNumber = 1;
					//　12月以外の末日の場合、判断
				} else {
					// returnDayの変数monthNumberの値に、1を加算代入
					returnDay.monthNumber += 1;
					// returnDayの変数dateNumberの値に、1(1月にするため)を代入
					returnDay.dateNumber = 1;
				}
			}
		}
		// returnDayを引数にインスタンス化したものを返す
		return new Day(returnDay);
	}

	/*
	 * 関数名：getBack
	 * 概要：前の日付を返却するゲッタメソッド
	 * 引数：int spectifiedValue
	 * 返り値：new Day(returnDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public Day getBack(int spectifiedValue) {
		// 返り値のDayクラス型変数returnDayを、そのオブジェクトのメンバ変数で生成
		Day returnDay = new Day(this.yearNumber, this.monthNumber, this.dateNumber);
		/*
		 * 【日付を指定日戻すためのメソッド】
		 * firstCountを0で初期化
		 * firstCountの値がspectifiedValue未満の間、以降の文を、繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 0; firstCount < spectifiedValue; firstCount++) {
			// returnDayの変数dateNumberの値をデクリメント
			returnDay.dateNumber--;
			// returnDayの変数dateNumberの値が、その年月の1日の場合、判断
			if (returnDay.dateNumber < 1) {
				// returnDayの変数monthNumberフィールドの値が1(1月)の場合、判断
				if (returnDay.monthNumber == 1) {
					// returnDayの変数returnDayの値を、減算代入
					returnDay.yearNumber -= 1;
					// returnDayの変数yearNumberの値が、0の場合、判断
					if (returnDay.yearNumber == 0) {
						// returnDayの変数yearNumberの値に、、0年を表示しないように1を代入
						returnDay.yearNumber = 1;
						// returnDayの変数dateNumberの値に、、1日を固定で表示させるため、1を代入
						returnDay.dateNumber = 1;
						// ループ文を抜ける
						break;
						// returnDayの変数yearNumberの値が、0でない場合判断
					} else {
						// returnDayの変数monthNumberの値を12(前年の12月を表示するため)を代入
						returnDay.monthNumber = 12;
						// returnDayの変数dateNumberの値を31(前年の31日を表示するため)を代入
						returnDay.dateNumber = 31;
					}
					// returnDayの変数yearNumberフィールドの値が、0でない場合判断
				} else {
					// returnDayの変数monthNumberの値を減算代入
					returnDay.monthNumber -= 1;
					// returnDayの変数dateNumberの値に、月末日の値を代入
					returnDay.dateNumber = checkDate(returnDay.yearNumber, returnDay.monthNumber);
				}
			}
		}
		// returnDayを引数にインスタンス化したものを返す
		return new Day(returnDay);
	}

}
