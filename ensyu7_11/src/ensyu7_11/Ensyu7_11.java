package ensyu7_11;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_11
 * 概要：整数を左右にシフトした値が2のべき乗での乗算や除算と等しくなるかを確認するプログラム
 * 作成日：2023/04/28
 * 作成者：OikawaKouhei
 */
public class Ensyu7_11 {
	/*
	 * 関数名：printBits
	 * 概要：入力値をint型32ビットで表すためのメソッド
	 * 引数：firstNumber
	 * 返り値：なし
	 * パラメーターの説明：表示するビットの桁を表すためのもの
	 */
	static void printBits (int firstNumber) {
		/*
		 * 「int型整数値を32ビットで表すためのループ文」
		 * 総ビット数を表し、ループを実行するための変数firstCountを31の値で初期化
		 * firstCountの値が0以上の間、以降の文を実行
		 * firstCountの値をデクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 31 ; firstCount >= 0 ; firstCount--) {
			/*
			 *  firstNumberの値をfirstCountの値分シフトし、
			 *  その値と1が、両方とも1であれば、1(true)を、そうでなければ、0をだす。
			 *  その値が、1かどうか判断する
			 */
			if ((firstNumber >>> firstCount & 1) == 1) {
				// その値が1であれば、「1」を表示し
				System.out.print('1');
			// そうでない場合
			} else {
				//「0」を表示する
				System.out.print('0');
			}
		}
	}
	/*
	 * 関数名：multiplaySquare
	 * 概要：引数の値に応じて、2のべき乗をした値を返り値としてだすためのメソッド
	 * 引数：indexNumber
	 * 返り値：resultNumber
	 * パラメーターの説明：2をなん乗するか判断するためのもの
	 */
	static int multiplaySquare(int indexNumber) {
		// 結果を代入するための返り値を1で初期化
		int resultNumber = 1;
		// 2乗するための定数SQUARE_NUMBERを2で初期化
		final int SQUARE_NUMBER = 2;
		
		/*
		 * 「2のべき乗をするためのループ文」
		 * 2のべき乗を何回するか判断するための変数firstCountを1で初期化
		 * firstCountの値がindexNumberの値以下の間、以降の文を繰り返し実行
		 * firstCountをインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 1; firstCount <= indexNumber; firstCount++) {
			// resultNumberの値に2を複合代入する
			resultNumber *= SQUARE_NUMBER;
		}
		//resultNumberの値を返り値として、返す
		return resultNumber;
	}
	
	/*
	 * 関数名：multiplaySquare
	 * 概要：整数を左右にシフトした値が、2のべき乗での乗さんや除算と等しくなることを表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：ビットを表示するため
	 */
	public static void main(String[] args) {
		//標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「整数値a：」を表示
		System.out.print("整数値a：");
		// 整数値aを示す変数firstNumberを標準入力した値で初期化
		int firstNumber = standardInput.nextInt();
		// 「シフトするビット数b：」を表示
		System.out.print("シフトするビット数b：");
		// シフトするビット数bを示す変数shiftNumberを標準入力した値で初期化
		int shiftNumber = standardInput.nextInt();
		
		//「整数a     ：」を表示
		System.out.print("整数a        ：");
		// aの値をビット表示
		printBits(firstNumber);
		
		//「a << b    ：」を表示
		System.out.print("\na << b     　：");
		// aの値をbの値左シフトした値を表示
		printBits(firstNumber << shiftNumber);
		//「a * 2の  shiftNumber 乗：」を表示
		System.out.print("\na * 2の" + shiftNumber + "乗　：");
		// aの値と2のb乗を掛けた値のビットを表示
		printBits((firstNumber * multiplaySquare(shiftNumber)));
		
		//「a >> b    ：」を表示
		System.out.print("\na >> b    　 ：");
		// aの値をbの値右シフトした値を表示
		printBits(firstNumber >> shiftNumber);
		//「a / 2の  shiftNumber  乗：」を表示
		System.out.print("\na / 2の" + shiftNumber + "乗　：");
		// aの値と2のb乗を割った値のビットを表示
		printBits((firstNumber / multiplaySquare(shiftNumber)));
	}

}
