package co.udea.edu.mobe.mobebackend.repository;

import co.udea.edu.mobe.mobebackend.entity.Rol;
import co.udea.edu.mobe.mobebackend.entity.Usuario;
import co.udea.edu.mobe.mobebackend.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    boolean existsByRolNombre(RolNombre rolNombre);
}
