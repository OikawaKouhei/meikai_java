package ensyu7_28;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名：Ensyu7_28
* 概要：二つの行列の和を格納した2次元配列を返すメソッド
* 作成者：OikawaKouhei
* 作成日：2023/05/08
*/
public class Ensyu7_28 {
	/*
	 * 関数名：inputQueue
	 * 概要：行・列の要素数を入力するためのメソッド
	 * 引数：なし
	 * 返り値：returnElement
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/08
	 */
	static int[][] inputQueue() {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		// 行を表す変数を0で初期化
		int lineElement = 0;
		// 列を表す変数を０で初期化
		int columnElement = 0;

		// 以降の文を実行
		do {
			//「行の要素数：」を表示
			System.out.print("行の要素数：");
			// lineElementの値に、標準入力した値を代入
			lineElement = standardInput.nextInt();
			// lineElementの値が０以下の間、do以降を繰り返し実行
		} while (lineElement <= 0);

		// 返り値として扱う行列returnElementを、入力した行列の要素数で生成
		int[][] returnElement = new int[lineElement][];

		/*
		 * 【各行の列数の要素数を入力するためのループ文】
		 * インデックスを表す変数を0で初期化
		 * firstCountの値が、行の要素数の値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < lineElement; firstCount++) {
			// 以降の文を実行
			do {
				//「列の要素数：」を表示
				System.out.print("[" + firstCount + "] の列の要素数：");
				// columnElementの値に、標準入力した値を代入
				columnElement = standardInput.nextInt();
				// columnElementの値が０以下の間、do以降を繰り返し実行
			} while (columnElement <= 0);
			// returnElementの各行の列数の要素数を代入していく
			returnElement[firstCount] = new int[columnElement];
		}
		// returnElementを返り値として返す
		return returnElement;
	}

	/*
	 * 関数名：inputElement
	 * 概要：行・列の要素を入力するためのメソッド
	 * 引数：String nameElement
	 * 返り値：returnElement
	 * パラメーターの説明：要素を入力している配列を表すため
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/08
	 */
	static int[][] inputElement(String nameElement) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// 返り値として扱う行列returnElementを、メソッドinputQueueの返り値で生成
		int[][] returnElement = inputQueue();
		/*
		 * 『行列の要素を入力するための多重ループ』
		 * 
		 * 【入力する要素の行を決めるための多重ループ】
		 * 行のインデックスを表すための変数を０で初期化
		 * firstCountの値がreturnElementの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < returnElement.length; firstCount++) {
			/*
			 * 【入力する要素の列を決めるための多重ループ】
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
	 * 関数名：addMatrix
	 * 概要：行・列の要素を加算するためのメソッド
	 * 　　　メソッド名・変数名は教科書準拠のため、コーディング規約と異なります
	 * 引数：int[][]x , int[][] y
	 * 返り値：returnElement
	 * パラメーターの説明：加算する行列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/08
	 */
	static int[][] addMatrix(int[][] x, int[][] y) {
		
		// 返り値として扱う行列returnElementを、要素数[x.length][]で生成
		int[][] returnElement = new int[x.length][];
		/*
		 * 『行列の要素を加算するための多重ループ』
		 * 
		 * 【加算する要素の行を決めるための多重ループ】
		 * 行のインデックスを表すための変数を０で初期化
		 * firstCountの値がxの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < x.length; firstCount++) {
			// returnElement[firstCount]の列数を代入
			returnElement[firstCount] = new int[x[firstCount].length];
			/*
			 * 【加算する要素の列を決めるための多重ループ】
			 * 列のインデックスを表すための変数を0で初期化
			 * secondCountの値がx[firstCount]の(列の)要素数未満の場合、以降の文を繰り返し実行
			 * secondCountの値をインクリメントし、繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < x[firstCount].length; secondCount++) {
					// 行列zに、行列x,yの要素の和を代入
					returnElement[firstCount][secondCount] = x[firstCount][secondCount] + y[firstCount][secondCount];
			}
		}
		// returnElementを返り値として返す
		return returnElement;
	}

	/*
	 * 関数名：printMatrix
	 * 概要：行列の要素を表示するためのメソッド
	 * 引数：int[][] tentativeElement
	 * 返り値：なし
	 * パラメーターの説明：表示する行列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/08
	 */
	static void printMatrix(int[][] tentativeElement) {
		/*
		 * 『行列の要素を表示するための多重ループ』
		 * 
		 * 【表示する要素の行を決めるための多重ループ】
		 * 行のインデックスを表すための変数を0で初期化
		 * firstCountの値がtentativeElementの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < tentativeElement.length; firstCount++) {
			/*
			 * 【表示する要素の列を決めるための多重ループ】
			 * 列のインデックスを表すための変数を0で初期化
			 * secondCountの値がtentativeElement[firstCount]の(列の)要素数未満の場合、以降の文を繰り返し実行
			 * secondCountの値をインクリメントし、繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < tentativeElement[firstCount].length; secondCount++) {
				// 要素を少なくとも5桁で表示
				System.out.printf("%5d", tentativeElement[firstCount][secondCount]);
			}
			// 改行するため
			System.out.println();
		}
	}
	
	/*
	 * 関数名：judgeMatrix
	 * 概要：二つの配列の要素数が同じ値か判断するメソッド
	 * 引数：int[][] firstElement , int[][] secondElement
	 * 返り値：returnJudge
	 * パラメーターの説明：要素数を比較する配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/08
	 */
	static boolean judgeMatrix(int[][] firstElement, int[][] secondElement) {
		// booleanの変数にtrueを代入
		boolean returnJudge = true;
		

		/*
		 * 『行列の要素を加算するための多重ループ』
		 * 
		 * 【加算する要素の行を決めるための多重ループ】
		 * 行のインデックスを表すための変数を０で初期化
		 * firstCountの値がxの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		Outer:for (int firstCount = 0; firstCount < firstElement.length; firstCount++) {
			/*
			 * 【加算する要素の列を決めるための多重ループ】
			 * 列のインデックスを表すための変数を0で初期化
			 * secondCountの値がx[firstCount]の(列の)要素数未満の場合、以降の文を繰り返し実行
			 * secondCountの値をインクリメントし、繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < firstElement[firstCount].length; secondCount++) {
				// 行列xの行と列の要素数が、行列yの行と列の要素数と等しくない場合、判断する
				if (firstElement.length != secondElement.length || firstElement[firstCount].length != secondElement[firstCount].length) {
					// returnJudgeにfalseを代入
					returnJudge = false;
					// Outerのループ文を抜ける
					break Outer;
				}
			}
		}
		// returnJudgeを返り値として返す
		return returnJudge;
	}

	/*
	 * 関数名：main
	 * 概要：三つの配列が等しければ加算を行ってtrueを返し、等しくなければelseを返すメソッドを用いて、表示するメソッド
	 * 引数：String[] arg
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/08
	 */
	public static void main(String[] arg) {
		//「行列firstElement」を表示
		System.out.println("行列firstElement");
		// 行列firstElementをinputElement("firstElement")で生成
		int[][] firstElement = inputElement("firstElement");
		// 改行するため
		System.out.println();
		
		// 行列secondElementを[0][0]で初期化
		int[][] secondElement = new int[0][0];
		// 以降の文を実行
		do {
			//「行列secondElement」を表示
			System.out.println("行列secondElement");
			// 行列secondElementをinputElement("secondElement")で生成
			secondElement = inputElement("secondElement");
			// 改行するため
			System.out.println();
			// judgeMatrix(firstElement , secondElement)の返り値が、falseだった場合、判断
			if (judgeMatrix(firstElement , secondElement) == false) {
				//「行列firstElementの要素数と同じ値を入力してください。」
				System.out.println("行列firstElementの要素数と同じ値を入力してください。");
			}
		// judgeMatrix(firstElement , secondElement)の返り値が、falseだった場合、do以降から繰り返し判断
		} while (judgeMatrix(firstElement , secondElement) == false);
		
		

		// 行列thirdElementをinputQueue()で生成
		int[][] thirdElement = addMatrix(firstElement, secondElement);
		// 改行するため
		System.out.println();

		// 行列firstElementの要素を表示
		printMatrix(firstElement);
		// 改行するため
		System.out.println();
		// 行列secondElementの要素を表示
		printMatrix(secondElement);
		// 改行するため
		System.out.println();
		// 行列secondElementの要素を表示
		printMatrix(thirdElement);		
	}
}
