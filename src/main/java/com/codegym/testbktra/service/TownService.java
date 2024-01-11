package com.codegym.testbktra.service;

import com.codegym.testbktra.model.Town;
import com.codegym.testbktra.repository.ITownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TownService implements ITownService {
    @Autowired
    private ITownRepository iTownRepository;
    @Override
    public List<Town> findAll() {
        return iTownRepository.findAll();
    }

    @Override
    public Town findById(Long id) {
        return null;
    }

    @Override
    public void save(Town town) {

    }

    @Override
    public void remove(Long id) {

    }
}
