package com.libraverse.service;

import com.libraverse.model.Author;
import com.libraverse.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
}
