package com.brunosantos.workshopmongo.services;

import com.brunosantos.workshopmongo.domain.User;
import com.brunosantos.workshopmongo.repository.UserRepository;
import com.brunosantos.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findALl(){
        return repo.findAll();
    }

   public User findById(String id){
        User user = repo.findById(id).orElse(null);
        if(user == null){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
   }

}
