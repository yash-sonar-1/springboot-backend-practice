package com.yash.backend.Service;

import com.yash.backend.DAO.UserRepo;
import com.yash.backend.entity.User;
import com.yash.backend.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;
//Constructor injection
    public UserService(UserRepo userRepo){
        this.userRepo=userRepo;
    }

    public User saveuser(User user){
        return userRepo.save(user);
    }

    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    public User getUserById(Long id){
        return userRepo.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("user not found with id "+ id));
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
