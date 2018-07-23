//迭代仓库
public class NameRepository {
	//数组
	public String names[] = { "John", "Tom", "Lee", "Sherry" };
	
	//获取迭代器
	public Iterator getIterator() {
		return new NameIterator();
	}

	//迭代器
	private class NameIterator implements Iterator {
		int index = 0;
		
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}

	}
}
