package ensyu10_4;



/*
 * クラス名：Ensyu10_4
 * 概要：改良した日付クラスをテストするクラス
 * 作成者：OikawaKouhei
 * 作成日；2023/05/17
 */
public class Ensyu10_4 {
	/*
	 * 関数名：main
	 * 概要：メインメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者；OIkawaKouhei
	 * 作成日：2023/05/17
	 */
	public static void main(String[] args) {
		// Dayクラス型変数todayPrintを引数なしで生成
		Day todayPrint = new Day();
		// 今日の日付を表示
		System.out.println("今日は、" + todayPrint + "です。");
		// 改行
		System.out.println();
		
		// Dayクラス型変数testPrintをありえない日付で生成
		Day testPrint = new Day(300, 2, 31);
		// 不正な値を、適当な値で調整し表示
		System.out.println("不正な値を調整しました。\n" + testPrint + "です。");
		// 改行
		System.out.println();
		
		// Dayクラス型変数firstDayを適当な引数で生成
		Day firstDay = new Day(2024, 2, 31);
		// その日付の元日から数えての経過日数を表示
		System.out.println("経過日数は\n" + firstDay.passDate() + "日です。");
		// 改行
		System.out.println();
		
		// 年内の残り日数を表示
		System.out.println("残り日数は\n" + firstDay.remainDate() + "日です。");
		// 改行
		System.out.println();
		
		
		// 【日付の前後関係を比較します。】を表示
		System.out.println("【日付の前後関係を比較します。】");
		// judgeFrontBackメソッドを用いて、Day型クラスの変数名を基準として、引数の前後関係を表示
		firstDay.judgeFrontBack(todayPrint);
		// 改行
		System.out.println();
		
		// DayクラスのjudgeFrontBackメソッドを用いて、二つの日付の前後関係を表示
		Day.judgeFrontBack(firstDay,todayPrint);
		// 改行
		System.out.println();
		
		
		// 【日付を一日前後させます。(フィールドの値を変更して表示)】を表示
		System.out.println("【日付を一日前後させます。(フィールドの値を変更して表示)】");
		// Dayクラス型変数thirdDayを適当な引数で生成
		Day thirdDay = new Day(2000, 4, 28);
		// thirdDayの元の日付を表示
		System.out.println(thirdDay + "\n日付を1日後ろに進めます。" );
		// thirdDayのsetFrontメソッドを呼び出し、thirdDayのフィールドの値を書き換える
		thirdDay.setFront();
		// 書き換えたthirdDayの日付を表示
		System.out.println(thirdDay);
		// 改行
		System.out.println();
		
		// thirdDayの元の日付を表示
		System.out.println(thirdDay + "\n日付を1日前に戻します。" );
		// thirdDayのsetBackメソッドを呼び出し、thirdDayのフィールドの値を書き換える
		thirdDay.setBack();
		// 書き換えたthirdDayの日付を表示
		System.out.println(thirdDay);
		// 改行
		System.out.println();
		
		
		// 【日付を一日前後させます。(フィールドの値を変更せず表示)】を表示
		System.out.println("【日付を一日前後させます。(フィールドの値を変更せず表示)】");
		// Dayクラス型変数forthDayを適当な引数で生成
		Day forthDay = new Day(1, 1, 1);
		// 元の日付と、forthDayのgetFrontメソッドを呼び出し、次の日付を表示
		System.out.println(forthDay + "\n次の日付を表示します。\n" + forthDay.getFront() );
		// 改行
		System.out.println();
		//  元の日付と、forthDayのgetBackメソッドを呼び出し、前の日付を表示
		System.out.println(forthDay + "\n前の日付を表示します。\n" + forthDay.getBack() );
		// 改行
		System.out.println();
				
		
		// 日付を進める定数の値
		final int FRONT_NUMBER = 366;
		// 日付を戻す定数の値
		final int BACK_NUMBER = 5;
		
		// 【日付を指定した日数前後させます。(フィールドの値を変更して表示)】
		System.out.println("【日付を指定した日数前後させます。(フィールドの値を変更して表示)】");
		// Dayクラス型変数fifthDayを適当な引数で生成
		Day fifthDay = new Day(1, 1, 1);
		// fifthDayの日付を、FRONT_NUMBER日後ろに進めます
		System.out.println(fifthDay + "\n日付を" + FRONT_NUMBER + "日後ろに進めます。" );
		// fifthDayのsetFrontメソッドを引数FRONT_NUMBERで呼び出し、 fifthDayの日付を、FRONT_NUMBER日進める
		fifthDay.setFront(FRONT_NUMBER);
		// fifthDayの日付を表示
		System.out.println(fifthDay);
		// 改行
		System.out.println();
		
		// fifthDayの日付を、BACK_NUMBER日前に戻します。
		System.out.println(fifthDay + "\n日付を" + BACK_NUMBER + "日前に戻します。" );
		// fifthDayのsetBackメソッドを引数BACK_NUMBERで呼び出し、 fifthDayの日付を、BACK_NUMBER日進める
		fifthDay.setBack(BACK_NUMBER);
		// fifthDayの日付を表示
		System.out.println(fifthDay);
		// 改行
		System.out.println();
		
		
		// 【日付を指定した日数前後させます。(フィールドの値を変更せず表示)】
		System.out.println("【日付を指定した日数前後させます。(フィールドの値を変更せず表示)】");
		// 元の日付と、fifthDayのgetFrontメソッドを引数FRONT_NUMBERで呼び出し、BACK_NUMBER日後を表示
		System.out.println(fifthDay + "\n" + FRONT_NUMBER +"日後を表示します。\n" + fifthDay.getFront(FRONT_NUMBER) );
		// 改行
		System.out.println();
		// 元の日付と、fifthDayのgetBackメソッドを引数BACK_NUMBERで呼び出し、BACK_NUMBER日後を表示
		System.out.println(fifthDay + "\n" + BACK_NUMBER +"日前を表示します。\n" + fifthDay.getBack(BACK_NUMBER) );
		// 改行
		System.out.println();
	}
	

}
