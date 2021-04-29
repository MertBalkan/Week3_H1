public class Instructor extends Person{
	
	private String courseName;
	private int givenCourseNumber;

	public Instructor(int id, String firstName, String lastName, String password, String courseName, int givenCourseNumber) {
		super(id, firstName, lastName, password);
		this.courseName = courseName;
		this.givenCourseNumber = givenCourseNumber;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getGivenCourseNumber() {
		return givenCourseNumber;
	}
	public void setGivenCourseNumber(int givenCourseNumber) {
		this.givenCourseNumber = givenCourseNumber;
	}
}