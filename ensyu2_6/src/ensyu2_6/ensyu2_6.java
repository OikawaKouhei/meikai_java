package ensyu2_6;
// java.util.Scannerのパッケージを利用するための宣言
import java.util.Scanner;

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
	 * パラメーターの説明：triangleBottom , triangleHeight
	 */
	public static void main(String[] args) {
		// 標準入力を取得するため
		Scanner standardInput = new Scanner(System.in);
		
		// これから、三角形の面積を求めることを知らせるため
		System.out.println("三角形の面積を求めます。");
		
		// 三角形の底辺を、実数値で入力を促すため
		System.out.print("底辺：");
		//標準入力した実数値を、変数triangleBottomに代入
		double triangleBottom = standardInput.nextDouble();
		
		// 三角形の高さを、実数値で入力を促すため
		System.out.print("高さ：");
		// 標準入力した実数値を、変数triangleHeightに代入
		double triangleHeight = standardInput.nextDouble();
		
		// 「(triangleBottom * triangleHeight) / 2 」を計算し、三角形の面積を出力するため
		System.out.println("面積は" + (triangleBottom * triangleHeight) / 2 + "です。");
	}
}
