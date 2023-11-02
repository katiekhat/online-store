package ge.softlab.onlinestore.services;

import ge.softlab.onlinestore.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ge.softlab.onlinestore.entities.Product;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServicesImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findProductsByNameOrEan(String search) {
        return productRepository.findProductsByNameOrEan(search);
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).orElseThrow();
    }
}
