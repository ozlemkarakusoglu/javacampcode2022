package homework3.entities;

public class Course {

	String courseName;
	String courseCategory;
	String courseTeacher;
	double coursePrice;
	
	
	public Course() {
		super();
	}
		
	public Course(String courseName, String courseCategory, String courseTeacher, double coursePrice) {
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.courseTeacher = courseTeacher;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategory() {
		return courseCategory;
	}


	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}


	public String getCourseTeacher() {
		return courseTeacher;
	}


	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}


	public double getCoursePrice() {
		return coursePrice;
	}


	public void setCoursePrice(double coursePrice) {		
		this.coursePrice = coursePrice;
	}
	
}
