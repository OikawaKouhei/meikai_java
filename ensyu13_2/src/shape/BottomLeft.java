package shape;

/*
 * クラス名：UppLeft
 * 概要：左下直角の二等辺三角形を表すクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public class BottomLeft extends IsoscelesRightTriangle {
	
	/*
	 * コンストラクタ
	 * 引数：int higthNumber,
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public BottomLeft(int higthNumber) {
		// 親クラスのコンストラクタを呼び出し、初期化
		super(higthNumber);
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：左下直角の二等辺三角形を描画するメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public void drawFigure() {
		/*
		 * 【左上直角の二等辺三角形を描画するための多重ループ】
		 * 
		 * 「高さを表すループ文」
		 * 高さを表す変数を0で初期化
		 * firstCountの値が、高さの値未満の間、繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 1; firstCount <= getHigth(); firstCount++) {
			/*
			 * 「空白を表すループ文」
			 * 「*」を表す変数を高さの値で初期化
			 * secondCountの値が、firstCountの値未満の間、繰り返し実行
			 * secondCountの値をデクリメント
			 */
			for (int secondCount = 1; secondCount <= firstCount; secondCount++) {
				//「*」を表示し、直角三角形をつくる
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}

	}
	/*
	 * 関数名：toString
	 * 概要：直角三角形の情報を表示
	 * 引数：なし
	 * 返り値："BottomLeft(高さ：" + getHigth() + ")";
	 * パラメーターの説明：なし
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public String toString() {
		// "BottomLeft(高さ：" + getHigth() + ")"を返す
		return "BottomLeft(高さ：" + getHigth() + ")";
	}

}
