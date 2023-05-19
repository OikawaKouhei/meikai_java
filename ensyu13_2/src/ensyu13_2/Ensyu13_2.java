package ensyu13_2;

//java.util.Scannerパッケージを利用するためのimport宣言
import java.util.Scanner;

//shape.BottomLeftパッケージを利用するためのimport宣言
import shape.BottomLeft;
//shape.BottomRightパッケージを利用するためのimport宣言
import shape.BottomRight;
// shape.HorizontalLineパッケージを利用するためのimport宣言
import shape.HorizontalLine;
//shape.Pointパッケージを利用するためのimport宣言
import shape.Point;
// shape.Rectangleパッケージを利用するためのimport宣言
import shape.Rectangle;
//shape.Shapeパッケージを利用するためのimport宣言
import shape.Shape;
//shape.UppLeftパッケージを利用するためのimport宣言
import shape.UppLeft;
//shape.UpperRightパッケージを利用するためのimport宣言
import shape.UpperRight;
// shape.VirticalLineパッケージを利用するためのimport宣言
import shape.VirticalLine;

/*
 * クラス名：Ensyu13_1
 * 概要：図形クラス群をテストするプログラム群
 * 作成者：OikawaKouhei
 * 作成日：2023/05/19
 */
public class Ensyu13_2 {

	/*
	 * 関数名：inputNumber
	 * 概要：入力値を返すためのメソッド
	 * 引数：String inputName
	 * 返り値：outPutNumber
	 * パラメーターの説明：どの入力値を入力しているか表示させるため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public static int inputNumber(String inputName) {
		Scanner standardInput = new Scanner(System.in);
		// 返り値用の変数を0で初期化
		int outPutNumber = 0;
		// 以降の文を繰り返し実行
		do {
			// inputNameを表示
			System.out.print(inputName);
			// outPutNumberの値に入力した値を代入
			outPutNumber = standardInput.nextInt();
			// outPutNumberの値が0以下の場合、判断
			if (outPutNumber <= 0) {
				//「再度正の整数を入力してください。」を表示
				System.out.println("再度正の整数を入力してください。");
			}
			// outPutNumberの値が0以下の場合、繰り返し実行
		} while(outPutNumber <= 0);
		// outPutNumberの値を返す
		return outPutNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：図形クラス群をテストするプログラム軍
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public static void main(String[] args) {
		// 図形の個数を表す変数を0で初期化
		int figureQuantity = 0;
		// "図形は何個："を引数としてinputNumberメソッドを呼び出し、その値をfigureQuantityに代入
		figureQuantity = inputNumber("図形は何個：");
		// Shape型配列putShapeを、要素数figureQuantityの値で生成
		Shape[] putShape = new Shape[figureQuantity];
		
		
		/*
		 * 「Shape型配列の要素を代入するためのループ文」
		 * インデックスのための変数を0で初期化
		 * firstCountの値が、要素数未満の間、繰り返し実行
		 * firstCountの値をインクリメントする
		 */
		for (int firstCount = 0; firstCount < figureQuantity; firstCount++) {
			// どの図形を描画させるか選択させるための変数を、0で初期化
			int selectNumber = 0;
			// 選択肢の上限を表す定数
			final int SELECT_LIMIT = 8;
			// 以降の文を実行
			do {
				// selecyNumberの値に()内の文字列を引数にして、呼び出したinputNumberメソッドの値を代入
				selectNumber = inputNumber((firstCount + 1) + "番の図形の種類\n(1…点/2…水平直線/3…垂直直線/4…長方形\n5…右上直角三角形/6…右下直角三角形/7…左上直角三角形/8…左下直角三角形)：");
			// selecyNumberの値が4より大きければ、do以降から繰り返し実行
			} while(selectNumber > SELECT_LIMIT);
			// どの型でインスタンス化するか判断するためのスイッチ分
			switch(selectNumber) {
						// selecyNumberの値が1の場合、putShape型でインスタンス化
				case 1: putShape[firstCount] = new Point();
						// スイッチ文を抜ける
						break;
						// selecyNumberの値が2の場合、メソッドinputNumberの返り値の値を引数とし、インスタンス化
				case 2:	putShape[firstCount] = new HorizontalLine(inputNumber("長さ："));
						// スイッチ文を抜ける
						break;
						// selecyNumberの値が3の場合、メソッドinputNumberの返り値の値を引数とし、インスタンス化
				case 3:	putShape[firstCount] = new VirticalLine(inputNumber("長さ："));
						// スイッチ文を抜ける		
						break;
						// selecyNumberの値が4の場合、メソッドinputNumberの返り値の値2つを引数とし、インスタンス化
				case 4: putShape[firstCount] = new Rectangle(inputNumber("幅："),inputNumber("高さ："));
						// スイッチ文を抜ける		
						break;
						// selecyNumberの値が5の場合、メソッドUpperRightの返り値を引数とし、インスタンス化
				case 5: putShape[firstCount] = new UpperRight(inputNumber("高さ："));
						// スイッチ文を抜ける	
						break;
						// selecyNumberの値が7の場合、メソッドBottomRightの返り値を引数とし、インスタンス化
				case 6: putShape[firstCount] = new BottomRight(inputNumber("高さ："));
						// スイッチ文を抜ける	
						break;
						// selecyNumberの値が7の場合、メソッドUppLeftの返り値を引数とし、インスタンス化
				case 7: putShape[firstCount] = new UppLeft(inputNumber("高さ："));
						// スイッチ文を抜ける	
						break;
						// selecyNumberの値が8の場合、メソッドBottomLeftの返り値を引数とし、インスタンス化
				case 8: putShape[firstCount] = new BottomLeft(inputNumber("高さ："));
						// スイッチ文を抜ける	
						break;
			}
		}
		// 改行
		System.out.println();
		// 拡張for文でputShape型配列の要素をだす
		for (Shape firstCount : putShape) {
			// 暗黙のうちにアップキャストして、そのクラスの図形を表示
			firstCount.print();
			// 改行
			System.out.println();
		}
	}

}
