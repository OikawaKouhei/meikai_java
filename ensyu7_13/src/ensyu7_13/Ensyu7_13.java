package ensyu7_13;

//java.util.Scannerのパッケージを利用するため
import java.util.Scanner;

/*
* クラス名：Ensyu7_13
* 概要：整数xの指定したビット目を1にした値、0にした値、反転した値を表示するプログラム
* 　　　メソッド内における関数名・変数名は教科書準拠の部分があるため、一部命名規則に従っていない場合があります
* 作成者：OikawaKouhei
* 作成日：2023/05/01
*/
public class Ensyu7_13 {
	/*
	 * 関数名：printBits
	 * 概要：ビット構成を表示するためのメソッド
	 * 引数：int firstNumber
	 * 返り値：なし
	 * パラメーターの説明：ビット表示する整数値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static void printBits(int firstNumber) {
		// int型整数を0から31ビットまでの計32ビットとして表示するための定数。
		final int MINUS_INT = 31;
		/*
		 * 【整数値をビット表示するための、ループ文】
		 * 
		 * 変数firstCountをint型ビット数32(31)分で初期化
		 * firstCountが0以上の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備
		 * 作成者：OikawaKouhei
		 * 作成日：2023/05/01
		 */
		for (int firstCount = MINUS_INT; firstCount >= 0; firstCount--) {
			/*
			 *  firstNumberの値をfirstCountの値分シフトし、
			 *  その値と1が、両方とも1であれば、1(true)を、そうでなければ、0をだす。
			 *  その値が、1かどうか判断する
			 */
			if ((firstNumber >>> firstCount & 1) == 1) {
				//「1」を表示
				System.out.print('1');
				// そうでない場合
			} else if ((firstNumber >>> firstCount & 1) == 0) {
				//「0」を表示
				System.out.print('0');
			}
		}
	}

	/*
	 * 関数名：set
	 * 概要：指定したビット目を1にして返すためのメソッド
	 * 引数：int x, int pos
	 * 返り値：setNumber
	 * パラメーターの説明：整数値とビットの桁を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int set(int x, int pos) {
		// 返り値と、指定ビット桁を1にするための変数setNumberを1で初期化
		int setNumber = 1;
		// setNumberの値に、setNumberの値をposの値分左シフトした値を代入
		setNumber = setNumber << pos;
		// setNumberの値に、setNumberの値とxを論理和した値を代入
		setNumber = setNumber | x;
		// setNumberの値を返り値として返す
		return setNumber;
	}

	/*
	 * 関数名：reset
	 * 概要：指定したビット目を0にして返すためのメソッド
	 * 引数：int x, int pos
	 * 返り値：setNumber
	 * パラメーターの説明：整数値とビットの桁を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int reset(int x, int pos) {
		// 返り値と、指定ビット桁を0にするための変数setNumberを1で初期化
		int setNumber = 1;
		// setNumberの値に、setNumberの値をposの値分左シフトした値を代入
		setNumber = setNumber << pos;
		// xの値を反転させる
		x = ~x;
		// setNumberの値に、setNumberの値とxを論理和した値を代入
		setNumber = setNumber | x;
		// setNumberを反転させる
		setNumber = ~setNumber;
		// setNumberの値を返り値として返す
		return setNumber;
	}

	/*
	 * 関数名：inverseN
	 * 概要：指定したビット目を反転して返すためのメソッド
	 * 引数：iint x, int pos
	 * 返り値：setNumber
	 * パラメーターの説明：整数値とビットの桁を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int inverse(int x, int pos) {
		// 返り値と、指定ビット桁を1にするための変数setNumberを1で初期化
		int setNumber = 1;
		// setNumberの値に、setNumberの値をposの値分左シフトした値を代入
		setNumber = setNumber << pos;
		/* xの値をposの値分右シフトし、最下位ビットとなった値が、
		 * 1であるか論理積にかけ、1であれば、判断
		 */
		if ((x >> pos & 1) == 1) {
			// setNumberの値に、setNumberの値とxの値を排他的論理和にかけ、posビット目が0と表示されるようにする
			setNumber = setNumber ^ x;
			// 0であった場合判断
		} else {
			// setNumberの値に、setNumberの値とxの値を論理和にかけ、posビット目が1と表示されるようにする
			setNumber = setNumber | x;
		}
		// setNumberの値を返り値として返す
		return setNumber;
	}

	/*
	 * 関数名：main
	 * 概要：整数値のビットと、指定したビット目を1・0・反転した値を構成を表示するためのメソッド
	 * 引数：Stirng[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 変数bitsNumberを0で初期化
		int bitsNumber = 0;
		// 変数bitPositionを0で初期化
		int bitPosition = 0;
		// int型整数を0から31ビットまでの計32ビットとして表示するための定数。
		final int MINUS_INT = 31;

		// 以降の文を実行
		do {
			//「整数値：」を表示
			System.out.print("整数値：");
			// 変数bitsNumberの値に、標準入力した値を代入
			bitsNumber = standardInput.nextInt();
			//「シフト数：」を表示
			System.out.print("ビット目：");
			// 変数shiftNumberの値に、標準入力した値を代入
			bitPosition = standardInput.nextInt();
		// ビット数に負の値と32以上の値を入力させないため
		} while (bitPosition < 0 || bitPosition > MINUS_INT);

		//「整数　　：」を表示
		System.out.print("整数　　　：");
		// 入力された整数値をビット表示
		printBits(bitsNumber);
		System.out.println();

		//「 1にした値：」を表示
		System.out.print(" 1にした値：");
		// setメソッドをbitsNumberの値とbitPositionの値を引数として呼び出し、printBitsメソッドを呼び出し表示
		printBits(set(bitsNumber, bitPosition));
		// 改行するため
		System.out.println();
		// setを整数値表示
		System.out.println("　整数表示：" + set(bitsNumber, bitPosition));

		//「 0にした値：」を表示
		System.out.print(" 0にした値：");
		// resetメソッドをbitsNumberの値とbitPositionの値を引数として呼び出し、printBitsメソッドを呼び出し表示
		printBits(reset(bitsNumber, bitPosition));
		// 改行
		System.out.println();
		// setを整数値表示
		System.out.println("　整数表示：" + reset(bitsNumber, bitPosition));

		//「反転した値：」を表示
		System.out.print("反転した値：");
		// inverseNメソッドをbitsNumberの値とbitPositionの値を引数として呼び出し、printBitsメソッドを呼び出し表示
		printBits(inverse(bitsNumber, bitPosition));
		// 改行
		System.out.println();
		// inverseを整数値表示
		System.out.println("　整数表示：" + inverse(bitsNumber, bitPosition));

	}
}
