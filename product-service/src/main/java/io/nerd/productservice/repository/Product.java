/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/20/2023 6:15 PM
 */
package io.nerd.productservice.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
