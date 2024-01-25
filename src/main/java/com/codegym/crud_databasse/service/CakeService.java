package com.codegym.crud_databasse.service;

import com.codegym.crud_databasse.model.TrungCake;
import com.codegym.crud_databasse.repository.CakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeService {
    @Autowired
    private CakeRepository cakeRepository;

    public List<TrungCake> getAllListCake() {
        return (List<TrungCake>) cakeRepository.findAll();
    }

    public void createCake(TrungCake trungCake) {
        cakeRepository.save(trungCake);
    }

    public TrungCake findById(int id) {
        return cakeRepository.findById(id).get();
    }

    public void updateCake(TrungCake trungCake) {
        TrungCake trungCakeEdit = findById(trungCake.getId());

        if (trungCakeEdit != null) {
            trungCakeEdit.setDetails(trungCake.getDetails());
            trungCakeEdit.setPrice(trungCake.getPrice());
            trungCakeEdit.setType(trungCake.getType());
            trungCakeEdit.setStatus(trungCake.isStatus());

            cakeRepository.save(trungCakeEdit);
        }
    }

    public void deleteById(int id) {
        cakeRepository.deleteById(id);
    }

    public List<TrungCake> searchWithKeyword(String keyword) {
        return cakeRepository.findTrungCakeByDetailsContaining(keyword);
    }


}
