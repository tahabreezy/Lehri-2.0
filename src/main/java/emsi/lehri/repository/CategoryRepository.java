package emsi.lehri.repository;


import emsi.lehri.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findCategoriesByName(String name);
}
