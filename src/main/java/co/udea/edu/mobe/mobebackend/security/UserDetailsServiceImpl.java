package co.udea.edu.mobe.mobebackend.security;

import co.udea.edu.mobe.mobebackend.entity.Usuario;
import co.udea.edu.mobe.mobebackend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       Usuario usuario = usuarioService.getByEmail(email).orElseThrow(()-> new UsernameNotFoundException("emial no encontrado"));
       return UsuarioPrincipalFactory.build(usuario);
    }
}
