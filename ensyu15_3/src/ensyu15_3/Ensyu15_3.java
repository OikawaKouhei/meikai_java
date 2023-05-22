package ensyu15_3;

//java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

/*
* クラス名；Ensyu15_3
* 概要：文字列探索をして、該当の文字列を表示するプログラム
* 作成者：OikawaKouhei
* 作成日：202305/22
*/
public class Ensyu15_3 {
	/*
	 * 関数名：main
	 * 概要：文字列の入力と表示
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouei
	 * 作成日：2023/05/22
	 */
	public static void main(String[] args) {
		// 標準入力するため
		Scanner standardInput = new Scanner(System.in);
		
		//「文字列1：」を表示
		System.out.print("文字列1：");
		// String変数stringFirstに入力した文字列を代入
		String stringFirst = standardInput.next();
		//「文字列2：」おｗ表示
		System.out.print("文字列2：");
		// String変数stringSecondに入力した文字列を代入
		String stringSecond = standardInput.next();
		// 位置する部分がそろうようにするための変数を0で初期化
		int spaceNumber = 0;
		// indexNumberの値に、stringFirstにstringSecondの文字列が含まれていれば、その一の値を、含まれていなければ-1を代入
		int indexNumber = stringFirst.indexOf(stringSecond);
		
		// indexNumberの値が-1の場合、判断
		if (indexNumber == -1) {
			//「文字列1の中に文字列2は含まれていません」を表示
			System.out.println("文字列1の中に文字列2は含まれていません");
			// indexNumberの値が-1でない場合、判断
		} else {
			// spaceNumberの値に、indexNumberの値とstringSecondの文字数の値を足して代入
			spaceNumber = indexNumber + stringSecond.length();
			//「文字列1：」を表示
			System.out.print("文字列1：");
			// stringFirstを表示
			System.out.println(stringFirst);
			//「文字列1：」を表示
			System.out.print("文字列2：");
			// 少なくともspaceNumberの値で表示し、上下がそろうように表示する
			System.out.printf("%" + spaceNumber + "s\n",stringSecond);
		}
	}
}
