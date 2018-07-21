import java.util.ArrayList;
import java.util.List;

public class CriteriaTall implements Criteria {

	public List<Person> waitCriteria(List<Person> persons) {
		List<Person> tabllPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equals("Tall")) {
				tabllPersons.add(person);
			}
		}
		return tabllPersons;
	}
}
