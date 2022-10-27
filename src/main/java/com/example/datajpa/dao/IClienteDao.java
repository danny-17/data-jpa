package com.example.datajpa.dao;

import com.example.datajpa.models.Cliente;

import java.util.List;

public interface IClienteDao {
    public List<Cliente> findAll();
}
