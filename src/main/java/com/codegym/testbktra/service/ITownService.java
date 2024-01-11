package com.codegym.testbktra.service;

import com.codegym.testbktra.model.Town;

import java.util.List;

public interface ITownService {
    List<Town> findAll();

    Town findById(Long id);

    void save(Town town);

    void remove(Long id);
}
