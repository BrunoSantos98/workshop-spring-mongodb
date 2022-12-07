package com.brunosantos.workshopmongo.services;

import com.brunosantos.workshopmongo.domain.Post;
import com.brunosantos.workshopmongo.repository.PostRepository;
import com.brunosantos.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

   public Post findById(String id){
       Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
   }

}
