package emsi.lehri.services;

import emsi.lehri.entities.Shipping;
import emsi.lehri.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    @Autowired
private ShippingRepository shippingRepository;
public ShippingService(ShippingRepository shippingRepository) {
    this.shippingRepository = shippingRepository;
}
public void Shipping(Shipping shipping) {
    shippingRepository.save(shipping);
}
}
