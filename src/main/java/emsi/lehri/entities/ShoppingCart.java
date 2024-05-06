package emsi.lehri.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ShoppingCart {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>(); ;

    @OneToMany(mappedBy = "clients", cascade = CascadeType.ALL)
    private Client client;

    public Product AddProducts(Product products) {
        return products;
    }
    public Product RemoveProducts(Product products) {
        return products;
    }
}
