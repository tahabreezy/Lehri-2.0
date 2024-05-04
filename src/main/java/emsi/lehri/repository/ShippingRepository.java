package emsi.lehri.repository;

import emsi.lehri.entities.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
    Shipping findShippingById(Long Id);
}
