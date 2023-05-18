package ensyu12_2;

/*
 * クラス名：Ensyu12_2
 * 概要：二つの銀行口座の残高を比較するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/05/18
 */
public class Ensyu12_2 {
	/*
	 * 関数名：main
	 * 概要：銀行口座を二つインスタンス化し、表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/18
	 */
	public static void main(String[] args) {
		// Accountクラス型でfirstAccountをインスタンス化
		Account firstAccount = new Account("山田", "0001", 1000);
		// TimeAccountクラスでsecondAccountをインスタンス化
		TimeAccount secondAccount = new TimeAccount("鈴木", "0002", 1000, 500);
		// TimeAccountクラスでthirdAccountをインスタンス化
		TimeAccount thirdAccount = new TimeAccount("柴田", "0003", 1000, 1000);
		// firstAccountとsecondAccountを比較して結果を表示
		System.out.println("firstAccountとsecondAccountを比較します。\n" + TimeAccount.compBalance(firstAccount,secondAccount));
		// firstAccountとthirdAccountを比較して結果を表示
		System.out.println("firstAccountとthirdAccountを比較します。\n" + TimeAccount.compBalance(firstAccount,thirdAccount));
		// secondAccountとthirdAccountを比較して表示
		System.out.println("secondAccountとthirdAccountを比較します。\n" + TimeAccount.compBalance(secondAccount,thirdAccount));
	}
	

}
