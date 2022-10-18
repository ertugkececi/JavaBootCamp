package nLayeredKodlama_io.dataAccess;

import nLayeredKodlama_io.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori NHibernate ile eklendi.");

	}

}
