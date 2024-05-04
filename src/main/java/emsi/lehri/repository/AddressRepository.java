package emsi.lehri.repository;

import emsi.lehri.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
    Address findAddressesById(Long Id);
}
