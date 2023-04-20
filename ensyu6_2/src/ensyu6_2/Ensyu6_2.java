package ensyu6_2;

/*
 * クラス名：Ensyu6_2
 * 概要：演習6_2
 * 作成者：OikawaKouhei
 * 作成日：2023/04/20
 */
public class Ensyu6_2 {
	/*
	 * 関数名：main
	 * 概要：要素型がint型で要素数が5の配列を生成し、それに対し、先頭から順に、5,4,3,2,1を代入するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// int型配列の配列変数elementNumberを生成し、要素数5の配列本体を同時に生成
		int [] erementNumber = new int[5];
		
		// 要素数を定数として表した変数ORIGINAL_ELEMENTを5で初期化
		final int ORIGINAL_ELEMENT = 5;
		
		/*
		 * 繰り返し処理を行い、実行中の要素数を表すためのint型変数repeatNumberを0で初期化
		 * repeatNumberの値が5未満になるまで繰り返し処理を行う
		 * repeatNumberの値をインクリメントし、繰り返しの準備をする
		 */
		for (int repeatNumber = 0 ; repeatNumber < 5 ; repeatNumber++) {
			// 要素数を0から呼び出していき、5から1までを順番に代入
			erementNumber[repeatNumber] = ORIGINAL_ELEMENT - repeatNumber;
		}
		/*
		 * 繰り返し処理を行うためのint型変数repeatNumberを0で初期化
		 * repeatNumberの値が5未満になるまで繰り返し処理を行う
		 * repeatNumberの値をインクリメントし、繰り返しの準備をする
		 */
		for (int repeatNumber = 0 ; repeatNumber < 5 ; repeatNumber++) {
			// 呼び出した要素数に応じた、数値を表示する
			System.out.println("erementNumber[" + repeatNumber + "] = " + erementNumber[repeatNumber]);
		
		}
	}

}
