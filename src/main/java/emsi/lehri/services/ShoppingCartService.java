package emsi.lehri.services;

import emsi.lehri.entities.ShoppingCart;
import emsi.lehri.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
private ShoppingCartRepository shoppingCartRepository;
public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
    this.shoppingCartRepository = shoppingCartRepository;
}
public void addToCart(ShoppingCart cart) {
    shoppingCartRepository.save(cart);
}
}
