package co.udea.edu.mobe.mobebackend.entity;

import lombok.Data;

@Data
public class Producto {

    private String nombre;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
