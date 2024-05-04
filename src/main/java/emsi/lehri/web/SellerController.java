package emsi.lehri.web;

import emsi.lehri.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class SellerController {
@Autowired
    private SellerRepository sellerRepository;
    @GetMapping("/index")
    public String index() {
        return "seller";
    }
}
