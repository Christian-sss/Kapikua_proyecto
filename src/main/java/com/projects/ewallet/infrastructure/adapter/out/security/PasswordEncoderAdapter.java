package com.projects.ewallet.infrastructure.adapter.out.security;

import com.projects.ewallet.application.port.out.PasswordEncoderPort;

public class PasswordEncoderAdapter implements PasswordEncoderPort {

    @Override
    public String encriptar(String password) {
        return "";
    }

    @Override
    public boolean validar(String passwordText, String passwordHash) {
        return false;
    }
}
