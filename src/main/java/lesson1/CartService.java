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

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @Autowired
//    public void setProductRepository(ProductRepository productRepository) {
//        List<Product> sourceProductList = productRepository.findAll();
//        List<Product> distProductList = new ArrayList<>();
//        for(Product product : sourceProductList){
//            distProductList.add(product);
//        }
//        this.productRepository = new ProductRepository(distProductList);
//    }


    //добавление продукта.
    public void addProduct(Product product){
        productRepository.addProduct(product);
    }

    // удаление продукта.
    public boolean removeProduct(Long id){
        return productRepository.removeProduct(id);
    }

    // количество продуктов.
    public Integer sumOfProducts(){
        return productRepository.findAll().size();
    }

    // цена всех продуктов в корзине.
    public Double totalPrise(){
        Double totalSum = 0.0;
        for(Product product : productRepository.findAll()){
            totalSum += product.getPrice();
        }
        return totalSum;
    }

    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}
