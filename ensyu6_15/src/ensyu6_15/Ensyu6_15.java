package ensyu6_15;

//java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_15
 * 概要：演習6_15
 * 作成者：OikawaKouhei
 * 作成日：2023/04/25
 */
public class Ensyu6_15 {
	/*
	 * 関数名：main
	 * 概要：曜日を表示してその英語表現を入力させるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を生成するため
		Random randomNumber = new Random();
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 日本語の曜日を要素とした配列japaneaseWeekを生成・初期化
		String[] japaneaseWeek = {
				"月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日", "日曜日"
		};
		// 英語の曜日を要素とした配列englishWeekを生成・初期化
		String[] englishWeek = {
				"monday", "tuesday", "wednesday", "thursday", "friday", "saturday",
				"sunday"
		};

		//「語の曜日名を小文字で入力してください。」を表示
		System.out.println("英語の曜日名を小文字で入力してください。");

		// 繰り返しを実行する場合の条件を代入するための変数retryNumberを0で初期化
		int retryNumber = 0;
		// 問題の曜日を配列から呼び出すための変数weekNumberを0で初期化
		int weekNumber = 0;
		// 乱数の範囲を0から6までとするために、final変数ORIZIN_RANDOMを7で初期化
		final int ORIZIN_RANDOM = 7;
		// 問題を続けるか判断するためのfinal変数JUDGE_NUMBERを1で初期化
		final int JUDGE_NUMBER = 1;
		// 同一曜日を連続して出さないようにするための変数beforeQuestionをORIZIN_RANDOMの値で初期化
		int beforeQuestion = ORIZIN_RANDOM;

		// 以降の文を実行する
		do {
			// 以降の文を実行する
			do {
				// weekNumberの値にORIZIN_RANDOMの範囲の乱数を代入
				weekNumber = randomNumber.nextInt(ORIZIN_RANDOM);
				// beforeQuestionの値とweekNumberの値が同じ場合、do以降から繰り返し実行
			} while (beforeQuestion == weekNumber);
			// 連続で同一問題が出ないようにweekNumberの値をbeforeQuestionの値に代入
			beforeQuestion = weekNumber;

			// 正解するまで繰り返し同じ問題を出すため
			while (true) {
				// 日本語の曜日を出題するため
				System.out.print(japaneaseWeek[weekNumber] + "：");
				// 入力した回答を、String型の変数answerWeekに代入
				String answerWeek = standardInput.next();

				// englishWeek[weekNumber]の文字列とanswerWeekの文字列が等しいか判定
				if (englishWeek[weekNumber].equals(answerWeek)) {
					// 等しい場合、while文を抜け出す
					break;
				}
				//「違います。」を表示
				System.out.println("違います。");
			}
			//「正解です。」を表示し、再度問題に答えるか入力させる
			System.out.print("正解です。もう一度？\n1…Yes／1以外の数値…No：");
			// retryNumberに入力された数値を代入
			retryNumber = standardInput.nextInt();
		// retryNumberの値がJUDGE_NUMBERの値の間、一番上位のdo以降から繰り返し実行
		} while (retryNumber == JUDGE_NUMBER);
		//「1以外の数字が入力されたため終了します。」を表示し、終了させる
		System.out.println("1以外が入力されたため終了します。");
	}

}
