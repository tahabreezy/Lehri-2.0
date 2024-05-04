package emsi.lehri.web;

import emsi.lehri.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CategoryController {
@Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/index")
    public String index() {
        return "category";
    }
}
