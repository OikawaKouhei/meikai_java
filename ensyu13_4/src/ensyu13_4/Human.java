package ensyu13_4;

/**
 * クラス名：Human
 * 概要：人を表すクラス
 * 作成日：2023/05/12
 * @author OikawaKouhei
 */
public class Human {
	/** 人間の名前を表す非公開のフィールドをString変数で宣言*/
	private String humanName;
	/*: 人間の身長を表す非公開フィールドをdouble変数で宣言*/
	private double humanHeight;
	/** 人間の体重を表す非公開フィールドをdouble変数で宣言*/
	private double humanWeight;
	/** 誕生日を表す非公開フィールドをDay型変数で宣言*/
	private Day birthDay;

	/**
	 * 人の名前・身長・体重・誕生日のコンストラクタ
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param humanName 設定する名前
	 * @param humanHeight 設定する身長
	 * @param humanWeight 設定する体重
	 * @param birthDay 設定する誕生日
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

	/**
	 * 関数名：getName
	 * 概要：名前を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return humanName 人の名前
	 */
	public String getName() {
		// humanNameを返す
		return humanName;
	}

	/**
	 * 関数名：getHeight
	 * 概要：身長を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return humanHeight 人の身長
	 */
	public double getHeight() {
		// humanHeightの値を返す
		return humanHeight;
	}

	/**
	 * 関数名：getWeight
	 * 概要：体重を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return humanWeight 人の体重
	 */
	public double getWeight() {
		// humanWeightの値を返す
		return humanWeight;
	}

	/**
	 * 関数名：getBirthDay
	 * 概要：名前を取得する
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return new Day(birthDay) 人の誕生日
	 */
	public Day getBirthDay() {
		// birthDayの値を返す
		return new Day(birthDay);
	}
	
	
	/**
	 * 関数名：changesHeight
	 * 概要：身長の増減を計算するメソッド
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param changeHeightNumber 加算する身長の増減分
	 */
	void changesHeight(double changeHeightNumber) {
		// humanHeightの値にchangeHeightNumberの値を加算する
		humanHeight += changeHeightNumber;
	}

	/**
	 * 関数名：changesWeight
	 * 概要：体重の増減を計算するメソッド
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @param changeWeightNumber 加算する体重の増減分
	 */
	void changesWeight(double changeWeightNumber) {
		// humanWeightの値にchangeWeightNumberの値を加算する
		humanWeight += changeWeightNumber;
	}
	
	/**
	 * 関数名：changesWeight
	 * 概要：生成したオブジェクトの情報を文字列で返却するメソッド
	 * 作成日：2023/05/12
	 * @author OikawaKouhei
	 * @return "名前：" + humanName + "\n身長：" + humanHeight + "\n体重：" 
				+ humanWeight + "\n誕生日：" + new Day(birthDay) 生成したオブジェクトの名前・身長・体重・誕生日の文字列
	 */
	public String toString() {
		// "名前：" + humanName + "\n身長：" + humanHeight + "\n体重：" + humanWeight + "\n誕生日：" + new Day(birthDay)を返す
		return "名前：" + humanName + "\n身長：" + humanHeight + "\n体重：" 
				+ humanWeight + "\n誕生日：" + new Day(birthDay) ;
	}
}
