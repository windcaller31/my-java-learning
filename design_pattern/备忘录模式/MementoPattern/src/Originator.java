
//保存状态类,操作备忘录
public class Originator {
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	//保存新的备忘录记录时返回新的备忘录类
	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	//获取备忘录对象中的记录
	public void getStateFromMemento(Memento Memento) {
		state = Memento.getState();
	}
}
