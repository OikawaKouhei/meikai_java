package ensyu9_2;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu9_2
 * 概要：日付クラスを利用するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/05/12
 */
public class Ensyu9_2 {
	/*
	 * 関数名：inputDay
	 * 概要：年月日を入力するため
	 * 引数：String dayName
	 * 返り値：dayNumber
	 * パラメーターの説明：入力している年月日
	 */
	static int inputDay(String dayName) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 返り値の円数を0で初期化
		int dayNumber = 0;

		// 以降の文を実行
		do {
			//「dayName」を表示
			System.out.print(dayName);
			// dayNumberに標準入力した値を代入
			dayNumber = standardInput.nextInt();
			// dayNumberの値が0以下の間、繰り返し実行
		} while (dayNumber <= 0);
		// dayNumberの値を返す
		return dayNumber;
	}

	/*
	 * 関数名：main
	 * 概要：日付クラスを利用するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {

		//「"day1を入力せよ。"」
		System.out.println("day1を入力せよ。");

		// yearNumberをinputDayメソッドの返り値で初期化
		int yearNumber = inputDay("年：");
		// monthNumberをinputDayメソッドの返り値で初期化
		int monthNumber = inputDay("月：");
		// dateNumberをinputDayメソッドの返り値で初期化
		int dateNumber = inputDay("日：");

		// クラスDay型変数dayFirstを宣言し、(yearNumber, monthNumber, dateNumber)で生成
		Day dayFirst = new Day(yearNumber, monthNumber, dateNumber);
		// 入力した年月日を表示
		System.out.println("day1 = " + dayFirst);

		// クラスDay型変数daySecondを宣言し、(dayFirst)で生成
		Day daySecond = new Day(dayFirst);
		//「day2をday1と同じ日付で作りました。」を表示
		System.out.println("day2をday1と同じ日付で作りました。");
		// day2を表示
		System.out.println("day2 = " + daySecond);

		// dayFirstの年月日とdaySecondの年月日の比較を、equalToメソッドを用いて判断
		if (dayFirst.equalTo(daySecond)) {
			//「day1とday2は等しいです」を表示
			System.out.println("day1とday2は等しいです");
			// そうでない場合、判断
		} else {
			//「day1とday2は等しくないです」を表示
			System.out.println("day1とday2は等しくないです");
		}
		// クラスDay型変数firstDayを宣言し、引数なしで生成
		Day firstDay = new Day();
		// クラスDay型変数secondDayを宣言し、引数(2023)で生成
		Day secondDay = new Day(2023);
		// クラスDay型変数thirdDayを宣言し、引数(2023 , 5)で生成
		Day thirdDay = new Day(2023, 5);
		// クラスDay型変数forthDayを宣言し、引数(2023, 5, 12)で生成
		Day forthDay = new Day(2023, 5, 12);

		// day2を表示
		System.out.println("1day = " + firstDay);
		// day2を表示
		System.out.println("2day = " + secondDay);
		// day2を表示
		System.out.println("3day = " + thirdDay);
		// day2を表示
		System.out.println("4day = " + forthDay);
	}

}
