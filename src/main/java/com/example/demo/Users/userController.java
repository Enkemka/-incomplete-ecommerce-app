
package com.example.demo.Users;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"})
public class userController {

    private userService UserService;
   @Autowired
   public userController(userService UserService){
       this.UserService = UserService;
   }

    @GetMapping("/getAll")
    public ResponseEntity<?> getALlUsers(){

        return ResponseEntity.ok(UserService.findAll());
    }

    //expand on this admin can get users by sorting base on certian other attributes

    @GetMapping("/test")
    public String testResponse() {
        return "Hello, Spring Boot is working!";
    }

    @GetMapping("/{Id}")
    public ResponseEntity<?> findById(@PathVariable int Id) {
        try {
            User user = UserService.findById(Id);
            return ResponseEntity.ok(user);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(404).body("User not found");
        } catch (Exception e) {
            // This will catch any other exceptions and return the message for debugging
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }

    @PostMapping
    public  ResponseEntity<?> addNewUser(@RequestBody User user){
        return ResponseEntity.ok(UserService.createUser(user));
    }











    @PostMapping("/register")
    public ResponseEntity<?>Register(@RequestBody User user){
       return ResponseEntity.ok(UserService.register(user));
    }

    //fix both patch mapping

    @PatchMapping("/{Id}/updatName")
    public  ResponseEntity<?> updateUserName(@PathVariable int Id,@RequestBody String Name){
        return ResponseEntity.ok(UserService.updateUserName(Id,Name));
    }

    @PatchMapping("/{Id}/updatePassword")
    public  ResponseEntity<?> updateUserPassword(@PathVariable int Id,@RequestBody String NewPassword) {
        return ResponseEntity.ok(UserService.updateUserPassword(Id, NewPassword));

    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<?> DeleteById(@PathVariable int Id){
        UserService.deleteUser(Id);
        return ResponseEntity.noContent().build();
    }

}

