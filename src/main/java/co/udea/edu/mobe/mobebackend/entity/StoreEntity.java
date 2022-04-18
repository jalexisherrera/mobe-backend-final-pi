package co.udea.edu.mobe.mobebackend.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tienda")
public class StoreEntity {
    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String cellphone;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String city;

    @Column(name = "type")
    private String typePhoto;

    @Column(name = "picByte", length = 1000)
    private byte[] photo;

    public StoreEntity() {
    }

    public StoreEntity(String name, String email, String cellphone, String address, String department, String city,
                       String typePhoto, byte[] photo) {
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
        this.address = address;
        this.department = department;
        this.city = city;
        this.typePhoto = typePhoto;
        this.photo = photo;
    }
}
