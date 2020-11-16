package lesson1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        CartService cartService1 = context.getBean("cartService", CartService.class);
//        CartService cartService2 = context.getBean("cartService", CartService.class);
//        System.out.println(System.identityHashCode(cartService1));
//        System.out.println(System.identityHashCode(cartService2));

//        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
//        System.out.println(productRepository.findProduct(1l));


        CartService cartService = context.getBean("cartService", CartService.class);
        System.out.println(cartService.getProductList());
        System.out.println(cartService.sumOfProducts());
        System.out.println(cartService.totalPrise());
        System.out.println(cartService.removeProduct(6l));
        System.out.println(cartService.removeProduct(5l));
        System.out.println(cartService.getProductList());
        System.out.println(cartService.sumOfProducts());
        System.out.println(cartService.totalPrise());
        cartService.addProduct(new Product(5l, "pinapple", 90.0));
        System.out.println(cartService.getProductList());
        System.out.println(cartService.sumOfProducts());
        System.out.println(cartService.totalPrise());
        System.out.println(cartService.getProductRepository().findProduct(1l));

    }
}
