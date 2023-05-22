package ensyu13_4;


/**
 * クラス名：Ensyu13_4
 * 概要：人の情報を入力・表示するクラス
 * 作成日：2023/05/15
 * @author OikawaKouhei
 */
public class Ensyu13_4 {
	/**
	 * 関数名：main
	 * 概要：人の情報を入力・表示するメソッド
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成日：2023/05/15
	 * @author OikawaKouhei
	 */
	public static void main(String[] args) {
		// クラスHuman型の変数firstHumanを()内の値で生成
		Human firstHuman = new Human("山田",  165.5, 56.0, new Day(2000, 07,03));
		// インスタンスfirstHumanのtoString()メソッドを呼び出し表示
		System.out.print(firstHuman.toString());
	}

}