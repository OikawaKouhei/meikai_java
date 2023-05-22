package shape;
/*
 * クラス名：Rectangle
 * 概要：平行四辺形を表すクラス
 * 作成者：OikawaKOuhei
 * 作成日：2023/05/19
 */
public class Parallelogram extends Shape implements Plane2D {
	// 平行四辺形の幅を表すフィールド
	private int widthNumber;
	// 平行四辺形の高さを表すフィールド
	private int heigthNumber;

	/*
	 * コンストラクタ
	 * 引数：int widthNumber, int heigthNumber
	 * 返り値：なし
	 * パラメーターの説明：平行四辺形の幅の値と高さの値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public Parallelogram(int widthNumber, int heigthNumber) {
		// widthNumberフィールド変数のフィールド変数の値を、引数のwidthNumberで初期化
		this.widthNumber = widthNumber;
		// heigthNumberフィールド変数の値を、引数のheigthNumberで初期化
		this.heigthNumber = heigthNumber;
	}

	/*
	 * 関数名：getArea
	 * 概要：平行四辺形の面積を求める
	 * 引数：なし
	 * 返り値：widthNumber * heigthNumber
	 * パラメーターの説明：なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public int getArea() {
		// 平行四辺形の面積の値を返す
		return widthNumber * heigthNumber;
	}

	/*
	 * 関数名：toString
	 * 概要：平行四辺形に関する図形情報を表す文字列をオーバーライドし返却
	 * 引数：なし
	 * 返り値："Parallelogram(幅：" + widthNumber + ", 高さ：" + heigthNumber + ")"
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	@Override
	public String toString() {
		// "Rectangle(幅：" + widthNumber + ", 高さ：" + heigthNumber +  "面積：" + getArea() + ")"の文字列を返す
		return "Parallelogram(幅：" + widthNumber + ", 高さ：" + heigthNumber + "面積：" + getArea() + ")";
	}

	/*
	 * 関数名：drawFigure
	 * 概要：平行四辺形を描画するメソッド
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/19
	 */
	@Override
	public void drawFigure() {
		/*
		 * 【平行四辺形を描画するためのループ文】
		 * 
		 * 「高さの列を決めるためのループ文」
		 * 縦列の表示を表す値を1で初期化
		 * firstCountの値がheigthNumberの値以下の間繰り返し実行
		 * firstCountの値をインクリメント
		 */
		for (int firstCount = 1; firstCount <= heigthNumber; firstCount++) {
			/*
			 * 「空白を描画するためのループ文」
			 * 空白を表す値を1で初期化
			 * secondCountの値がheigthNumber - firstCountの値以下の間繰り返し実行
			 * secondCountの値をインクリメント
			 */
			for (int secondCount = 1; secondCount <= heigthNumber - firstCount; secondCount++)  {
				// 半角スペースを表示
				System.out.print(' ');
			}
			/*
			 * 「*を表示するためのループ文」
			 * *の個数を表す値を1で初期化
			 * thirdCountの値がwidthNumberの値以下の間繰り返し実行
			 * thirdCountの値をインクリメント
			 */
			for (int thirdCount = 1; thirdCount <= widthNumber; thirdCount++) {
				//「*」を表示
				System.out.print('*');
			}
			// 改行
			System.out.println();		}
	}

}
