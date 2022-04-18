package co.udea.edu.mobe.mobebackend.service;

import co.udea.edu.mobe.mobebackend.entity.Usuario;
import co.udea.edu.mobe.mobebackend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    public boolean existsEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);

    }
}
