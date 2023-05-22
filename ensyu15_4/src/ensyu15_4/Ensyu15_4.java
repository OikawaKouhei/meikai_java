package ensyu15_4;
/*
 * クラス名：Ensyu15_4
 * 概要：浮動小数点数値を桁数と小数点以下の桁数を指定して表示
 * 作成者：OikawaKouhei
 * 作成日：2023/05/22
 */
public class Ensyu15_4 {
	/*
	 * 関数名：printDouble
	 * 概要：浮動小数点数値xを小数点以下の点をｐ桁で、全体を少なくともw桁で表示するメソッド
	 * 引数：double x, int p, int w
	 * 返り値：なし
	 * パラメーターの説明：浮動小数点数値、小数点以下を何桁で表示するかの値、全体の桁数
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/22
	 */
	public static void printDouble(double x, int p, int w) {
		// 浮動小数点数値xを小数点以下の点をｐ桁で、全体を少なくともw桁で表示
		System.out.printf(String.format("%%%d.%df\n", w,p), x);
	}
	
	/*
	 * 関数名：main
	 * 概要：printDoubleメソッドをテストするメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouei
	 * 作成日：2023/05/23
	 */
	public static void main(String[] args) {
		// printDoubleメソッドを用いて浮動小数点を表示
		printDouble(3.141526, 2, 1);
	}
	
}
