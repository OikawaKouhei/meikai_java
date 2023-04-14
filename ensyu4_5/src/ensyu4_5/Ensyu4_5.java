package ensyu4_5;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;
/*
 * クラス名：Ensyu4_5
 * 概要：演習4_5
 * 作成者：OikawaKohei
 * 作成日：2023/04/11
 * 実行結果とその考察：5と入力すると、4/3/2/1/0/-1と表示される
 * 　　　　　　　　　　前置型は、デクリメント後の値から表示されるため。
 */
public class Ensyu4_5 {
	/*
	 * 関数名：main
	 * 概要：List4_5における、countNumberのデグリメントを、「countNumber--」から「--countNumber」に
	 * 　　　変更した場合、どのように出力されるか確認するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 「カウントダウンします。」と表示する
		System.out.println("カウントダウンします。");
		// 宣言したcountNumber初期化する
		int countNumber = 0;
		// 以降の文を実行する
		do {
			//「正の整数値：」と表示して、以降に整数値の入力を促す
			System.out.print("正の整数値：");
			// 変数countNumberに標準入力した数値を代入
			countNumber = standardInput.nextInt();
			
			// countNumberが正の整数値の場合を判断
			if (countNumber > 0) {
				//「カウントダウンを開始します。」を表示
				System.out.println("カウントダウンを開始します。");
			// countNumberが正の整数値でない場合を判断
			} else {
				//「正の整数値を入力し直してください。」と表示
				System.out.println("正の整数値を入力し直してください。");
			}
		// countNumberが0以下である限り、do以降の文を繰り返し実行
		} while (countNumber <= 0);
		
		// countNumberが0以上の間、{}以降の文を繰り返し実行する
		while (countNumber >= 0) {
			// countNumberの値を表示するとともに、前置減分演算子でデクリメントする。
			System.out.println(--countNumber);
		}
	}

}
