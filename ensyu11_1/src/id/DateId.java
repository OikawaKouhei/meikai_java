package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

/*
 * クラス名：DateId
 * 概要：識別番号クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/18
 */
public class DateId {
	// 静的フィールドcounterNumberを宣言
	private static int counterNumber;
	// 非静的フィールドidNumberを宣言
	private int idNumber;
	
	// 静的初期化子を行う
	static {
		// GregorianCalendarクラス型変数を生成
		GregorianCalendar todayNumber = new GregorianCalendar();
		// プログラム実行時の年を代入
		int yearNumber = todayNumber.get(YEAR);
		// プログラム実行時の月+1を代入
		int monthNumber = todayNumber.get(MONTH) + 1;
		// プログラム実行時の日を代入
		int dateNumber = todayNumber.get(DATE);
		
		// 今日の日付を表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n",yearNumber,monthNumber,dateNumber);
		// counterNumberに日付を基にした識別番号を代入
		counterNumber = yearNumber * 1000000 + monthNumber * 10000 + dateNumber * 100;
	}
	/*
	 * コンストラクタ
	 * 概要；インスタンス化するたびに、counterNumberをインクリメントし、idNumberに代入
	 * 引数：なし
	 * 返り値；なし
	 * 作成者；OikawaKouhei
	 * 作成日；2023/05/18
	 */
	public DateId() {
		// idNumberにcounterNumberを代入し、その後インクリメント
		idNumber = counterNumber++;
	}
	/*
	 * 関数名；getId
	 * 概要；idNumberの値を返す
	 * 引数；なし
	 * 返り値；idNumber
	 * 作成者；OikawaKouhei
	 * 作成日；2023/05/18
	 */
	public int getId() {
		// idNumberの値を返す
		return idNumber;
	}

}
