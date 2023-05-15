package ensyu9_4;

/*
 * クラス名：Human
 * 概要：人間の名前・身長・体重の情報をまとめたクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/11
 */
public class Human {
	// 人間の名前を表す非公開のフィールドをString変数で宣言
	private String humanName;
	// 人間の身長を表す非公開フィールドをdouble変数で宣言
	private double humanHeight;
	// 人間の体重を表す非公開フィールドをdouble変数で宣言
	private double humanWeight;
	// 誕生日を表す非公開フィールドをDay型変数で宣言
	private Day birthDay;

	/*
	 * 関数名：Human
	 * 概要：クラスのインスタンスを初期化するため
	 * 引数：String humanName , double humanHeight , double humanWeight, Day birthDay
	 * 返り値：なし
	 * パラメーターの説明：フィールド変数を初期化するため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	Human(String humanName, double humanHeight, double humanWeight, Day birthDay) {
		// humanNameフィールドに仮引数humanNameを代入
		this.humanName = humanName;
		// humanHeightフィールドに仮引数humanHeightを代入
		this.humanHeight = humanHeight;
		// humanWeightフィールドに仮引数humanWeightを代入
		this.humanWeight = humanWeight;
		// birthDayフィールドに仮引数birthDayを引数として生成した、Day型のインスタンスを渡す
		this.birthDay = new Day(birthDay);
		
	}

	/*
	 * 関数名：getName
	 * 概要：humanNameを返すメソッド
	 * 引数：なし
	 * 返り値：humanName
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public String getName() {
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
	 * 作成日：2023/05/15
	 */
	public double getHeight() {
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
	 * 作成日：2023/05/15
	 */
	public double getWeight() {
		// humanWeightの値を返す
		return humanWeight;
	}

	/*
	 * 関数名：getBirthDay
	 * 概要：birthDayを返すメソッド
	 * 引数：なし
	 * 返り値：new Day(birthDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public Day getBirthDay() {
		// birthDayの値を返す
		return new Day(birthDay);
	}
	
	
	/*
	 * 関数名：changesHeight
	 * 概要：身長の増減を計算するメソッド
	 * 引数：changeHeightNumber
	 * 返り値：humanHeight
	 * パラメーターの説明：加減する値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/11
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
	 * 作成日：2023/05/11
	 */
	void changesWeight(double changeWeightNumber) {
		// humanWeightの値にchangeWeightNumberの値を加算する
		humanWeight += changeWeightNumber;
	}
	
	/*
	 * 関数名：toString
	 * 概要：人の情報を表示するためのメソッド
	 * 引数：なし
	 * 返り値："名前：" + humanName + "\n身長：" + humanHeight + "\n体重：" 
				+ humanWeight + "\n誕生日：" + new Day(birthDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public String toString() {
		// "名前：" + humanName + "\n身長：" + humanHeight + "\n体重：" + humanWeight + "\n誕生日：" + new Day(birthDay)を返す
		return "名前：" + humanName + "\n身長：" + humanHeight + "\n体重：" 
				+ humanWeight + "\n誕生日：" + new Day(birthDay) ;
	}
}
