package emsi.lehri.repository;

import emsi.lehri.entities.Product;
import emsi.lehri.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Seller findByName(String name);
}
