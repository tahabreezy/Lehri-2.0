package emsi.lehri.services;

import emsi.lehri.entities.Product;
import emsi.lehri.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void AddProduct(Product product) {
        productRepository.save(product);
    }
}
