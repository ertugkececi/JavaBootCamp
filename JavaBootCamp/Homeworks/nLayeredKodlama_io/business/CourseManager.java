package nLayeredKodlama_io.business;

import java.util.ArrayList;

import nLayeredKodlama_io.core.utilities.logging.Logger;
import nLayeredKodlama_io.dataAccess.CourseDao;
import nLayeredKodlama_io.entities.Course;

public class CourseManager {
	CourseDao courseDao;
	ArrayList<Logger> loggers;
	ArrayList<Course> courses;

	public CourseManager(CourseDao courseDao, ArrayList<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		courses = new ArrayList<Course>();
	}

	public void add(Course course) throws Exception {
		for (Course courseInList : courses) {
			if (courseInList.getName() == course.getName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}

		if (course.getPrice() < 0) {
			throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
		}

		courses.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
