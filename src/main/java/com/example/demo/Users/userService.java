package com.example.demo.Users;

import jakarta.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class userService {
    @Autowired
    private userRepo userRepo;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);


    //admin actions
    //get all users
    public List<User> findAll(){
       return userRepo.findAll();
    }

    //post
    //simple make a new user
    public User createUser(User user){
        if(userRepo.findByUserName(user.getUserName())!=null) {
            throw new IllegalArgumentException("User/ userName already exists");
        }
        if(user==null) {
            throw new IllegalArgumentException("User is null");
        }
        return userRepo.save(user);
    }

    //delete
    public void deleteUser(int Id){
        if(userRepo.findById(Id).isEmpty()){
            throw new NoSuchElementException("User not found");
        }
        userRepo.deleteById(Id);
    }


    //search
    //get by id
    //or else throw exception
    public User findById(int id) {
        return userRepo.findById(id)
                .orElseThrow(()->new EntityNotFoundException("User not found"));
    }



//search by name containing
    public List<User> searchByName(String name){

        if(name.isEmpty()){
            throw new IllegalArgumentException("Name is empty");
        }
        return userRepo.findByUserNameContainingIgnoreCase(name);
    }



//login operations

    //for registering a new user
    //check if username is present in repo
    //if it's already present throw execption
    //make a new string that uses password encoder on password
    //set password to hashed password and save user in repo
    public User register(User user){
        if(userRepo.findByUserName(user.getUserName()).isPresent()){
            throw new IllegalArgumentException("UserName already exists");
        }

        String hashedPassword=passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        return userRepo.save(user);
    }
    //patch
    //change username
    //check if username is in repo
    //check if username isnt the same as current username
    //set username and throw execption
    public User updateUserName(int Id, String newUserName) {
        //if username isnt in repo
         User user = userRepo.findById(Id)
                 .orElseThrow(() -> new NoSuchElementException("User not found"));

        //if username is already current

        if (userRepo.findByUserName(newUserName) != null) {
            throw new NoSuchElementException("UserName already exists");
        }
        //return exeption here
        user.setUserName(newUserName);
        return userRepo.save(user);
    }
    //patch
    //change passsword
    public User updateUserPassword(int Id, String NewPassword){
         User user = userRepo.findById(Id)
                .orElseThrow(() -> new NoSuchElementException("User not found"));
       if(user.getPassword().equals(NewPassword)){
           throw new IllegalArgumentException("password already in use");
       }

        String hashedPassword=passwordEncoder.encode(NewPassword);
        user.setPassword(hashedPassword);
       return userRepo.save(user);


    }






    //user functionality



        //order history

    //show all
    //show one
    //sort by date
    //sort by purchase price
    //add
    //update
    //delete specific
    //delete all



        //cart history
    //show all
    //show one
    //add
    //update
    //delete specific
    //delete all






}
