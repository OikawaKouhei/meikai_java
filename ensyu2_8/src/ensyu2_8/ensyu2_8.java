package ensyu2_8;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：ensyu2_8
 * 概要：演習2_8
 * 作成者：OikawaKouhei
 * 作成日：2023/04/07
 */
public class ensyu2_8 {
	
	/*
	 * 関数名：main関数
	 * 概要：入力した整数値のプラスマイナス５の範囲の整数値をランダムに生成して表示する
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため
		Scanner standardInput = new Scanner(System.in);
		
		// ランダムな数値を生成するため
		Random randomNumber = new Random();
		
		// 「整数値：」を出力して、以降に整数値の入力を促すため
		System.out.print("整数値：");
		// 標準入力した整数値を、変数inputNumberに代入する
		int inputNumber = standardInput.nextInt();
		
		// -5以上5以下の乱数を生成するため
		int firstRandom = randomNumber.nextInt(11) - 5;
		
		// 「その値の±5の乱数を生成しました」を出力する
		System.out.println("その値の±5の乱数を生成しました");
		// 標準入力した整数値の±5の数値を出力する
		System.out.println("それは" + (inputNumber + firstRandom) +"です。");
	}

}
