/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/21/2023 8:20 AM
 */
package io.nerd.order.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest{
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
