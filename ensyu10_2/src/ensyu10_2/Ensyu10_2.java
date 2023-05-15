package ensyu10_2;

public class Ensyu10_2 {
	/*
	 * 関数名：main
	 * 概要：連番を表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/15
	 */
	public static void main(String[] args) {
		// 識別番号を増やす値を変更する値を定数にする
		final int plusNumber = 4;
		
		// Serialnumberクラス型のインスタンスfirstInstanceを生成
		Serialnumber firstInstance = new Serialnumber();
		// Serialnumberクラス型のインスタンスsecondInstanceを生成
		Serialnumber secondInstance = new Serialnumber();
		// Serialnumberクラス型のインスタンスthirdInstanceを生成
		Serialnumber thirdInstance = new Serialnumber();
		
		// 定数plusNumberを引数にSerialnumberクラスのsetPlusメソッドを呼ぶ
		Serialnumber.setPlus(plusNumber);
		
		// Serialnumberクラス型のインスタンスforthInstanceを生成
		Serialnumber forthInstance = new Serialnumber();
		// Serialnumberクラス型のインスタンスfifthInstanceを生成
		Serialnumber fifthInstance = new Serialnumber();
		// Serialnumberクラス型のインスタンスsixInstanceを生成
		Serialnumber sixInstance = new Serialnumber();

		// firstInstanceの識別番号を表示
		System.out.println("firstInstanceの識別番号：" + firstInstance.getIdNumber());
		//  secondInstanceの識別番号を表示
		System.out.println("secondInstanceの識別番号：" + secondInstance.getIdNumber());
		// thirdInstanceの識別番号を表示
		System.out.println("thirdInstanceの識別番号：" + thirdInstance.getIdNumber());
		// thirdInstanceの識別番号を表示
		System.out.println("forthInstanceの識別番号：" + forthInstance.getIdNumber());
		// thirdInstanceの識別番号を表示
		System.out.println("fifthInstanceの識別番号：" + fifthInstance.getIdNumber());
		// thirdInstanceの識別番号を表示
		System.out.println("sixInstanceの識別番号：" + sixInstance.getIdNumber());

		// 最後に与えた識別番号を表示
		System.out.println("最後に与えた識別番号：" + Serialnumber.getMaxId());
	}
}
