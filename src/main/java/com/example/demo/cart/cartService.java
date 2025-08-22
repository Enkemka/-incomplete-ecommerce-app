/*
package com.example.demo.cart;

import com.example.demo.Items.Items;
import com.example.demo.Items.itemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartService {
    @Autowired
    private itemRepo ItemRepo;


    //get all items
public List<Items> getAllItems() {
    return ItemRepo.findAll();
}
    public Items findItemById(String Id){
        return ItemRepo.findItemsById(Id);
    }


    //get an item
    public Items findItemByName(String itemName){
    return ItemRepo.findItemsByName(itemName);
    }

    //get item by descrpition, rquest param, find my containing
    public Items findItemByNameContaining(String itemName){
      return  ItemRepo.findItemsByDescriptionContaining(itemName);
    }

    //add new item

public Items addNewItem(Items items){
   return ItemRepo.save(items);
}

    //patch update item partially for each

public Items UpdateItems(String Id, UpdateCartDto updateItemsDto) {

    if (updateItemsDto.getName() != null) {
        Items newItem = ItemRepo.findItemsById(Id);
        newItem.setName(updateItemsDto.getName());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getQuantity() != -1) {
        Items newItem = ItemRepo.findItemsById(Id);
        newItem.setQuantity(updateItemsDto.getQuantity());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getPrice() != -1) {
        Items newItem = ItemRepo.findItemsById(Id);
        newItem.setPrice(updateItemsDto.getPrice());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getDescription() != null) {
        Items newItem = ItemRepo.findItemsById(Id);
        newItem.setDescription(updateItemsDto.getDescription());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getCreationDate() != null) {
        Items newItem = ItemRepo.findItemsById(Id);
        newItem.setCreationDate(updateItemsDto.getCreationDate());
        return ItemRepo.save(newItem);
    }

return null;
}




    //delete item
    public Items DeleteItems(Items items){
        return ItemRepo.save(items);
    }







}
*/
