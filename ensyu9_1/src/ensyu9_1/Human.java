package ensyu9_1;

/*
 * クラス名：Human
 * 概要：人間の名前・身長・体重の情報をまとめたクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/12
 */
public class Human {
	// 人間の名前を表す非公開のフィールドをString変数で宣言
	private String humanName;
	// 人間の身長を表す非公開フィールドをdouble変数で宣言
	private double humanHeight;
	// 人間の体重を表す非公開フィールドをdouble変数で宣言
	private double humanWeight;

	/*
	 * 関数名：Human
	 * 概要：クラスのインスタンスを初期化するため
	 * 引数：String humanName , double humanHeight , double humanWeight
	 * 返り値：なし
	 * パラメーターの説明：フィールド変数を初期化するため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	Human(String humanName, double humanHeight, double humanWeight) {
		// humanNameフィールドに仮引数humanNameを代入
		this.humanName = humanName;
		// humanHeightフィールドに仮引数humanHeightを代入
		this.humanHeight = humanHeight;
		// humanWeightフィールドに仮引数humanWeightを代入
		this.humanWeight = humanWeight;
	}

	/*
	 * 関数名：getName
	 * 概要：humanNameを返すメソッド
	 * 引数：なし
	 * 返り値：humanName
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	String getName() {
		// humanNameを返す
		return humanName;
	}

	/*
	 * 関数名：getHeight
	 * 概要：humanHeightを返すメソッド
	 * 引数：なし
	 * 返り値：humanHeight
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	double getHeight() {
		// humanHeightの値を返す
		return humanHeight;
	}

	/*
	 * 関数名：getWeight
	 * 概要：humanWeightを返すメソッド
	 * 引数：なし
	 * 返り値：humanWeight
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	double getWeight() {
		// humanWeightの値を返す
		return humanWeight;
	}

	/*
	 * 関数名：changesHeight
	 * 概要：身長の増減を計算するメソッド
	 * 引数：changeHeightNumber
	 * 返り値：humanHeight
	 * パラメーターの説明：加減する値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	void changesHeight(double changeHeightNumber) {
		// humanHeightの値にchangeHeightNumberの値を加算する
		humanHeight += changeHeightNumber;
	}

	/*
	 * 関数名：changesWeight
	 * 概要：体重の増減を計算するメソッド
	 * 引数：changeWeightNumber
	 * 返り値：humanWeight
	 * パラメーターの説明：加減する値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/12
	 */
	void changesWeight(double changeWeightNumber) {
		// humanWeightの値にchangeWeightNumberの値を加算する
		humanWeight += changeWeightNumber;
	}
}
