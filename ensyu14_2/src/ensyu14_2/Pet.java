package ensyu14_2;
/*
 * クラス名：Pet
 * 概要：ペットに自己紹介させるためのクラス
 * 作成者；OikawaKouhei
 * 作成日：2023/05/21
 */
public class Pet {
	// ペットの名前を表すフィールド
	private String petName;
	// 主人の名前を表すフィールド
	private String masterName;
	
	/*
	 * コンストラクタ
	 * 引数：String petName, String masterName
	 * 返り値：無し
	 * パラメーターの説明：なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public Pet(String petName, String masterName) {
		// ペットの名前を表すフィールドのpetNameに引数petNameを代入
		this.petName = petName;
		// 主人の名前を表すフィールドのmasterNameに引数masterNameを代入
		this.masterName = masterName;
	}
	/*
	 * 関数名：getPetName
	 * 概要：petNameを取得
	 * 引数：なし
	 * 返り値：petName
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public String getPetName() {
		// petNameを返す
		return petName;
	}
	
	/*
	 * 関数名：getMasterName
	 * 概要：masterNameを取得
	 * 引数：なし
	 * 返り値：petName
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public String getMasterName() {
		// petNameを返す
		return masterName;
	}
	
	/*
	 * 関数名：introduceMine
	 * 概要：自己紹介を指せる
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public void introduceSelf() {
		// 「■僕の名前は" + petName + "です。」を表示
		System.out.println("■僕の名前は" + petName + "です。");
		// 「■ご主人様は" + masterName + "です。」を表示
		System.out.println("■ご主人様は" + masterName + "です。");
	}
}
