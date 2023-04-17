package ensyu4_7;

//java.utilScannerを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu4_7
 * 概要：演習4_7
 * 作成者：OikawaKouhei
 * 作成日：2023/04/17
 */
public class Ensyu4_7 {
	/*
	 * 関数名：main
	 * 概要：読み込んだ数値の個数だけ記号文字「*」「+」を表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
			// 「何個表示しますか：」と表示して、以降に数値の入力を促す
			System.out.print("何個表示しますか：");
			// 変数firstNumberを標準入力した値で初期化する
			int firstNumber = standardInput.nextInt();

				// 繰り返しを実行するための変数asteriskNumberを初期化
				int asteriskNumber = 0 ;
				// 繰り返しを実行するための変数plusNumberを初期化
				int plusNumber = 0 ;

				// firstNumberが0より大きい場合を判断
				if (firstNumber > 0) {
					// do以降の文を実行する
					do {
						// asteriskNumberとplusNumberを足した値が、firstNumberより小さければ判断
						if (asteriskNumber + plusNumber < firstNumber) {
							//「*」を表示する
							System.out.print('*');
							// asteriskNumberをインクリメントする
							asteriskNumber ++ ;
						// asteriskNumberとplusNumberを足した値が、firstNumberより小さければ判断
						} if (asteriskNumber + plusNumber < firstNumber) {
							//「+」を表示する
							System.out.print('+');
							// plusNumberをインクリメントする
							plusNumber ++ ;
						}
					// asteriskNumberとplusNumberを足した値が、firstNumberより小さい間、do以降の文を実行
					} while(asteriskNumber + plusNumber < firstNumber);
					// 改行するため
					System.out.println();
				// firstNumberが0以下の場合を判断
				} else {
					//「正の整数値を入力してください。」を表示する
					System.out.print("正の整数値を入力してください。");
				}
	}
}
