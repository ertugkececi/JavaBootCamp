package nLayeredKodlama_io.dataAccess;

import nLayeredKodlama_io.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Jdbc ile eklendi.");

	}

}
