package ensyu9_3;

/*
 * クラス名：Ensyu9_3
 * 概要：銀行口座の情報を入力・表示用のクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Ensyu9_3 {
	/*
	 * 関数名：main
	 * 概要：口座情報の縫う力表示用メソッド
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static void main(String[] args) {
		// クラスAccount型の変数firstAccountを()内の値で生成
		Account firstAccount = new Account("山田", "20342", 1000, new Day(2023, 05, 15));
		
		// firstAccountのgetOpeningDayメソッドを呼び出し、開設日を表示
		System.out.println( firstAccount.getOpeningDay() + "に口座を開設しました。");
		// firstAccountのtoStringメソッドを呼び出し表示
		System.out.println(firstAccount.toString());
	}

}
