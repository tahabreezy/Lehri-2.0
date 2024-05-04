package emsi.lehri.services;

import emsi.lehri.entities.Category;
import emsi.lehri.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
private CategoryRepository categoryRepository;
public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
}
public void AddCategory(Category category) {
    categoryRepository.save(category);
}
}
