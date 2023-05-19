package shape;
/*
 * クラス名：HorizontalLine
 * 概要：水平直線を表すクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public class HorizontalLine extends AbstractLine {
	
	/*
	 * コンストラクタ
	 * 概要：親クラスのAbstractLineのコンストラクタを呼び出し、長さを引数として受け取る
	 * 引数：int lengthNumber
	 * 返り値：なし
	 * パラメーターの説明：長さ
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	public HorizontalLine(int lengthNumber) {
		// 親クラスのコンストラクタを呼び出し、lengthNumberの値を取得
		super(lengthNumber);
	}
	
	/*
	 * 関数名：toString
	 * 概要：水平直線に関する図形情報を表す文字列をオーバーライドし返却
	 * 引数：なし
	 * 返り値："HorizontalLine(長さ" + getLength() + ")"
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	public String toString() {
		// "HorizontalLine(長さ" + getLength() + ")"を返す
		return "HorizontalLine(長さ：" + getLength() + ")";
	}

	/*
	 * 関数名：drawFigure
	 * 概要：水平直線を描画するメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	@Override
	public void drawFigure() {
		/*
		 * 「水平直線を描画するためのループ文」
		 * 条件設定のための変数を1で初期化
		 * 取得した長さの値以下の間、繰り返し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備
		 */
		for (int firstCount = 1; firstCount <= getLength(); firstCount++) {
			// -を表示
			System.out.print('-');
		}
		// 改行
		System.out.println();
	}

}
