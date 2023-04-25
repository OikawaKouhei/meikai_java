package ensyu6_14;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_14
 * 概要：演習6_14
 * 作成者：OikawaKouhei
 * 作成日：2023/04/25
 */
public class Ensyu6_14 {
	/*
	 * 関数名：main
	 * 概要：月を1から12の数値として表示して、英語表現を入力させる英単語学習プログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を生成するため
		Random randomNumber = new Random();
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 日本語の月名を要素とした配列japaneaseMonthStringを生成・初期化
		String[] japaneaseMonthString = {
				"1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"
		};
		// 英語の月名を要素とした配列englishMonthStringを生成・初期化
		String[] englishMonthString = {
				"January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December"
		};

		//「英語の月名を入力してください。」を表示
		System.out.println("英語の月名を入力してください。");
		//「なお、先頭は大文字で、2文字目以降は小文字とします。」ｗ表示
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");

		// 繰り返しを実行する場合の条件を代入するための変数retryNumberを0で初期化
		int retryNumber = 0;
		// 問題の月を配列から呼び出すための変数monthNumberを0で初期化
		int monthNumber = 0;
		// 乱数の範囲を0から11までとするために、final変数ORIZIN_RANDOMを12で初期化
		final int ORIZIN_RANDOM = 12;
		// 問題を続けるか判断するためのfinal変数JUDGE_NUMBERを1で初期化
		final int JUDGE_NUMBER = 1;
		// 同一月を連続して出さないようにするための変数beforeQuestionをORIZIN_RANDOMの値で初期化
		int beforeQuestion = ORIZIN_RANDOM;

		// 以降の文を実行
		do {
			// 以降の文を実行
			do {
				// monthNumberの値にORIZIN_RANDOMの範囲の乱数を代入
				monthNumber = randomNumber.nextInt(ORIZIN_RANDOM);
				// beforeQuestionの値とmonthNumberの値が同じの間、do以降繰り返し実行
			} while (beforeQuestion == monthNumber);
			// 連続で同一問題が出ないようにmonthNumberの値をbeforeQuestionの値に代入
			beforeQuestion = monthNumber;

			// 正解するまで繰り返し同じ問題を出すため
			while (true) {
				// 日本語の月名を出題するため
				System.out.print(japaneaseMonthString[monthNumber] + "：");
				// 入力した回答を、String型の変数answerMonthに代入
				String answerMonth = standardInput.next();
				// englishMonthString[monthNumber]の文字列とanswerMonthの文字列が等しいか判定
				if (englishMonthString[monthNumber].equals(answerMonth)) {
					// 等しい場合、while文を抜け出す
					break;
				}
				//「違います」を表示
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
