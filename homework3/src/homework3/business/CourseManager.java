package homework3.business;


import homework3.core.logging.Logger;
import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Course[] courses;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Course[] courses, Logger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getCoursePrice() < 0 ) {
			throw new Exception("Bir kursun fiyatý 0'dan küçük olamaz.");
		}
		else {
			for(Course coursee : courses) {
				if(coursee.getCourseName() == course.getCourseName()) {
					throw new Exception("Kurs ismi tekrar edemez.");
				}
			}
		}
		
		courseDao.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}	
	}
	
}
