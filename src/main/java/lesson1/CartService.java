package lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope("prototype")
public class CartService {

    private ProductRepository productRepository;
    private List<Product> productList;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
        productList = new ArrayList<>();
    }


    //добавление продукта.
    public boolean addProduct(Long id){
        Product product = productRepository.findProduct(id);
        if(product == null){
            return false;
        }
        return productList.add(product);
    }

    // удаление продукта.
    public boolean removeProduct(Long id){
        Product product = findProduct(id);
        if(product == null){
            return false;
        }
        return productList.remove(product);
    }

    public Product findProduct(Long id){
        for(Product product : productList){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }

    // количество продуктов.
    public Integer sumOfProducts(){
        return Collections.unmodifiableCollection(productList).size();
    }

    // цена всех продуктов в корзине.
    public Double totalPrise(){
        Double totalSum = 0.0;
        for(Product product :productList){
            totalSum += product.getPrice();
        }
        return totalSum;
    }

    public List<Product> getProductList(){
        return Collections.unmodifiableList(productList);
    }

    public List<Product> getProductRepository() {
        return productRepository.findAll();
    }
}
