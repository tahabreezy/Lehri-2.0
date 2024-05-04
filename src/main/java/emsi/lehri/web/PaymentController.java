package emsi.lehri.web;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PaymentController {
    @Autowired
    private PaymentController paymentController;
    @GetMapping("/index")
    public String index() {
        return "payment";
    }
}
