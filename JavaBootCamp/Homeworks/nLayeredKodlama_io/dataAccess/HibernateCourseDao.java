package nLayeredKodlama_io.dataAccess;

import nLayeredKodlama_io.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs NHibernate ile eklendi.");

	}

}
