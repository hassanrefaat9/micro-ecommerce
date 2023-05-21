/**
 * @author Hassan Refaat <hassan.refaat.dev@gmail.com>
 * @Created 5/21/2023 1:04 PM
 */
package io.nerd.inventory.repository;

import io.nerd.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory>findBySkuCode(String skuCode);
}
