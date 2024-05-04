package emsi.lehri.web;

import emsi.lehri.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @GetMapping("/index")
    public String index(){
        return "client";
    }


}
