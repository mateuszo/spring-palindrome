package com.codecool.springzbuta.repositories;

import com.codecool.springzbuta.models.Palindrome;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PalindromeRepository extends CrudRepository<Palindrome, Long> {

    List<Palindrome> findAllByTextStartingWith(String start);
}
