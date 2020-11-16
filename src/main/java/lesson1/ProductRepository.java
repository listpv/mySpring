package lesson1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
    }

    @PostConstruct
    public void init(){
        productList.add(new Product(1l, "apple", 50.0));
        productList.add(new Product(2l, "orange", 60.0));
        productList.add(new Product(3l, "tomato", 70.0));
        productList.add(new Product(4l, "banana", 80.0));
        productList.add(new Product(5l, "pineapple", 90.0));
    }

    // метод, позволяющий найти продукт по id.
    public Product findProduct(Long id){
        for(Product product : productList){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(productList);
    }

    // удаление продукта по id.
    public boolean removeProduct(Long id){
        Product product = findProduct(id);
        if(product == null){
            return false;
        }
        return productList.remove(product);
    }

    // долбавление продукта.
    public void addProduct(Product product){
        productList.add(product);
    }
}
