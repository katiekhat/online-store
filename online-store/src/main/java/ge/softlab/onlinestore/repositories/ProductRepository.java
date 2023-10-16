package ge.softlab.onlinestore.repositories;

import ge.softlab.onlinestore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE %:search% OR LOWER(p.ean) LIKE %:search%")
    List<Product> findProductsByNameOrEan(String search);
}

