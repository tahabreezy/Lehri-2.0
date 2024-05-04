package emsi.lehri.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Locale;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Product {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Locale.Category category;
    @ManyToOne
    @JoinColumn (name = "seller_id")
    private Seller seller;
}
