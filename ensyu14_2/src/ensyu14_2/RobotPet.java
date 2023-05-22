package ensyu14_2;
/*
 * クラス名：RobotPet
 * 概要：ロボットペットに自己紹介と家事、スキン変更させるためのクラス
 * 作成者；OikawaKouhei
 * 作成日：2023/05/21
 */
public class RobotPet extends Pet implements Skinnable {
	/*
	 * コンストラクタ
	 * 引数：String petName, String masterName
	 * 返り値：無し
	 * パラメーターの説明：なし
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public RobotPet(String petName, String masterName) {
		// Petクラスのコンストラクタを呼び出す
		super(petName, masterName);		
	}
	
	/*
	 * 関数名：introduceSelf
	 * 概要：自己紹介をさせる
	 * 引数：なし
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public void introduceSelf() {
		// 「◇僕はロボット。名前は" + getPetName() + "です。」を表示
		System.out.println("◇僕はロボット。名前は" + getPetName() + "です。");
		// 「◇ご主人様は" + getMasterName() + "です。」を表示
		System.out.println("◇ご主人様は" + getMasterName() + "です。");
	}
	/*
	 * 関数名：workMoving
	 * 概要：家事をさせる
	 * 引数：int commandNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	public void workMoving(int commandNumber) {
		// commandNumberの値の時に、家事をさせるためのスイッチ文
		switch(commandNumber) {
		// 「掃除します。」を表示して、文を抜ける
		case 0: System.out.println("掃除します。"); break;
		// 「洗濯します。」を表示して、文を抜ける
		case 1: System.out.println("洗濯します。"); break;
		// 「炊事します。」を表示して、文を抜ける
		case 2: System.out.println("炊事します。"); break;
		}
	}
	/*
	 * 関数名：changeSkin
	 * 概要：スキンを変更するメソッド
	 * 引数：int skinNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public void changeSkin(int skinNumber) {
		// skinNumberの値の時に、スキンの変更をさせるためのスイッチ文
		switch(skinNumber) {
		// 「黒色になりました」を表示して、文を抜ける
		case 0: System.out.println("黒色になりました"); break;
		// 「赤色になりました」を表示して、文を抜ける
		case 1: System.out.println("赤色になりました"); break;
		// 「緑色になりました」を表示して、文を抜ける
		case 2: System.out.println("緑色になりました"); break;
		

		}

	}

}