package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRespository extends JpaRepository<Item, Integer> {
    public List<Item> findItemsByItemId(int itemId);
}
