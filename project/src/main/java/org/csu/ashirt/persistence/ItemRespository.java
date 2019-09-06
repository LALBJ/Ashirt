package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRespository extends JpaRepository<Item, Integer> {
    public Item findItemByItemId(int itemId);
    public List<Item> findItemsByCategoryId(int categoryId);
}
