package nLayeredKodlama_io.dataAccess;

import nLayeredKodlama_io.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc ile eklendi.");

	}

}
