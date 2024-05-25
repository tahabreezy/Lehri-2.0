package emsi.lehri.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Client {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String password;
    @OneToOne(cascade = CascadeType.PERSIST)
    private ShoppingCart shoppingCart;

    }
