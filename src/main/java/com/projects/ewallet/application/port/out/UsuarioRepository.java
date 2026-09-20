package com.projects.ewallet.application.port.out;

import com.projects.ewallet.domain.model.seguridad.Usuario;
import java.util.Optional;

public interface UsuarioRepository {


     Optional<Usuario> save(Usuario usuario);


}
