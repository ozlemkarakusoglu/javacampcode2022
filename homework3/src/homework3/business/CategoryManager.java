package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.CategoryDao;
import homework3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Category[] categories;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Category[] categories, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		for(Category categoryy : categories) {
			if(categoryy.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez.");

			}
		}
		
		categoryDao.add(category);
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}	
	}

}
