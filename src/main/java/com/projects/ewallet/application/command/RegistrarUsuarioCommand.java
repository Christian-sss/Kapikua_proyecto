package com.projects.ewallet.application.command;

public record RegistrarUsuarioCommand(
        String email,
        String telefono,
        String password
) {
}
