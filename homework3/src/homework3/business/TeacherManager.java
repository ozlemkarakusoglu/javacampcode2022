package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.TeacherDao;
import homework3.entities.Teacher;

public class TeacherManager {

	private TeacherDao teacherDao;
	private Logger[] loggers;
	
	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}
	
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		for(Logger logger : loggers) {
			logger.log(teacher.getTeacherName());
		}	
	}
}
