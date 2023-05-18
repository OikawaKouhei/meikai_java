package ensyu12_2;

public class TimeAccount extends Account {
	// 定期預金残高を表す非公開フィールドを生成
	private long timeBalance;
	
	/*
	 * コンストラクタ
	 * 概要：定期預金付き銀行口座のインスタンス生成時のコンストラクタ
	 * 引数：
	 * 返り値；なし
	 * パラメーターの説明：口座名義・口座番号・普通預金残高・定期預金
	 * 作成者：OikawaKouhei
	 * 作成日；2023/05/18
	 */
	TimeAccount(String accountName, String accountNumber, long accountBalance, long timeBalance) {
		super(accountName, accountNumber, accountBalance );
		this.timeBalance = timeBalance;
	}
	/*
	 * 関数名：getTimeBalance
	 * 概要：定期預金の残高の値を返す
	 * 引数：なし
	 * 返り値：timeBalance
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/18
	 */
	long getTimeBalance() {
		// timeBalanceの値を返す
		return timeBalance;
	}
	/*
	 * 関数名：
	 * 概要：二つの値を比較して、-1/0/1のどれかを返すメソッド
	 * 引数：long firstNumber, long secondNumber
	 * 返り値：judgementNumber
	 * パラメーターの説明：比較する二つの値
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/18
	 */
	static int compareValue(long firstNumber, long secondNumber) {
		// judgementNumberの値を0で初期化
		int judgementNumber = 0;
		// firstNumberの値がsecondNumberの値より大きければ判断
		if(firstNumber > secondNumber) {
			// judgementNumberの値に1を代入
			judgementNumber = 1;
			// firstNumberの値がsecondNumberの値より小さければ判断
		} else if (firstNumber < secondNumber) {
			// judgementNumberの値に-1を代入
			judgementNumber = -1;
		}
		// judgementNumberの値を返す
		return judgementNumber;
	}
	
	/*
	 * 関数名：sumBalance
	 * 概要：引数のクラス型がAccount型であれば、普通預金の金額を返し、
	 * 　　　TimeAccount型であれば、普通預金と定期預金の合計額を返すメソッド
	 * 引数：Account sumAccount
	 * 返り値：sumNumber
	 * パラメーターの説明：合計値を出す、Accountクラス型変数
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/18
	 */
	static long sumBalance(Account sumAccount) {
		// sumNumberの値を0で初期化
		long sumNumber = 0;
		// sumAccountがTimeAccount型にキャストできる下位クラスであれば判断
		if (sumAccount instanceof TimeAccount) {
			// sumNumberに普通預金と定期預金の合計値を代入
			sumNumber = ((TimeAccount)sumAccount).getBalance() + ((TimeAccount)sumAccount).getTimeBalance();
		// そうでない場合判断
		} else {
			// umNumberに普通預金の値を代入
			sumNumber = sumAccount.getBalance();
		}
		// sumNumberの値を返す
		return sumNumber;
	}
	
	/*
	 * 関数名：compBalance
	 * 概要：aの合計値が多ければ1、等しければ0、bの合計値が多ければ-1を返すメソッド
	 * 引数：Account a, Account b
	 * 返り値：judgementNumber
	 * パラメーターの説明：比較するAccountクラス型変数
	 * 作成者：OkawaKouhei
	 * 作成日：2023/05/18
	 */
	static int compBalance(Account a, Account b) {
		// 返り値のための変数を0で初期化
		int judgementNumber = 0;
		// long型変数sumfirstにクラス型変数aの最大値を代入
		long sumFirst = sumBalance(a);
		// long型変数sumSecondにクラス型変数bの最大値を代入
		long sumSecond = sumBalance(b);
		// sumFirstの値とsumSecondの値を引数にして、compareValueメソッドを呼び出し、その値を代入
		judgementNumber = compareValue(sumFirst,sumSecond);
		// judgementNumberの値を返す
		return judgementNumber;
	}
}
