package ensyu9_4;

/*
 * クラス名：Ensyu9_4
 * 概要：人の情報を入力・表示するクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Ensyu9_4 {
	/*
	 * 関数名：main
	 * 概要：人の情報を入力・表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static void main(String[] args) {
		// クラスHuman型の変数firstHumanを()内の値で生成
		Human firstHuman = new Human("山田",  165.5, 56.0, new Day(2000, 07,03));
		// インスタンスfirstHumanのtoString()メソッドを呼び出し表示
		System.out.print(firstHuman.toString());
	}

}
