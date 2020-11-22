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


        CartService cartService1 = context.getBean("cartService", CartService.class);
        System.out.println("cartService1 " + cartService1.getProductList());
        System.out.println("cartService1 " + cartService1.sumOfProducts());
        System.out.println("cartService1 " + cartService1.totalPrise());
        System.out.println("cartService1 " + cartService1.removeProduct(6l));
        System.out.println("cartService1 " + cartService1.removeProduct(5l));
        CartService cartService2 = context.getBean("cartService", CartService.class);
        System.out.println("cartService1 " + cartService1.getProductList());
        System.out.println("cartService2 " + cartService2.getProductList());
        System.out.println("cartService1 " + cartService1.sumOfProducts());
        System.out.println("cartService2 " + cartService2.sumOfProducts());
        System.out.println("cartService1 " + cartService1.totalPrise());
        cartService2.addProduct(new Product(6l, "watermelon", 50.0));
        CartService cartService3 = context.getBean("cartService", CartService.class);
        System.out.println("cartService1 " + cartService1.getProductList());
        System.out.println("cartService2 " + cartService2.getProductList());
        System.out.println("cartService3 " + cartService3.getProductList());
        System.out.println("cartService1 " + cartService1.sumOfProducts());
        System.out.println("cartService2 " + cartService2.sumOfProducts());
        System.out.println("cartService3 " + cartService3.sumOfProducts());
        System.out.println("cartService1 " + cartService1.totalPrise());
        System.out.println("cartService2 " + cartService2.totalPrise());
        System.out.println("cartService3 " + cartService3.totalPrise());
        System.out.println("cartService1 " + cartService1.getProductRepository().findProduct(1l));

    }
}
