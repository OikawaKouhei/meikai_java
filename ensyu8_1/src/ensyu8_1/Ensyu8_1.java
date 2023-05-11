package ensyu8_1;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu8_1
 * 概要：入力した名前と身長と体重を表示。身長と体重の計算
 * 作成者：OikawaKouhei
 * 作成日：2023/05/11
 */
public class Ensyu8_1 {
	/*
	 * 関数名：inputBody
	 * 概要：身長と体重を入力するためのメソッド
	 * 引数：String bodyInfomation
	 * 返り値：bodyNumber
	 * パラメーターの説明：入力する情報が何を表すのか表示するため
	 */
	static double inputBody(String bodyInfomation) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 返り値double型変数bodyNumberを0で初期化
		double bodyNumber = 0;
		
		// 以降の文を実行
		do {
			//「bodyInfomation」を表示
			System.out.print(bodyInfomation);
			// bodyNumberに入力した値を代入
			bodyNumber = standardInput.nextDouble();
		// bodyNumberの値が０以下の間繰り返し実行
		} while(bodyNumber <= 0);
		// bodyNumberを返り値として返す
		return bodyNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：身長と体重を表示するためのメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「あなたのデータを入力してください」を表示
		System.out.println("あなたのデータを入力してください");
		
		//「名前は：」 を表示
		System.out.print("名前は：");
		// String型変数yourNameを、入力した文字列で初期化
		String yourName = standardInput.next();
		
		// double型変数yourheightを、引数を「身長は：」にしたinputBodyメソッドを呼び出し、その値で初期化
		double yourheight = inputBody("身長は：");
		
		// double型変数yourWeightを、引数を「体重は：」にしたinputBodyメソッドを呼び出し、その値で初期化
		double yourWeight = inputBody("体重は：");
		
		// Human型変数yourDetaをインスタンス化
		Human yourDeta = new Human(yourName , yourheight , yourWeight);
		
		// yourDetaのchangesHeightメソッドを呼び出す
		yourDeta.changesHeight(10.2);
		// yourDetaのchangesHeightメソッドを呼び出す
		yourDeta.changesWeight(-5.5);
		
		//「あなたの身体データを表示します」
		System.out.println("あなたの身体データを表示します。");
		// 名前を表示
		System.out.println("名前：" + yourDeta.getName());
		// 増減後の身長を表示
		System.out.println("増減後の身長：" + yourDeta.getHeight());
		// 増減後の体重を表示
		System.out.println("増減後の体重：" + yourDeta.getWeight());
		
	}
}
