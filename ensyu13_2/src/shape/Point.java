package shape;

/*
 * クラス名：Point
 * 概要：抽象クラスShapeから派生した点を表すクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public class Point extends Shape {
	
	/*
	 * コンストラクタ
	 * 概要：点を生成するため
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public Point() {
		
	}

	/*
	 * 関数名：toString
	 * 概要："Point"を表す文字列を返却する抽象メソッド
	 * 引数：なし
	 * 返り値："Point"
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		// 文字列"Point"を返す
		return "Point";
	}

	/*
	 * 関数名：drawFigure
	 * 概要：+を一つ表示じ改行するためのメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public void drawFigure() {
		// TODO 自動生成されたメソッド・スタブ
		// プラス記号を点の代わりに、一つ表示して改行
		System.out.println('+');
	}

}
