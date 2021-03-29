package study;

/*
*継承・オーバロイドの基本的な使い方
*/
public class Main{

	public static void main(String [] args) {
// ③Task クラスのインスタンスを生成し、「doTask()」メソッドを呼び出しなさい。
		Task doTask= new Task();//Taskというインスタンスを作成

		Task task= new Task();  //インスタンスTaskのdoTaskメソッドの呼び出し「クラス名.メソッド()」
		task.doTask ();
	}
}