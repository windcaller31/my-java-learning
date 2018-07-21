import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{

	 @Override
	   public List<Person> waitCriteria(List<Person> persons) {
	      List<Person> malePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getGender().equals("Male")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	   }

}
