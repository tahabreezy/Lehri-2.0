package emsi.lehri.web;

import emsi.lehri.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class AddressController {
@Autowired
    private AddressRepository addressRepository;
    @GetMapping("/index")
    public String index(){
        return "address";
    }
}
