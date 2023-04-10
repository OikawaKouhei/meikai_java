package ensyu2_9;

// java.util.Randomのパッケージを利用するための宣言
import java.util.Random;

/*
 * クラス名：ensyu2_9
 * 概要：演習2_9
 * 作成者：OikawaKouhei
 * 作成日：2023/04/07
 */
public class ensyu2_9 {
	
	/*
	 * 関数名：main関数
	 * 概要：0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満の乱数を順に上から表示
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 乱数を取得するため
		Random randomNumber = new Random();
		
		// 0.0以上1.0未満の範囲の乱数を生成する
		double firstRandom = randomNumber.nextDouble();
		// 0.0以上10.0未満の範囲の乱数を生成する
		double secondRandom = randomNumber.nextDouble();
		// 0.0以上1.0未満の範囲の乱数を生成すために、もう一度0.0以上1.0未満の範囲の乱数を生成する
		double thirdRandom = randomNumber.nextDouble();
		// 0以上9の範囲の乱数を生成する
		int fourthNumber = randomNumber.nextInt(10);
		
		// 0.0以上1.0未満の範囲の乱数を出力する
		System.out.println(firstRandom);
		// 0.0以上10.0未満の範囲の乱数を出力する
		System.out.println(secondRandom + fourthNumber);
		// -1.0以上1.0未満の範囲の乱数を出力する
		System.out.println(firstRandom - thirdRandom );
	}

}
