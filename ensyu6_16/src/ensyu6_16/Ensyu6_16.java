package ensyu6_16;

// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_16
 * 概要：演習6_16
 * 作成者：OikawaKouhei
 * 作成日：2023/04/26
 */
public class Ensyu6_16 {
	/*
	 * 関数名：main
	 * 概要：4行3列と3行4列の行列の積を求めるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 定数３を表す変数THIRD_NUMBERを初期化
		final int THIRD_NUMBER = 3;
		// 定数４を表す変数FORTH_NUMBERを初期化
		final int FORTH_NUMBER = 4;
		
		// ４行３列の行列を表す多次元配列firstElementを生成
		final int [][] firstElement = new int[FORTH_NUMBER][THIRD_NUMBER];
		// ３行４列の行列を表す多次元配列firstElementを生成
		final int [][] secondElement = new int[THIRD_NUMBER][FORTH_NUMBER];
		// ４行４列の行列を表す多次元配列firstElementを生成
		int [][] thirdElement = new int[FORTH_NUMBER][FORTH_NUMBER];
		
		//「行列firstElement」を表示
		System.out.println("行列firstElement");

		/*
		 *　『４行３列の行列を表す多次元配列firstElementの要素を標準入力するための多重ループ』
		 *【４行３列の行列において、行を示すためのループ文】
		 * 行を表すインデックスの値を表す変数firstCountを0の値で初期化
		 * firstCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < FORTH_NUMBER ; firstCount++) {
			/*
			 *【４行３列の行列において、列を示すためのループ文】
			 * 列を表すインデックスの値を表すsecondCountを0の値で初期化
			 * secondCountの値がTHIRD_NUMBERの値未満の間、以降の文を繰り返し実行
			 * secondCountの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int secondCount = 0 ; secondCount < THIRD_NUMBER ; secondCount++) {
				// どこの要素の値を入力しているか確認できるように表示
				System.out.print("firstElement [" + firstCount + "][" + secondCount + "] = " );
				// 標準入力した値を、今示している箇所の要素として代入
				firstElement [firstCount][secondCount] = standardInput.nextInt();
			}
		// 見やすさのため改行
		} System.out.println();
		
		
		
		//「行列secondElement」を表示
		System.out.println("行列secondElement");

		/*
		 *　『３行４列の行列を表す多次元配列secondElementの要素を標準入力するための多重ループ』
		 *【３行４列の行列において、行を示すためのループ文】
		 * 行を表すインデックスの値を表す変数firstCountを0の値で初期化
		 * firstCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < THIRD_NUMBER ; firstCount++) {
			/*
			 *【３行４列の行列において、列を示すためのループ文】
			 * 列を表すインデックスの値を表す変数secondCountを0の値で初期化
			 * secondCountの値がTHIRD_NUMBERの値未満の間、以降の文を繰り返し実行
			 * secondCountの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int secondCount = 0 ; secondCount < FORTH_NUMBER ; secondCount++) {
				// どこの要素の値を入力しているか確認できるように表示
				System.out.print("secondElement [" + firstCount + "][" + secondCount + "] = " );
				// 標準入力した値を、今示している箇所の要素として代入
				secondElement [firstCount][secondCount] = standardInput.nextInt();
			}
		// 見やすさのため改行
		} System.out.println();
		
		/*
		 *　『配列firstElementと配列secondElementの積を要素とした、多次元配列thirdElementを４行４列の行列にして表す』
		 *
		 *【４行４列の行列において、行を示すためのループ文】
		 * 行を表すインデックスの値を表す変数firstCountを0の値で初期化
		 * firstCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < FORTH_NUMBER ; firstCount++) {
			/*
			 *【４行４列の行列において、列を示すためのループ文】
			 * 列を表すインデックスの値を表す変数secondCountを0の値で初期化
			 * secondCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
			 * secondCountの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int secondCount = 0 ; secondCount < FORTH_NUMBER ; secondCount++) {
				/*
				 *【４行４列の行列において、配列firstElementと配列secondElementの積を計算し、多次元配列thirdElementの要素として代入するためのループ文】
				 * firstElementの列とsecondElementの行を表すインデックスの値を表す変数thirdCountを0の値で初期化
				 * thirdCountの値がTHIRD_NUMBERの値未満の間、以降の文を繰り返し実行
				 * thirdCountの値をインクリメントして、次の繰り返しの準備をする
				 */
				for (int thirdCount = 0 ; thirdCount < THIRD_NUMBER ; thirdCount++) {
					// firstElementの要素の値とsecondElementの要素の値の積をthirdElementの要素として複合代入
					thirdElement[firstCount][secondCount] += firstElement [firstCount][thirdCount] * secondElement [thirdCount][secondCount];
				}
			}
		// 見やすさのため改行	
		} System.out.println();
		
		//「行列firstElement」を表示
		System.out.println("行列firstElement");

		/*
		 *　『４行３列の行列を表す多次元配列firstElementの要素を表示するための多重ループ』
		 *
		 *【４行３列の行列において、行を示すためのループ文】
		 * 行を表すインデックスの値を表す変数firstCountを0の値で初期化
		 * firstCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < FORTH_NUMBER ; firstCount++) {
			/*
			 *【４行３列の行列において、列を示すためのループ文】
			 * 列を表すインデックスの値を表す変数secondCountを0の値で初期化
			 * secondCountの値がTHIRD_NUMBERの値未満の間、以降の文を繰り返し実行
			 * secondCountの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int secondCount = 0 ; secondCount < THIRD_NUMBER ; secondCount++) {
				// 各要素を表示し、少なくとも４桁の幅で10進数で表示
				System.out.printf("%4d" , firstElement [firstCount][secondCount]);
			// 見やすさのため改行
			} System.out.println();
		// 見やすさのため改行
		} System.out.println();
		
		//「行列secondElement」を表示
		System.out.println("行列secondElement");
		
		/*
		 *　『３行４列の行列を表す多次元配列secondElementの要素を表示するための多重ループ』
		 *
		 *【３行４列の行列において、行を示すためのループ文】
		 * 行を表すインデックスの値を表す変数firstCountを0の値で初期化
		 * firstCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < THIRD_NUMBER ; firstCount++) {
			/*
			 *【３行４列の行列において、列を示すためのループ文】
			 * 列を表すインデックスの値を表す変数secondCountを0の値で初期化
			 * secondCountの値がTHIRD_NUMBERの値未満の間、以降の文を繰り返し実行
			 * secondCountの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int secondCount = 0 ; secondCount < FORTH_NUMBER ; secondCount++) {
				// 各要素を表示し、少なくとも４桁の幅で10進数で表示
				System.out.printf("%4d" , secondElement [firstCount][secondCount]);
			// 見やすさのため改行
			} System.out.println();
		// 見やすさのため改行
		} System.out.println();
		
		//「行列thirdElement」を表示
		System.out.println("行列thirdElement");
		
		/*
		 *　『４行４列の行列を表す多次元配列thirdElementを表示するためのループ文』
		 *
		 *【４行４列の行列において、行を示すためのループ文】
		 * 行を表すインデックスの値を表す変数firstCountを0の値で初期化
		 * firstCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
		 * firstCountの値をインクリメントして、次の繰り返しの準備をする
		 */
		for (int firstCount = 0 ; firstCount < FORTH_NUMBER ; firstCount++) {
			/*
			 *【４行４列の行列において、列を示すためのループ文】
			 * 列を表すインデックスの値を表す変数secondCountを0の値で初期化
			 * secondCountの値がFORTH_NUMBERの値未満の間、以降の文を繰り返し実行
			 * secondCountの値をインクリメントして、次の繰り返しの準備をする
			 */
			for (int secondCount = 0 ; secondCount < FORTH_NUMBER ; secondCount++) {
				// 各要素を表示し、少なくとも４桁の幅で10進数で表示
				System.out.printf("%4d" , thirdElement [firstCount][secondCount]);
			// 見やすさのため改行
			} System.out.println();
		}
	}

}
