public class StudentManager extends PersonManager{
	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName() + "student added");
	}
	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName() + "student updated");
	}
	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName() + "student deleted");
	}
}