package emsi.lehri.services;

import emsi.lehri.entities.Seller;
import emsi.lehri.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
private SellerRepository sellerRepository;
public SellerService(SellerRepository sellerRepository) {
    this.sellerRepository = sellerRepository;
}
public void AddSeller(Seller seller) {
    sellerRepository.save(seller);
}
}
