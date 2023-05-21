/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/21/2023 1:05 PM
 */
package io.nerd.inventory.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sku_code")
    private String skuCode;
    private Integer quantity;

}
