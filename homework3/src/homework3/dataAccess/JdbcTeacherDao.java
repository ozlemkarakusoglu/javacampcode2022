package homework3.dataAccess;

import homework3.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("JDBC ile veritabanýna eklendi");
		
	}

}
