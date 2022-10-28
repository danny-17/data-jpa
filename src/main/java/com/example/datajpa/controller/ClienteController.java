package com.example.datajpa.controller;

import com.example.datajpa.dao.IClienteDao;
import com.example.datajpa.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class ClienteController {

    @Autowired
    private IClienteDao clienteDao;

    @RequestMapping(value = "listar", method = RequestMethod.GET)
    public String listar(Model model){
        model.addAttribute("titulo", "listado de clientes");
        model.addAttribute("clientes", clienteDao.findAll());

        return "listar";
    }

    @RequestMapping(value = "/form")
    public String crear (Map<String, Object> model){
        Cliente cliente = new Cliente();
        model.put("titulo", "Formulario del cliente");
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(Cliente cliente){
        clienteDao.save(cliente);
        return "redirect:listar";
    }

}
