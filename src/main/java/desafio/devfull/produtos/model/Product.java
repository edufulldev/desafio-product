package desafio.devfull.produtos.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Table(name = "products")
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @Column(nullable = false, scale = 2)
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
