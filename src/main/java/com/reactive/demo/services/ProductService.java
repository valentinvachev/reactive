package com.reactive.demo.services;

import com.reactive.demo.entity.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@Service
public class ProductService {

    public Flux<Product> getAllProducts() {
        Product product1 = new Product(1,"Fist","desc");
        Product product2 = new Product(2,"Second","desc");

        return Flux.fromIterable(List.of(product1,product2))
                .delayElements(Duration.ofMillis(4000));
    }
}
