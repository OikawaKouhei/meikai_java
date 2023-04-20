package ensyu5_6;

/*
 * クラス名：Ensyu5_6
 * 概要：演習5_6
 * 作成者：OikaaKouhei
 * 作成日：2023/04/20
 */
public class Ensyu5_6 {
	/*
	 * 関数名：main
	 * 概要：float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
	 * 　　　int型の変数を0から1000までインクリメントした値を1000で割った値を求める
	 * 　　　様子を、横に並べて表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		//「  float        int   」を表示し、左がfloat型、右がint型であることを示す
		System.out.println("  float        int   ");
		//「---------------------」を表示
		System.out.println("----------------------");
		
		// 変数repeatNumberを0で初期化
		int repeatNumber = 0;
		
		/*
		 * firstNumberをフロート型0.0の値で初期化する
		 * firstNumberの値がフロート型1.0の値以下の場合、以降の文を繰り返し判断
		 * firstNumberの値にフロート型0.001の値を加算する
		 */
		for (float firstNumber = 0.0F ; firstNumber <= 1.0F ; firstNumber += 0.001F) {
			// firstNumberの値を、全体を9桁で,小数点以下を7桁で表示
			System.out.printf("%9.7f",firstNumber);
			// 以降の文を実行
			do {
				// 変数secondNumberをint型からfloatg型へ拡大変換した変数repeatNumberを100で割った値で初期化
				float secondNumber = (float)repeatNumber/ 1000;
				// secondNumberの値を、全体を9桁で、小数点以下を7桁で表示し改行
				System.out.printf("    %9.7f\n" , secondNumber);
				// repeatNumberをインクリメント
				repeatNumber++ ;
				// for文を実行するためdo文を抜ける
				break;
			// repeatNumberの値が1000以下の場合繰り返し判断
			} while(repeatNumber <= 1000);
		}
	}

}
