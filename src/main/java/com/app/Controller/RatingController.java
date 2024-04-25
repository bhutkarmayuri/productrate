package com.app.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.Model.Product;
import com.app.Model.Rating;
import com.app.Service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products/{productId}/ratings")
public class RatingController {

    private final ProductService productService;

    public RatingController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> rateProduct(
            @PathVariable String productId,
            @RequestBody Rating rating
    ) {
        Product product = productService.rateProduct(productId, rating);
        return ResponseEntity.ok(product);
    }
}
