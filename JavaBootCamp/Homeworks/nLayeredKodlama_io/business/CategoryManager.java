package nLayeredKodlama_io.business;

import java.util.ArrayList;
import nLayeredKodlama_io.core.utilities.logging.Logger;
import nLayeredKodlama_io.dataAccess.CategoryDao;
import nLayeredKodlama_io.entities.Category;

public class CategoryManager {

	CategoryDao categoryDao;
	ArrayList<Logger> loggers;
	ArrayList<Category> categories;

	public CategoryManager(CategoryDao categoryDao, ArrayList<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category categoryInList : categories) {
			if (categoryInList.getName() == category.getName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}

		categories.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

	}

}
