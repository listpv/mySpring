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

        System.out.println("cartService1---");
        CartService cartService1 = context.getBean("cartService", CartService.class);
        System.out.println(cartService1.getProductRepository());
        System.out.println("cartService1 " + cartService1.getProductList());
        System.out.println("cartService1 " + cartService1.sumOfProducts() + " " + cartService1.totalPrise());
        cartService1.addProduct(1l);
        cartService1.addProduct(3l);
        cartService1.addProduct(6l);
        System.out.println("cartService1 " + cartService1.getProductList());
        System.out.println("cartService1 " + cartService1.sumOfProducts() + " " + cartService1.totalPrise());
        cartService1.removeProduct(1l);
        cartService1.removeProduct(4l);
        System.out.println("cartService1 " + cartService1.getProductList());
        System.out.println("cartService1 " + cartService1.sumOfProducts() + " " + cartService1.totalPrise());
        System.out.println("cartService2---");
        CartService cartService2 = context.getBean("cartService", CartService.class);
        System.out.println(cartService2.getProductRepository());
        System.out.println("cartService2 " + cartService2.getProductList());
        System.out.println("cartService2 " + cartService2.sumOfProducts() + " " + cartService2.totalPrise());
        cartService2.addProduct(4l);
        cartService2.addProduct(5l);
        cartService2.addProduct(2l);
        System.out.println("cartService2 " + cartService2.getProductList());
        System.out.println("cartService2 " + cartService2.sumOfProducts() + " " + cartService2.totalPrise());
        cartService2.removeProduct(5l);
        System.out.println("cartService2 " + cartService2.getProductList());
        System.out.println("cartService2 " + cartService2.sumOfProducts() + " " + cartService2.totalPrise());
        System.out.println("cartService3---");
        CartService cartService3 = context.getBean("cartService", CartService.class);
        System.out.println(cartService3.getProductRepository());
        System.out.println("cartService3 " + cartService3.getProductList());
        System.out.println("cartService3 " + cartService3.sumOfProducts() + " " + cartService3.totalPrise());
        cartService3.addProduct(4l);
        cartService3.addProduct(5l);
        cartService3.addProduct(2l);
        cartService3.addProduct(3l);
        System.out.println("cartService3 " + cartService3.getProductList());
        System.out.println("cartService3 " + cartService3.sumOfProducts() + " " + cartService3.totalPrise());
        cartService3.removeProduct(4l);
        System.out.println("cartService3 " + cartService3.getProductList());
        System.out.println("cartService3 " + cartService3.sumOfProducts() + " " + cartService3.totalPrise());


    }
}
