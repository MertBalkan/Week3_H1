public class Student extends Person{
	
	private String biography;
	private int courseTakenNumber;
	
	public Student(int id, String firstName, String lastName, String password, String biography, int courseTakenNumber) {
		super(id, firstName, lastName, password);
		this.biography = biography;
		this.courseTakenNumber = courseTakenNumber;
	}
	
	public int getCourseTakenNumber() {
		return courseTakenNumber;
	}

	public void setCourseTakenNumber(int courseTakenNumber) {
		this.courseTakenNumber = courseTakenNumber;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}	
}