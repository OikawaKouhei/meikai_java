package ensyu14_2;
/*
 * インターフェース名：Skinnable
 * 概要：スキン変更させるためのインターフェース
 * 作成者；OikawaKouhei
 * 作成日：2023/05/21
 */
public interface Skinnable {
	// 黒色を表すクラス変数で定数を0で初期化
	int BLACK_NUMBER = 0;
	// 赤色を表すクラス変数で定数を1で初期化
	int RED_NUMBER = 1;
	// 緑色を表すクラス変数で定数を2で初期化
	int GREEN_NUMBER = 2;
	/*
	 * 関数名：changeSkin
	 * 概要：スキン変更するための抽象メソッド
	 * 引数：int skinNumber
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKohei
	 * 作成日：2023/05/21
	 */
	void changeSkin(int skinNumber);
}
