//中介者，负责包装通信方法
public class ChatRoom {
	//通信方法
	public static void shwoMessage(User user,String message){
		System.out.println(" ---user--- "+user.getName()+" ---message---: "+message);
	}
}
