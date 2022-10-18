package nLayeredKodlama_io.dataAccess;

import nLayeredKodlama_io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen NHibernate ile eklendi.");

	}

}
