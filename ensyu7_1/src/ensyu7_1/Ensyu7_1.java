package ensyu7_1;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_1
 * 概要：受け取ったint型引数の値nが負であれば－1を返却し、0であれば0を返却し、
 * 　　　正であれば１で返却するプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/04/27
 */
public class Ensyu7_1 {
	/*
	 * 関数名：sign0f
	 * 概要：受け取った値が負であれば、-1を返却し、0であれば0を返却し、正であれば１で返却する
	 * 引数(仮引数)：int n
	 * 返り値：-1 or 0 or 1
	 * パラメーター(仮引数)の説明：実引数の値が、0未満か、0か、1以上の値か判断するためのもの
	 */
	static int sign0f(int n) {
		// 変数judgmentNumberを宣言し、仮引数nで初期化
		int judgmentNumber = n;
		// nの値が０未満の場合、judgmentNumberに-1を代入
		if (n < 0) judgmentNumber = -1;
		// nの値が０の場合、judgmentNumberに0を代入
		if (n == 0) judgmentNumber = 0;
		// nの値がより大きいの場合、judgmentNumberに1を代入
		if (n > 0) judgmentNumber = 1;
		// judgmentNumberの値を返す
		return judgmentNumber;
	}
	
	/*
	 * 関数名：main
	 * 概要：受け取った値が負であれば、-1を返却し、0であれば0を返却し、正であれば１で返却する
	 * 引数：String
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「入力された整数値が、\n負なら-1,0なら0,正なら1を表示します。」を表示
		System.out.println("入力された整数値が、\n負なら-1,0なら0,正なら1を表示します。");
		//「整数値：」を表示し、以降に標準入力を促す
		System.out.print("整数値：");
		// firstNumberを標準入力した値で初期化
		int firstNumber = standardInput.nextInt();
		
		// sign0fメソッドを呼び出し、「-1」「0」「1」の該当する値を表示
		System.out.println(sign0f(firstNumber));
	}

}
