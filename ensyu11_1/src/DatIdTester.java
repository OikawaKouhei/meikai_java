import id.DateId;
/*
 * クラス名；DatIdTester
 * 概要：DateIdクラスのテスト用
 * 作成者：OikawaKouhei
 * 作成日：2023/05/18
 */
public class DatIdTester {
	/*
	 * 関数名；main
	 * 概要：識別番号を生成
	 * 引数：String[] args
	 * 返り値；なし
	 * 作成者；OikawaKouhei
	 * 作成日；2023/05/18
	 */
	public static void main(String[] args) {
		// DateIdクラスのfirstIdを生成
		DateId firstId = new id.DateId();
		// DateIdクラスのsecondIdを生成
		DateId secondId = new id.DateId();
		// DateIdクラスのthirdIdを生成
		DateId thirdId = new id.DateId();
		
		// firstIdの識別番号を表示
		System.out.println("firstIdの識別番号：" + firstId.getId());
		// secondIdの識別番号を表示
		System.out.println("secondIdの識別番号：" + secondId.getId());
		// thirdIdの識別番号を表示
		System.out.println("thirdIdの識別番号：" + thirdId.getId());
	}

}
