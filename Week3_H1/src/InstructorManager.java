public class InstructorManager extends PersonManager{
	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName() + "instructor added");
	}
	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName() + "instructor updated");
	}
	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName() + "instructor deleted");
	}
}