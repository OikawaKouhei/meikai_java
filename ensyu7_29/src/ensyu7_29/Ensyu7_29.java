package ensyu7_29;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu7_29
 * 概要：2次元配列aと同じ配列を生成して、返すメソッドを用いたプログラム
 * 作成者：OkwaKouhei
 * 作成日：2023/05/09
 */
public class Ensyu7_29 {
	/*
	 * 関数名：inputQueue
	 * 概要：行列の要素数を入力するメソッド
	 * 引数：なし
	 * 返り値：returnElement
	 * パラメーターの説明：なし
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
	 * 関数名：printMatrix
	 * 概要：行列の要素を表示するためのメソッド
	 * 引数：int[][] tentativeElement
	 * 返り値：なし
	 * パラメーターの説明：表示する行列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static void printMatrix(int[][] tentativeElement) {
		/*
		 * 『行列の要素を表示するためのループ』
		 * 
		 * 【表示する要素の行を決めるための多重ループ】
		 * 行のインデックスを表すための変数を0で初期化
		 * firstCountの値がtentativeElementの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < tentativeElement.length; firstCount++) {
			/*
			 * 【表示する要素の列を決めるためのループ】
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
	 * 関数名：aryClone2
	 * 概要：仮引数と同じ２次元配列を生成し、返すメソッド
	 * 　　　関数名・変数名が教科書準拠となっていますので、コーディング規約と異なります
	 * 引数：int[][] a
	 * 返り値：cloneElement
	 * パラメーターの説明：コピーする２次元配列
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	static int[][] aryClone2(int[][] a) {
		// 返り値用の2次元配列cloneElementを行数をa.lengthで生成
		int[][] cloneElement = new int[a.length][];
		
		/*
		 * 『cloneElementにaの各行列の要素数を代入していくための多重ループ』
		 * 
		 * 【行数を表すためのループ文】
		 * 行のインデックスを表すための変数を0で初期化
		 * firstCountの値がa.lengthの(行の)要素数未満の場合、以降の文を繰り返し実行
		 * firstCountの値をインクリメントし、繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < a.length; firstCount++) {
			// cloneElement[firstCount]の列数を[a[firstCount].length](a[firstCount]行の列数)にする
			cloneElement[firstCount] = new int[a[firstCount].length];
			/*
			 * 【列数を表すためのループ文】
			 * 列のインデックスを表すための変数を0で初期化
			 * secondCountの値がa[firstCount].lengthの(行の)要素数未満の場合、以降の文を繰り返し実行
			 * secondCountの値をインクリメントし、繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < a[firstCount].length; secondCount++) {
				// cloneElement[firstCount][secondCount]の要素数の値に、
				cloneElement[firstCount][secondCount] = a[firstCount][secondCount];
			}
		}
		// 2次元配列cloneElementを返り値として返す
		return cloneElement;
	}
	/*
	 * 関数名：main
	 * 概要：2次元配列を表示するメソッド
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/09
	 */
	public static void main(String[] args) {
		// inputElementメソッドを呼び出し、2次元配列firstElementを生成
		int[][] firstElement = inputElement("firstElement");
		
		//「２次元配列firstElementを、２次元配列secondElementにコピーします。」を表示
		System.out.println("２次元配列firstElementを、２次元配列secondElementにコピーします。");
		
		// aryClone2メソッドを呼び出し、secondElementを生成
		int[][] secondElement = aryClone2(firstElement);
		
		//「行列firstElement」を表示
		System.out.println("行列firstElement");
		// printMatrixメソッドを呼び出し、firstElementを表示
		printMatrix(firstElement);
		
		//「行列secondElement」を表示
		System.out.println("行列secondElement");
		// printMatrixメソッドを呼び出し、secondElementを表示
		printMatrix(secondElement);
	}
	

}
