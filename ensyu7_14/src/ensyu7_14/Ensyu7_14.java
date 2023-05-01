package ensyu7_14;

import java.util.Scanner;

/*
* クラス名：Ensyu7_14
* 概要：整数xの指定したビット目を1にした値、0にした値、反転した値を表示するプログラム
* 　　　メソッド内における関数名・変数名は教科書準拠の部分があるため、一部命名規則に従っていない場合があります
* 作成者：OikawaKouhei
* 作成日：2023/05/01
*/
public class Ensyu7_14 {
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
	 * 関数名：setN
	 * 概要：指定したビット目から入力した値分、連続して1にした値を返すためのメソッド
	 * 引数：int x , int pos , int n
	 * 返り値：setNumber
	 * パラメーターの説明：整数値とビットの桁,連続する個数を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int setN(int x, int pos, int n) {
		// 返り値のための変数setNumberを1で初期化
		int setNumber = 1;
		// 値を保存するための変数temporaryNumberを0で初期化
		int temporaryNumber = 0;
		/*
		 * 【posの値からn個のビットの値を変えるためのループ文】
		 * 値を変える範囲を決め、繰り返しを実行するための変数firstCountをposの値で初期化
		 * firstCountの値がpos + nの値未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = pos; firstCount < pos + n; firstCount++) {
			// temporaryNumberに1をfirstCountの値分左シフトした値を、加算代入する
			temporaryNumber += 1 << firstCount;
		}
		// setNumberに、temporaryNumberの値とxの値の論理和で論理演算して出した値を代入
		setNumber = temporaryNumber | x;
		// setNumberの値を返り値として返す
		return setNumber;
	}

	/*
	 * 関数名：resetN
	 * 概要：指定したビット目から入力した値分、連続して0にした値を返すためのメソッド
	 * 引数：int x , int pos , int n
	 * 返り値：setNumber
	 * パラメーターの説明：整数値とビットの桁,連続する個数を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int resetN(int x, int pos, int n) {
		// 返り値のための変数setNumberを1で初期化
		int setNumber = 1;
		// 値を保存するための変数temporaryNumberを0で初期化
		int temporaryNumber = 0;
		/*
		 * 【posの値からn個のビットの値を変えるためのループ文】
		 * 値を変える範囲を決め、繰り返しを実行するための変数firstCountをposの値で初期化
		 * firstCountの値がpos + nの値未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = pos; firstCount < pos + n; firstCount++) {
			// temporaryNumberに1をfirstCountの値分左シフトした値を、加算代入する
			temporaryNumber += 1 << firstCount;
		}
		// xの値を補数にして、xに代入
		x = ~x;
		// setNumberに、temporaryNumberの値とxの値の論理和で論理演算して出した値を代入
		setNumber = temporaryNumber | x;
		// setNumberの値を補数にして、setNumberに代入
		setNumber = ~setNumber;
		// setNumberを返り値として返す
		return setNumber;
	}

	/*
	 * 関数名：inverseN
	 * 概要：指定したビット目から入力した値分、連続して反転した値を返すためのメソッド
	 * 引数：int x , int pos , int n
	 * 返り値：setNumber
	 * パラメーターの説明：整数値とビットの桁,連続する個数を表す
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/01
	 */
	static int inverseN(int x, int pos, int n) {
		// 返り値のための変数setNumberを1で初期化
		int setNumber = 1;
		// 値を保存するための変数temporaryNumberを0で初期化
		int temporaryNumber = 0;
		/*
		 * 【posの値からn個のビットの値を変えるためのループ文】
		 * 値を変える範囲を決め、繰り返しを実行するための変数firstCountをposの値で初期化
		 * firstCountの値がpos + nの値未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = pos; firstCount < pos + n; firstCount++) {
			// temporaryNumberに1をfirstCountの値分左シフトした値を、加算代入する
			temporaryNumber += 1 << firstCount;
		}
		/* xの値をposの値分右シフトし、最下位ビットとなった値が、
		 * 1であるか論理積にかけ、1であれば、判断
		 */
		if ((x >> pos & 1) == 1) {
			// setNumberの値に、setNumberの値とxの値を排他的論理和にかけ、posビット目が0と表示されるようにする
			setNumber = temporaryNumber ^ x;
			// 0であった場合判断
		} else {
			// setNumberの値に、setNumberの値とxの値を論理和にかけ、posビット目が1と表示されるようにする
			setNumber = temporaryNumber | x;
		}
		// setNumberを返り値として返す
		return setNumber;
	}

	/*
	 * 関数名：main
	 * 概要：整数値・ビット桁・連続個数を入力して、その範囲の値を、1・0・反転して表示するメソッド
	 * 引数：String[] args
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
		// 変数bitsPositionを0で初期化
		int bitsPosition = 0;
		// 変数bitsStraightを0で初期化
		int bitsStraight = 0;
		// int型整数を0から31ビットまでの計32ビットとして表示するための定数。
		final int MINUS_INT = 32;
				
		// 以降の文を実行
		do {
			//「整数値：」を表示
			System.out.print("整数値：");
			// 変数bitsNumberの値に、標準入力した値を代入
			bitsNumber = standardInput.nextInt();
			//「ビット目：」を表示
			System.out.print("ビット目：");
			// 変数shiftNumberの値に、標準入力した値を代入
			bitsPosition = standardInput.nextInt();
			//「何個：」を表示
			System.out.print("何個：");
			// 変数bitsStraightの値に、標準入力した値を代入
			bitsStraight = standardInput.nextInt();
			
		// ビット数と表示数に負の値と33以上の値を入力させないため
		} while (bitsPosition < 0 || bitsStraight < 0 || (bitsPosition + bitsStraight) > MINUS_INT);

		//「整数　　：」を表示
		System.out.print("整数　　　：");
		// 入力された整数値をビット表示
		printBits(bitsNumber);
		System.out.println();
		
		//「 1にした値：」を表示
		System.out.print(" 1にした値：");
		// setメソッドをbitsNumberの値とbitPositionの値を引数として呼び出し、printBitsメソッドを呼び出し表示
		printBits(setN(bitsNumber , bitsPosition , bitsStraight));
		// 改行するため
		System.out.println();
		// setNを整数値表示
		System.out.println("　整数表示：" + setN(bitsNumber, bitsPosition , bitsStraight));
		
		//「 0にした値：」を表示
		System.out.print(" 0にした値：");
		// resetメソッドをbitsNumberの値とbitPositionの値を引数として呼び出し、printBitsメソッドを呼び出し表示
		printBits(resetN(bitsNumber , bitsPosition , bitsStraight));
		// 改行
		System.out.println();
		// resetNを整数値表示
		System.out.println("　整数表示：" + resetN(bitsNumber, bitsPosition , bitsStraight));
		
		//「反転した値：」を表示
		System.out.print("反転した値：");
		// inverseNメソッドをbitsNumberの値とbitPositionの値を引数として呼び出し、printBitsメソッドを呼び出し表示
		printBits(inverseN(bitsNumber , bitsPosition , bitsStraight));
		// 改行
		System.out.println();
		// inverseNを整数値表示
		System.out.println("　整数表示：" + inverseN(bitsNumber, bitsPosition , bitsStraight));
	}

}