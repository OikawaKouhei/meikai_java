package ensyu10_5;

/*
 * クラス名：Ensyu10_5
 * 概要：インスタンスが生成するたびに、インスタンス初期化しで文字列を表示
 * 作成者：OikawaKouhei
 * 作成日：2023/05/18
 */
public class Ensyu10_5 {
	/*
	 * 関数名：main
	 * 概要：Accountクラスのインスタンスを生成
	 * 引数；String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/18
	 */
	public static void main(String[] args) {
		// Dayクラス型変数firstDayで、引数なしでインスタンス化
		Day firstDay = new Day();
		// Accountクラス型変数firstAccountで、引数("山田", "0001", 2000, firstDay )で生成
		Account firstAccount = new Account("山田", "0001", 2000, firstDay );
		// firstAccountのオブジェクトを表示
		System.out.println(firstAccount.toString() + "\n");
	
		// Accountクラス型変数secondAccountで、引数("鈴木", "0002", 3000, firstDay )で生成
		Account secondAccount = new Account("鈴木", "0002", 3000, firstDay );
		// secondAccountのオブジェクトを表示
		System.out.println(secondAccount.toString() + "\n");
	}
	

}
