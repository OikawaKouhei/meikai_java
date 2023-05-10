package ensyu7_33;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_33
 * 概要：int型の1次元配列とint型の2次元配列の全要素を表示する多重定義されたメソッドを用いたプログラム
 * 作成者：OikawaKouhei
 * 作成日：2023/05/09
 */
public class Ensyu7_33 {
	/*
	 * 関数名：inputElement
	 * 概要：1次元配列を入力した値で生成するメソッド
	 * 引数：なし
	 * 返り値：returnElement
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int[] inputElement() {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 配列の要素数を入力するための変数を0で初期化
		int elementNumber = 0;

		// 以降の文を実行
		do {
			//「1次元配列の要素数：」を表示
			System.out.print("1次元配列の要素数：");
			// elementNumberに標準入力した値を代入
			elementNumber = standardInput.nextInt();
			// elementNumberの値が0以下の間、do以降を繰り返し実行
		} while (elementNumber <= 0);

		// 返り値である配列returnElementを要素数elementNumberで生成
		int[] returnElement = new int[elementNumber];

		/*
		 * 【配列の要素数を入力するためのループ文】
		 * 配列のインデックスを表す変数を0で初期化
		 * firstCountの値がelementNumberの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < elementNumber; firstCount++) {
			// firstCountの値に応じて、配列のインデックスを表示
			System.out.print("returnElement[" + firstCount + "] = ");
			// firstCountの値に応じて、配列に要素い入力した値を代入
			returnElement[firstCount] = standardInput.nextInt();
		}
		// returnElementを返り値として返す
		return returnElement;
	}

	/*
	 * 関数名：inputQueue
	 * 概要：行列の要素数を入力するメソッド
	 * 引数：なし
	 * 返り値：returnElement
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int[][] inputQueue() {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 行を表す変数を0で初期化
		int lineElement = 0;
		// 列を表す変数を0で初期化
		int columElement = 0;

		// 以降の文を実行
		do {
			//「行の要素数：」を表示
			System.out.print("行の要素数：");
			// 行を表す変数lineElementに標準入力した値を代入
			lineElement = standardInput.nextInt();
			// lineElementが0以下の間、以降の文を繰り返し実行
		} while (lineElement <= 0);

		// 返り値の役割を持つ2次元配列returnElementを、行の要素数をlineElementの値で生成
		int[][] returnElement = new int[lineElement][];

		/*
		 * 【各行の列の要素数を入力するためのループ文】
		 * インデックスを表す変数を0で初期化
		 * firstCountの値が、行の要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、ループの準備をする
		 */
		for (int firstCount = 0; firstCount < lineElement; firstCount++) {
			// 以降の文を実行
			do {
				// 行を表示し、その列の要素数を入力するよう促す
				System.out.print("[" + firstCount + "]の列の要素数：");
				// 列を表す変数columElementに入力した値を代入
				columElement = standardInput.nextInt();
				// columElementの値が0以下の間、do以降を繰り返し実行
			} while (columElement <= 0);
			// returnElementの各行に列数を代入していく
			returnElement[firstCount] = new int[columElement];
		}
		// 2次元配列returnElementを返す
		return returnElement;
	}

	/*
	 * 関数名：inputElement
	 * 概要：行・列の要素を入力するためのメソッド
	 * 引数：String nameElement
	 * 返り値：returnElement
	 * パラメーターの説明：要素を入力している配列を表すため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int[][] inputElement(String nameElement) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 返り値として扱う行列returnElementを、メソッドinputQueueの返り値で生成
		int[][] returnElement = inputQueue();
		/*
		 * 『行列の要素を入力するための多重ループ』
		 * 
		 * 【入力する要素の行を決めるためのループ】
		 * 行のインデックスを表すための変数を０で初期化
		 * firstCountの値がreturnElementの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < returnElement.length; firstCount++) {
			/*
			 * 【入力する要素の列を決めるためのループ】
			 * 列のインデックスを表すための変数を０で初期化
			 * secondCountの値がreturnElement[firstCount]の(列の)要素数未満の場合、以降の文を繰り返し実行
			 * secondCountの値をインクリメントし、繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < returnElement[firstCount].length; secondCount++) {
				// 入力している要素のインデックスを表す
				System.out.print(nameElement + "[" + firstCount + "][" + secondCount + "] = ");
				// 要素に入力した値を代入
				returnElement[firstCount][secondCount] = standardInput.nextInt();
			}
		}
		// returnElementを返り値として返す
		return returnElement;
	}

	/*
	 * 関数名：countdigits
	 * 概要：2次元配列において、最低限のスペースを開けるための、書式文字列の数値を求めて返すメソッド
	 * 引数：int[][] tentativeElement, int tentativeColum
	 * 返り値：countNumber
	 * パラメーターの説明：書式文字列で表示する値が格納された2次元配列、その値が格納されている列数の値
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/10
	 */
	static int countdigits(int[][] tentativeElement, int tentativeColum) {
		// 桁数を数えるための変数を1で初期化
		int countNumber = 1;
		// 同列の最大値を求めるための変数を0で初期化
		int maxNumber = 0;

		/*
		 * 『２次元配列の同じ列の最大値を求めるための多重ループ』
		 * 
		 * 【行数を表すループ文】
		 * 行のインデックスを表す変数を0で初期化
		 * firstCountの値が、tentativeElementの要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < tentativeElement.length; firstCount++) {
			/*
			 * 【列数を表すループ文】
			 * 列のインデックスを表す変数を0で初期化
			 * firstCountの値が、tentativeElement[firstCount]の要素数未満の間、以降の文を繰り返し実行
			 * firstCountの値をインクリメントし、次の繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < tentativeElement[firstCount].length; secondCount++) {

				// ループ文で表している列数と、列数を表す仮引数の値が同じであれば、判断
				if (secondCount == tentativeColum) {

					// tentativeElement[firstCount][secondCount]の値が0以下であれば判断
					if (tentativeElement[firstCount][secondCount] <= 0) {
						// maxNumberの値が0以下であれば、判断
						if (maxNumber <= 0) {
							// tentativeElement[firstCount][secondCount]の絶対値が、maxNumberの絶対値よりも大きい場合、判断
							if (-(tentativeElement[firstCount][secondCount]) > -(maxNumber)) {
								// maxNumberの値に、tentativeElement[firstCount][secondCount]を代入
								maxNumber = tentativeElement[firstCount][secondCount];
							}
						// maxNumberの値が0より大きい場合、判断
						} else if (maxNumber > 0) {
							// tentativeElement[firstCount][secondCount]の絶対値が、maxNumberの絶対値よりも大きい場合、判断
							if (-(tentativeElement[firstCount][secondCount]) > maxNumber) {
								// maxNumberの値に、tentativeElement[firstCount][secondCount]を代入
								maxNumber = tentativeElement[firstCount][secondCount];
							}
						}
						// tentativeElement[firstCount][secondCount]の値が0より大きい場合、判断
					} else if (tentativeElement[firstCount][secondCount] > 0) {
						// maxNumberの値が0以下であれば、判断
						if (maxNumber <= 0) {
							// tentativeElement[firstCount][secondCount]の絶対値が、maxNumberの絶対値よりも大きい場合、判断
							if (tentativeElement[firstCount][secondCount] > -(maxNumber)) {
								// maxNumberの値に、tentativeElement[firstCount][secondCount]を代入
								maxNumber = tentativeElement[firstCount][secondCount];
							}
							// maxNumberの値が0より大きい場合、判断
						} else if (maxNumber > 0) {
							// tentativeElement[firstCount][secondCount]の絶対値が、maxNumberの絶対値よりも大きい場合、判断
							if (tentativeElement[firstCount][secondCount] > maxNumber) {
								// maxNumberの値に、tentativeElement[firstCount][secondCount]を代入
								maxNumber = tentativeElement[firstCount][secondCount];
							}
						}
					}
				}
			}
		}

		// maxNumberの値が0未満であれば、-分の桁数をカウントするため、判断
		if (maxNumber < 0) {
			// countNumberの値をインクリメント
			countNumber++;
			// maxNumberの値を絶対値にする
			maxNumber = -(maxNumber);
		}

		// 以降の文を繰り返し実行
		do {
			// maxNumberの値を、桁数を求めるために10で割り、その値をmaxNumberに代入
			maxNumber /= 10;
			// countNumberの値をインクリメントし、桁数をカウント
			countNumber++;
		// maxNumberの値が0になるまで、do以降から繰り返し実行
		} while (maxNumber != 0);

		// countNumberの値を返り値として返す
		return countNumber;
	}

	/*
	 * 関数名：printArray
	 * 概要：1次元配列を表示するメソッド
	 * 引数：int[] a
	 * 返り値：なし
	 * パラメーターの説明：表示する1次元配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static void printArray(int[] a) {
		/*
		 * 【配列の各要素を表示するためのループ文】
		 * インデックスを表すための変数を0で初期化
		 * firstCountの値が、配列aの要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			//「a[firstCount] 」を表示
			System.out.print(a[firstCount] + " ");
		}
	}

	/*
	 * 関数名：printArray
	 * 概要：2次元配列を表示するメソッド
	 * 引数：int[][] a
	 * 返り値：なし
	 * パラメーターの説明：表示する1次元配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/10
	 */
	static void printArray(int[][] a) {
		/*
		 * 『2次元配列を表示するための多重ループ』
		 * 
		 * 【行を表すためのループ文】
		 * 行のインデックスを表す変数を0で初期化
		 * firstCountの値が、tentativeElementの要素数未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			/*
			 * 【列数を表すループ文】
			 * 列のインデックスを表す変数を0で初期化
			 * firstCountの値が、tentativeElement[firstCount]の要素数未満の間、以降の文を繰り返し実行
			 * firstCountの値をインクリメントし、次の繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < a[firstCount].length; secondCount++) {
				// 最低何桁で表示するかの値を表す変数をメソッドcountdigits(a, secondCount)の返り値で初期化
				int spaceNumber = countdigits(a, secondCount);
				// 左詰めで最低spaceNumberの値分、10進数表示で、a[firstCount][secondCount]の値を表示する
				System.out.printf("%" + -spaceNumber + "d", a[firstCount][secondCount]);
			}
			// 改行する
			System.out.println();
		}
	}

	/*
	 * 関数名：main
	 * 概要：1次元配列と2次元配列を表示するためのメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/10
	 */
	public static void main(String[] args) {
		//「1次元配列の要素数を入力してください。」を表示
		System.out.println("1次元配列の要素数を入力してください。");
		// 1次元配列firstElementをメソッドinputElementで生成
		int[] firstElement = inputElement();
		//「2次元配列の要素数を入力してください。」を表示
		System.out.println("2次元配列の要素数を入力してください。");
		// 2次元配列secondElementをメソッドinputElementで生成
		int[][] secondElement = inputElement("secondElement");

		//「1次元配列を表示します。」を表示
		System.out.println("1次元配列を表示します。");
		// メソッドprintArrayを引数firstElementで1次元配列でfirstElementを表示
		printArray(firstElement);
		// 改行
		System.out.println();

		//「2次元配列を表示します。」を表示
		System.out.println("2次元配列を表示します。");
		// メソッドprintArrayを引数secondElementで2次元配列secondElementを表示
		printArray(secondElement);
		System.out.println();
	}

}
