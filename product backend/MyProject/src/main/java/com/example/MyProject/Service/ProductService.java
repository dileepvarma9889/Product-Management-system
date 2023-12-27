package com.example.MyProject.Service;



import java.util.List;

import com.example.MyProject.Model.Product;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProduct();
    public Product getProductById(Integer id);
    public String deleteProduct(Integer id);
    public Product editProduct(Product product,Integer id);


    

    
}
