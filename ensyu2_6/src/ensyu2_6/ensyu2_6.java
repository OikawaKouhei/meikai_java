package ensyu2_6;

import java.util.Scanner;

// java.util.Scannerパッケージを利用するための宣言


/*
 * クラス名：ensyu2_6
 * 概要：演習2_6
 * 作成者：OikawaKouhei
 * 作成日：2023/04/06
 */
public class ensyu2_6 {
	/*
	 * 関数名：main関数
	 * 概要：底辺と高さを実数値で入力し、三角形の面積を求める。
	 * 引数：String[] args
	 * 返り値：なし
	 * パラメーターの説明：bottom , high
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため
		Scanner standardInput = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		
		System.out.print("底辺：");
		//標準入力した実数値を、変数bottomに代入
		double bottom = standardInput.nextDouble();
		
		System.out.print("高さ：");
		//標準入力した実数値を、変数highに代入
		double high = standardInput.nextDouble();
		
		System.out.println("面積は" + (bottom * high) / 2 + "です。");
	}
}
