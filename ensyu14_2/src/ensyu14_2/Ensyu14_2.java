package ensyu14_2;
//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu14_2
* 概要：PetクラスとRobotPetクラスをテストするためのクラス
* 作成者；OikawaKouhei
* 作成日：2023/05/21
*/
public class Ensyu14_2 {
	/*
	 * 関数名：inputNumber
	 * 概要：入力値を返すためのメソッド
	 * 引数：String inputName
	 * 返り値：outPutNumber
	 * パラメーターの説明：どの入力値を入力しているか表示させるため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public static int inputNumber() {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 返り値用の変数を0で初期化
		int outPutNumber = 0;
		// 入力させる数値の範囲を定数にする
		final int RANGE_NUMBER = 2;
		
		// 以降の文を繰り返し実行
		do {
			// outPutNumberの値に入力した値を代入
			outPutNumber = standardInput.nextInt();
			// outPutNumberの値が0以下の場合、判断
			if (outPutNumber < 0 || outPutNumber > RANGE_NUMBER) {
				//「再度正の整数を入力してください。」を表示
				System.out.println("指定された値を入力してください。");
			}
			// outPutNumberの値が0以下、又は2より大きい場合、繰り返し実行
		} while(outPutNumber < 0 || outPutNumber > RANGE_NUMBER);
		// outPutNumberの値を返す
		return outPutNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：表示をテストするメインメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/19
	 */
	public static void main(String[] args) {
		// Petクラスを引数("太郎丸", "鈴木")でインスタンス化
		Pet firstPet = new Pet("太郎丸", "鈴木");
		// firstPetのintroduceSelfメソッドを呼び出す
		firstPet.introduceSelf();
		// 改行
		System.out.println();
		
		// RobotPetクラスを引数("アトム","伊藤")でインスタンス化
		RobotPet firstRobot = new RobotPet("アトム","伊藤");
		// firstRobotのintroduceSelfメソッドを呼び出す
		firstRobot.introduceSelf();
		// 何の行動をさせるか、選択肢を表示
		System.out.println("命令は？(0…掃除/1…洗濯/2…炊事)：");
		// firstRobotのworkMovingメソッドを呼び出す
		firstRobot.workMoving(inputNumber());
		// 改行
		System.out.println();
		// 何色に着せ替えるか、選択肢を表示
		System.out.println("色は？(0…黒/1…赤/2…緑)：");
		// firstRobotのchangeSkinメソッドを呼び出す
		firstRobot.changeSkin(inputNumber());
	}
}
