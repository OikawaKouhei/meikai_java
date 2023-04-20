package ensyu6_1;

/*
 * クラス名：Ensyu6_1
 * 概要：演習6_1
 * 作成者：OikawaKouhei
 * 作成日：2023/04/20
 */
public class Ensyu6_1 {
	/*
	 * 関数名：main
	 * 概要：要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// double型配列の配列変数elementNumberを生成し、要素数5の配列本体を同時に生成
		double[] erementNumber = new double[5];
		
		// 要素1に1.1を代入
		erementNumber[1] = 1.1 ;
		// 要素2に2.2を代入
		erementNumber[2] = 2.2 ;
		// 要素3に3.3を代入
		erementNumber[3] = 3.3 ;
		
		
		// 要素数が0の数値を表示
		System.out.println("erementNumber[" + 0 + "] = " + erementNumber[0]);
		// 要素数が1の数値を表示
		System.out.println("erementNumber[" + 1 + "] = " + erementNumber[1]);
		// 要素数が2の数値を表示
		System.out.println("erementNumber[" + 2 + "] = " + erementNumber[2]);
		// 要素数が3の数値を表示
		System.out.println("erementNumber[" + 3 + "] = " + erementNumber[3]);
		// 要素数が4の数値を表示
		System.out.println("erementNumber[" + 4 + "] = " + erementNumber[4]);
		
	}

}
