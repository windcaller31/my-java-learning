
public class MyClassLoaderTest {
	public static void main(String args[]) {
		try {
			MyClassLoader m = new MyClassLoader("/Users/iyx/Documents/workspace/limtLucene/target/classes");
			Class<?> C = m.findClass("limtLucene.Lucene3");
			System.out.println(C.getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
