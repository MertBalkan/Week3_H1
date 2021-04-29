public class UserManager extends PersonManager{
	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName() + "user added");
	}
	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName() + "user updated");
	}
	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName() + "user deleted");
	}
}
