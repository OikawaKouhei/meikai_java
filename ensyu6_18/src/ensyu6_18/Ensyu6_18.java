package ensyu6_18;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_18
 * 概要：演習6_18
 * 作成者：OikawaKouhei
 * 作成日：2023/04/26
 */
public class Ensyu6_18 {
	/*
	 * 関数名：main
	 * 概要：行数・各行の列数・各要素の値を標準入力できるようにしたプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
	// 標準入力するため
	Scanner standardInput = new Scanner(System.in);
	
	// 行を表す変数lineElementを0で初期化
	int lineElement = 0;
	// 列を表す変数columnElementを0で初期化
	int columnElement = 0;
	// 正の整数値しか入力できないようにするための定数ONE_THANを1で初期化
	final int ONE_THAN = 1;
	
	// 以降の文を実行
	do {
		//「行の要素数：」を表示
		System.out.print("行の要素数：");
		// lineElementの値に楊淳入力した値を代入
		lineElement = standardInput.nextInt();
	// lineElementの値の値がONE_THANの値未満の場合、do以降から繰り返し判断
	} while (lineElement < ONE_THAN);	
	
	// 2次元配列firstElementを生成
	int [][] firstElement = new int [lineElement][];
	
	//「各行の列数」を表示
	System.out.println("各行の列数");
	/*
	 * 【配列firstElementの各行の列数を入力された数値で生成するためのループ文】
	 * 行数を表す変数firstCountを0で初期化
	 * firstCountの値がlineElementの値未満の場合、以降の文を繰り返し実行
	 * firstCountをインクリメントし、次の繰り返しの準備
	 */
	for (int firstCount = 0 ; firstCount < lineElement ; firstCount++) {
		// 以降の文を実行
		do {
			// 各行のインデックスを表示
			System.out.print("firstElement[" + firstCount + "] = ");
			// 列数を表す変数に標準入力した値を代入
			columnElement = standardInput.nextInt();
		// columnElementの値が、ONE_THANの値未満の間、doから繰り返し実行
		} while (columnElement < ONE_THAN);
		// 各行数に、列数を生成
		firstElement[firstCount] = new int [columnElement];
	}
	
	//「各行と列数の要素」を表示
	System.out.println("各行と列数の要素");
	/*
	 * 『各行列の要素に入力した値を入れるためのループ文』
	 * 
	 * 【行を指定するためのループ文】
	 * 行のインデックスを表すための変数firstCountを0で初期化
	 * firstCountの値が、firstElement.lengthの値未満の場合、以降の文を繰り返し実行
	 * firstCountの値をインクリメントし、次の繰り返しの準備をする
	 */
	for (int firstCount = 0 ; firstCount < firstElement.length ; firstCount++) {
		/*
		 * 【列を指定するためのループ文】
		 * 列のインデックスを表すための変数secondCountを0で初期化
		 * firstCountの値が、firstElement[firstCount].lengthの値未満の場合、以降の文を繰り返し実行
		 * secondCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int secondCount = 0 ; secondCount < firstElement[firstCount].length ; secondCount++) {
			// どの要素の値を入力しているか表示
			System.out.print("firstElement[" + firstCount + "][" + secondCount + "] =");
			// 表示している要素に、標準入力した値を代入
			firstElement[firstCount][secondCount] = standardInput.nextInt();
		}
	}
	/*
	 * 『各行列の要素に入力した値を表示するためのループ文』
	 * 
	 * 【行を指定するためのループ文】
	 * 行のインデックスを表すための変数firstCountを0で初期化
	 * firstCountの値が、firstElement.lengthの値未満の場合、以降の文を繰り返し実行
	 * firstCountの値をインクリメントし、次の繰り返しの準備をする
	 */
	for (int firstCount = 0 ; firstCount < firstElement.length ; firstCount++) {
		/*
		 * 【列を指定するためのループ文】
		 * 列のインデックスを表すための変数secondCountを0で初期化
		 * firstCountの値が、firstElement[firstCount].lengthの値未満の場合、以降の文を繰り返し実行
		 * secondCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int secondCount = 0 ; secondCount < firstElement[firstCount].length ; secondCount++) {
			// 要素の値を順番に表示する
			System.out.printf("%5d", firstElement[firstCount][secondCount]);
		}
		// 見やすさのための改行
		System.out.println();
	}
	
	}
}
