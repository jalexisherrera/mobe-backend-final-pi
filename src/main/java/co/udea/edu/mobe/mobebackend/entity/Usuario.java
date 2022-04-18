package co.udea.edu.mobe.mobebackend.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    @ManyToMany(fetch = FetchType.EAGER) //para indexar todo
    @JoinTable(joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"), inverseJoinColumns =
    @JoinColumn(name = "rol_id", referencedColumnName = "id"))
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
