package com.codegym.testbktra.repository;

import com.codegym.testbktra.model.Town;

import java.util.List;

public interface ITownRepository {
    List<Town> findAll();

    Town findById(Long id);

    void save(Town town);

    void remove(Long id);
}
