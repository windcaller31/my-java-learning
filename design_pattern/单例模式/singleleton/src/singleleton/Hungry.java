package singleleton;

public class Hungry {
	public static Hungry hun = new Hungry();
	//让构造函数为 private，这样该类就不会被实例化
	private Hungry(){};
	public static Hungry getInstance(){
		return hun;
	}
	public void showMsg(){
		System.out.println("aaaaa");
	}
}
