package emsi.lehri.web;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ShoppingCartRepository {
    @Autowired
    public ShoppingCartRepository shoppingCartRepository;
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
