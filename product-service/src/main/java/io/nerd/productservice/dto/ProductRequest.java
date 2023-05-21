/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/20/2023 6:22 PM
 */
package io.nerd.productservice.dto;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}
