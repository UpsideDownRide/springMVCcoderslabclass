package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.components.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;
import pl.coderslab.repositories.ProductRepository;

import java.util.Random;

@Controller
public class CartController {
    private final Cart cart;
    private final ProductRepository productRepository;

    public CartController(Cart cart, ProductRepository productRepository) {
        this.cart = cart;
        this.productRepository = productRepository;
    }

    @GetMapping("/addtocart")
    @ResponseBody
    public void addtocart(@RequestParam long id, @RequestParam int quantity) {
        cart.addToCart(new CartItem(quantity,
                productRepository.get(id).orElseThrow(IllegalArgumentException::new)));
    }

    @RequestMapping("/cart")
    @ResponseBody
    public String listAllCartItems(Model model) {
        model.addAttribute("cartItems", cart.listAllItems());
        return "cart";
    }


}
