package emsi.lehri.web;

import emsi.lehri.entities.Client;
import emsi.lehri.entities.Product;
import emsi.lehri.entities.ShoppingCart;
import emsi.lehri.repository.ClientRepository;
import emsi.lehri.repository.ShoppingCartRepository;
import emsi.lehri.services.ClientService;
import emsi.lehri.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:3131")
public class AuthController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientService clientService;
    @Autowired
    private ShoppingCartService shoppingCartService;
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Client client) {
        Client existingUser = clientRepository.findClientsByUsername(client.getUsername());
        if(existingUser != null && existingUser.getPassword().equals(client.getPassword())) {
            if(existingUser.getShoppingCart() == null || existingUser.getShoppingCart().getProducts() == null) {
                ShoppingCart shoppingCart = new ShoppingCart(null ,new ArrayList<Product>(),existingUser);
                shoppingCartRepository.save(shoppingCart);
                existingUser.setShoppingCart(shoppingCart);
                clientRepository.save(existingUser);
            }
            System.out.println(existingUser.getUsername() + "is logged in");
            return ResponseEntity.ok(existingUser);
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("In;valid username or password");
        }

        }
    @PostMapping("/Register")
    public ResponseEntity<?> register(@RequestBody Client client) throws NullPointerException {
        Client existingclient = clientRepository.findClientsByUsername(client.getUsername());
        if(existingclient == null) {
            clientService.AddClient(client);
            System.out.println(existingclient.getUsername() + "is registered");
            return ResponseEntity.ok(client);
        }
        else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }
    }




