package ensyu4_19;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_19
 * 概要：演習4_19
 * 作成者：OikawaKouhei
 * 作成日：2023/04/18
 */
public class Ensyu4_19 {
	/*
	 * 関数名：main
	 * 概要：季節を求め、1～12ではない数値が入力された場合、再入力を促すようなプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力をするため
		Scanner standardInput = new Scanner(System.in);
		
		// 動作終了時に終了するかを問うための変数retryNumberを0で初期化
		int retryNumber = 0 ;
		// 月を求めるための変数monthNumberを0で初期化
		int monthNumber = 0 ;
		
		// 以降の文を実行
		do {
			// 以降の文を実行
			do {
				//「季節を求めます。\n何月ですか？：」を表示し、以降に入力を促す
				System.out.print("季節を求めます。\n何月ですか？：");
				// monthNumberに標準入力した値を代入
				monthNumber = standardInput.nextInt();
				// monthNumberが0以下または、13以上の場合、判断
				if (monthNumber <=0 || monthNumber >=13)
					//「再度1から12までの数値を入力してください」を表示して、再度入力を促す
					System.out.println("再度1から12までの数値を入力してください");
			// monthNumberが0以下または、13以上の場合、do以降を繰り返し実行
			} while (monthNumber <=0 || monthNumber >= 13 );
			
			// monthNumberの値が3以下かつmonthNumberの値が5以下の場合、判断
			if (monthNumber >= 3 && monthNumber <= 5) {
				//「それは春です。」と表示する
				System.out.println("それは春です。");
			// monthNumberの値が6以上かつmonthNumberの値が8以下の場合、判断
			} else if (monthNumber >= 6 && monthNumber <= 8) {
				//「それは夏です。」と表示する
				System.out.println("それは夏です。");
			// monthNumberの値が9以上かつmonthNumberの値が11以下の場合、判断
			} else if (monthNumber >= 9 && monthNumber <= 11) {
				//「それは秋です。」と表示する
				System.out.println("それは秋です。");
			// monthNumberの値が12または、monthNumberの値が1または、monthNumberの値が2の場合、判断
			} else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
				//「それは冬です。」と表示する
				System.out.println("それは冬です。");
			}
			// 以降の文を実行
			do {
				//「もう一度？　1…Yes／0…No：」を表示し、以降に数値の入力を促す
				System.out.print("もう一度？　1…Yes／0…No：");
				// retryNumberの値に標準入力した値を代入
				retryNumber = standardInput.nextInt();
				// retryNumberの値が1でも0でもない場合、判断
				if (retryNumber != 1 && retryNumber != 0) {
					// 「1か0を入力してください。」を表示し、再度入力を促す
					System.out.println("1か0を入力してください。");
				}
			// retryNumberの値が、1でも0でもない場合、do以降を繰り返し実行
			} while(retryNumber != 1 && retryNumber != 0);
			
		// retryNumberの値が1の場合、do以降を繰り返し実行
		}while (retryNumber == 1);
	}

}
