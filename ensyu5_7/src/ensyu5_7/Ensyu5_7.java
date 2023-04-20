package ensyu5_7;

/*
 * クラス名：Ensyu5_7
 * 概要：演習5_7
 * 作成者：OikaaKouhei
 * 作成日：2023/04/20
 */
public class Ensyu5_7 {
	/*
	 * 関数名：main
	 * 概要：0.0から1.0まで0.001沖に、その値と、その値の2乗を表示するプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		//「  元値        ２乗   」を表示し、左が元値、右が２乗であることを示す
		System.out.println("  元値        ２乗   ");
		//「---------------------」を表示
		System.out.println("----------------------");
		
		/*
		 * int型変数repeatNumberを0で初期化
		 * repeatNumberが1000以下の間、以降の文を実行する
		 * repeatNumberの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int repeatNumber = 0 ; repeatNumber <= 1000 ; repeatNumber++) {
			// float型変数firstNumberを、int型からfloat型に拡大変換した変数repeatNumberを1000で割った値で初期化
			float firstNumber = (float)repeatNumber / 1000;
			// 元の値を全体を9桁で、小数点以下を7桁で表示
			System.out.printf("%9.7f" , firstNumber);
			// 2乗値を全体を9桁で、小数点以下を7桁で表示し改行
			System.out.printf("    %9.7f \n" , firstNumber * firstNumber);
		}
	}
}
