package emsi.lehri.services;

import emsi.lehri.entities.Address;
import emsi.lehri.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private AddressRepository addressRepository;
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    public void AddAddress (Address address) {
        addressRepository.save(address);
    }
}
