import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	//备忘录list
	private List<Memento> mementoList = new ArrayList<Memento>();

	//保存现场
	public void add(Memento state) {
		mementoList.add(state);
	}

	//恢复现场
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
