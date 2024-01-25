package com.codegym.crud_databasse.repository;

import com.codegym.crud_databasse.model.TrungCake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CakeRepository extends CrudRepository<TrungCake, Integer> {
    public List<TrungCake> findTrungCakeByDetailsContaining(String keyword);
}
