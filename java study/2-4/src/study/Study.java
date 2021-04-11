package study;

//①Fruitsconctants.javaをインポートしなさい。
import constants.FruitsConstants;

//②Fruits.javaをインポートしなさい。
import fruits.Fruits;

//基本的なJavaの構造と、importについて理解を深める
public class Study {

	public static void main(String[] args) {
		/**③Fruits.javaのprintFruitsメソッドを呼び出しなさい
		 * また、課題の画像とおなじ表示になるように
		 * printFruitsの引数にはFruitsConstantsに指定されている定数を設定してください
		 */

		/**
		*「import fruits.Fruits;」でFruitsクラスをインポートしているのでnewせずに
		*「クラス名.メソッド名()」で呼び出しの記述をして使うことができます。
		*また、「レモン」と「20」も「import constants.FruitsConstants;」でインポートしているので
		*「クラス名.定数名」で呼び出し出力されるように記述。
		*/
		Fruits.printFruits(constants.FruitsConstants.FRUITS_LEMON_04,constants.FruitsConstants.FRUITS_COUNT_20);
	}
}
