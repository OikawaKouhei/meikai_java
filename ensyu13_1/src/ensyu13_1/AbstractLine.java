package ensyu13_1;

/*
 * クラス名：AbatLine
 * 概要：抽象クラスShapeから派生した直線を表す抽象クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public abstract class AbstractLine extends Shape {
	// 直線を表すフィールド
	private int lengthNumber;
	
	/*
	 * コンストラクタ
	 * 概要：長さを引数として受け取る
	 * 引数：int lengthNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public AbstractLine(int lengthNumber) {
		// 引数lengthNumberでsetLengthメソッドを呼び出し、lengthNumberフィールドの値を初期化
		setLength(lengthNumber);
	}
	
	
	/*
	 * 関数名：getLength
	 * 概要：直線の長さを取得するためのメソッド(ゲッタ)
	 * 引数：なし
	 * 返り値；lengthNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public int getLength() {
		// lengthNumberの値を返す
		return lengthNumber;
	}
	
	/*
	 * 関数名：setLength
	 * 概要：直線の長さを設定するためのメソッド(セッタ)
	 * 引数：int lengthNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKOuhei
	 * 作成日：2023/05/19
	 */
	public void setLength(int lengthNumber) {
		// そのオブジェクトのlengthNumberの値に、引数lengthNumberの値を代入
		this.lengthNumber = lengthNumber;
	}
	
	/*
	 * 関数名：toString
	 * 概要：直線に関する図形情報を表す文字列を返却するメソッド
	 * 引数：toString
	 * 返り値："AbstLine(長さ： " + lengthNumber + ")"
	 * パラメーターの説明：なし
	 */
	public String toString() {
		//「"AbstLine(長さ： " + lengthNumber + ")"」を返す
		return "AbstLine(長さ： " + lengthNumber + ")";
	}
	
}
