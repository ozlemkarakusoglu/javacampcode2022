package homework3;



import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.TeacherManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.Logger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.HibernateCategoryDao;
import homework3.dataAccess.JdbcCourseDao;
import homework3.dataAccess.JdbcTeacherDao;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course("a","b","c",10);
		
		Course[] courses = {};
		
		Teacher teacher = new Teacher("x");
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(course1);
		
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.add(teacher);
		
		Category category1 = new Category("z");
		Category[] categories = {};
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories, loggers);
		categoryManager.add(category1);
	}

}
