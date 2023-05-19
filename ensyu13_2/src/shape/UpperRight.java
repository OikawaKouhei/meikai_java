package shape;

/*
 * クラス名：UpperRight
 * 概要：右上直角の直角二等辺三角形
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public class UpperRight extends IsoscelesRightTriangle {
	
	/*
	 * コンストラクタ
	 * 引数：int higthNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public UpperRight(int higthNumber) {
		// 親クラスのコンストラクタを呼び出し、初期化
		super(higthNumber);
	}
	
	/*
	 * 関数名：drawFigure
	 * 概要：右上直角の二等辺三角形を描画するメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public void drawFigure() {
		
		/*
		 * 【右上直角の二等辺三角形を描画するための多重ループ】
		 * 
		 * 「高さを表すループ文」
		 * 高さを表す変数を0で初期化
		 * firstCountの値が、高さの値未満の間、繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 0; firstCount < getHigth(); firstCount++) {
			/*
			 * 「空白を表すループ文」
			 * 半角を表す変数を高さの値で初期化
			 * secondCountの値が、firstCountの値未満の間、繰り返し実行
			 * secondCountの値をデクリメント
			 */
			for (int secondCount = 0; secondCount < firstCount; secondCount++) {
				//「 」を表示し、右下が直角になるようにする
				System.out.print(' ');
				
			} 
			/*
			 * 「*を表すループ文」
			 * 「*」を表す変数を0で初期化
			 * thirdCountの値が、firstCountの値未満の間、繰り返し実行
			 * thirdCountの値をインクリメント
			 */
			for (int thirdCount = getHigth(); thirdCount > firstCount; thirdCount--) {
				//「*」を表示し、直角三角形をつくる	
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
	 * 返り値："UpperRight(高さ：" + getHigth() + ")";
	 * パラメーターの説明：なし
	 * 作成者：OIkawaKouhei
	 * 作成日：2023/05/19
	 */
	@Override
	public String toString() {
		// "UpperRight(高さ：" + getHigth() + ")"を返す
		return "UpperRight(高さ：" + getHigth() + ")";
	}
}
