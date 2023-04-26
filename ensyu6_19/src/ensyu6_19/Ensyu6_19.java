package ensyu6_19;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
 * クラス名：Ensyu6_19
 * 概要：演習6_19
 * 作成者：OikawaKouhei
 * 作成日：2023/04/26
 */
public class Ensyu6_19 {
	/*
	 * 関数名：main
	 * 概要：クラス数・各クラスの人数・全員の点数を読み込み、それらの合計点と平均点を求めるプログラム
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);

		// クラス数(行)を表す変数lineElementを0で初期化
		int classElement = 0;
		// 生徒数(列)を表す変数columnElementを0で初期化
		int studentsElement = 0;
		// 正の整数値しか入力できないようにするための定数ONE_THANを1で初期化
		final int ONE_THAN = 1;
		// 総合計値を出すための変数sumNumberを0で初期化
		int sumNumber = 0;
		// 総生徒数を出すための変数allStudentsを0で初期化
		double allStudents = 0;

		// 以降の文を実行
		do {
			//「組数：」を表示
			System.out.print("組数：");
			// classElementの値に標準入力した値を代入
			classElement = standardInput.nextInt();
		// classElementの値の値がONE_THANの値未満の場合、do以降から繰り返し判断
		} while (classElement < ONE_THAN);
		
		// 2次元配列firstElementを生成
		int[][] firstElement = new int[classElement][];
		// 全生徒の合計点を要素とするための配列sumElementを生成
		int[] sumElement = new int[classElement];

		
		/*
		 * 【どこの組かを指定するためのループ文】
		 * 組を表す変数firstCountを0で初期化
		 * firstCountの値がlineElementの値未満の場合、以降の文を繰り返し実行
		 * firstCountをインクリメントし、次の繰り返しの準備
		 */
		for (int firstCount = 0; firstCount < classElement; firstCount++) {
			// 以降の文を実行
			do {
				// 組を表示
				System.out.print((firstCount + 1) + "組の人数：");
				// 生徒の人数を表す変数に標準入力した値を代入
				studentsElement = standardInput.nextInt();
				// studentsElementの値が、ONE_THANの値未満の間、doから繰り返し実行
			} while (studentsElement < ONE_THAN);
			
			allStudents += studentsElement;
			// 各組数(行数)に、生徒の人数(列数)を生成
			firstElement[firstCount] = new int[studentsElement];

			/*
			 * 【人を指定するためのループ文】
			 * 人のインデックスを表すための変数secondCountを0で初期化
			 * secondCountの値が、firstElement[firstCount].lengthの値未満の場合、以降の文を繰り返し実行
			 * secondCountの値をインクリメントし、次の繰り返しの準備をする
			 */
			for (int secondCount = 0; secondCount < firstElement[firstCount].length; secondCount++) {
				// 以降の文を実行する
				do {
				// どの組の誰の点数を入力しているか表示
				System.out.print((firstCount + 1) + "組" + (secondCount + 1) + "番の点数：");
				// 表示している要素に、標準入力した値を代入
				firstElement[firstCount][secondCount] = standardInput.nextInt();
				// firstElement[firstCount][secondCount]の値が0未満の場合、do以降を実行
				} while (firstElement[firstCount][secondCount] < 0);
				// sumElement[firstCount]の値にfirstElement[firstCount][secondCount]を複合代入
				sumElement[firstCount] += firstElement[firstCount][secondCount];
			}
		}
		
		//「  組 |   合計   平均 」を表示
		System.out.println("  組 |   合計   平均 ");
		//「-----+---------------」を表示
		System.out.println("-----+---------------");
		
		/*
		 * 【組ごとの合計と平均値を出力するプログラム】
		 * 組名を示すインデックスを表すための変数firstCountの値を0で初期化
		 * firstCountの値がclassElementの値未満の場合、以降の文を繰り消し実行
		 * firstCountの値をインクリメントし、次の繰り返しの準備をする
		 */
		for (int firstCount = 0; firstCount < classElement; firstCount++) {
			// 以降に表示する組名を表示
			System.out.print((firstCount + 1) +"組  |     ");
			// 組の合計点と平均点を表示
			System.out.println((sumElement[firstCount]) + "    " + (double)(sumElement[firstCount] / firstElement[firstCount].length));
			// 全クラスの合計を計算する
			sumNumber += sumElement[firstCount];
		}
		//「-----+---------------」を表示
		System.out.println("-----+---------------");
		// 全組の合計と平均を表示する
		System.out.println(" 計 |      " + (sumNumber) + "    " + (double)(sumNumber / allStudents) );
	}
}
