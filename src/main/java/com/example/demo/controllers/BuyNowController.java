package com.example.demo.controllers;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;
// testing commits
// testing2
@Controller
public class BuyNowController {
    @Autowired
    private final ProductRepository productSearch;
    public BuyNowController(ProductRepository productSearch) {
        this.productSearch = productSearch;
    }
    @GetMapping("/buynow")
    public String buyProduct(@RequestParam Long productId) {
        Optional<Product> productNotNull = productSearch.findById(productId);
        if (productNotNull.isPresent()) {
            Product purchasedProduct = productNotNull.get();
            if (purchasedProduct.getInv() >= 1) {
                purchasedProduct.setInv(purchasedProduct.getInv() - 1);
                productSearch.save(purchasedProduct);
                return "confirmationbuyproduct";
            }
        }
        return "failbuyproduct";
    }
}
// remember to import