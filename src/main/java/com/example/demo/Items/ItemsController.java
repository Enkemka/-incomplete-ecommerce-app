package com.example.demo.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @GetMapping("/findItem")
        public ResponseEntity<?> ItemSearch (@RequestParam String itemName){
            return ResponseEntity.ok(itemsService.findItemByNameContaining(itemName));
        }


}




    /*//get all items
//public ResponseEntity<List<Items>> getAllItems(){
//        return (ResponseEntity<List<Items>>) itemsService.getAllItems();
//    }
//
//    //get an item
//    public ResponseEntity<?> getItemById(String Id){
//       return ResponseEntity.ok(Id);
//    }
//
//    //get item by descrpition, rquest param, find my containing
//    public ResponseEntity<List<Items>> getAllItemsByCategory(String category){
//        return ResponseEntity.ok(itemsService);
//    }*/

    //add new item



    //patch update item partially for each



    //delete item









