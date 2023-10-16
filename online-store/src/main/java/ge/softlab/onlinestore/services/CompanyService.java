package ge.softlab.onlinestore.services;

import ge.softlab.onlinestore.entities.Company;
import ge.softlab.onlinestore.entities.Product;
import ge.softlab.onlinestore.models.CreateCompany;
import ge.softlab.onlinestore.models.CreateProduct;

import java.util.List;

public interface CompanyService {
    List<Company> searchCompaniesByName(String searchValue);
    Company createNewCompany(Integer id, CreateCompany createCompany);
    Product createNewProduct(Integer id, CreateProduct createProduct);

}


