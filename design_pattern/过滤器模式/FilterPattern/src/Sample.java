import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String args[]) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Tall"));
		persons.add(new Person("John", "Male", "Tall"));
		persons.add(new Person("Laura", "Female", "Tall"));
		persons.add(new Person("Diana", "Female", "Tall"));
		persons.add(new Person("Mike", "Male", "Short"));
		persons.add(new Person("Bobby", "Male", "Short"));

		CriteriaMale criteriaMale = new CriteriaMale();
		CriteriaTall criteriaTall = new CriteriaTall();
		AndCriteria andCriteria = new AndCriteria(criteriaMale, criteriaTall);
		persons = andCriteria.waitCriteria(persons);
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
