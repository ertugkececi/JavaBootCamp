package nLayeredKodlama_io.business;

import java.util.ArrayList;

import nLayeredKodlama_io.core.utilities.logging.Logger;
import nLayeredKodlama_io.dataAccess.InstructorDao;
import nLayeredKodlama_io.entities.Instructor;

public class InstructorManager {
	InstructorDao instructorDao;
	ArrayList<Logger> loggers;
	ArrayList<Instructor> instructors;

	public InstructorManager(InstructorDao instructorDao, ArrayList<Logger> loggers,
			ArrayList<Instructor> instructors) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		instructors = new ArrayList<Instructor>();
	}

	public void add(Instructor instructor) throws Exception {
		instructors.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

}
