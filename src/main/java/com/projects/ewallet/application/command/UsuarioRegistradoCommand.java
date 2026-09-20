package com.projects.ewallet.application.command;

public record UsuarioRegistradoCommand(
        Long idCliente,
        String email,
        String message

) {

}
