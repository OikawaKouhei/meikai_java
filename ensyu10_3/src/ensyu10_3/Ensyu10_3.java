package ensyu10_3;

/*
 * クラス名：Ensyu10_3
 * 概要：二値・三値・配列の要素の最大値・最小値を求めるメソッドを用いてそれを表示
 * 作成者：OikawaKouhei
 * 作成日：2023/05/16
 */
public class Ensyu10_3 {
	/*
	 * 関数名：main
	 * 概要：二値・三値・配列の要素の最大値・最小値を入力・表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/16
	 */
	public static void main(String[] args) {
		// 定数firstNumberを5で初期化
		final double firstNumber = 5;
		// 定数secondNumberを4で初期化
		final double secondNumber = 4;
		// 定数thirdNumberを3で初期化
		final double thirdNumber = 3;
		
		// 配列firstElementを、{1,0,-1}で生成
		double[] firstElement = {1,0,-1};
		
		// 二値の最大値を表示
		System.out.println("二値の最大値：" + MinMax.calculateMax(firstNumber, secondNumber));
		// 三値の最大値を表示
		System.out.println("三値の最大値："+ MinMax.calculateMax(firstNumber, secondNumber, thirdNumber));
		// 配列の要素の値の最大値を幼児
		System.out.println("配列の最大値：" + MinMax.calculateMax(firstElement));
		// 改行
		System.out.println();
		
		// 二値の最小値を表示
		System.out.println("二値の最小値：" + MinMax.calculateMinimum(firstNumber, secondNumber));
		// 三値の最小値を表示
		System.out.println("三値の最小値："+ MinMax.calculateMinimum(firstNumber, secondNumber, thirdNumber));
		// 配列の要素の値の最小値を表示
		System.out.println("配列の最小値：" + MinMax.calculateMinimum(firstElement));
	}
	

}
