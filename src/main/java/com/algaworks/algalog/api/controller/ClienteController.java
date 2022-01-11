package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setId(1L);
        cliente1.setNome("Joao");
        cliente1.setTelefone("99999999");
        cliente1.setEmail("joaodacouves@gmail.com");

        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("88888888");
        cliente2.setEmail("maria@gmail.com");

        return Arrays.asList(cliente1, cliente2);
    }
}
