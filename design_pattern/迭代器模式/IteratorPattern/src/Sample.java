
public class Sample {
	public static void main(String args[]){
		NameRepository namesRepository = new NameRepository();
		//先获取迭代器  hasNext 判断  next 开始迭代
		for(Iterator i = namesRepository.getIterator() ; i.hasNext() ; ){
			 String name = (String)i.next();
	         System.out.println("Name : " + name);
		}
	}		
	 
}
