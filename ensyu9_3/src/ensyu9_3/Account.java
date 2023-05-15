package ensyu9_3;

/*
 * クラス名：Account
 * 概要：銀行口座のクラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/12
 */
public class Account {
	// 口座名義を表す非公開フィールドaccountNameをnullで初期化
	private String accountName = null;
	// 口座番号を表す非公開フィールドaccountNumberをnullで初期化
	private String accountNumber = null;
	// 預金残高を表す非公開フィールドaccountBalanceを0で初期化
	private long accountBalance = 0;
	// 口座開設日を表す非公開フィールドopeningDayを初期化
	private Day openingDay ;
	
	// インスタンスの生成時に、コンストラクタで、口座の名義・番号・残高・開設日を初期化
	public Account(String accountName, String accountNumber, long accountBalance, Day openingDay) {
		// フィールドのaccountNameの値を、仮引数accountNameで初期化
		this.accountName = accountName;
		// フィールドのaccountNumberの値を、仮引数accountNumberで初期化
		this.accountNumber = accountNumber;
		//  フィールドのaccountBalanceの値を、仮引数accountBalanceで初期化
		this.accountBalance = accountBalance;
		// フィールドのopeningDayの値を、仮引数openingDayを、Dayクラスで生成し、そのインスタンスで初期化
		this.openingDay = new Day(openingDay);
	}
	/*
	 * 関数名：getName
	 * 概要：口座名義のゲッタ
	 * 引数：なし
	 * 返り値：accountName
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public String getName() {
		// accountNameの値を返す
		return accountName;
	}
	/*
	 * 関数名：getNumber
	 * 概要：口座番号のゲッタ
	 * 引数：なし
	 * 返り値：accountNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public String getNumber() {
		// accountNumberの値を返す
		return accountNumber;
	}
	/*
	 * 関数名：getBalance
	 * 概要：口座残高のゲッタ
	 * 引数：なし
	 * 返り値：accountBalance
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public long getBalance() {
		// accountBalanceの値を返す
		return accountBalance;
	}
	
	/*
	 * 関数名：getOpeningDay
	 * 概要：口座開設日のゲッタ
	 * 引数：なし
	 * 返り値：new Day(openingDay)
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public Day getOpeningDay() {
		// 口座開設日をDayクラスで新たにインスタンス化し、返す
		return new Day(openingDay);
	}
	
	/*
	 * 関数名：toString
	 * 概要：銀行口座の情報を表示するためのメソッド
	 * 引数：なし
	 * 返り値："口座名義：" + accountName + "\n口座番号：" + accountNumber 
				+ "\n預金残高：" + accountBalance + "\n口座開設日：" + getOpeningDay())
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public String toString() {
		// "口座名義：" + accountName + "\n口座番号：" + accountNumber + "\n預金残高：" + accountBalance + "\n口座開設日：" + getOpeningDay()文字列を返す
		return "口座名義：" + accountName + "\n口座番号：" + accountNumber 
				+ "\n預金残高：" + accountBalance + "\n口座開設日：" + getOpeningDay();
	}

}
