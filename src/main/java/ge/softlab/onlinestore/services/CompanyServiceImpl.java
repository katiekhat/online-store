package ge.softlab.onlinestore.services;

import ge.softlab.onlinestore.entities.Company;
import ge.softlab.onlinestore.entities.Product;
import ge.softlab.onlinestore.models.CreateCompany;
import ge.softlab.onlinestore.models.CreateProduct;
import ge.softlab.onlinestore.repositories.CompanyRepository;
import ge.softlab.onlinestore.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    private final ProductRepository productRepository;

    @Override
    public List<Company> searchCompaniesByName(String name) {
        return companyRepository.searchCompaniesByName(name);
    }

    @Override
    public Company createNewCompany(Integer id, CreateCompany createCompany) {
        Company company = new Company();
        company.setId(id);
        company.setName(createCompany.name());
        company.setCountryId(createCompany.countryId());
        company.setParentId(createCompany.parentId());
        companyRepository.save(company);
        return company;
    }

    @Override
    public Product createNewProduct(Integer id, CreateProduct createProduct) {
        Product product = new Product();
        product.setId(id);
        product.setEan(createProduct.ean());
        product.setName(createProduct.name());
        product.setCompanyId(createProduct.companyId());
        product.setCountryId(createProduct.countryId());
        productRepository.save(product);
        return product;
    }
}


