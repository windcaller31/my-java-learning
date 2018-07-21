import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

	private CriteriaMale criteriaMale;
	private CriteriaTall criteriaTall;
	
	public AndCriteria(CriteriaMale criteriaMale, CriteriaTall criteriaTall) {
		super();
		this.criteriaMale = criteriaMale;
		this.criteriaTall = criteriaTall;
	}

	public List<Person> waitCriteria(List<Person> personList) {
		List<Person> first = this.criteriaMale.waitCriteria(personList);
		List<Person> second = this.criteriaTall.waitCriteria(personList);
		List<Person> finalList = new ArrayList<Person>();
		for(Person p : first){
			if(second.contains(p)){
				finalList.add(p);
			}
		}
		return finalList;
	}

}
