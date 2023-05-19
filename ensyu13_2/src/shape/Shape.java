package shape;

/*
 * クラス名：Shape
 * 概要：図形の概念を表す抽象クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public abstract class Shape {
	/*
	 * 関数名：toString
	 * 概要：図形情報を表す文字列を返却する抽象メソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public abstract String toString();
		
	/*
	 * 関数名：drawFigure
	 * 概要：図形を描写するする抽象メソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public abstract void drawFigure();
	
	/*
	 * 関数名：printFigure
	 * 概要：図形情報の表示と図形の描画を行うメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public void print() {
		// メソッドtoStringが返却する文字列を表示して改行
		System.out.println(toString());
		// メソッドdrowを呼び出して図形の描画をする
		drawFigure();
	}

}
