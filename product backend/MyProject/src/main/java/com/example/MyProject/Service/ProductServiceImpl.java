package com.example.MyProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyProject.Model.Product;
import com.example.MyProject.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productrepo;

    @Override
    public Product saveProduct(Product product) {
       return productrepo.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productrepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productrepo.findById(id).get();
    }

    @Override
    public String deleteProduct(Integer id) {
        Product product = productrepo.findById(id).get();
        if(product!=null){
            productrepo.delete(product);
            return "Product Delete Sucessfully";
        }
        return "Something erong on server";
        
    }

    @Override
    public Product editProduct(Product product, Integer id) {
        Product oldProduct= productrepo.findById(id).get();

        oldProduct.setProductName(product.getProductName());
        oldProduct.setDescription(product.getDescription());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setStatus(product.getStatus());
        return productrepo.save(oldProduct);

       
    }
    
    
}
