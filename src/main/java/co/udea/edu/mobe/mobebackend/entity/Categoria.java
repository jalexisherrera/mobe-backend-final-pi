package co.udea.edu.mobe.mobebackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {



        @Id
        @Column(nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(nullable = false)
        private String name;

        @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        private List<StoreEntity> stores;

        public Categoria() {
        }

        public Categoria(String name, List<StoreEntity> stores) {
                this.name = name;
                this.stores = stores;
        }
}
