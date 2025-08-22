package com.example.demo.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {
    @Autowired
    private itemRepo ItemRepo;


    //get all items
public List<Items> getAllItems() {
    return ItemRepo.findAll();
}
    public Items findItemById(int Id){
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


public Items UpdateItems(String Id, UpdateItemsDto updateItemsDto) {

    if (updateItemsDto.getName() != null) {
        Items newItem = ItemRepo.findItemsById(Integer.parseInt(Id));
        newItem.setName(updateItemsDto.getName());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getQuantity() != -1) {
        Items newItem = ItemRepo.findItemsById(Integer.parseInt(Id));
        newItem.setQuantity(updateItemsDto.getQuantity());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getPrice() != -1) {
        Items newItem = ItemRepo.findItemsById(Integer.parseInt(Id));
        newItem.setPrice(updateItemsDto.getPrice());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getDescription() != null) {
        Items newItem = ItemRepo.findItemsById(Integer.parseInt(Id));
        newItem.setDescription(updateItemsDto.getDescription());
        return ItemRepo.save(newItem);
    }

    if (updateItemsDto.getCreationDate() != null) {
        Items newItem = ItemRepo.findItemsById(Integer.parseInt(Id));
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
