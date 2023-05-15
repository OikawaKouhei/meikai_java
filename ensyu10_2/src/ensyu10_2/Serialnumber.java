package ensyu10_2;

/*
 * クラス名：Serialnumber
 * 概要：連番クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Serialnumber {
	// 識別番号を数えるための非公開フィールドcountNumberを0で初期化
	private static int countNumber = 1;
	// 識別番号を表示するための非公開フィールドidNumberを初期化
	private int idNumber;
	// 最後に与えた識別番号を表示するための非公開フィールドmaxNumberを初期化
	private static int plusId = 0;

	// コンストラクタで、フィールド変数を初期化
	public Serialnumber() {
		// フィールド変数maxNumberを、countNumberの値に加算代入
		plusId += countNumber;
		// フィールド変数idNumberを、plusIdの値で初期化
		idNumber = plusId;
		

	}

	/*
	 * 関数名：getIdNumber
	 * 概要：idNumberを取得する(ゲッタ)
	 * 引数：なし
	 * 返り値：idNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public int getIdNumber() {
		// idNumberの値を返す
		return idNumber;
	}
	
	/*
	 * 関数名：getMaxId
	 * 概要：getMaxIdを取得する(ゲッタ)
	 * 引数：なし
	 * 返り値：plusId
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static int getMaxId() {
		// pulsIdの値を返す
		return plusId;
	}
	
	/*
	 * 関数名：setPlus
	 * 概要：countNumberをセットする(セッタ)
	 * 引数：なし
	 * 返り値：countNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static int setPlus(int plusNumber) {
		// countNumberの値にplusNumberの値を代入
		countNumber = plusNumber;
		// countNumberの値を返す
		return countNumber;
	}

}
