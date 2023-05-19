package shape;
/*
 * クラス名：Rectangle
 * 概要：長方形を表すクラス
 * 作成者：OikawaKOuhei
 * 作成日：2023/05/19
 */
public class Rectangle extends Shape {
	// 長方形の幅を表すフィールド
	private int widthNumber;
	// 長方形の高さを表すフィールド
	private int heigthNumber;
	
	/*
	 * コンストラクタ
	 * 引数：int widthNumber, int heigthNumber
	 * 返り値：なし
	 * パラメーターの説明：長方形の幅の値と高さの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public Rectangle(int widthNumber, int heigthNumber) {
		// widthNumberフィールド変数のフィールド変数の値を、引数のwidthNumberで初期化
		this.widthNumber = widthNumber;
		// heigthNumberフィールド変数の値を、引数のheigthNumberで初期化
		this.heigthNumber = heigthNumber;
	}
	
	/*
	 * 関数名：toString
	 * 概要：長方形に関する図形情報を表す文字列をオーバーライドし返却
	 * 引数：なし
	 * 返り値："Rectangle(長さ" + getLength() + ")"
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	@Override
	public String toString() {
		// "Rectangle(幅：" + widthNumber + ", 高さ：" + heigthNumber + ")"の文字列を返す
		return "Rectangle(幅：" + widthNumber + ", 高さ：" + heigthNumber + ")";
	}

	/*
	 * 関数名：drawFigure
	 * 概要：長方形を描画するメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	@Override
	public void drawFigure() {
		/*
		 * 【長方形を描画するためのループ文】
		 * 
		 * 「高さの列を決めるためのループ文」
		 * 縦列の表示を表す値を1で初期化
		 * firstCountの値がheigthNumberの値以下の間繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 1; firstCount <= heigthNumber; firstCount++) {
			/*
			 * 「幅の列を決めるためのループ文」
			 * 横列の表示を表す値を1で初期化
			 * secondCountの値がwidthNumberの値以下の間繰り返し実行
			 * secondCountの値をインクリメント
			 */
			for (int secondCount = 1; secondCount <= widthNumber; secondCount++) {
				// *を表示
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}

	}

}
