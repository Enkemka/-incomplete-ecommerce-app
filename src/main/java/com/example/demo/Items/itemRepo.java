package com.example.demo.Items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepo extends JpaRepository<Items,Integer> {
     Items findItemsByName(String name);
    Items findItemsById(int Id);

     Items findItemsByDescriptionContaining(String name);
}
