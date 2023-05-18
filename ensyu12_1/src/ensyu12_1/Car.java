package ensyu12_1;

public class Car {
	// 車の名前を表す非公開のフィールドをString変数で宣言
	private String carName;
	// 車のナンバーを表す非公開のフィールドをString変数で宣言
	private String carNumber;
	// 車幅を表す非公開のフィールドをint変数で宣言
	private int carwidth;
	// 車高を表す非公開のフィールドをint変数で宣言
	private int carheigth;
	// 車長を表す非公開のフィールドをint変数で宣言
	private int carlength;
	// 横軸の座標を表す非公開のフィールドをdouble変数で宣言
	private double nowBesidePoint;
	// 縦軸の座標を表す非公開のフィールドをdouble変数で宣言
	private double nowVerticalPoint;
	// 燃料タンクの容量を表す非公開のフィールドをdouble変数で宣言
	private double fuelCapacity;
	// 残りの燃料を表す非公開のフィールドをdouble変数で宣言
	private double fuelRemaining;
	// 燃費を表す非公開のフィールドをdouble変数で宣言
	private double fuelConsumption;
	// 購入日を表す非公開フィールドをDayクラス型で宣言
	private Day purchaseDay;

	/* 
	 * コンストラクタ
	 * 概要：非公開のフィールド変数をインスタンス化するためのコンストラクタ
	 * 引数：String carName, String carNumber, int carwidth, int carheigth, int carlength,
			 double fuelCapacity, double fuelRemaining, double fuelConsumption, Day purchaseDay
	 * 返り値；なし
	 * パラメーターの説明：車の名前・大きさ・移動したときの座標・タンクの容量と残り燃料・燃費・購入日
	 * 作成者・OikawaKouhei
	 * 作成日：2023/05/18
	 * 
	 */
	Car(String carName, String carNumber, int carwidth, int carheigth, int carlength,
			 double fuelCapacity, double fuelRemaining, double fuelConsumption, Day purchaseDay) {
		/*
		 * 非公開のフィールド変数を仮引数で初期化する
		 * 現在の車の座標を表すnowBesidePointとnowVerticalPointは0.0で初期化する
		 */
		this.carName = carName; this.carNumber = carNumber; this.carwidth = carwidth; this.carheigth = carheigth;
		this.carlength = carlength; this.fuelCapacity = fuelCapacity; this.fuelRemaining = fuelRemaining; this.fuelConsumption = fuelConsumption;
		this.purchaseDay = new Day(purchaseDay);
		nowBesidePoint = nowVerticalPoint = 0.0;
	}
	
	/*
	 * 関数名：getNowBesidePoint
	 * 概要：車の横軸の座標を調べる
	 * 引数：なし
	 * 返り値：nowBesidePoint
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/11
	 */
	double getNowBesidePoint() {
		// nowBesidePointの値を返す
		return nowBesidePoint;
	}
	/*
	 * 関数名：getNowVerticalPoint
	 * 概要：車の縦軸の座標を調べる
	 * 引数：なし
	 * 返り値：nowVerticalPoint
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/11
	 */
	double getNowVerticalPoint() {
		// fuelConsumptionの値を返す
		return nowVerticalPoint;
	}
	/*
	 * 関数名：getFuelCapacity
	 * 概要：車の燃料の容量を調べる
	 * 引数：なし
	 * 返り値：fuelCapacity
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/11
	 */
	double getFuelCapacity() {
		// fuelConsumptionの値を返す
		return fuelCapacity;
	}
	/*
	 * 関数名：getFuelRemaining
	 * 概要：車の残りの燃料を調べる
	 * 引数：なし
	 * 返り値：fuelRemaining
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/11
	 */
	double getFuelRemaining() {
		// fuelConsumptionの値を返す
		return fuelRemaining;
	}
	/*
	 * 関数名：getFuelConsumption
	 * 概要：車の燃費を調べる
	 * 引数：なし
	 * 返り値：fuelConsumption
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/11
	 */
	double getFuelConsumption() {
		// fuelConsumptionの値を返す
		return fuelConsumption;
	}
	
	/*
	 * 関数名；getPurchaseDay
	 * 概要：購入日を取得
	 * 引数：なし
	 * 返り値：purchaseDay
	 * パラメーターの説明：なし
	 * 作成者：OikawaKouhei
	 * 作成日：2023/05/18
	 */
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	
	/*
	 * 関数名：movePoint
	 * 概要：残りの燃料と、車の燃費をもとに、指定した距離移動できるか判断するメソッド
	 * 引数；double besidePoint , double verticalPoint
	 * 返り値：judgeMove
	 * パラメーターの説明：車の移動した地点の横軸と縦軸の値
	 * 作成者：OikwaKouhei
	 * 作成日：2023/05/11
	 */
	boolean movePoint(double besidePoint , double verticalPoint) {
		// 移動距離を表すdouble変数をMath.sqrt(besidePoint * besidePoint + verticalPoint * verticalPoint)の値で初期化
		double pointMove = Math.sqrt(besidePoint * besidePoint + verticalPoint * verticalPoint);
		
		// 返り値boolean型変数judgeMoveをfalseで初期化
		boolean judgeMove = false;
		
		// 使った燃料を表すdouble変数を、移動距離÷燃費の値で初期化
		double useFuele = pointMove / fuelConsumption;
		
		// 使った燃料の値が残り燃料の値以下の場合、判断
		if (useFuele <= fuelRemaining) {
			// 残り燃料の値から使った燃料の値分引き、残り燃料に代入
			fuelRemaining -= useFuele;
			// 現在の横軸の値に、移動後の横軸の値を加算代入
			nowBesidePoint += besidePoint;
			// 現在の縦軸の値に、移動後の縦軸の値を加算代入
			nowVerticalPoint += verticalPoint;
			// judgeMoveにtrueを代入
			judgeMove = true;
		}
		// judgeMoveを返す
		return judgeMove;
	}
	
	/*
	 * 関数名：refuelCar
	 * 概要：給油する
	 * 引数；double fuelPuls
	 * 返り値：なし
	 * パラメーターの説明：給油する値
	 * 作成者：OikwaKouhei
	 * 作成日：2023/05/11
	 */
	void refuelCar(double fuelPuls) {
		// 給油する値が燃料の容量を超える場合、判断
		if (fuelCapacity <= (fuelRemaining + fuelPuls)) {
			// 現在の残り燃料に、燃料の容量までの値を加算
			fuelRemaining += (fuelCapacity - fuelRemaining);
		// 給油する値が燃料の容量を超えない場合、判断
		} else {
			// 現在の残り燃料に、給油量の値を加算
			fuelRemaining += fuelPuls;
		}
	}
}
