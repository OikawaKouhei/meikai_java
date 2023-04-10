package ensyu3_8;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu3_8
 * 概要：演習3_8
 * 作成者：OikawaKouhei
 * 作成日：2023/04/10
 */
public class ensyu3_8 {

	/*
	 * 関数名：main関数
	 * 概要：読み込んだ点数に応じて、優・良・可・不可を判定して表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「点数：」を表示し、点数の入力を促す
		System.out.print("点数：");
		// 入力した数値を、変数testPointsに代入する
		int testPoints = standardInput.nextInt();
		
		// 変数testPointsが、「0～59」かを判定する
		if (testPoints >= 0 && testPoints <= 59)
			// 「0～59」だった場合、「不可」と表示する
			System.out.println("不可");
		// 「0～59」でない場合、変数testPointsが、「60～69」かを判定する
		else if (testPoints >= 60 && testPoints <= 69)
			// 「60～69」だった場合、「可」と表示する
			System.out.println("可");
		// 「0～59」「60～69」でない場合、変数testPointsが「70～79」かを判定する
		else if (testPoints >= 70 && testPoints <= 79)
			// 「70～79」だった場合、「良」と表示する
			System.out.println("良");
		// 「0～59」「60～69」「70～79」でない場合、変数testPointsが「80～100」かを判定する
		else if (testPoints >= 80 && testPoints <= 100)
			// 「80～100」だった場合、「優」と表示する
			System.out.println("優");
		// 「0未満の数値または101以上の数値」を入力したときを判定する
		else
			// 「0未満の数値または101以上の数値」だった場合、「エラー」を表示
			System.out.println("エラー");
		
	}

}
