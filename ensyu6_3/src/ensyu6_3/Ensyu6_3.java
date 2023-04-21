package ensyu6_3;

/*
 * クラス名：Ensyu6_3
 * 概要：演習6_3
 * 作成者：OikawaKouhei
 * 作成日：2023/04/20
 */
public class Ensyu6_3 {
	/*
	 * 関数名：main
	 * 概要：要素型がidouble型で要素数が5の配列を生成し、それに対し、先頭から順に、
	 *       1.1,2.2,3.3,4.4,5.5を代入するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// int型配列の配列変数elementNumberを生成し、要素数5の配列本体を同時に生成
		double [] erementNumber = new double[5];
		
		// 実数を足すための変数originalElementを1で初期化
		double originalElement = 1 ;
		
		/*
		 * 繰り返し処理と、配列を表すための変数repeatNumberを0で初期化
		 * repeatNumberの値が、erementNumber.lengthの値(5)未満の間、繰り返しを実行
		 * repeatNumberの値をインクリメントする
		 * originalElementの値をインクリメントする
		 */
		for (int repeatNumber = 0 ; repeatNumber < erementNumber.length ; repeatNumber++ , originalElement++) {
			// 各配列に、「originalElement + ( originalElement / 10)」の値を代入
			erementNumber[repeatNumber] = originalElement + ( originalElement / 10);
		}
		/*
		 * 繰り返し処理と、配列を表すための変数repeatNumberを0で初期化
		 * repeatNumberの値が、erementNumber.lengthの値(5)未満の間、繰り返しを実行
		 * repeatNumberの値をインクリメントする
		 */
		for (int repeatNumber = 0 ; repeatNumber < erementNumber.length ; repeatNumber++) {
			// 各配列を表示し、そこに代入された数値も表示する
			System.out.println("erementNumber[" + repeatNumber + "] = " + erementNumber[repeatNumber]);
		}
	}

}
