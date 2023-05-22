package ensyu14_3;
/*
 * クラス名：DVDPlayer
 * 概要：ExPlayerを実装するクラス
 * 作成者；OikawaKouhei
 * 作成日：2023/05/21
 */
public class DVDPlayer implements ExPlayer {

	/*
	 * メソッド名：playMotion
	 * 概要：再生開始を表示
	 * 引数：なし
	 * 返り値；なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public void playMotion() {
		// 「■DVD再生開始!」を表示
		System.out.println("■DVD再生開始!");
	}

	/*
	 * メソッド名：stopMotion
	 * 概要：再生開始を表示
	 * 引数：なし
	 * 返り値；なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public void stopMotion() {
		// 「■DVD再生停止!」を表示
		System.out.println("■DVD再生停止!");
	}

	/*
	 * メソッド名：slowMotion
	 * 概要：再生開始を表示
	 * 引数：なし
	 * 返り値；なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/21
	 */
	@Override
	public void slowMotion() {
		// 「■DVDスロー再生開始!」を表示
		System.out.println("■DVDスロー再生開始!");
	}

}
