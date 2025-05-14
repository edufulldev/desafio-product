package desafio.devfull.produtos.dto;

import desafio.devfull.produtos.model.Product;
import java.math.BigDecimal;

public record ProductDTO(String name, BigDecimal price) {

    public static ProductDTO from (Product p) {
        return new ProductDTO(p.getName(), p.getPrice());
    }
}
