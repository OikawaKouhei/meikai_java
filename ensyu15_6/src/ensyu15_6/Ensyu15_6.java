package ensyu15_6;

/*
 * クラス名：Ensyu15_6
 * 概要：コマンドライン引数で与えられた半径をもつ円の円周の長さと面積を求めて表示するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/05/23
 */
public class Ensyu15_6 {
	/*
	 * 関数名：main
	 * 概要：半径を持つ円の円周の長さと面積を求めて表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：コマンドライン引数
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/23
	 */
	public static void main(String[] args) {
		// 円の円周の長さを求めるための変数を0.0で初期化
		double circumferenceValue = 0.0;
		// 円の面積を求めるための変数を0.0で初期化
		double circleAreaValue = 0.0;
		// 円の半径の値を表す変数をコマンドライン引数で返却された値で初期化
		double circleRadius = Double.parseDouble(args[0]);
		// 円周率を定数として初期化
		final double PI_VALUE = 3.14;
		// 円の直径を求めるための値(２)を定数として初期化
		final double VALUE_TIMES = 2.0;
		
		// 円の円周の長さを求める
		circumferenceValue = VALUE_TIMES * PI_VALUE * circleRadius;
		// 円の面積を求める
		circleAreaValue = circleRadius * circleRadius * PI_VALUE;
		// 求めた円周を表示
		System.out.println("コマンドライン引数の値を円の半径として円周を求めました。\n" + circumferenceValue);
		// 求めた円の面積を表示
		System.out.println("コマンドライン引数の値を円の半径として円の面積を求めました。\n" + circleAreaValue);
	}

}
