package ensyu15_7;
/*
 * クラス名：Ensyu15_7
 * 概要：コマンドラインで与えられた引数全てを加算して表示
 * 作成者：OikawaKouhei
 * 作成日：2023/05/23
 */
public class Ensyu15_7 {
	/*
	 * 関数名：main
	 * 概要：コマンドラインで与えられた引数全てを加算するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：コマンドライン引数
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/23
	 */
	public static void main(String[] args) {
		// 合計値を出すための変数を0.0で初期化
		double sumValue = 0.0;
		
		/*
		 * 「args配列全ての値を加算するための拡張for文」
		 * args配列の各要素firstIndexを表示
		 */
		for (String firstIndex: args) {
			// sumValueに、コマンドラインに与えられた各要素の値を加算代入
			sumValue += Double.parseDouble(firstIndex);
		}
		//合計値を表示
		System.out.println("合計値は" + sumValue + "です。");
	}

}
