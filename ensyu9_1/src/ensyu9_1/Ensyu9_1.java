package ensyu9_1;

/*
* クラス名：Ensyu9_1
* 概要：入力した名前と身長と体重を表示。
* 作成者：OikawaKouhei
* 作成日：2023/05/12
*/
public class Ensyu9_1 {
	/*
	 * 関数名：inputHuman
	 * 概要：名前と身長と体重を表示するためのメソッド
	 * 引数：Human[] fhisycalDisplay , String elementName
	 * 返り値：なし
	 * パラメーターの説明：人間クラスの配列の内容を表示するため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	static void inputHuman(Human[] fhisycalDisplay , String elementName) {
		/*
		 * 【配列の内容を表示していくためのループ文】
		 * インデックスを表す変数を0で初期化
		 * firstCountの値がfhisycalDisplayの要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備
		 */
		for (int firstCount = 0; firstCount < fhisycalDisplay.length; firstCount++) {
			// 人間クラス配列の、名前・身長・体重を表示
			System.out.println(elementName + "[" + firstCount + "]\n" 
											+ fhisycalDisplay[firstCount].getName() + "さん\n"
											+ fhisycalDisplay[firstCount].getHeight() + "cm\n"
											+ fhisycalDisplay[firstCount].getWeight() + "kg\n");
			
		}
	}

	/*
	 * 関数名：main
	 * 概要：身長と体重を表示するためのメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	public static void main(String[] args) {

		// クラス型インスタンスの配列の各要素を「"山田", 160, 60.5」「"鈴木", 145.3, 45」「"伊藤", 130.4, 50.9」で初期化
		Human[] nowFormating = {	new Human("山田", 160, 60.5),
									new Human("鈴木", 145.3, 45),
									new Human("伊藤", 130.4, 50.9),
								};

		// クラス型インスタンスの配列を生成
		Human[] afterFormating;

		// 配列の各要素に、「"鈴木", 160, 66.5」「"伊藤", 170, 69.5」「"山田", 180, 75.5」を代入
		afterFormating = new Human[] {	new Human("鈴木", 160, 66.5),
										new Human("伊藤", 170, 69.5),
										new Human("山田", 180, 75.5),
		};
		// inputHumanメソッドを用いて、nowFormating配列の要素を表示
		inputHuman(nowFormating , "nowFormating");
		// inputHumanメソッドを用いて、afterFormating配列の要素を表示
		inputHuman(afterFormating , "afterFormating");

	}
}
