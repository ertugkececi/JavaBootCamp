package nLayeredKodlama_io.dataAccess;

import nLayeredKodlama_io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile eklendi.");

	}

}
