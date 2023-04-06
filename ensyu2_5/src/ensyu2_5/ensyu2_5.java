package ensyu2_5;
// java.utilScannerパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu2_5
 * 概要：演習2_5
 * 作成者：OikawaKouhei
 * 作成日：2023/04/06
 */
public class ensyu2_5 {
	
	/*
	 * 関数名：main関数
	 * 概要：読み込んだ実数値の合計と平均をを表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：firstDouble , secondDouble
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため。
		Scanner standardInput = new Scanner(System.in);
		
		System.out.print("firstDoubleの値：");
		// 標準入力した実数値を、firstDoubleに代入する
		double firstDouble = standardInput.nextDouble();
		
		System.out.print("secondDoubleの値：");
		// 標準入力した実数値を、secondDoubleに代入する
		double secondDouble = standardInput.nextDouble();
		
		System.out.println("合計は" + (firstDouble + secondDouble) + "です。");
		System.out.println("平均は" + (firstDouble + secondDouble) / 2 + "です。");
	}

}
