package ensyu12_1;

import java.util.Scanner;

public class Ensyu12_1 {
		/*
		 * 関数：inputCarInformation
		 * 概要：車の車高・車幅・車長を入力するためのメソッド
		 * 引数：String carPart
		 * 返り値：partNumber
		 * パラメーターの説明：入力している情報の名前
		 * 作成者：OikawaKouhei
		 * 作成日：2023/05/11
		 */
		static int inputCarInformation(String carPart) {
			// 標準入力するため
			Scanner standardInput = new Scanner(System.in);
			// 車の大きさを代入するための変数を0で初期化
			int partNumber = 0;
			// 以降の文を実行
			do {
				//「carPart」を表示
				System.out.print(carPart);
				// partNumberに入力した値を代入
				partNumber = standardInput.nextInt();
			// partNumberの値が0以下の間、do以降から繰り返し実行 
			} while (partNumber <= 0);
			// partNumberの値を返す
			return partNumber;
		}

		/*
		 * 関数：inputCarMove
		 * 概要：車の燃料や、移動地点などを入力するためのメソッド
		 * 引数：String carInformation
		 * 返り値：partNumber
		 * パラメーターの説明：入力している情報の名前
		 * 作成者：OikawaKouhei
		 * 作成日：2023/05/11
		 */
		static double inputCarMove(String carInformation) {
			// 標準入力するため
			Scanner standardInput = new Scanner(System.in);
			// 車の移動に関する情報を代入するための変数を0で初期化
			double moveNumber = 0;
			// 以降の文を実行
			do {
				//「carInformation：」を表示
				System.out.print(carInformation);
				// moveNumberの値に、入力した値を代入
				moveNumber = standardInput.nextDouble();
			// moveNumberの値が0以下の間、do以降から繰り返し実行
			} while (moveNumber <= 0);
			// moveNumberの値を返す
			return moveNumber;
		}

		/*
		 * 関数名：main
		 * 概要：車の情報を入力・表示し、移動距離に応じて残り燃料を減らす
		 * 引数：String[] args
		 * 返り値：なし
		 * パラメーターの説明：なし
		 * 作成者：OikawaKouhei
		 * 作成日：2023/05/18
		 */
		public static void main(String[] args) {
			// 標準入力するため
			Scanner standardInput = new Scanner(System.in);

			//「車のデータを入力してください」
			System.out.println("車のデータを入力してください");

			//「名前は：」を表示
			System.out.print("名前は：");
			// 車の名前を表すString変数を、入力した値で初期化
			String carName = standardInput.next();
			//「ナンバーは：」を表示
			System.out.print("ナンバーは：");
			// 車のナンバーの名前を表すString変数を、入力した値で初期化
			String carNumber = standardInput.next();

			// 車幅を表す変数carWidthの値を、メソッドinputCarInformationの返り値で初期化
			int carWidth = inputCarInformation("車幅は：");
			// 車高を表す変数carWidthの値を、メソッドinputCarInformationの返り値で初期化
			int carHeigth = inputCarInformation("高さは：");
			// 車長を表す変数carWidthの値を、メソッドinputCarInformationの返り値で初期化
			int carLength = inputCarInformation("長さは：");

			// タンクの容量を表す変数fuelCapacityの値を、メソッドinputCarMoveの返り値で初期化
			double fuelCapacity = inputCarMove("タンクの容量は：");
			// 現在の燃料を表す変数fuelRemainingの値を、0で初期化
			double fuelRemaining = 0;
			// 以降の文を実行
			do {
				// fuelRemainingの値に、メソッドinputCarMoveの返り値を代入
				fuelRemaining =inputCarMove("現在の燃料は：");
			// 現在の燃料が、燃料タンクの容量を超えている間、繰り返し判断
			} while (fuelRemaining > fuelCapacity);
			// 燃費を表す変数fuelConsumptionの値を、メソッドinputCarMoveの返り値で初期化
			double fuelConsumption = inputCarMove("燃費は：");
			// 購入日を引数なしで生成
			Day purchaseDay = new Day();
			// 購入日を表示
			System.out.println(purchaseDay);

			// 詠み込んだ値をもとにクラスCar型のインスタンスmyCarを構築
			CarMileage myCar = new CarMileage (carName, carNumber, carWidth, carHeigth, carLength, 
													fuelCapacity, fuelRemaining, fuelConsumption, purchaseDay);

			// trueの間、以降の文を繰り返し実行
			while (true) {
				// 現在地の値を表示
				System.out.println("現在地(" + myCar.getNowBesidePoint() + ", " + myCar.getNowVerticalPoint() + ")");
				// 残り燃料を表示
				System.out.println("残り燃料：" + myCar.getFuelRemaining());
				

				// 改行
				System.out.println();
				
				//「給油…1 / 移動…2 / 停止…それ以外の値：」を表示
				System.out.print("給油…1 / 移動…2 / 停止…それ以外の値：");
				// 次の動作を決めるための変数を、入力した値で初期化
				int judgeNumber = standardInput.nextInt();
				// judgeNumberの値が1の場合、判断
				if (judgeNumber == 1) {
					//「給油します。」を表示
					System.out.print("給油します。");
					// 給油量を表すdouble型変数をメソッドinputCarMoveの値で初期化
					double pulusFuel = inputCarMove("給油量：");
					// pulusFuelを引数としてインスタンスメソッドmyCar.refuelCarを呼び出す
					myCar.refuelCar(pulusFuel);
				// judgeNumberの値が2の場合、判断
				} else if (judgeNumber == 2) {
					//「X方向の移動距離：」を表示
					System.out.print("X方向の移動距離：");
					// 横軸方向の移動を表すdouble変数を入力した値で初期化
					double nowBesidePoint = standardInput.nextDouble();
					//「X方向の移動距離：」を表示
					System.out.print("Y方向の移動距離：");
					// 縦軸方向の移動を表すdouble変数を入力した値で初期化
					double nowVerticalPoint = standardInput.nextDouble();
					

					// (nowBesidePoint, nowVerticalPoint)を引数としてインスタンスメソッドmyCar.movePointを呼び出し、falseであれば判断
					if (! myCar.movePoint(nowBesidePoint, nowVerticalPoint)) {
						//「燃料が足りません。」を表示
						System.out.println("燃料が足りません。");
						// falseの場合、判断
					} else {
						// 走行距離をCarMileageクラスのgetTotalMileageメソッドを呼び出し表示
						System.out.println("走行距離：" + myCar.getTotalMileage(nowBesidePoint, nowVerticalPoint));
					}
				// それ以外の場合、判断
				} else {
					//「終わります」を表示
					System.out.println("終わります");
					// whileのループ文を抜け出す
					break;
				}
			}
		}

	}

