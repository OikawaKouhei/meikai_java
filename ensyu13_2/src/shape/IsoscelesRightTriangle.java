package shape;

/*
 * クラス名：IsoscelesRightTriangle
 * 概要：直角二等辺三角形を表す抽象クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public abstract class IsoscelesRightTriangle extends Shape {
	// 高さを表すフィールドを生成
	private int higthNumber;
	
	
	/*
	 * コンストラクタ
	 * 引数：int higthNumber, int bottomNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public IsoscelesRightTriangle(int higthNumber) {
		// setHigthメソッドを用いて、higthNumberフィールドを初期化
		setHigth(higthNumber);
	}
	/*
	 * 関数名：getHigth
	 * 概要：高さの値を取得
	 * 引数：なし
	 * 返り値：higthNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public int getHigth() {
		// higthNumberの値を返す
		return higthNumber;
	}
	
	
	/*
	 * 関数名：setHigth
	 * 概要：フィールドの高さの値を書き換える
	 * 引数：higthNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public void setHigth(int higthNumber) {
		// フィールドの値に、higthNumberを代入
		this.higthNumber = higthNumber;
	}
	
	
	/*
	 * 関数名：toString
	 * 概要：直角三角形の情報を表示
	 * 引数：なし
	 * 返り値："IsoscelesRightTriangle(高さ：" + higthNUmber + ",底辺：" + bottomNumber + ")"
	 * パラメーターの説明：なし
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public String toString() {
		// "IsoscelesRightTriangle(高さ：" + higthNUmber + ")"を返す
		return "IsoscelesRightTriangle(高さ：" + higthNumber + ")";
	}
}
