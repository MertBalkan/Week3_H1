public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "enginHoca123", "Java", 2);
		User user = new User(2, "Celal", "Sengor", "454");
		Student student = new Student(3, "Mert", "Balkan", "435", "Hellow", 2);
		
		Person[] persons = {instructor, user, student};
		
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		
		PersonManager[] managers = {instructorManager, userManager, studentManager};
		
		instructorManager.add(instructor);
		userManager.add(user);
		studentManager.add(student);

	}
}