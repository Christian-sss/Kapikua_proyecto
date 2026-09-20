package com.projects.ewallet.application.port.out;

import com.projects.ewallet.domain.model.billetera.Cliente;

import java.util.Optional;

public interface ClienteRepository {

    Optional<Cliente> save(Cliente cliente);


}
