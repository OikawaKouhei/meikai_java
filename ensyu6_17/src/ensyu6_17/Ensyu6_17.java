package ensyu6_17;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_17
 * 概要：演習6_17
 * 作成者：OikawaKouhei
 * 作成日：202thirdNumber/0forthNumber/26
 */
public class Ensyu6_17 {
	/*
	 * 関数名：main
	 * 概要：6人の2科目(国語・数学)の点数を読み込んで、科目ごとの平均点・学生ごとの平均点を求めるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		// 定数２教科を表す変数SECOND_NUMBERを2で初期化
		final int SECOND_NUMBER = 2;
		// 定数６人を表す変数SECOND_NUMBERを6で初期化
		final int SIX_NUMBER = 6;
		// 0未満の入力を防ぐための変数ZERO_THANを0で初期化
		final int ZERO_THAN = 0;
		
		// 教科を表す文字列の配列を生成
		String[] subjectString = {
			"国語","数学"	
		};
		// 人名を表す文字列の配列を生成
		String[] nameString = {
				"A","B","C","D","E","F"
		};
		
		// 人と教科に応じた点数を入力するための多次元配列firstElementを生成
		int [][] firstElement = new int[SIX_NUMBER][SECOND_NUMBER];
		// 教科を表すための配列secondElementを生成
		int [] secondElement = new int[SECOND_NUMBER];
		// 人を表すための配列thirdElementを生成
		int [] thirdElement = new int[SIX_NUMBER];
		
		/*
		 * 『人と教科ごとに点数を標準入力するための多重ループ』
		 * 
		 * 【人を切り替えて表示していくためのループ文】
		 * 人を表すためのインデックスの値を表す変数firstCountを0で初期化
		 * firstCountの値がSIX_NUMBERの値未満の間、以降の文を繰り返し判断
		 * firstCountの値をインクリメントし、次の繰り返し準備をする
		 */
		for (int firstCount = 0 ; firstCount < SIX_NUMBER ; firstCount++) {
			/*
			 * 【教科を切り替えて表示していくためのループ文】
			 * 教科を表すためのインデックスの値を表す変数secondCountを0で初期化
			 *  secondCountの値がSECOND_NUMBERの値未満の間、以降の文を繰り返し判断
			 *  secondCountの値をインクリメントし、次の繰り返し準備をする
			 */
			for (int secondCount = 0 ; secondCount < SECOND_NUMBER ; secondCount++) {
				// 以降の文を実行するため
				do {
					// 人と教科を表示して、以降に該当する点数の入力を促す
					System.out.print(nameString[firstCount] + "さん-" + subjectString[secondCount] + "…");
					// firstElement[firstCount][secondCount]の要素に、標準入力した値を代入
					firstElement[firstCount][secondCount] = standardInput.nextInt();
				// firstElement[firstCount][secondCount]の値が0未満であれば、do以降を繰り返し実行
				} while (firstElement[firstCount][secondCount] < ZERO_THAN);
			}
		// 見やすさのための改行
		} System.out.println();
		
		// 以降に科目ごとの平均点と生徒ごとの平均点を表示することを明示
		System.out.println("科目ごとの平均点と、生徒ごとの平均点を表示します");
		
		/*
		 * 『科目ごとの平均点を出すための計算と、表示をするための多重ループ』
		 * 
		 * 【教科を切り替えて表示していくためのループ文】
		 * 教科を表すためのインデックスの値を表す変数firstCountを0で初期化
		 * firstCountの値がSECOND_NUMBERの値未満の間、以降の文を繰り返し判断
		 * firstCountの値をインクリメントし、次の繰り返し準備をする
		 */
		for (int firstCount = 0 ; firstCount < SECOND_NUMBER ; firstCount++) {
			/*
			 * 【人を切り替えて表示していくためのループ文】
			 * 人を表すためのインデックスの値を表す変数firstCountを0で初期化
			 * secondCountの値がSIX_NUMBERの値未満の間、以降の文を繰り返し判断
			 * firstCountの値をインクリメントし、次の繰り返し準備をする
			 */
			for (int secondCount = 0 ; secondCount < SIX_NUMBER ; secondCount++) {
				// 教科を表すための配列にfirstElement[secondCount][firstCount]の要素の値を複合代入
				secondElement[firstCount] += firstElement[secondCount][firstCount];
			}
			// 教科ごとの平均点を表示
			System.out.println(subjectString[firstCount] + "の平均は" + (secondElement[firstCount] / SIX_NUMBER) + "点です。");
		// 見やすさのための改行
		} System.out.println();
		
		/*
		 * 『人ごとの平均点を出すための計算と、表示をするための多重ループ』
		 * 
		 * 【人を切り替えて表示していくためのループ文】
		 * 人を表すためのインデックスの値を表す変数firstCountを0で初期化
		 * firstCountの値がSIX_NUMBERの値未満の間、以降の文を繰り返し判断
		 * firstCountの値をインクリメントし、次の繰り返し準備をする
		 */
		for (int firstCount = 0 ; firstCount < SIX_NUMBER ; firstCount++) {
			/*
			 * 【教科を切り替えて表示していくためのループ文】
			 * 教科を表すためのインデックスの値を表す変数firstCountを0で初期化
			 * secondCountの値がSECOND_NUMBERの値未満の間、以降の文を繰り返し判断
			 * firstCountの値をインクリメントし、次の繰り返し準備をする
			 */
			for (int secondCount = 0 ; secondCount < SECOND_NUMBER ; secondCount++) {
				// 人を表すための配列にthirdElement[firstCount][secondCount]の要素の値を複合代入
				thirdElement[firstCount] += firstElement[firstCount][secondCount];
			}
			// 人ごとの平均点を表示
			System.out.println(nameString[firstCount] + "の平均は" + (thirdElement[firstCount] / SECOND_NUMBER) + "点です。");
		// 見やすさのための改行
		} System.out.println();
		
	}

}
