package ensyu10_3;

/*
 * クラス名：MinMax
 * 概要：二値・三値・配列の最小値・最大値を求めるクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/16
 */
public class MinMax {

	/*
	 * 関数名：max
	 * 概要：二値の最大値を求める
	 * 引数：double firstNumber, double secondNumber
	 * 返り値：maxNumber
	 * パラメーターの説明：比較する二つの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static double calculateMax(double firstNumber, double secondNumber) {
		// 比較する二値のうち最大値を返す変数を0で初期化
		double maxNumber = 0;
		// maxNumberの値にfirstNumberの値を代入
		maxNumber = firstNumber;
		// maxNumberの値が、secondNumberの値未満の場合、判断
		if (maxNumber < secondNumber) {
			// maxNumberにsecondNumberの値を代入
			maxNumber = secondNumber;
		}
		// maxNumberの値を返す
		return maxNumber;
	}

	/*
	 * 関数名：max
	 * 概要：三値の最大値を求める
	 * 引数：double firstNumber, double secondNumber, double thirdNumber
	 * 返り値：maxNumber
	 * パラメーターの説明：比較する三つの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static double calculateMax(double firstNumber, double secondNumber, double thirdNumber) {
		// 比較する三値のうち最大値を返す変数を0で初期化
		double maxNumber = 0;
		// maxNumberの値にfirstNumberの値を代入
		maxNumber = firstNumber;
		// maxNumberの値が、secondNumberの値の値未満の場合、判断
		if (maxNumber < secondNumber) {
			// maxNumberにsecondNumberの値を代入
			maxNumber = secondNumber;
		}
		// maxNumberの値が、thirdNumberの値の値未満の場合、判断
		if (maxNumber < thirdNumber) {
			// maxNumberにthirdNumberの値を代入
			maxNumber = thirdNumber;
		}
		// maxNumberの値を返す
		return maxNumber;
	}
	
	/*
	 * 関数名：max
	 * 概要：配列の最大値を求める
	 * 引数：double[] firstNumber
	 * 返り値：maxNumber
	 * パラメーターの説明：比較する要素数の値の配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static double calculateMax(double[] firstElement) {
		// 比較する配列のうち最大値を返す変数を0で初期化
		double maxNumber = 0;
		// maxNumberにfirstElement[0]の値を代入
		maxNumber = firstElement[0];
		/*
		 * 【配列の要素の値の最大値を求めるループ文】
		 * 
		 * インデックスを表す円数を０で初期化
		 * firstCountの値が愛列の要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントする
		 */
		for (int firstCount = 0; firstCount < firstElement.length; firstCount++ ) {
			
			// maxNumberの値がfirstElement[firstCount]未満の場合、判断
			if (maxNumber < firstElement[firstCount]) {
				// maxNumberにfirstElement[firstCount]の値を代入
				maxNumber = firstElement[firstCount];
			}	
		}
		// maxNumberの値を返す
		return maxNumber;
	}
	
	/*
	 * 関数名：min
	 * 概要：二値の最小値を求める
	 * 引数：double firstNumber, double secondNumber
	 * 返り値：minimumNumber
	 * パラメーターの説明：比較する二つの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static double calculateMinimum(double firstNumber, double secondNumber) {
		// 比較する二値のうち最大値を返す変数を0で初期化
		double minimumNumber = 0;
		// minimumNumberの値にfirstNumberの値を代入
		minimumNumber = firstNumber;
		// minimumNumberの値が、secondNumberの値より大きい場合、判断
		if (minimumNumber > secondNumber) {
			// minimumNumberにsecondNumberの値を代入
			minimumNumber = secondNumber;
		}
		// minimumNumberの値を返す
		return minimumNumber;
	}
	
	/*
	 * 関数名：min
	 * 概要：三値の最大値を求める
	 * 引数：double firstNumber, double secondNumber, double thirdNumber
	 * 返り値：maxNumber
	 * パラメーターの説明：比較する三つの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static double calculateMinimum(double firstNumber, double secondNumber, double thirdNumber) {
		// 比較する三値のうち最大値を返す変数を0で初期化
		double minimumNumber = 0;
		// minimumNumberの値にfirstNumberの値を代入
		minimumNumber = firstNumber;
		// minimumNumberの値が、secondNumberの値より大きい場合、判断
		if (minimumNumber > secondNumber) {
			// minimumNumberにsecondNumberの値を代入
			minimumNumber = secondNumber;
		}
		// minimumNumberの値が、thirdNumberの値より大きい場合、判断
		if (minimumNumber > thirdNumber) {
			// minimumNumberにthirdNumberの値を代入
			minimumNumber = thirdNumber;
		}
		// minimumNumberの値を返す
		return minimumNumber;
	}
	
	/*
	 * 関数名：min
	 * 概要：配列の最大値を求める
	 * 引数：double[] firstNumber
	 * 返り値：minimumNumber
	 * パラメーターの説明：比較する要素数の値の配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/16
	 */
	public static double calculateMinimum(double[] firstElement) {
		// 比較する配列のうち最大値を返す変数を0で初期化
		double minimumNumber = 0;
		// maxminimumNumberNumberにfirstElement[0]の値を代入
		minimumNumber = firstElement[0];
		/*
		 * 【配列の要素の値の最大値を求めるループ文】
		 * 
		 * インデックスを表す円数を０で初期化
		 * firstCountの値が配列の要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントする
		 */
		for (int firstCount = 0; firstCount < firstElement.length; firstCount++ ) {
			
			// minimumNumberの値がfirstElement[firstCount]より大きい場合、判断
			if (minimumNumber > firstElement[firstCount]) {
				// minimumNumberにfirstElement[firstCount]の値を代入
				minimumNumber = firstElement[firstCount];
			}	
		}
		// minimumNumberの値を返す
		return minimumNumber;
	}

}