public class PersonManager {
	public void add(Person person) {
		System.out.println(person.getFirstName() + "default added");
	}
	public void update(Person person) {
		System.out.println(person.getFirstName() + "default updated");
	}
	public void delete(Person person) {
		System.out.println(person.getFirstName() + "default deleted");
	}
}