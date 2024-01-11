package com.codegym.testbktra.repository;

import com.codegym.testbktra.model.Town;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class TownRepository implements ITownRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Town> findAll() {
        TypedQuery<Town> query = entityManager.createQuery("select c from Town c", Town.class);
        return query.getResultList();
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
