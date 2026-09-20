package com.projects.ewallet.application.service;

import com.projects.ewallet.application.command.UsuarioRegistradoCommand;
import com.projects.ewallet.application.port.in.RegistrarUsuarioUseCase;
import com.projects.ewallet.application.port.out.ClienteRepository;
import com.projects.ewallet.application.port.out.PasswordEncoderPort;
import com.projects.ewallet.application.port.out.UsuarioRepository;
import com.projects.ewallet.domain.model.billetera.Cliente;
import com.projects.ewallet.domain.model.seguridad.Usuario;


public class RegistroService implements RegistrarUsuarioUseCase {

    private final UsuarioRepository usuarioRepository;
    private final ClienteRepository clienteRepository;
    private final PasswordEncoderPort passwordEncoderPort;

    public RegistroService(UsuarioRepository usuarioRepository, ClienteRepository clienteRepository, PasswordEncoderPort passwordEncoderPort) {
        this.usuarioRepository = usuarioRepository;
        this.clienteRepository = clienteRepository;
        this.passwordEncoderPort = passwordEncoderPort;
    }

    @Override
    public UsuarioRegistradoCommand ejecutar(RegistrarUsuarioUseCase usuarioUseCase) {

        var usuario = new Usuario();

        var cliente = new Cliente();










    }
}
