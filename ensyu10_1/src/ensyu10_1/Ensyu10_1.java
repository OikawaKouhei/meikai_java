package ensyu10_1;

/*
 * クラス名：Ensyu10_1
 * 概要：連番を表示
 * 作成者：OikawaKouhei
 * 作成日：2023/05/15
 */
public class Ensyu10_1 {
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
		// Serialnumberクラス型のインスタンスfirstInstanceを生成
		Serialnumber firstInstance = new Serialnumber();
		// Serialnumberクラス型のインスタンスsecondInstanceを生成
		Serialnumber secondInstance = new Serialnumber();
		// Serialnumberクラス型のインスタンスthirdInstanceを生成
		Serialnumber thirdInstance = new Serialnumber();
		
		// firstInstanceの識別番号を表示
		System.out.println("firstInstanceの識別番号：" + firstInstance.getIdNumber());
		//  secondInstanceの識別番号を表示
		System.out.println("secondInstanceの識別番号：" + secondInstance.getIdNumber());
		// thirdInstanceの識別番号を表示
		System.out.println("thirdInstanceの識別番号：" + thirdInstance.getIdNumber());
		
		
		// 最後に与えた識別番号を表示
		System.out.println("最後に与えた識別番号：" + Serialnumber.getMaxId());
	}

}
