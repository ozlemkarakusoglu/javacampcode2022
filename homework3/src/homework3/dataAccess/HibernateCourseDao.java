package homework3.dataAccess;

import homework3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi");
		
	}

}
