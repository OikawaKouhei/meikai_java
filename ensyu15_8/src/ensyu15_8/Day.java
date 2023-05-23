package ensyu15_8;

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
	 * 概要：1日の曜日を求める
	 * 引数：なし
	 * 返り値：(y + y / 100 + y / 400 + (13 * m + 8) / 5 + dateNumber) % 7
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public int dayOfWeek(int yearNumber, int monthNumber, int dayNumber) {
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
		// ((y + y / 4 - y /100 + y / 400 + (13 * m + 8) / 5 + dateNumber) % 7)の値を代入
		int weekNumber = (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + dayNumber) % 7;
		// (y + y / 4 - y /100 + y / 400 + (13 * m + 8) / 5 + dateNumber) % 7の値を返す
		return weekNumber;
	}

	/*
	 * 関数名：printCalendar
	 * 概要：引数の年と月に応じて、カレンダー表示するメソッド
	 * 引数：int yearNumber, int monthNumber
	 * 返り値：なし
	 * パラメーターの説明：年と月
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/23
	 */
	public void printCalendar(int yearNumber, int monthNumber) {
		// 書式文字列で何文字開けるか表すための変数を0で初期化
		int spaceNumber = 0;
		// 表示するカレンダーの月を表示
		System.out.println(monthNumber + "月");
		// 曜日を表示
		System.out.println(" 日 月 火 水 木 金 土");
		/*
		 * 【1ヵ月をカレンダー表示するための多重ループ】
		 * 「その月の最終日まで表示するためのループ文」
		 * 1日から表示するため、firstCountの値を1で初期化
		 * firstCountの値が、checkDate(yearNumber, monthNumber)「月末の日」以下の間、繰り返し実行
		 */
		Outer: for (int firstCount = 1; firstCount <= checkDate(yearNumber, monthNumber);) {
			/*
			 * 「カレンダー表示にするため、土曜日表示後改行して日曜日を表示するようにするためのループ文」
			 * 日曜日を1とし土曜日を7と表すとき、secondCountの値を日曜日の値1で初期化
			 * secondCountの値が、土曜日(7)になるまで、以降の文を繰り返し実行
			 * firstCountの値をインクリメントし、次の日にちを表示できるようにする
			 * secondCountの値をインクリメントし、次の曜日を表せるようにする
			 */
			for (int secondCount = 1; secondCount <= 7; firstCount++, secondCount++) {
				// 1日目を表す場合、判断
				if (firstCount == 1) {
					// dayOfWeekメソッドで0、すなわち土曜日が帰ってきた場合、判断
					if (dayOfWeek(yearNumber, monthNumber, firstCount) == 0) {
						// 書式文字列はの最低文字数を0で指定できないため、1をspaceNumberに代入
						spaceNumber = 1;
						// 土曜日以外の場合、判断
					} else {
						// dayOfWeek(yearNumber, monthNumber ,firstCount)で帰ってきた値に、1をプラスし、月曜日以降を表示できるようにする
						spaceNumber = dayOfWeek(yearNumber, monthNumber, firstCount) + 1;
					}
					// %(3 * spaceNumber)d桁最低でもあけ、firstCountの値を表示
					System.out.printf("%" + (3 * spaceNumber) + "d", firstCount);
					// 2日目の日付をspaceNumber + 1 曜日として表示できるよう、代入し、+1はインクリメントで行う
					secondCount = spaceNumber;
					// 1日目以外を表す場合、判断
				} else {
					// 少なくとも3桁で日付を表示する
					System.out.printf("%3d", firstCount);
					// firstCountの値が、その月の月末であれば判断
					if (firstCount == checkDate(yearNumber, monthNumber)) {
						// 改行
						System.out.println();
						// Outer for文を抜ける
						break Outer;
					}
				}
			}
			// 土曜日で改行するため
			System.out.println();
		}
	}
}
