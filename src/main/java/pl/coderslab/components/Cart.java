package pl.coderslab.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import pl.coderslab.model.CartItem;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
    private final List<CartItem> cartItems = new ArrayList<>();
    public void addToCart(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public List<CartItem> listAllItems() {
        return cartItems;
    }
}
