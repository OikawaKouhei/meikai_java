package shape;

/*
 * クラス名：UppLeft
 * 概要：左上直角の二等辺三角形を表すクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public class UppLeft extends IsoscelesRightTriangle {
	/*
	 * コンストラクタ
	 * 引数：int higthNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public UppLeft(int higthNumber) {
		// 親クラスのコンストラクタを呼び出し、初期化
		super(higthNumber );
	}
	/*
	 * 関数名：drawFigure
	 * 概要：左上直角の二等辺三角形を描画するメソッド
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
		for (int firstCount = 0 ; firstCount < getHigth() ; firstCount++) {
			/*
			 * 「空白を表すループ文」
			 * 半角を表す変数を高さの値で初期化
			 * secondCountの値が、firstCountの値未満の間、繰り返し実行
			 * secondCountの値をデクリメント
			 */
			for (int secondCount = getHigth() ; secondCount > firstCount ; secondCount--) {
				//「*」を表示する
				System.out.print('*');
			}
			// その段で、表示したい「*」を表示し終えたら、改行する
			System.out.println();
		}
	}
	/*
	 * 関数名：toString
	 * 概要：直角三角形の情報を表示
	 * 引数：なし
	 * 返り値："UppLeft(高さ：" + getHigth() + ",底辺：" + getBottom() + ")";
	 * パラメーターの説明：なし
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public String toString() {
		// "UppLeft(高さ：" + getHigth() + ")"を返す
		return "UppLeft(高さ：" + getHigth() + ")";
	}

}
