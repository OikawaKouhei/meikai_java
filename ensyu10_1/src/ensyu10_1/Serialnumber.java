package ensyu10_1;

/*
 * クラス名：Serialnumber
 * 概要：連番クラス
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Serialnumber {
	// 識別番号を数えるための非公開フィールドcountNumberを0で初期化
	private static int countNumber = 0;
	// 識別番号を表示するための非公開フィールドidNumberを初期化
	private int idNumber;
	// 最後に与えた識別番号を表示するための非公開フィールドmaxNumberを初期化
	private static int maxNumber;
	
	// コンストラクタで、フィールド変数を初期化
	public Serialnumber() {
		// フィールド変数idNumberを、countNumberをインクリメントした値で初期化
		idNumber = ++countNumber;
		// フィールド変数maxNumberを、countNumberの値で初期化
		maxNumber = countNumber;
		
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
	 * 返り値：maxNumber
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static int getMaxId() {
		// maxNumberの値を返す
		return maxNumber;
	}
}
