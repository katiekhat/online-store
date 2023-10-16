package ge.softlab.onlinestore.controllers;

import ge.softlab.onlinestore.entities.Company;
import ge.softlab.onlinestore.entities.Product;
import ge.softlab.onlinestore.models.CreateCompany;
import ge.softlab.onlinestore.models.CreateProduct;
import ge.softlab.onlinestore.repositories.ProductRepository;
import ge.softlab.onlinestore.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CompanyController{
    private final CompanyService companyService;
    private final ProductRepository productRepository;
    @GetMapping("/api/companies")
    public List<Company> searchCompaniesByName(String searchValue) {

        return companyService.searchCompaniesByName(searchValue);
    }
    @PostMapping("/api/companies/{id}")
    public Company createNewCompany( @PathVariable Integer id, @RequestBody CreateCompany createCompany){
        return companyService.createNewCompany(id,createCompany);
    }
    @PostMapping("api/companies/{id}/products")
    public Product createNewProduct(@PathVariable Integer id, @RequestBody CreateProduct createProduct){
        return companyService.createNewProduct(id,createProduct);
    }


}
