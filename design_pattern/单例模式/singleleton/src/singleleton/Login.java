package singleleton;

public class Login {
	//内部类是延时加载的，也就是说只会在第一次使用时加载。不使用就不加载，所以可以很好的实现单例模式。
	//真正意义上的懒汉模式：即延迟加载 、静态域

	private static class loginHolder {
		private static final Login instance = new Login();
	}

	public static Login login;

	private Login() {
	};

	public static final Login getInstance() {
		return loginHolder.instance;
	}
}
