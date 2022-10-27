package com.example.datajpa.service;

import com.example.datajpa.dao.IClienteDao;
import com.example.datajpa.models.Cliente;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ClienteDaoImp implements IClienteDao {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly=true)
    @Override
    public List<Cliente> findAll() {
        return null;
    }
}
