package ru.rayumov.market.core.integrations;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import ru.rayumov.market.api.CartDto;

@Component
@RequiredArgsConstructor
public class CartServiceIntegration {

    private final WebClient cartServiceWebClient;


    public CartDto getCurrentCart() {
        return cartServiceWebClient.get()
                .uri("api/v1/cart")
                .retrieve()
                .bodyToMono(CartDto.class)
                .block();
    }

    public void clearCart() {
        cartServiceWebClient.delete()
                .uri("api/v1/cart/clear")
                .retrieve()
                .bodyToMono(Void.class)
                .block();
    }

}



