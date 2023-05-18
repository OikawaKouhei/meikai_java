package ensyu12_1;

/*
 * クラス名：CarMileage
 * 概要：Carクラスのサブクラス、走行距離を計算するクラス
 * 作成者：OikawaKouhei
 * 作成日；2023/05/18
 */
public class CarMileage extends Car {
	// 総距離を表す非公開フィールドを宣言
	private double totalMileage;
	// 走行距離を計算するための非公開フィールドを宣言
	private static double countMileage;
	
	{
		// インスタンス初期化しで、countMileageの値を0っで初期化
		countMileage = 0;
	}
	
	/*
	 * コンストラクタ
	 * 概要：非公開のフィールド変数をインスタンス化するためのコンストラクタ
	 * 引数；String carName, String carNumber, int carwidth, int carheigth, int carlength,
				double fuelCapacity, double fuelRemaining, double fuelConsumption,Day purchaseDay
	 * 返り値；なし
	 * パラメーターの説明：車の名前・大きさ・移動したときの座標・タンクの容量と残り燃料・燃費・購入日
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/18
	 */
	CarMileage(String carName, String carNumber, int carwidth, int carheigth, int carlength,
				double fuelCapacity, double fuelRemaining, double fuelConsumption,Day purchaseDay) {
		// スーパークラスのコンストラクタを呼び出し、初期化
		super(carName,  carNumber,  carwidth,  carheigth,  carlength,
				 fuelCapacity, fuelRemaining,  fuelConsumption, purchaseDay );
		// totalMileageフィールドの値を0で初期化
		this.totalMileage = 0;
		
	}
	/*
	 * 関数名：getTotalMileage
	 * 概要：走行距離を計算し、返すメソッド
	 * 引数：double besidePoint, double verticalPoint
	 * 返り値：totalMileage
	 * パラメーターの説明：移動後の座標
	 * 作成者；OikawaKouhei
	 * 作成日：2023/05/18
	 */
	public double getTotalMileage(double besidePoint, double verticalPoint) {
		// 走行距離を計算して加算代入
		countMileage += Math.sqrt(besidePoint * besidePoint + verticalPoint * verticalPoint);
		// 総走行距離にcountMileageの値を代入
		totalMileage = countMileage;
		// totalMileageの値を返す
		return totalMileage;
	}
	
	
}
