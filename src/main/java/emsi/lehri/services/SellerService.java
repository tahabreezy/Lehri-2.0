package emsi.lehri.services;

import emsi.lehri.entities.Seller;
import emsi.lehri.repository.SellerRepository;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
private SellerRepository sellerRepository;
public SellerService(SellerRepository sellerRepository) {
    this.sellerRepository = sellerRepository;
}
public void AddSeller(Seller seller) {
    sellerRepository.save(seller);
}
}
