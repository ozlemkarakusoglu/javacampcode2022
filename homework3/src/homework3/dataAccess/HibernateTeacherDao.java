package homework3.dataAccess;

import homework3.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Hibernate ile veritabanýna eklendi");
	}

}
