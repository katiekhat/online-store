package ge.softlab.onlinestore.services;

import ge.softlab.onlinestore.entities.Product;

import java.util.List;

public interface ProductService {

      Product getProduct(Integer id);
      List<Product> findProductsByNameOrEan(String search);

}
